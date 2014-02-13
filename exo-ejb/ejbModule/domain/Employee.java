package domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Employee
 *
 */
@Entity
@Table(name="t_employee")

public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	
	private Address employeeAddress;
	private Employee superior;
	
	public Employee() {
	}   
	
	@Id    
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Embedded
	public Address getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(Address employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	@ManyToOne
	@JoinColumn( name = "superior_fk")
	public Employee getSuperior() {
		return superior;
	}

	public void setSuperior(Employee superior) {
		this.superior = superior;
	}
   
}
