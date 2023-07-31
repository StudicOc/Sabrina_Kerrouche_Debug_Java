package com.hemebiotech.analytics;


import java.util.List;
import java.util.TreeMap;

public interface ISymptomCount {
    TreeMap <String, Integer> countSymptoms (List <String> symptoms);
}
