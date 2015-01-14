package com.sandbox.service;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sandbox.model.BlogModel;
import com.sandbox.model.BlogModelXStreamList;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.StreamException;
import com.thoughtworks.xstream.persistence.FilePersistenceStrategy;
import com.thoughtworks.xstream.persistence.PersistenceStrategy;
import com.thoughtworks.xstream.persistence.XmlArrayList;

@Service
public class ObjectSerializer {

	private final String SERIALIZED_OBJECT_PATH = System.getProperty("user.dir")+"\\src\\main\\resources\\savedEntries\\";

	private XStream xstream;

	public void serializeObject(Object object, String fileName) throws IOException
	{
		File file = new File(SERIALIZED_OBJECT_PATH);
		PersistenceStrategy strategy = new FilePersistenceStrategy(file);
		List list = new XmlArrayList(strategy);
		list.add(object);
	}

	public <T> List<T> deserializeObject(String fileName, Class<T> type) throws IOException, ClassNotFoundException
	{
		File file = new File(SERIALIZED_OBJECT_PATH);
		PersistenceStrategy strategy = new FilePersistenceStrategy(file);
		List list = new XmlArrayList(strategy);
		return list;
	}
}
