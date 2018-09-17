

import org.testng.annotations.Test;

public class JavaProgram {

	@Test
	public void reverseOfString() {
		String name = "Sudheer Reddy";
		String revName = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			revName = revName + name.charAt(i);
		}
		System.out.println("Reverse String is...." + revName);
	}

	@Test
	public void oddAndEvenNumber() {
		int n = 91;
		if (n % 2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("odd number");
			System.out.println("odd number");
			System.out.println("odd number");
			System.out.println("odd number");
			System.out.println("odd number");
			System.out.println("odd number");
		}
	}

	@Test
	public void palindromeOfString() {
		String name = "Malayalam";
		String revName = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			revName = revName + name.charAt(i);
		}
		if (name.equalsIgnoreCase(revName)) {
			System.out.println("Palindrome number");
		} else {
			System.out.println("Not a palindrome number");
		}
	}

	@Test
	public void palindromeOfNumber() {
		int num = 121, reversedInteger = 0, remainder, originalInteger;

		originalInteger = num;

		// reversed integer is stored in variable
		while (num != 0) {
			remainder = num % 10;
			reversedInteger = reversedInteger * 10 + remainder;
			num /= 10;
		}

		// palindrome if orignalInteger and reversedInteger are equal
		if (originalInteger == reversedInteger)
			System.out.println(originalInteger + " is a palindrome.");
		else
			System.out.println(originalInteger + " is not a palindrome.");
	}

	@Test
	public void fibanocciNumber() {
		int n = 10, t1 = 0, t2 = 1;

		for (int i = 1; i < n; i++) {
			System.out.println(t1 + "  ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
	}
	
	@Test
	public void palindrome() {
		int num=121;int remainder,rev=0;
		while (num!=0) {
			remainder=num%10;
			rev=rev*10+remainder;
			num=num/10;			
		}		
	}
	
	@Test
	public void factNumber(){
		int j=1,num=5,fact=1;
		for ( j = 1; j < num; j++) {
			fact=fact*j;
		}
		System.out.println("factorial is...."+fact);		
	}
	
	@Test
	public void duplicateCount() {
		String str = "w3schools";
		  int cnt = 0;
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) {
		   for (int j = i + 1; j < str.length(); j++) {
		    if (inp[i] == inp[j]) {
		     System.out.println(inp[j]);
		     cnt++;
		     break;
		    }
		   }
		  }
	}

	@Test
	public void bubleSort(){
		int[] arr= {1,2,1,4,67};
		int n=arr.length;
		int temp=0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n-1; j++) {
				if (arr[j-1]>arr[j]){
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;					
				}
			}
			
		}
		for (int j = 0; j< arr.length; j++) {
			System.out.println("Array is.."+arr[j]);
			
		}
	}
}
