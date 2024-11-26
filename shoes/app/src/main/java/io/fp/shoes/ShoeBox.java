package io.fp.shoes;

public class ShoeBox<T extends Shoe> extends Box<T>{

    public ShoeBox(T a) {
        super(a);
    }
   
}
