package JetProgram;

public class F35 {
	String f35;
	
	
	protected F35() {
		System.out.println( "Model: F-35 Lightning II");
		System.out.println( "Speed: max speed = Mach 1.6 or 1,200 MPH");
		System.out.println( "Range: 1,200 nautical miles");
		System.out.println( "Price: $94.6 million ");
	}
	protected void choice() {
	}	

	public String getF35() {
		return f35;
	}

	public void setF35(String f35) {
		this.f35 = f35;
	}
}
