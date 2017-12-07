/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Liz Hayes-Golding (ehayesgolding0123@westfield.ma.edu)
 * Created Nov 8, 2017 3:22:27 PM
 * 
 */

package cais220project;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lizhayes-golding
 */

public class CSVEarthquakeDataFactory extends EarthquakeDataFactory {

    @Override
    public List<EarthquakeData> getData() {
        ArrayList<EarthquakeData> list = new ArrayList<>();
        File dataFile = new File("1.0_hour.csv");
        try(Scanner input = new Scanner(dataFile);) {
            String line;
            if (input.hasNext()) 
                line = input.nextLine(); //throw away first line
            
            while (input.hasNext()) {
                line = input.nextLine();
                String location, url = "";
                double magnitude = 0, latitude = 0, longitude = 0, depth = 0;
                Date quakeTime = null;
                double value = 0;
                
                int current = 1;
                current = line.indexOf("\"", current); //find index of second quotation mark
                location = line.substring(1, current); //String between the two quotation marks
                current += 2; //skip quote and comma
                
                int column = 1;
                while (current > 0) {
                    int endIndex = line.indexOf(",", current);
                    if (endIndex > 0) {
                        String data = line.substring(current, endIndex);
                        current = endIndex + 1; //move past comma to next section
                        if (column != 2)
                            value = Double.parseDouble(data);
                        switch (column) {
                            case 1:
                                magnitude = value;
                                break;
                            case 2:
                                long quakeTimeEpoch = Long.parseLong(data);
                                quakeTime = new Date(quakeTimeEpoch);
                                break;
                            case 3:
                                longitude = value;
                                break;
                            case 4:
                                latitude = value;
                                break;
                            case 5:
                                depth = value;
                                break;
                        }
                        column ++;
                    }
                    else {
                        url = line.substring(current);
                        current = -1;
                    }            
                }
                EarthquakeData data = new EarthquakeData(location, magnitude,quakeTime, latitude, longitude, depth, url);
                list.add(data);
            }
            
        }
        catch(Exception ex) {
            System.err.println(ex.toString());
            ex.printStackTrace(System.err);
        }
        return list;
    }
    
    
    
    
    
    public static void main(String[] args) {
        
    }

    @Override
    public List<EarthquakeData> getData(URL urlFile) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
