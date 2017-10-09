package JetProgram;

import java.util.Scanner;

public class JetsProject {

	static EnterJetInfo custom = new EnterJetInfo();
	static int num = 0;
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		printOptionsMenu();
		System.out.println("Please select a number from the menu:");
		num = kb.nextInt();
		

		if (num == 1) {
			printJetMenu();

			int input = 0;
			System.out.println("Please select a Jet you want to see:");
			input = kb.nextInt();

			if (input == 1) {
				F35 f = new F35();
			} else if (input == 2) {
				F15 f1 = new F15();
			} else if (input == 3) {
				F22 f22 = new F22();
			} else if (input == 4) {
				F18 f18 = new F18();
			} else if (input == 5) {
				SR71 sr71 = new SR71();
			} else if (input == 6) {

			}

			else if (num == 2) {
				SR71 sr71 = new SR71();
			} else if (num == 3) {
				F15 f15 = new F15();
			} else if (num == 4) {
				custom.getModel();
				
				custom.getSpeed();
				custom.getRange();
				custom.getPrice();
			} else if (num == 5) {
				System.exit(0);
			}
		}
	}

	

	public static void printOptionsMenu() {
		System.out.println("---------------------------------");
		System.out.println("|(1) List fleet-----------------|");
		System.out.println("|(2) View fastest jet-----------|");
		System.out.println("|(3) View jet with longest range|");
		System.out.println("|(4) Add a jet to the fleet-----|");
		System.out.println("|(5) Quit-----------------------|");
		System.out.println("---------------------------------");

	}

	public static void printJetMenu() {
		System.out.println("---------------------------------");
		System.out.println("|(1) F-35A Lightning II --------|");
		System.out.println("|(2) F-15 Eagle ----------------|");
		System.out.println("|(3) F-22 Raptor ---------------|");
		System.out.println("|(4) F-18 Hornet ---------------|");
		System.out.println("|(5) SR-71 Blackbird------------|");
		System.out.println("|(6) New Jet ---------|");
		System.out.println("---------------------------------");
	}

	public JetsProject() {

	}

}
