package com.employeeDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.employeeDetails.model.EmployeeDetails;
import com.employeeDetails.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
	public ModelAndView addEmployee(ModelAndView modelAndView, EmployeeDetails employeeDetails) {
		modelAndView.addObject("employee", employeeDetails);
		modelAndView.setViewName("AddEmployee");
		System.out.println("addEmployee");
		return modelAndView;
	}
}
