package com.hello.spring;

import java.io.Serializable;
//여기에 데이터를 하나씩 넣을거
public class EmployeeVO implements Serializable 
{
    private static final long serialVersionUID = 1L;
 
    private Integer id;
    private String firstName;
    private String lastName;
 
    //Setters and Getters
 
    public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
    public String toString() {
        return "EmployeeVO [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + "]";
    }
}
