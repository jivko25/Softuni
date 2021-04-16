package Softuni.Softuniada2020;

import java.util.Scanner;

public class DreamCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double income = Double.parseDouble(sc.nextLine());
        double lose = Double.parseDouble(sc.nextLine());
        double increse = Double.parseDouble(sc.nextLine());
        double target = Double.parseDouble(sc.nextLine());
        int mounths = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for(int i = 0; i < mounths;i++){
            sum += income - lose;
            income += increse;
        }
        if(sum >= target){
            System.out.println("Have a nice ride!");
        } else {
            System.out.println("Work harder!");
        }
    }
}
