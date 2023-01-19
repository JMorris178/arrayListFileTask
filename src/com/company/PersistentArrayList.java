package com.company;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;  // IOException class handles errors
public class PersistentArrayList {
    public static void listSetup(String[] data, String fileName, boolean append){
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < data.length; i++){
            list.add(data[i]);
        }
        int count = 0;
        try (PrintWriter pr = new PrintWriter(new FileWriter(fileName, append))) {
            for(int i = 0; i < list.size(); i++){
                pr.println(list.get(i));
            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String createNewFile(){
        try {
            File fileCreate = new File("output.txt");
            if (fileCreate.createNewFile()) {
                System.out.println("File created: " + fileCreate.getName());
            } else {
                System.out.println("File exists");
            }
            String fileName =  fileCreate.getName();
            return(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return("");
    }

    public static int getIndex(int indexInput){
        String output = 
    }


}
