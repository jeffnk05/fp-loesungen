package io.fp.textinput;

import java.util.SortedMap;
import java.util.TreeMap;

import javafx.scene.control.TextField;

public class TextFrequencyStore {
    
    private SortedMap<String, Integer> memory;

    public TextFrequencyStore(){
        memory = new TreeMap<String, Integer>();
    }

    public void addTextInput(String textInput){
        if(memory.containsKey(textInput)) {
            Integer value = memory.get(textInput);
            value++;
            memory.put(textInput, value);
        } else {
            memory.put(textInput,1);
        }

    }

    public int getTotalNumberOfTextInputs() {
        return memory.keySet().size();
    }

    public void clear(){
        memory.clear();
    }

    @Override
    public String toString() {
        return "TextFrequencyStore [memory=" + memory + "]";
    }

    public void addTextInput(TextField textInput) {
    }

    
}
