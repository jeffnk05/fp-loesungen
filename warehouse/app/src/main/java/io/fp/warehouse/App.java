/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.fp.warehouse;

import java.util.ArrayList;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
        ProductDescription pd1 = new ProductDescription("Elektronik", "Das ist eine robuste Kamera.");
        ProductDescription pd2 = new ProductDescription("Bücher", "RIch Dad, Poor Dad ist ein sehr informatives Buch");
        ProductDescription pd3 = new ProductDescription("Taschen", "Diese Tasche ist ein Unikat.");
        ProductDescription pd4 = new ProductDescription("Kleidung", "Das ist ein ökologischer Pullover.");

        ArrayList<Product<ProductDescription>> products = new ArrayList<Product<ProductDescription>>();

        Product<ProductDescription> pro = new Product<ProductDescription>(pd1, PriceLevel.HIGH);
        Product<ProductDescription> pro2 = new Product<ProductDescription>(pd2, PriceLevel.LOW);
        Product<ProductDescription> pro3 = new Product<ProductDescription>(pd3, PriceLevel.EXCLUSIVE);
        Product<ProductDescription> pro4 = new Product<ProductDescription>(pd4, PriceLevel.MEDIUM);

    

        products.add(pro);
        products.add(pro2);
        products.add(pro3);
        products.add(pro4);

        for(Product<ProductDescription> product : products){
            System.out.println(product.getProductDescription());
            System.out.println(product.getPrice());
        }
    }
}
