package org.campus02.oop;

import java.util.ArrayList;
import java.util.HashSet;

public class MaxSalaryAnalyzer extends PersonAnalyzer{

    @Override
    public void analyze() {
        int highestsalary = 0;
        HashSet<Person> highestsalarylist = new HashSet<>();
        for (Person person: super.getPersons()) {
            if(person.getSalary() == highestsalary){
                highestsalarylist.add(person);
            }
            if(person.getSalary() > highestsalary){
                highestsalary = person.getSalary();
                highestsalarylist.clear();
                highestsalarylist.add(person);
            }
        }
        for(Person person: super.getPersons()){
            System.out.println(person);
        }
    }
}
