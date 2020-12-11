package Softuni.Fundamentals.Regex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Race {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String [] arr = (sc.nextLine()).split(", ");
		String NameRegex = "[A-Za-z]";
		Pattern NamePattern = Pattern.compile(NameRegex);
		Pattern NumPattern = Pattern.compile("(\\d)");
		String [] places = {"1st", "2nd", "3rd"};
		Map<String, Integer> participiants = new HashMap<>();
		for(int i = 0;i<arr.length;i++) {
			participiants.put(arr[i],0);
		}
		String input = sc.nextLine();
		while(!"end of race".equals(input)) {
			Matcher NameMatcher = NamePattern.matcher(input);
			Matcher NumMatcher = NumPattern.matcher(input);
			StringBuilder sb = new StringBuilder();
			int value = 0;
			while(NameMatcher.find()) {
				sb.append(NameMatcher.group());
			}
			while(NumMatcher.find()) {
				value += Integer.parseInt(NumMatcher.group());
			}
			if(participiants.get(sb.toString()) != null) {
				participiants.put(sb.toString(), participiants.get(sb.toString()) + value);
			}
			input = sc.nextLine();
		}
		int [] n = {0};
		participiants.entrySet().stream()
		.sorted((a,b) -> Integer.compare(b.getValue(),a.getValue()))
		.limit(3)
		.forEach(e -> {
			System.out.printf("%s place: %s\n",places[n[0]],e.getKey());
			n[0]++;
		});;
	}
}
