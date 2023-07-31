package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter{

    private final String filepath;
    public WriteSymptomDataToFile (String filepath) {
        this.filepath = filepath;
    }
    @Override
    public void writeSymptoms(Map<String, Integer> symptoms) {

        Map<String, Integer> writeSymptoms = new HashMap<>();

        try {
            FileWriter fileWriter = new FileWriter(filepath);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (String symptom : symptoms.keySet()) {
                writer.write(symptom + " : " + symptoms.get(symptom));
                writer.newLine();
            }
            writer.close() ;

        } catch (IOException e) {
            System.out.println("Beurre " + e.getMessage()) ;
            e.printStackTrace();
        }
    }
}
