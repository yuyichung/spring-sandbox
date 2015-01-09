package com.sandbox.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.sandbox.model.BlogModel;

@Controller
@RequestMapping("/addEntry")
public class EntryController {

	@Inject
	private BlogModel accessor;

	@RequestMapping(method=RequestMethod.GET)
	public String showSubmitPage()
	{
		return "addEntry";
	}

	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView saveEntry(@ModelAttribute("entry_text") String text)
	{
		accessor.setText(text);
		return new ModelAndView("showMessage", "message", accessor.getText());
	}
}
