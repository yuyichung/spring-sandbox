package com.sandbox.controller;

import javax.ws.rs.FormParam;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sandbox.config.SpringContextAccessor;
import com.sandbox.model.BlogModel;

@Controller
@RequestMapping("/showMessage")
public class HelloController {

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView showBlog() {
		boolean blogEntries = SpringContextAccessor
			.getApplicationContext() == null ? true : false;
		String html= "<div>" +
			   "<p>"+blogEntries+"</p>" +
			   "</div>";
		return new ModelAndView("showMessage", "message", html);
	}
}
