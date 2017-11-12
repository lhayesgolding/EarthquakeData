/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Liz Hayes-Golding (ehayesgolding0123@westfield.ma.edu)
 * Created Nov 8, 2017 3:22:27 PM
 * 
 */
package cais220project;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lizhayes-golding
 */
public class CSVEarthquakeDataFactory extends EarthquakeDataFactory {

    public List<EarthquakeData> getData() {
        ArrayList<EarthquakeData> list = new ArrayList<>();
        
        File dataFile = new File("1.0_hour.csv");
        try (
            Scanner input = new Scanner(dataFile);
        )
        {
            String line;
            if (input.hasNext())
                // throw away first line
                line = input.nextLine();
            
            while (input.hasNext()) {
                line = input.nextLine();
                String location, url;
                double magnitude, longitude, latitude, depth;
                long quakeTime;
                
                int current = 1; //skip the first quote
                current = line.indexOf("\"", current);
                
                location = line.substring(1, current);
                System.out.print("Location: " + location + " ");
                current++; //skip quote
                current++; //skip comma
                
                int column = 1;
                while (current > 0) {
                    int endIndex = line.indexOf(",", current);
                    if (endIndex > 0) {
                       // String data = line.substring(current. endIndex);
                        System.out.print(data + " ");
                        current = endIndex + 1;
                    }
                    else {
                        url = line.substring(current);
                        System.out.print(url);
                        current = -1;
                    }
                }
            }
            
        }
        catch (Exception ex) {       
        }    
        
        return list;
    }
    
    public static void main(String[] args) {
        
        
    }
    
}
