/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.fp.generics;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        
        Pair<String, Integer> pair1 = new Pair<String, Integer>("Foo", 1);
        
        String name = pair1.getOne();
        int y = pair1.getTwo();
        System.out.println(name);
    }
}