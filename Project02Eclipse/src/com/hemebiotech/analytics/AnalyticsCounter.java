package com.hemebiotech.analytics;

import java.util.TreeMap;
import java.util.*;

public class AnalyticsCounter {

	public static void main(String[] args) throws Exception {

		//1-Get symptoms
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		List<String> symptoms = reader.GetSymptoms();

		// 2- Count symptoms

		TreeMap<String, Integer> counter = countSymptoms(symptoms);

		// 3 - Write symptoms
        WriteSymptomDataToFile writer = new WriteSymptomDataToFile("./result.out");
        writer.writeSymptoms(counter);
	}
}






