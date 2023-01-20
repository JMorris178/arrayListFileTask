package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String[] data = new String[]{"hello", "this","is", "the", "data"};
        ArrayList<String> list = new ArrayList<String>();
        boolean append = true;
        //creates file
        String fileName = PersistentArrayList.createNewFile();
        //puts stuff in file
        PersistentArrayList.listSetup(data, fileName, append, list);
        //get
        Scanner myInput = new Scanner(System.in);
        int indexInput = myInput.nextInt();
        String output = PersistentArrayList.getIndex(indexInput,list);
        System.out.println(output);
        //add
        String newInput = myInput.next();
        PersistentArrayList.add(newInput, append, fileName);
        //clear (currently in comments so it doesn't break code)
        //append = false; //append to false so it deletes whats on the line first
        //PersistentArrayList.clearData(append, fileName);
        //append = true;
        //get size
        int sizeOfFile = PersistentArrayList.getSizeOfFile(fileName);
        System.out.println(sizeOfFile);
        //contains
        String elementToFind = myInput.next();
        PersistentArrayList.contains(elementToFind);
    }
}
