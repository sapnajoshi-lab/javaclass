package labquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class cricketmap {

	public static void main(String[] args) {

		        // Create a Map to store cricketer name and their scores
		        Map<String, Integer> cricketerScores = new HashMap<>();
		        
		        // Add some cricketer names and their scores
		        cricketerScores.put("Virat Kohli", 115);
		        cricketerScores.put("Rohit Sharma", 95);
		        cricketerScores.put("Shubman Gill", 88);
		        cricketerScores.put("Hardik Pandya", 49);
		        cricketerScores.put("KL Rahul", 43);
		        
		        // Display the available cricketers and their scores
		        System.out.println("Cricketers and their scores: ");
		        for (Map.Entry<String, Integer> entry : cricketerScores.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue());
		        }

		        // Take user input for the cricketer's name to search
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("\nEnter the cricketer's name to search: ");
		        String batsmanName = scanner.nextLine();

		        // Search for the batsman and display his score
		        if (cricketerScores.containsKey(batsmanName)) {
		            System.out.println(batsmanName + "'s score: " + cricketerScores.get(batsmanName));
		        } else {
		            System.out.println("Batsman not found!");
		        }

		        scanner.close();
		    }
		}