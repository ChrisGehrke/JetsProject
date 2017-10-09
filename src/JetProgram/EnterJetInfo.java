package JetProgram;

public class EnterJetInfo extends CustomJet {
	

	public EnterJetInfo() {
		super();
	}
		public int choice() {
			return 1;
	}
		private String model;
		private Double speed;
		private Double range;
		private Double price;
		
		public EnterJetInfo(String model, Double speed, Double range, Double price) {
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

		public Double getSpeed() {
			return speed;
		}

		public void setSpeed(Double speed) {
			this.speed = speed;
		}

		public Double getRange() {
			return range;
		}

		public void setRange(Double range) {
			this.range = range;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}
		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("EnterJetInfo [model=");
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

		
	
	