/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.fp.filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException {
        File inputFile = new File("/Users/jeff/Desktop/FP/FP-Projekte/filehandling");
        File outputFile = new File("average.txt");

        FileReader in = new FileReader(inputFile);
        FileWriter out = new FileWriter(outputFile);
        
        BufferedReader br = new BufferedReader(in);
        BufferedWriter bw = new BufferedWriter(out);

        String line = br.readLine();
        List<Double> buffer = new ArrayList<>();
        double res = 0;

        while(line != null){
            buffer.add(Double.parseDouble(line));
        }

        for(Double sum : buffer){
            res += sum;
        }

        res = res / buffer.size();

        bw.write("The average is: " + res);
        
        br.close();
		bw.close();


        

    }
}
