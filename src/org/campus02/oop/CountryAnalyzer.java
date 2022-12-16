package org.campus02.oop;

import java.util.HashMap;

public class CountryAnalyzer extends PersonAnalyzer{

    private HashMap<String, Integer> result = new HashMap<>();

    public CountryAnalyzer() {
        this.result = result;
    }

    public HashMap<String, Integer> getResult() {
        return result;
    }

    @Override
    public void analyze() {
        for (Person person: super.getPersons()) {
            String country = person.getCountry();
            if(result.containsKey(country)){
                result.put(country, result.get(country)+1);
            }else{
                result.put(country, 1);
            }
        }
    }
}
