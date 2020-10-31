package Softuni.Fundamentals.ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Articles2 {
	static class Article{
		String title;
		String content;
		String author;
		
		public Article(String title,String content,String author) {
			this.title = title;
			this.content = content;
			this.author = author;
		}
		
		public String getTitle(){
			return title;
		}
		
		public String getContent() {
			return content;
		}
		
		public String getAuthor() {
			return author;
		}
		
		public String toString() {
			return String.format("%s - %s: %s", getTitle(),getContent(),getAuthor());
		}
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		List<Article> allArticles = new ArrayList<>();
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0;i<n;i++) {
			String input = sc.nextLine();
			String [] arr = input.split(", ");
			allArticles.add(new Article(arr[0], arr[1], arr[2]));
		}
		String typeOfSort = sc.nextLine();
		if("title".equals(typeOfSort)) {
		allArticles.stream()
		.sorted((p1,p2) -> p1.getTitle().compareTo(p2.getTitle()))
		.forEach(person -> System.out.println(person.toString()));
		}
		else if("content".equals(typeOfSort)) {
			allArticles.stream()
			.sorted((p1,p2) -> p1.getContent().compareTo(p2.getContent()))
			.forEach(person -> System.out.println(person.toString()));
			}
		else if("author".equals(typeOfSort)) {
			allArticles.stream()
			.sorted((p1,p2) -> p1.getAuthor().compareTo(p2.getAuthor()))
			.forEach(person -> System.out.println(person.toString()));
			}
	}
}
