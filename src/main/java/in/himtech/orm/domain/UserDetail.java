package in.himtech.orm.domain;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity 
@Table(name = "USER_DETAIL")
public class UserDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String name;
	
	private Address address;
	
	@AttributeOverrides({
		@AttributeOverride(name="city", column = @Column(name="Office_CITY")),
		@AttributeOverride(name="locality", column = @Column(name="Office_LOCALITY")),
		@AttributeOverride(name="pincode", column = @Column(name="Office_PINCODE"))
	})
	private Address officeAddress;
	
	@Temporal(TemporalType.DATE)
	private Date dob;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Address getOfficeAddress() {
		return officeAddress;
	}
	
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	
	public Date getDob() {
		return dob;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "UserDetail [id=" + id + ", name=" + name + ", address=" + address + ", officeAddress=" + officeAddress
				+ ", dob=" + dob + "]";
	}
}
