package JetProgram;

public class F15 {
	String f15;
	
	protected F15() {
		System.out.println( "Model: F-15 Eagle");
		System.out.println( "Speed: max speed = Mach 2.5 or 1,650 MPH");
		System.out.println( "Range: 3,000 nautical miles");
		System.out.println( "Price: $29.9 million ");
	}

	public String getF15() {
		return f15;
	}

	public void setF15(String f15) {
		this.f15 = f15;
	}
}	

		

	