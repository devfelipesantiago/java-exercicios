package course.POO;

import course.entities.Rent;

import java.util.Scanner;

public class AppRent {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rent[] room = new Rent[10];
        System.out.print("How many rooms will be rented? ");
        int quantityRoom = sc.nextInt();

        for (int i = 1; i <= quantityRoom; i++) {
            sc.nextLine();

            System.out.println("Rent #"+i+":");
            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.println("Room: ");
            int numberRoom = sc.nextInt();
            room[numberRoom] = new Rent(name, email);
        }

        System.out.println("Busy rooms:");
        for (int i = 0; i < room.length; i++) {
            if (room[i] != null){
                System.out.println(i+": "+room[i]);
            }
        }

        sc.close();
    }
}
