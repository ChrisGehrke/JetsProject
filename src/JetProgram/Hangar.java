package JetProgram;


public class Hangar {
		private JetsProject[] jetsarr;

		public Hangar() {
			jetsarr = new JetsProject[6];
			jetsarr[0] = new JetsProject("F-15 Eagle", 1650, 3000, 29_900_000);
			jetsarr[1] = new JetsProject("F-18 Hornet", 2070, 1275, 70_500_000);
			jetsarr[2] = new JetsProject("F-22 Raptor", 1500, 1600, 150_000_000);
			jetsarr[3] = new JetsProject("SR-71 Black Bird", 2200, 2900, 33_000_000);
			jetsarr[4] = new JetsProject("F-35 Lightning II", 1200, 1200, 94_600_000);
		}
		

		public void printJets() {
			for (int i = 0; i < jetsarr.length; i++) {
				if (jetsarr[i] != null) {
					System.out.println(jetsarr[i]);
				}
			}
				}
			public boolean addJetToMenu(JetsProject jet) {
				System.out.println("");
				boolean added = false;
				for (int i = 0; i < jetsarr.length; i++) {
					if (jetsarr[i] == null) {
						jetsarr[i] = jet;
						added = true;
						break;
					}
				}
				
		
				if(added == false) {
					JetsProject[] addJet = new JetsProject[jetsarr.length * 2];
				
					int i;
					for (i = 0; i < addJet.length; i++) {
						addJet = jetsarr;
						addJet[i] = jet;
						added = true;
						
					}
					
				}
				System.out.println("");
				return added;
			
			
			
		}

		


		public JetsProject fastestJet() {
			return jetsarr[3];
		}


		public JetsProject longestRange() {
			return jetsarr[0];
		}


		
			
		}
		

	


