package io.fp.campus;

import java.util.ArrayList;

public class Faculty {
    
    private String name;
    private ArrayList<Professor> profs;
    private ArrayList<Assistant> assis;

    public Faculty(String name){
        this.name = name;
        this.profs = new ArrayList<Professor>();
        this.assis = new ArrayList<Assistant>();
    }

    public void addProfessor(Professor professor){
        profs.add(professor);
    }

    public void addAssistant(Assistant assistant){
        assis.add(assistant);
    }

    public ArrayList<Assistant> getAssistantsOfProfessor(Professor professor){
        ArrayList<Assistant> assisFound = new ArrayList<>();

        for(Assistant assi : assis){
            if (assi.hasBoss() && assi.getBoss().equals(professor)) {
                assisFound.add(assi);
            }
        }
        return assisFound;
    }

    public ArrayList<Professor> getProfessorWithAssistant(){
        ArrayList<Professor> profsFound = new ArrayList<>();
        for (Assistant assi : assis){
            if (assi.hasBoss() && !profsFound.contains(assi.getBoss())){
                profsFound.add(assi.getBoss());
            }
        }
        return profsFound;
    }

    public int getAmountProfs(){
        return profs.size();
    }

    public int getAmountAssis(){
        return assis.size();
    }

    @Override
    public String toString() {
        return "Faculty [name=" + name + ", assis=" + assis + ", profs=" + profs + "]";
    }

    
}
