package in.himtech.orm.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PersonId implements Serializable{
	
	private String firstName;
	
	private String localityName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLocalityName() {
		return localityName;
	}

	public void setLocalityName(String localityName) {
		this.localityName = localityName;
	}

	@Override
	public String toString() {
		return "PersonId [firstName=" + firstName + ", localityName=" + localityName + "]";
	}
	
}
