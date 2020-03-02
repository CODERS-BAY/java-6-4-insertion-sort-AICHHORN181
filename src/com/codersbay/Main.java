package com.codersbay;

public class Main {

    public static void main(String[] args) {
        int [] list = {5,4,5,14,9,4,6,8,99,14,566,4,99,654,96,85899};
        int j=0; int wert=0;

        for (int i = 1; i < list.length-1; i++){
            wert=list[i];
            j=i;
            while ((j > 0) && (list[j-1] > wert)) {
                list[j] = list[j - 1];
                j--;
            }
            list[j]=wert;
        }

        System.out.println(java.util.Arrays.toString(list));
    }

}