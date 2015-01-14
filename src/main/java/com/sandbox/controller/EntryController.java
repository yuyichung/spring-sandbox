package com.sandbox.controller;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.sandbox.model.BlogModel;
import com.sandbox.service.ObjectSerializer;

@Controller
@RequestMapping("/addEntry")
public class EntryController {

	@Inject
	private ObjectSerializer serializer;

	@RequestMapping(method=RequestMethod.GET)
	public String showSubmitPage()
	{
		return "addEntry";
	}

	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView saveEntry(@ModelAttribute("entry_text") String text) throws IOException
	{
		BlogModel newEntry = new BlogModel();
		newEntry.setText(text);
		serializer.serializeObject(newEntry, "entries.xml");
		return new ModelAndView("showMessage", "message", newEntry.getText());
	}
}
