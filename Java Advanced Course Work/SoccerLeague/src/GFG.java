
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import static soccerleague.Soccer.HashMapFromTextFile;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
// Java program to sort hashmap by values


public class GFG {
    
final static String filePath
		= "SoccerLeague.txt";
	// function to sort hashmap by values

	public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> filePath)
	{
		// Create a list from elements of HashMap
		List<Map.Entry<String, Integer> > list =
			new LinkedList<Map.Entry<String, Integer> >(filePath.entrySet());

		// Sort the list
		Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
                        @Override
			public int compare(Map.Entry<String, Integer> o1,
							Map.Entry<String, Integer> o2)
			{
				return (o1.getValue()).compareTo(o2.getValue());
			}
		});
		
		// put data from sorted list to hashmap
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;
	}

	// Driver Code
	public static void main(String[] args)
	{

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		// enter data into hashmap
		Map<String, String> mapFromFile
			= HashMapFromTextFile();
		Map<String, Integer> filePath1 = sortByValue(filePath);

		// print the sorted hashmap
		for (Map.Entry<String, Integer> en : filePath1.entrySet()) {
			System.out.println("Key = " + en.getKey() +
						", Value = " + en.getValue());
		}
	}
}

