package com.hemebiotech.analytics;

import java.util.List;
import java.util.TreeMap;

public class CountSymptomDataToFile implements ISymptomCount{
    @Override
    public TreeMap <String, Integer> countSymptoms(List<String> symptoms) {

        TreeMap<String, Integer> countFrequencySymptom = new TreeMap<>();

        for (String freq : symptoms)
        {
            if(countFrequencySymptom.containsKey(freq))
            {
                countFrequencySymptom.put(freq, countFrequencySymptom.get(freq)+1);
            }
            else
            {
                countFrequencySymptom.put(freq, 1);
            }
        }
        return countFrequencySymptom;
    }
}

