package io.fp.wohnheime;

import java.util.ArrayList;

public class SharedFlat {
    
    private ArrayList<Student> students;
    private int maxNumberOfStudents;

    public SharedFlat(int maxNumberOfStudents) {
        this.maxNumberOfStudents = maxNumberOfStudents;
        this.students = new ArrayList<Student>();
    }

    public SharedFlat() {
        this.maxNumberOfStudents = 1;
        this.students = new ArrayList<Student>();
    }

    public ArrayList<Student> getStudents(){
        return students;
    }
    
    public int amountOfStudents(){
        return students.size();
    }

    public void addStudent(Student student){
        if (students.size() < maxNumberOfStudents){
            students.add(student);
            System.out.println(student.getName() + " moved in.");
        }
        else {
            System.out.println("The shared flat is full. You cannot move in " + student.getName() + ".");
        }
    }
}
