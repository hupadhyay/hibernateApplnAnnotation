package in.himtech.orm.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	@GeneratedValue
	private Integer id;

	private String name;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "DEPT_EMP", joinColumns = @JoinColumn(name = "DEPT_ID"), inverseJoinColumns = @JoinColumn(name = "EMP_ID"))
	private List<Employee> listEmp = new ArrayList<>();

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

	public List<Employee> getListEmp() {
		return listEmp;
	}

	public void setListEmp(List<Employee> listEmp) {
		this.listEmp = listEmp;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", listEmp=" + listEmp + "]";
	}

}
