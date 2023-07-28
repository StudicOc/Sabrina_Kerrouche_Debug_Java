package com.hemebiotech.analytics;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class AnalyticsCounter {


	public static void main(String[] args) throws Exception {

		//1-Get symptom
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> symptoms = reader.GetSymptoms();

		//countSymptoms (symptoms); Call method
		//Retrieve result of GetSymptoms
		TreeMap<String, Integer> counter = countSymptoms(symptoms);


		//Boucle and check result with console
		for (Map.Entry<String, Integer> symptom : counter.entrySet()) {
			System.out.println(symptom.getKey() + " : " + symptom.getValue() + "\n");
		}

		writeSymptoms(countSymptoms(symptoms));

	}

	// 3- Sort symptom
	public static TreeMap<String, Integer> countSymptoms(List<String> symptoms) {

		TreeMap<String, Integer> countFrequencySymptom = new TreeMap<>();

		// Checking all elements of our loop

		for (String freq : symptoms)
		{
			if(countFrequencySymptom.containsKey(freq))
			{
				//Check is present in elementCountMap, incrementing it's count by 1

				countFrequencySymptom.put(freq, countFrequencySymptom.get(freq)+1);
			}
			else
			{
				//If element is not present in elementCountMap,
				//adding this element to elementCountMap with 1 as it's value
				countFrequencySymptom.put(freq, 1);
				//System.out.println("Element Count : "+countFrequencySymptom);
			}
		}
		return countFrequencySymptom;
	}


	// 4 - Write symptom
	public static void writeSymptoms(Map<String, Integer> symptoms) {

		if (symptoms != null) {
			try {
				FileWriter fileWriter = null;
				fileWriter = new FileWriter("./result.out");
				BufferedWriter writer = new BufferedWriter(fileWriter);

				// Parcourir la map: SET : parcourir les clés de la map
				for (String symptom : symptoms.keySet()) {
					writer.write(symptom + " : " + symptoms.get(symptom));
					writer.newLine();
				}
				writer.close();
			}
			catch (IOException e) {
				System.out.println("Beurre " + e.getMessage()) ;
				e.printStackTrace();
			}
		} else {
			System.out.println("Beurre");
		}
	}
}






