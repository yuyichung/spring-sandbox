package com.sandbox.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.ws.rs.FormParam;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sandbox.model.BlogModel;
import com.sandbox.service.ObjectSerializer;

@Controller
@RequestMapping("/showMessage")
public class HelloController {

	@Inject
	private ObjectSerializer serializer;

	private String divFormat="<div><p>%s</p></div>";
	private String html = "";

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView showBlog() throws IOException {
		List<BlogModel> entries = null;
		try {
			entries = serializer.deserializeObject("entries.xml", BlogModel.class);
		} catch (ClassNotFoundException e) {
		}
		if(entries == null) {
			entries = new ArrayList<BlogModel>();
			entries.add(new BlogModel());
		}
		if(entries.size() <= 0)
		{
			html = String.format(divFormat, "no updates");
		} else
			entries.forEach(bm -> html = html.concat(String.format(divFormat, bm.getText())));
		return new ModelAndView("showMessage", "message", html);
	}
}
