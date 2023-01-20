package com.company;
import java.io.*;
import java.util.ArrayList;

public class PersistentArrayList {
    public static void listSetup(String[] data, String fileName, boolean append, ArrayList<String> list){

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

    public static String getIndex(int indexInput, ArrayList<String> list){
        String output = list.get(indexInput);
        return(output);
    }

    public static void add(String newInput, boolean append, String fileName){
        try (
                FileWriter fw = new FileWriter(fileName, append);
                PrintWriter pw = new PrintWriter(fw)
        ) {
            pw.println(newInput);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void clearData(boolean append, String fileName){
        try {
            FileWriter fw = new FileWriter(fileName, append);
            PrintWriter pw = new PrintWriter(fw);
            FileReader fr = new FileReader("output.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();

            while (line != null)
                pw.println("");
                line = br.readLine();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getSizeOfFile(String fileName){
        try {
            int count = 0;
            FileReader fr = new FileReader("output.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                count++;
                line = br.readLine();
            }
            return(count);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return(0);
    }

    public static void contains(String elementToFind){
        try {

            FileReader fr = new FileReader("output.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                if (line.equals (elementToFind)){
                    System.out.println("found");
                }
                line = br.readLine();

            }

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


}
