package org.campus02.oop;

import java.util.ArrayList;

public class PersonManager {
    private ArrayList<Person> d = new ArrayList<>();

    public PersonManager() {
        this.d = d;
    }
    public void addPerson(Person p){
        d.add(p);
    }


    public ArrayList<Person> getD() {
        return d;
    }

    public void setD(ArrayList<Person> d) {
        this.d = d;
    }

    public void doAnalysis(PersonAnalyzer a){
        a.setPersons(d);
        a.analyze();
    }
}
