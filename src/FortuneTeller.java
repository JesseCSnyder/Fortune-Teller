import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String firstName;
		String lastName;
		int age;
		int birthMonth;
		String favColor;
		int numSiblings;
		String roygbiv = "Red, Orange, Yellow, Green, Blue, Indigo, and Violet";
		
		System.out.println("Welcome to the Fortune Teller.");
		System.out.println("By entering a few details about yourself; I can tell you about your future!");
		System.out.println("Please enter your first name:");
		
		firstName = input.nextLine();
		
		System.out.println("And your last name:");
		
		lastName = input.nextLine();
		
		System.out.println("Your age?");
		
		age = input.nextInt();
		
		System.out.println("What month were you born in numerically?");
		
		birthMonth = input.nextInt();
			input.nextLine();
		
		System.out.println("What is your favorite ROYGBIV color?  "
				+ "If you would like a list of those colors, please type 'Help' for assistance.");
		
		favColor = input.nextLine();
		
		if (favColor.equalsIgnoreCase("help")) 
		
		{System.out.println(roygbiv);
		System.out.println("What is your favorite ROYGBIV color?  ");
		favColor = input.nextLine();
		System.out.println("How many siblings do you have?");}
		
		else {System.out.println("How many siblings do you have?");}
		
		numSiblings = input.nextInt();
		
		String retireYear;
		String vacationHome = "init";
		String modeTransport = "init";
		String bankBalance;
		
		if (age%2 == 0)
		{retireYear = "20 years";}
		else {retireYear = "25 years";}
		
		if(numSiblings == 0)
		{vacationHome = "Paris, France";}
		else if(numSiblings == 1)
		{vacationHome = "Rome, Italy";}
		else if(numSiblings == 2)
		{vacationHome = "London, England";}
		else if(numSiblings ==3)
		{vacationHome = "Berlin, Germany";}
		else if(numSiblings > 3)
		{vacationHome = "Madrid, Spain";}
		else if(numSiblings < 0)
		{vacationHome = "Chillicothe, Ohio";}
		
		switch(favColor.toLowerCase()) {
		case "red": {modeTransport = "donkey";}
		case "orange":{modeTransport = "cheetah";}
		case "yellow":{modeTransport = "stilts";}
		case "green":{modeTransport = "your feet";}
		case "blue":{modeTransport = "the bus";}
		case "indigo":{modeTransport = "bicycle";}
		case "violet":{modeTransport = "unicycle";}
		break;}
		
		if((birthMonth >=1) && (birthMonth <=4))
		{bankBalance = "$150,000";}
		else if ((birthMonth >=5) && (birthMonth <=8))
		{bankBalance = "$200,000";}
		else if ((birthMonth >=9) && (birthMonth <=12))
		{bankBalance = "$100,000";}
		else {bankBalance = "$1";}
		
		System.out.println(firstName + lastName + " will retire in " +retireYear+ " with " +bankBalance+ " in the bank, "
				+ "a vacation home in " +vacationHome+", and travel by " + modeTransport+".");
		
		input.close();
			
		}
	}
	



		
		
		
	

	


