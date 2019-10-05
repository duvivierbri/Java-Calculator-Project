package calcpackage;
import java.util.Scanner;
import java.lang.Math.*;

public class MyCalculator{
   
   public static void main(String [] args){
    
    Scanner scnr = new Scanner(System.in);
    String answer = "";
    
    do {
    System.out.println("Enter the calculator mode: Standard/Scientific?");
    String mode = scnr.next();
    
    if (mode.equalsIgnoreCase("Standard")){
     System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
    } 
    
    
    if (mode.equalsIgnoreCase("Scientific")) {
       System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
    }
    
    String operation = scnr.next();
    
    //Setting up operations
    if (operation.equals("+")){
     System.out.println("How many numbers do you want to add:");
    }
    
    if (operation.equals("*")){
     System.out.println("How many numbers do you want to multiply:");
    }
    
    if (operation.equals("-")){
     System.out.println("How many numbers do you want to subtract:"); 
    }
    
    if (operation.equals("/")){
     System.out.println("How many numbers do you want to divide:");
    }
    
    if (operation.equalsIgnoreCase("sin")) {
    	if (mode.equalsIgnoreCase("standard")) {
    		System.out.println("Invalid Operation");
    	} else if (mode.equalsIgnoreCase("scientific")){
    		System.out.println("Please enter how many number you would like to calculate");
    	}
    }
    
    if (operation.equalsIgnoreCase("cos")) {
    	if (mode.equalsIgnoreCase("standard")) {
    		System.out.println("Invalid Operation");
    	} else if (mode.equalsIgnoreCase("scientific")){
    		System.out.println("Please enter how many number you would like to calculate");
    	}
    }
    
    if (operation.equalsIgnoreCase("tan")) {
    	if (mode.equalsIgnoreCase("standard")) {
    		System.out.println("Invalid Operation");
    	} else if (mode.equalsIgnoreCase("scientific")){
    		System.out.println("Please enter the number you would like to calculate");
    	}
    }
    
    int howManyNum = scnr.nextInt(); //Takes how many numbers
    
    //____________________________________________________________
    
    //Inputing numbers
    
    System.out.println("Input your numbers");
    
    //double userNumbers = scnr.nextInt();
    double result = 0;
    //double startValue = scnr.nextDouble();
    
    if (operation.equals("+")) {
     for(int n = 0; n < howManyNum; ++n) {
    	 result = result + scnr.nextInt();
     }
    }
    
    if (operation.equals("-")) {
    	
    	for(int n = 0; n < howManyNum; ++n) {
    		if (n == 0) {
    			result = scnr.nextDouble();
    		} else {
    			result = result - scnr.nextInt();
    		}
    	}
    }
    
    if (operation.equals("*")) {
    	for (int n = 0; n < howManyNum; ++n) {
    		if (n == 0) {
    			result = scnr.nextDouble();
    		}else {
    		result = (result * scnr.nextInt());
    		}
    	}
    }
    
    if (operation.equals("/")) {
    	for (int n = 0; n < howManyNum; ++n) {
    		if (n == 0) {
    			result = scnr.nextDouble();
    		}else {
    		result = (result / scnr.nextInt());
    		}
    	}
    }
    
    if (operation.equalsIgnoreCase("sin")) {
    	result = scnr.nextDouble();
    	result = Math.sin(result);
    }
    
    if (operation.equalsIgnoreCase("cos")) {
    	for (int n = 0; n < howManyNum; ++n) {
    		if (n == 0) {
    			result = Math.toRadians(scnr.nextDouble());
    		}else {
    			result = Math.cos(result);
    		}
    	}
    }
    
    if (operation.equalsIgnoreCase("tan")) {
    	for (int n = 0; n < howManyNum; ++n) {
    		if (n == 0) {
    			result = Math.toRadians(scnr.nextDouble());
    		}else {
    			result = Math.tan(result);
    		}
    	}
    }
    
    System.out.println("Your Answer: " + result);
    
    System.out.println("Would you like to play again? Y/N");
    answer = scnr.next();
    
    }while(!answer.equalsIgnoreCase("n"));

    
}
}

   

