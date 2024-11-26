package io.fp.warehouse;

public class Product<T> {
    
    private T productDescription;
    private PriceLevel price;

    public Product(){
        
    }

    public Product(T productDescription, PriceLevel price) {
        this.productDescription = productDescription;
        this.price = price;
    }

    public T getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(T productDescription) {
        this.productDescription = productDescription;
    }

    public PriceLevel getPrice() {
        return price;
    }

    public void setPrice(PriceLevel price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [price=" + price + ", productDescription=" + productDescription + "]";
    }

}
