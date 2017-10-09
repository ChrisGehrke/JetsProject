package JetProgram;

public class F22 {
	String f22;
	
	protected F22() {
		
		System.out.println( "Model: F-22 Raptor");
		System.out.println( "Speed: max speed = Mach 2.25 or 1,500 MPH");
		System.out.println( "Range: 1,600 nautical miles");
		System.out.println( "Price: $150 million ");
	}
		

	public String getF22() {
		return f22;
	}

	public void setF35(String f22) {
		this.f22 = f22;
	}
}
	