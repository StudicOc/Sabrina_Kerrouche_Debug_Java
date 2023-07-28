package com.hemebiotech.analytics;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter{


    @Override
    public void writeSymptoms(Map<String, Integer> symptoms) {


        Map<String, Integer> writeSymptoms = new HashMap<>();

        try {

            FileWriter fileWriter = new FileWriter("./result.out");
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // Keyset : récupérer un set(unique( récupérer les clés de ma map) des cles
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

// Creates a Writer using FileWriter
//Writer output = new FileWriter("output.txt");
// Writes string to the files
// output.write(data);

// Closes the writer
//output.close();