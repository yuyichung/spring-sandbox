package com.sandbox.model;

import java.util.ArrayList;

public class BlogModelXStreamList {

	private ArrayList<BlogModel> entries;

	public ArrayList<BlogModel> getEntries() {
		return entries;
	}

	public void setEntries(ArrayList<BlogModel> entries) {
		this.entries = entries;
	}

	public void add(BlogModel newEntry) {
		entries.add(newEntry);
	}
}
