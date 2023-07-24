package com.hemebiotech.analytics;


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

	}

	//1-Get symptom

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

	// 3- Sort symptom
	// 4 - Write symptom




}






