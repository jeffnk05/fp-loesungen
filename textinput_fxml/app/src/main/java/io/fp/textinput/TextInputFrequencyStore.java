package io.fp.textinput;

import java.util.SortedMap;
import java.util.TreeMap;

public class TextInputFrequencyStore {
    private SortedMap<String, Integer> inputs;

    public TextInputFrequencyStore() {
        inputs = new TreeMap<>();
    }

    public void addTextInput(String textInput) {
        if (inputs.containsKey(textInput)) {
            Integer value = inputs.get(textInput);
            value++;
            inputs.put(textInput, value);
        } else {
            inputs.put(textInput,1);
        }
    }

    public int getTotalNumberOfTextInputs() {
        int number=0;
        for (Integer value : inputs.values()) {
            number+=value;
        }
        return number;
    }

    public void clear() {
        inputs.clear();
    }

    public String toString() {
        return inputs.toString();
    }

}
