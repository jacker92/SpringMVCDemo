package com.s1700306;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.s1700306.service.Calculator;

@Controller
public class CalculatorController {

	@RequestMapping("/calculate")
	public ModelAndView calculate(HttpServletRequest request, HttpServletResponse response) {
		
		ModelAndView mv = new ModelAndView();
		Calculator cal = new Calculator();
		long i1;
		long i2;
		
		if (cal.isNumber(request.getParameter("t1")) && cal.isNumber(request.getParameter("t2"))) {
			  i1 = Long.parseLong(request.getParameter("t1"));
			  i2 = Long.parseLong(request.getParameter("t2"));
		} else {
			mv.setViewName("error.jsp");
			return mv;
		}
		
		mv.setViewName("display.jsp");
		mv.addObject("addition", cal.add(i1, i2));
		mv.addObject("multiplication",cal.multiplicate(i1, i2));
		mv.addObject("subtraction",cal.substraction(i1, i2));
		mv.addObject("division", cal.division(i1, i2));
		
		mv.addObject("t1", i1);
		mv.addObject("t2", i2);
		
		return mv;
	}
}
