package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        String data;

        try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Vladyslav\\Desktop\\Співробітники.txt"))){
            while ((data = br.readLine()) != null){
                list.add(data);
            }
        } catch (IOException e) {
            System.out.println("Nie udalo sie odczytac plik!");
        }
        System.out.println("Ilosc elementow: " + list.size());

        for (String element:list) {
            System.out.println(element);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            String element = it.next();
            System.out.println(element);
        }
    }
}
