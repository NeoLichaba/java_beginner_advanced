
package soccerleague;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * 
 */

public class Soccer {
    // Java program to reading
// text file to HashMap


	final static String filePath
		= "SoccerLeague.txt";
	public static void main(String[] args)
	{

		// read text file to HashMap
		Map<String, String> mapFromFile
			= HashMapFromTextFile();

		// iterate over HashMap entries
		for (Map.Entry<String, String> entry :
			mapFromFile.entrySet()) {
			System.out.println(entry.getKey() + " vs. "
							+ entry.getValue());
		}
	}

	public static Map<String, String> HashMapFromTextFile()
	{

		Map<String, String> map
			= new HashMap<String, String>();
		BufferedReader br = null;

		try {

			// create file object
			File file = new File(filePath);

			// create BufferedReader object from the File
			br = new BufferedReader(new FileReader(file));

			String line = null;

			// read file line by line
			while ((line = br.readLine()) != null) {

				// split the line by ,
				String[] parts = line.split(",");

				// first part is name, second is number
				String name = parts[0].trim();
				String number = parts[1].trim();

				// put name, number in HashMap if they are
				// not empty
				if (!name.equals("") && !number.equals(""))
                                        map.put(name,name);
					/*map.put("Tarantulas2", "1");
                                        map.put("FCAwesome","0");
                                        map.put("Tarantulas2", "3");
                                        map.put("ManchesterUnited", "1");
                                        map.put("Lions", "4");
                                        map.put("Grouches", "0");
                                        map.put("Liverpool", "3");
                                        map.put("ManchesterUnited", "3");
                                        map.put("Lions", "1");
                                        map.put("FCAwesome","1");*/
                                        
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {

			// Always close the BufferedReader
			if (br != null) {
				try {
					br.close();
				}
				catch (Exception e) {
				};
			}
		}

		return map;
	}

        }
