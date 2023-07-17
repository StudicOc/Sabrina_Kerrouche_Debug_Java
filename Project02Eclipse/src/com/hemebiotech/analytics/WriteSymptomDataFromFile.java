package com.hemebiotech.analytics;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteSymptomDataFromFile implements ISymptomWriter {

    private final String filepath;

    /**
     *
     * @param filepath a full or partial path to file with symptom strings in it, one per line
     */
    public WriteSymptomDataFromFile(String filepath) {
        this.filepath = filepath;
    }
    @Override
    public void writeSymptoms(Map<String, Integer> symptoms) {


        //Flux en sortie

        // Collection Map
        Map<String, Integer> map = new HashMap<>();

        try {
            //Creating a bufferedWriter that uses the filepath
            // New file object

            BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
            //Integer line = entry.getKey();
            //String headCount = entry.getValue();
           // method put ?!
            // Add symptoms and their quantities : iteration + method write





           writer.newLine();
           writer.close();
			}




        catch (IOException e) {
				e.printStackTrace();
			}


    }
}
