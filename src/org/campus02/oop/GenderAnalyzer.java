package org.campus02.oop;

public class GenderAnalyzer extends PersonAnalyzer{
    @Override
    public void analyze() {
        int countM = 0;
        int countF = 0;

        int heightM = 0;
        int heightF = 0;

        for(Person person: super.getPersons()) {
            if (person.getGender() == 'M') {
                countM++;
                heightM += person.getSize();
            }
            if (person.getGender() == 'F') {
                countF++;
                heightF += person.getSize();
            }
        }
        System.out.println();
        System.out.println("In der Liste existieren " + countM + " Männer mit einer durchschnittlichen " +
                    "Körpergröße von " + (heightM/countM) + " cm.");
        System.out.println("In der Liste existieren " + countF + " Frauen mit einer durchschnittlichen " +
                    "Körpergröße von " + (heightF/countF) + " cm.");
        }

    }

