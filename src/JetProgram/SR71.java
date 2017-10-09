package JetProgram;

public class SR71 {
	String sr71;
		
	protected SR71() {
		System.out.println( "Model: SR71 Blackbird");
		System.out.println( "Speed: max speed = Mach 3.3 or 2,200 MPH");
		System.out.println( "Range: 2,900 nautical miles");
		System.out.println( "Price:$33 million ");
	}

	public String getSr71() {
		return sr71;
	}


	public void setSr71(String sr71) {
		this.sr71 = sr71;
	}
}



