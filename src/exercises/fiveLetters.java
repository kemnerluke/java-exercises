package exercises;

import java.lang.reflect.Array;

public class fiveLetters {
	
	
	public static void printWord(String obj []) {
		for(int i=0;i<obj.length;i++) {
			if(obj[i].length()==5) {
				System.out.println(obj[i]);
			}
		}
	}

	public static void main(String[] args) {
		String array []= {"bob","luke","tom","whizz","actor","acorn"};
		printWord(array);
		
	}

}
