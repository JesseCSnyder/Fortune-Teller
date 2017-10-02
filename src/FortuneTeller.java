import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the Fortune Teller.");
		System.out.println("By entering a few details about yourself; I can tell you about your future!");
		System.out.println("Please enter your first name:");

		String firstName = input.nextLine();

		System.out.println("And your last name:");

		String lastName = input.nextLine();

		System.out.println("Your age?");

		int age = input.nextInt();

		System.out.println("What month were you born in numerically?");

		int birthMonth = input.nextInt();

		input.nextLine(); // line prevents input error

		System.out.println("What is your favorite ROYGBIV color?  "
				+ "If you would like a list of those colors, please type 'Help' for assistance.");

		String favColor = input.nextLine();
		String roygbiv = "Red, Orange, Yellow, Green, Blue, Indigo, and Violet";

		if (favColor.equalsIgnoreCase("help"))

		{
			System.out.println(roygbiv);
			System.out.println("What is your favorite ROYGBIV color?  ");
			favColor = input.nextLine();
			System.out.println("How many siblings do you have?");
		}

		else {
			System.out.println("How many siblings do you have?");
		}

		int numSiblings = input.nextInt();

		String retireYear;

		if (age % 2 == 0) {
			retireYear = "20 years";
		} else {
			retireYear = "25 years";
		}

		String vacationHome;

		if (numSiblings == 0) {
			vacationHome = "Paris, France";
		} else if (numSiblings == 1) {
			vacationHome = "Rome, Italy";
		} else if (numSiblings == 2) {
			vacationHome = "London, England";
		} else if (numSiblings == 3) {
			vacationHome = "Berlin, Germany";
		} else if (numSiblings > 3) {
			vacationHome = "Madrid, Spain";
		} else if (numSiblings < 0) {
			vacationHome = "Chillicothe, Ohio";
		} else {
			vacationHome = "Chillicothe, Ohio";
		}

		String modeTransport;

		switch (favColor.toLowerCase()) {
		case "red": {
			modeTransport = "donkey";
		}
			break;
		case "orange": {
			modeTransport = "cheetah";
		}
			break;
		case "yellow": {
			modeTransport = "stilts";
		}
			break;
		case "green": {
			modeTransport = "foot";
		}
			break;
		case "blue": {
			modeTransport = "bus";
		}
			break;
		case "indigo": {
			modeTransport = "bicycle";
		}
			break;
		case "violet": {
			modeTransport = "unicycle";
		}
			break;
		default: {
			modeTransport = "flying carpet";
		}
		}

		String bankBalance;

		if ((birthMonth >= 1) && (birthMonth <= 4)) {
			bankBalance = "$150,000";
		} else if ((birthMonth >= 5) && (birthMonth <= 8)) {
			bankBalance = "$200,000";
		} else if ((birthMonth >= 9) && (birthMonth <= 12)) {
			bankBalance = "$100,000";
		} else {
			bankBalance = "$1";
		}

		System.out.println(firstName + " " + lastName + " will retire in " + retireYear + " with " + bankBalance
				+ " in the bank, " + "a vacation home in " + vacationHome + ", and travel by " + modeTransport + ".");

		input.close();

	}
}
	



		
		
		
	

	


