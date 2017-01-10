package in.himtech.orm.domain;

import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value="0")
public class Bike extends Vehicle {
	private String model;
	private String numOfWheel;

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Bike(String name, String registration, String model, String numOfWheel) {
		super(name, registration);
		this.model = model;
		this.numOfWheel = numOfWheel;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getNumOfWheel() {
		return numOfWheel;
	}

	public void setNumOfWheel(String numOfWheel) {
		this.numOfWheel = numOfWheel;
	}

	@Override
	public String toString() {
		return "Bike [model=" + model + ", numOfWheel=" + numOfWheel + "]";
	}

}
