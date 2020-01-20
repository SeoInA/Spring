package com.hello.spring;

import java.util.List;

//DAO부터 interface를 만들고 class를 만들어야한다.

public interface EmployeeDAO 
{
    public List<EmployeeVO> getAllEmployees();
}
