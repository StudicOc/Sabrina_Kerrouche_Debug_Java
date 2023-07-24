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

            FileWriter fileWriter = new FileWriter("/result.out");
            BufferedWriter writer = new BufferedWriter(fileWriter);


            // Use method write

            writer.close() ;

        } catch (IOException e) {
            System.out.println("Beurre " + e.getMessage()) ;
            e.printStackTrace();
        }




    }
}
