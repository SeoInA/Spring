package com.hello.spring_ex1;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@Autowired
	UserListServiceImpl userListService;
	
	@RequestMapping(value="/users",method=RequestMethod.GET)
	public ModelAndView home(ModelAndView mv) {
		
		List<UserListResponseDTO> userlist = userListService.getUserListService();
		
		for(int i = 0; i<userlist.size(); i++) {
			System.out.println("name: "+ userlist.get(i).getUserName());
		}
		
		mv.addObject("listuser",userlist);
		mv.setViewName("spring_ex1");
		
		return mv;
	}
}