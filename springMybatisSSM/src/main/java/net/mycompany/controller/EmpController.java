package net.mycompany.controller;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.mycompany.pojo.Emp;
import net.mycompany.service.IEmpService;

@Controller
@RequestMapping("/emp") 
public class EmpController { 
 @Resource
 private IEmpService empService; 
	
	@RequestMapping(value="/registerInp", method = RequestMethod.POST)
	public String doRegistration(@ModelAttribute("emp") @Valid Emp emp, Errors errors, Model model) {							
		if(errors.hasErrors()) {
			for(FieldError error : errors.getFieldErrors()) {
				model.addAttribute(error.getField(),error.getDefaultMessage());
			}
		 	List<String> professionList = Arrays.asList("PG","SA","PM");
		 	model.addAttribute("professionList", professionList);
		 	
		 	return "Registration";
		}else {
			Emp emp_result = empService.setEmpById(emp);
			if(null != emp_result) {
				model.addAttribute("title", "Registration Success");
				model.addAttribute("emp_result", emp_result);	
			}else {
				model.addAttribute("title", "Registration Failure");
				Emp empty = new Emp();
				model.addAttribute("emp_result", empty);
			}											
			return "RegistrationSuccess";
		}					
	}
 
 @RequestMapping(value="/register", method = RequestMethod.GET)
 public String viewRegistrationForm(Model model) {
 	Emp emp = new Emp();
 	model.addAttribute("emp", emp);
 	
 	List<String> professionList = Arrays.asList("PG","SA","PM");
 	model.addAttribute("professionList", professionList);
 	
 	return "Registration";		
 }
 
}
