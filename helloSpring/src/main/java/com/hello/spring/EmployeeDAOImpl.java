package com.hello.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

//interface 상속받아서 구현하는 애

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
 
    public List<EmployeeVO> getAllEmployees() 
    {
    	//데이터베이스 배제하는 소스라 직접 넣어줌
        List<EmployeeVO> employees = new ArrayList<EmployeeVO>();
         
        EmployeeVO vo1 = new EmployeeVO();
        vo1.setId(1);
        vo1.setFirstName("Lokesh");
        vo1.setLastName("Gupta");
        employees.add(vo1);
         
        EmployeeVO vo2 = new EmployeeVO();
        vo2.setId(2);
        vo2.setFirstName("Raj");
        vo2.setLastName("Kishore");
        employees.add(vo2);
         
        return employees;
    }
}