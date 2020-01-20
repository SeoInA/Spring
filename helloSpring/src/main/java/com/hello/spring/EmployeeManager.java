package com.hello.spring;

import java.util.List;

//controller 연결하는 애(service 라고 부름)를 위한 interface. 

public interface EmployeeManager {
	public List<EmployeeVO> getAllEmployees();  
}
