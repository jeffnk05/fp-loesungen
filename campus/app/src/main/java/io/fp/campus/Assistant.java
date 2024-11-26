package io.fp.campus;

public class Assistant {
    
    private String name;
    private int age;
    private Professor boss;
    private Faculty faculty;

    public Assistant(String name, int age, Faculty faculty){
        this.name = name;
        this.age = age;
        this.faculty = faculty;
    }

    public  void setBoss(Professor professor){
        this.boss = professor;
    }

    public Professor getBoss(){
        return boss;
    }

    @Override
    public String toString(){
        return name;
    }

    public boolean hasBoss(){
        return boss != null;
    }
}
