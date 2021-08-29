package Fundamentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lista {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        list.add("Anna");
        list.add("Bob");
        list.add("Paul");
        list.add("John");
        list.add("Smith");

        System.out.println(list.size());
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("-----------------------------------");
        list.removeIf(x -> x.charAt(0) == 'A');
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-----------------------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("-----------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
        for (String a : result){
            System.out.println(a);
        }

        System.out.println("-----------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);

    }
}
