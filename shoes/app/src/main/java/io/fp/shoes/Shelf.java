package io.fp.shoes;

import java.util.ArrayList;

public class Shelf {
    
    private ArrayList<ArrayList<ShoeBox<? extends Shoe>>> shelf;
    private double height;
    private double width;

    public Shelf(double height, double width){
        this.height = height;
        this.width = width;
        shelf = new ArrayList<>();
    }

    public void add(ShoeBox<? extends Shoe> shoeBox){
        shelf.add(shoeBox);
    }
}
