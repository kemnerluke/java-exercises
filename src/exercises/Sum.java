package exercises;

import java.util.ArrayList;
import java.util.List;

public class Sum {
	
	
	public static void even(int[] obj) {
		
		int sum=0;
		
		
		for(int i=0;i<obj.length;i++) {
			
		
			int number =obj[i];
			
			if(!(number%2==0)) {
				System.out.println(i+" is a even number:");
				sum+=i;

			}
			else {
				System.out.println("\n"+i+" is not a even number");
			}
		 }
			System.out.println("SUM "+sum);

	}

	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6,7,8,9,10,11};

		
		even(array);
	}

}
