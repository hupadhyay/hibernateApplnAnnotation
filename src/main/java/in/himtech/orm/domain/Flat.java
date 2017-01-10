package in.himtech.orm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Flat {
	@Id
	@GeneratedValue
	private Integer id;
	
	private String location;
	
	private String state;
	
	@OneToOne(mappedBy="flat")
	private Owner owner;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
	public Owner getOwner() {
		return owner;
	}

	@Override
	public String toString() {
		return "Flat [id=" + id + ", location=" + location + ", state=" + state + "]";
	}

}
