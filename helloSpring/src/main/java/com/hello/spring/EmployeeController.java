package com.hello.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//http://localhost:8080/spring/employee-module/getAllEmployees

@Controller

@RequestMapping("/employee-module") // 이게 두 개 있는 이유는 주소를 두개로 만들고 싶은거다

public class EmployeeController 
{
    @Autowired
    EmployeeManager manager;
 
    @RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
    
    public String getAllEmployees(Model model)
    {
        model.addAttribute("employees", manager.getAllEmployees());
        return "employeesListDisplay";
    }
    
}

