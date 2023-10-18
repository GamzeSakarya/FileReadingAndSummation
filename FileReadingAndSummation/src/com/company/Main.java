package com.company;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        String fileName = "src\\com\\company\\file.txt"; //okunacak dosyanın adı
        int total = 0; //Sayıların toplamını saklayacak değişken
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = br.readLine()) != null){
                int number = Integer.parseInt(line);
                total += number;
            }
            System.out.println("Dosyadaki sayıların toplamı : " + total);
        }
        catch(IOException e){
            System.out.println("Dosya okuma hatası :" + e.getMessage());
        }
        }
}
