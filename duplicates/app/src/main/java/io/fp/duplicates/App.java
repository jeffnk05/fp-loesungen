/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.fp.duplicates;

import java.util.HashSet;
import java.util.Set;

public class App {
    
    public static void main(String[] args) {
        
        Set<String> unicate = new HashSet<String>();
        Set<String> duplicate = new HashSet<String>();

        for(String word: args){
            if(!unicate.add(word)){
                duplicate.add(word);
            }
        }
        unicate.removeAll(duplicate);
        System.out.println("Unicates: " + unicate);
        System.out.println("Duplicates: " + duplicate);
    }
}
