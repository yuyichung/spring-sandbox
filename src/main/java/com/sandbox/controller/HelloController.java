package com.sandbox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/showMessage")
	public ModelAndView showBlog() {
		String html= "<div>" +
			   "<p>hihihi</p>" +
			   "</div>";
		return new ModelAndView("showMessage", "message", html);
	}
}
