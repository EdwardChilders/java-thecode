package com.edward.code.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {

	@RequestMapping("/")
	public String code() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/survey", method=RequestMethod.POST)
	public String survey(@RequestParam String code, RedirectAttributes redirectAttributes) {
		if (code.contentEquals("bushido")) {
			return "redirect:/code";
		}else {
			redirectAttributes.addFlashAttribute("error", "You must train harder!");
			return "redirect:/";
		}
	}
	
	@RequestMapping("/code")
	public String thecode() {
		return "code.jsp";
	}
}
