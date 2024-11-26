package io.fp.campus;

public class Professor {
    
    private String name;
    private int age;
    private String researchArea;
    private boolean isTalking;
    private Faculty faculty;

    public Professor(String name, int age, Faculty faculty) {
        this.name = name;
        this.age = age;
        this.faculty = faculty;
        this.isTalking = true;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    public String getResearchArea(){
        return researchArea;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
