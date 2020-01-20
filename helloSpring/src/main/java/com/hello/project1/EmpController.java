package com.hello.project1;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.study.ex01.controller.SampleController1;

@Controller
public class EmpController {
	@Autowired
	EmpDao dao;
	
	
	private static final Logger logger=LoggerFactory.getLogger(SampleController1.class);
	
	@RequestMapping("/empMain")
	public void empMain() {
		logger.info("empMain 실행.........");
	}
	
	
	
	@RequestMapping("/empform")
	
	public String showform(Model m) {
		m.addAttribute("command",new Emp());
		return "empform";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@ModelAttribute("emp")Emp emp) {
		dao.save(emp);
		return "redirect:/viewemp";
	}
	
	@RequestMapping("/viewemp")
	public String viewemp(Model m) {
		List<Emp> list=dao.getEmployees();
		m.addAttribute("list",list);
		return "viewemp";
	}
	
	@RequestMapping(value="/editemp/{id}")
	public String edit(@PathVariable int id, Model m) {
		Emp emp=dao.getEmpById(id);
		m.addAttribute("command",emp);
		return "empeditform";
	}
	
	 @RequestMapping(value="/editsave",method = RequestMethod.POST)    
	    public String editsave(@ModelAttribute("emp") Emp emp){    
	        dao.update(emp);    
	        return "redirect:/viewemp";    
	    }    
	    /* It deletes record for the given id in URL and redirects to /viewemp */    
	    @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)    
	    public String delete(@PathVariable int id){    
	        dao.delete(id);    
	        return "redirect:/viewemp";    
	    }     
}
