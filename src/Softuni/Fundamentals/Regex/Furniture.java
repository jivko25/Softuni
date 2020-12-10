package Softuni.Fundamentals.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Furniture {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String regex = "^>>(?<name>[A-Za-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)$";
		Pattern pattern = Pattern.compile(regex);
		List<String> furniture = new ArrayList<>();
		
		double sum = 0;
		while(!"Purchase".equals(input)) {
			Matcher matcher = pattern.matcher(input);
			if(matcher.find()) {
			String name = matcher.group("name");
			double value = Double.parseDouble(matcher.group("price"));
			int quantity = Integer.parseInt(matcher.group("quantity"));
			sum += (value * quantity);
			furniture.add(name);
			}
			input = sc.nextLine();
		}
		System.out.println("Bought furniture:");
		furniture.forEach(p -> System.out.println(p));
		System.out.printf("Total money spend: %.2f", sum);
	}
}
