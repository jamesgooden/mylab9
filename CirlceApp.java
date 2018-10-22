import java.util.Scanner;

public class CirlceApp {
	static int radius;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isValid;
      String  userContinue;
      String userName;
		System.out.println("Welcome to the Circle Tester ");
		System.out.println("Whats your name?");
		userName = scan.next();
		System.out.println("Nice to meet you " + userName + "!");
	do {	
		System.out.println("Please enter the radius for your circle");
	

		do {


		if (scan.hasNextInt()) {
			radius = scan.nextInt();
	     	isValid = true;
		
		}
		
        else {

			System.out.println("Sorry that isnt a valid entry please enter a number");
	       isValid = false;
			scan.next();
		}

	      }  while (! (isValid));
		Circle circle = new Circle(radius);
   System.out.println("Circumference : " + circle.getFormattedCircumference(radius));
   System.out.println("Area: "  + circle.getFormattedArea(radius));
   System.out.println("Would you like to continue? Press Y or any key to end ");
	userContinue = scan.next();
	}while (userContinue.equalsIgnoreCase("Y"));
    System.out.println("Thank you for using my application " + userName+ ". Goodbye");
	}
	
	
	}
	

	

	
	
	
	
	


