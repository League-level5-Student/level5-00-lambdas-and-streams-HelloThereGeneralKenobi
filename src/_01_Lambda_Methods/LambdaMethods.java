package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		/*
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((s)->{
			for(int i = 0; i < s.length(); i++) {
				System.out.println(s.charAt(s.length() - i - 1));
			}
		}, "repeat");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			for(int i = 0; i < s.length(); i++) {
				if(i%2 == 0 ) {
					System.out.println(s.substring(i,i+1).toUpperCase());
				}
				else {
					System.out.println(s.substring(i,i+1));
				}
			}
		}, "repeat");
		*/
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((s)->{
			String newString = "";
			for(int i = 0; i < s.length(); i++) {
				newString = newString + s.charAt(i);
				newString = newString + ".";
			}
			System.out.println(newString);
		}, "hello");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			String newString = "";
			for(int i = 0; i < s.length(); i++) {
				if(s.substring(i,i+1) == "a" || s.substring(i,i+1) == "e" || s.substring(i,i+1) == "i" || s.substring(i,i+1) == "o" || s.substring(i,i+1) == "u") {
					
				} else {
					newString = newString + s.substring(i,i+1);
				}
			}
			System.out.println(newString);
		}, "hello");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
