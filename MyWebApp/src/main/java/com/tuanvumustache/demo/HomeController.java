package com.tuanvumustache.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	//5. Web App using Spring Boot
	@RequestMapping("home")
//	@ResponseBody
	public ModelAndView home( //9. Model Object -- remove String
			//HttpServletRequest request, HttpServletResponse response // 7. Accepting Client Data -- add request . 8. ModelAndView -- add response
			//@RequestParam("name") String myName, HttpSession session //9. Model Object
			Alien alien//9.a Web App using Spring Boot Model Object
			) 
	{ 
		System.out.println("Hi...");
		
		//return "home.jsp";
		
		// 7. Accepting Client Data -- add request
		//session = request.getSession();
		//name = request.getParameter("name");
		
		ModelAndView modelAndView = new ModelAndView(); //9. Model Object
		//System.out.println("Hi "+myName);
		//session.setAttribute("name", myName);
		
		//9. Model Object
		modelAndView.addObject("obj",alien); //9.a Web App using Spring Boot Model Object -- change name to obj alien
		modelAndView.setViewName("home");
		
		return modelAndView;
		//return "home"; //6. Application Properties File
	}
}
