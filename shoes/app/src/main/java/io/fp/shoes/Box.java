package io.fp.shoes;

public abstract class Box<T> {
    
    protected T a;

    public Box(T a) {
        this.a = a;
    }

    public void remove(){
        this.a = null;
    }

    public void put(T a){
        this.a = a;
    }
    
    @Override
    public String toString() {
        return "Box [a=" + a + "]";
    }
}
