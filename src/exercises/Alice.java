package exercises;

import java.util.Scanner;

public class Alice {
		
	public void search() {
		Scanner scanner= new Scanner(System.in);
	   String firstSentence="Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?";
	   
	   System.out.println("Please enter the word or phrase you are looking for");
	   
	   String search=scanner.nextLine();
	   
	   
	   if(firstSentence.contains(search)){

		   System.out.println("true");
		   
	   }
	   else {
		   System.out.println("false");
	   }
	}
	

	public static void main(String[] args) {
		Alice obj = new Alice();
		obj.search();
	}

}
