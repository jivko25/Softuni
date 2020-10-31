package Softuni.Fundamentals.ObjectsAndClasses;
import java.util.Scanner;

public class Articles {
	public static class ContentFiller{
		String title;
		String content;
		String author;
		
		public void setTitle(String newTitle) {
			if(" ".equals(newTitle.charAt(1))) {
			newTitle = newTitle.replaceFirst(" ", "");
			}
			title = newTitle;
		}
		
		public void setContent(String newContent) {
			if(" ".equals(newContent.charAt(1))) {
				newContent = newContent.replaceFirst(" ", "");
				}
			content = newContent;
		}
		
		public void setAuthor(String newAuthor) {
			if(" ".equals(newAuthor.charAt(1))) {
				newAuthor = newAuthor.replaceFirst(" ", "");
				}
			author = newAuthor;
		}
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String [] arr = input.split(",");
		ContentFiller filler = new ContentFiller();
		filler.setTitle(arr[0]);
		filler.setContent(arr[1]);
		filler.setAuthor(arr[2]);
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 1;i<=n;i++) {
			String action = sc.nextLine();
			String [] actionArr = action.split(": ");
			switch (actionArr[0]) {
			case "Edit":
				filler.setContent(actionArr[1]);
				break;
			case "Rename":
				filler.setTitle(actionArr[1]);
				break;
			case "ChangeAuthor":
				filler.setAuthor(actionArr[1]);
				break;

			default:
				break;
			}
		}
		System.out.printf("%s - %s: %s",filler.title,filler.content,filler.author);
	}
}
