package io.fp.counter.model;

public class CounterModel {
    
    private int counter = 0;

    public int getCounter(){
        return counter;
    }

    public void setCounter(int counter){
        this.counter = counter;
    }
    
    public void increaseCounter(){
        counter++;
    }
}
