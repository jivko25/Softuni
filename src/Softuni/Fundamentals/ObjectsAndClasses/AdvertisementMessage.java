package Softuni.Fundamentals.ObjectsAndClasses;
import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
	static class Messeges{
		String [] Phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
		String [] Events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
		String [] Authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
		String [] Cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Random rd = new Random();
		Messeges ad = new Messeges();
		for(int i = 1;i<=n;i++) {
		System.out.printf("%s %s %s - %s",ad.Phrases[rd.nextInt(6)],ad.Events[rd.nextInt(5)],ad.Authors[rd.nextInt(7)],ad.Cities[rd.nextInt(4)]);
		System.out.println();
		}
	}
}
