package JetProgram;

public class F18 {
	String f18;
	
	protected F18() {
		System.out.println( "Model: F-18 Hornet");
		System.out.println( "Speed: max speed = Mach 1.8 or 2,070 MPH");
		System.out.println( "Range: 1,275 nautical miles");
		System.out.println( "Price: $70.5 million ");
	}
		

	public String getF18() {
		return f18;
	}

	public void setF35(String f18) {
		this.f18 = f18;
	}
}
	