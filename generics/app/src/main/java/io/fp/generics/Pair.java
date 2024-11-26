package io.fp.generics;

public class Pair<T, U> {
    
    private T one;
    private U two;

    public Pair(T one, U two){
        this.one = one;
        this.two = two;
    }

    public T getOne() {
        return one;
    }

    public void setOne(T one) {
        this.one = one;
    }

    public U getTwo() {
        return two;
    }

    public void setTwo(U two) {
        this.two = two;
    }

    @Override
    public String toString() {
        return "Pair [one=" + one + ", two=" + two + "]";
    }

    
}
