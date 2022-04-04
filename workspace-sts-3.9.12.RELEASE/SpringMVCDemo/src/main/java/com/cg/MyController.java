package com.cg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/hello")
	public String getHello()
	{
		return "Hello";
	}

	@RequestMapping("/emp")
	public String getEmp()
	{
		return "Emp";
	}

	@RequestMapping("/reg")
	public String getReg(@ModelAttribute("emp") Employee e)
	{
		return "Reg";
	}
}