package in.himtech.orm.domain;

import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value="1")
public class Car extends Vehicle{
	private String numOfPassenger;
	
	private String company;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String name, String registration, String numOfPassenger, String company) {
		super(name, registration);
		this.numOfPassenger = numOfPassenger;
		this.company = company;
	}

	public String getNumOfPassenger() {
		return numOfPassenger;
	}

	public void setNumOfPassenger(String numOfPassenger) {
		this.numOfPassenger = numOfPassenger;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Car [numOfPassenger=" + numOfPassenger + ", company=" + company + "]";
	}

	
}
