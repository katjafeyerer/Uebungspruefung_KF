package org.campus02.arrays;

import java.util.Arrays;

public class ArrayHelper {
    public static void main(String[] args) {
        int[] numbers = {8, 5, 1, 9, 0, 4};
        System.out.println(Arrays.toString(numbers));
        arrangeOrder(numbers);
        System.out.println(Arrays.toString(numbers));


    }
    public static void arrangeOrder(int[] numbers){
        boolean change = true;
        while(change){
            change = false;

            for (int i = 0; i < numbers.length-1; i++) {
                int left = numbers[i];
                int right = numbers[i+1];
                if(left > right){
                    numbers[i] = right;
                    numbers[i+1] = left;
                    change = true;

                }
            }

        }
    }
}
        //aufsteigend wiedergeben
        // links nach rechts arbeiten
        // aktuelles Element mit rechtem Element vergleichen
        // wenn aktuelles > rechtes --> die beiden vertauschen
        // wiederholen, bis kein vertauschen mehr möglich ist


