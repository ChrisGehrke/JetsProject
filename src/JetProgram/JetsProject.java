package JetProgram;

import java.util.Scanner;

public class JetsProject {
	static Hangar hangar = new Hangar();
	static Scanner kb = new Scanner(System.in);
	private String model;
	private int speed;
	private int range;
	private long price;

	public static void main(String[] args) {
		int menu = 0;
		do {
			printOptionsMenu();
			System.out.println("Please select a number from the menu:");
			menu = kb.nextInt();

			switch (menu) {
			case 1:
				hangar.printJets();
				break;
			case 2:
				System.out.println("The fastest jet is: " + hangar.fastestJet() + "\n");
				break;
			case 3:
				System.out.println("The jet with the longest range is: " + hangar.longestRange() + "\n");
				break;
			case 4:
				String model;
				int speed;
				int range;
				long price;
				System.out.print("\n");
				System.out.print("Enter the Model of jet: ");
				model = kb.next();
				System.out.print("Enter the Speed of jet in mph: ");
				speed = kb.nextInt();
				System.out.print("Enter the Range of jet: ");
				range = kb.nextInt();
				System.out.print("Enter the Price of jet:$ ");
				price = kb.nextLong();
				System.out.print("");

				JetsProject jet = new JetsProject(model, speed, range, price);
				hangar.addJetToMenu(jet);
				break;
			case 5:
				System.out.println("Good Bye");
				break;
			}
		} while (menu != 5);

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

	public JetsProject() {

	}

	public JetsProject(String model, int speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("JetsProject [model=");
		builder.append(model);
		builder.append(", speed=");
		builder.append(speed);
		builder.append(", range=");
		builder.append(range);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}

}
