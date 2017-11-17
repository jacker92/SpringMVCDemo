package com.s1700306;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InformationController {	

	@RequestMapping("/processInfo")
	public ModelAndView process (@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname,
			HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView mv = new ModelAndView();

		System.out.println(request.getParameter("firstname"));
		mv.setViewName("information.jsp");
		mv.addObject("firstname",firstname);
		mv.addObject("lastname",lastname);
		return mv;
	}
}
