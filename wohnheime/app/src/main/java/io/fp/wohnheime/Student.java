package io.fp.wohnheime;

public class Student {
    
    private String name;
    private String studyProgram;

    public Student(String name, String studyProgram){
        this.name = name;
        this.studyProgram = studyProgram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudyProgram() {
        return studyProgram;
    }

    public void setStudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + "]";
    }
    
    
}
