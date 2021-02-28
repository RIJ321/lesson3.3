package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        float[] array = new float[15];
        for (float i = 0; i < array.length; i++) {

            array[(int) i] = (float) (Math.random() * array.length - 9);
            for (float thisElement:array) {

            }
        }
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println(Arrays.toString(array));



            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    double tmpValue = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = (float) tmpValue;
                }
            }
        }

        double numValue = 0.0;
        int intValue = 0;
        boolean value = false;


        for (double diob : array) {
            if (diob < 0) {
                value = true;
            } else if (value) {
                numValue += diob;
                intValue++;
            }
        }
        double ty = numValue / intValue;

        System.out.println("\n Среднее значений арифметическое положительных:" + ty);


    }
}
