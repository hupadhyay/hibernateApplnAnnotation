package in.himtech.orm.domain;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@NamedQuery(name="querybyId", query="from Tourist where id = :id")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Tourist {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	
	private String country;

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Tourist [id=" + id + ", name=" + name + ", country=" + country + "]";
	}

}
