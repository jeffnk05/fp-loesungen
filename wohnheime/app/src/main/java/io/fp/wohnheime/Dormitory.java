package io.fp.wohnheime;

import java.util.ArrayList;

public class Dormitory {
    
    private ArrayList<SharedFlat> flats;
    
    public Dormitory(){
        flats = new ArrayList<>();

        flats.add(new SharedFlat());
    }

    public Dormitory(ArrayList<SharedFlat> flats){
        this.flats = flats;
    }

    public int amountOfRentingStudents(){
        int res = 0;
        for (SharedFlat flat : flats){
            res += flat.amountOfStudents();
        }
        return res;
    }

    public ArrayList<String> getNamesOfStudemts(){
        ArrayList<String> namesFound = new ArrayList<>();

        for(SharedFlat flat : flats){
            namesFound.add(flat.getStudents().toString());
        }
        return namesFound;
    }
    
    //Korrekte Lösung
    public ArrayList<String> getStudentsName(){
        ArrayList<String> names = new ArrayList<>();
        for(SharedFlat flat : flats){
            for(Student student : flat.getStudents()){
                names.add(student.getName());
            }
        }
        return names;
    }

    
}
