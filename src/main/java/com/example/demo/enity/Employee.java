package com.example.demo.enity;

/*@Entity
@Table(name="emp")*/
public class Employee {
	
	/*
	 * @Id
	 * 
	 * @GeneratedValue
	 */
	private int id;
	private String name;
	private String address;
	private String empId;
	public int getId() {
		return id;
	}
	public Employee() {
		
	}
	public Employee(int id, String name, String address, String empId) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.empId = empId;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}

}
