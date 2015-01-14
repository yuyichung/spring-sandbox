package com.sandbox.model;

import java.io.Serializable;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class BlogModel implements Serializable {

	private static final long serialVersionUID = 1L;
	private String text;

	public BlogModel()
	{
		text = "no updates";
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
