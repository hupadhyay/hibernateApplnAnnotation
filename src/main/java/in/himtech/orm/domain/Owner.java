package in.himtech.orm.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Owner {
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private Double balance;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Flat flat;

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

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public Flat getFlat() {
		return flat;
	}
	
	public void setFlat(Flat flat) {
		this.flat = flat;
	}

	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}
