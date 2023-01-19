package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String[] data = new String[]{"hello", "this","is", "the", "data"};
        boolean append = true;
        String fileName = PersistentArrayList.createNewFile();
        PersistentArrayList.listSetup(data, fileName, append);
        Scanner myInput = new Scanner(System.in);
        int indexInput = myInput.nextInt();
        PersistentArrayList.getIndex(indexInput);


    }
}
