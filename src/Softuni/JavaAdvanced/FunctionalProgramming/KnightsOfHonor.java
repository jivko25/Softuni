package Softuni.JavaAdvanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Consumer<String> consumer = name -> System.out.println("Sir " + name);

        Arrays.stream(sc.nextLine().split("\\s+")).forEach(consumer);
    }
}
