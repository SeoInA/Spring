package com.hello.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeManagerImpl implements EmployeeManager{

    @Autowired
    EmployeeDAO dao;
     
    @Override
    public List<EmployeeVO> getAllEmployees() 
    {	//리스트를리턴받음
        return dao.getAllEmployees();
    }
}
