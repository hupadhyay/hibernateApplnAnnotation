package in.himtech.orm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="Discrim", discriminatorType=DiscriminatorType.INTEGER)
//@DiscriminatorValue(value="3")
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy=InheritanceType.JOINED)
public class Vehicle {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private String registration;

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle( String name, String registration) {
		super();
		this.name = name;
		this.registration = registration;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", registration=" + registration + "]";
	}
	
	
}
