package org.campus02.oop;

import java.util.ArrayList;

public class BMIAnalyzer extends PersonAnalyzer{
    private ArrayList<Pair<Person, Double>> result = new ArrayList<>();

    public ArrayList<Pair<Person, Double>> getResult() {
        return result;
    }
    public

    @Override
    public void analyze() {
        for (Person p: super.getPersons()) {
            double bmi = calcBMI(p);
            Pair<Person, Double> result = new Pair<>(p, bmi);
            //result.add(bmiPair);
        }
    }
    private double calcBMI(Person p){
      //BMI = Gewicht / ((Körpergrößer / 100.0) * (Körpergrößer / 100.0))  
       // double bmi = 0;
        //for (Person p:super.getPersons()) {
        return p.getWeight() / ((p.getSize()/100)*(p.getSize()/100));
      //  }
    }
}

