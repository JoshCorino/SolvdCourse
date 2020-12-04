package com.solvd.projectUniversity.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.projectUniversity.model.Main;

public class Test {
	

	public static void main( String[] args ){
		
		Logger log = LogManager.getLogger(Test.class);
		DoublyLinkedList<String> list = new DoublyLinkedList<String>();
		log.info(list.isEmpty());
		log.info(" ");
		
		list.add("Hi1");
		list.add("Hi2");
		list.add(2,"Hi5");
		list.add(2,"Hi4");
		list.add(2,"Hi3");
		list.forEach(object -> log.info(object.toString()));
		log.info(" ");
		
		log.info(list.get(0).toString());
		log.info(list.get(1).toString());
		log.info(list.get(2).toString());
		log.info(list.get(3).toString());
		log.info(list.get(4).toString());
		log.info(" ");
				
		List<String> arr=new ArrayList<String>();
		arr.add("Hi6");
		arr.add("Hi7");
		arr.add("Hi8");
		arr.add("Hi9");
		arr.add("Hi10");
		list.addAll(arr);
		list.forEach(object -> log.info(object.toString()));
		log.info(" ");
		
		log.info(list.containsAll(arr));
		log.info(" ");
		
		list.remove("Hi1");
		log.info(list.get(0).toString());
		log.info(" ");
		
				

		
		list.removeAll(arr);
		list.forEach(object -> log.info(object.toString()));
		
		log.info(" ");
		
		log.info("Size: "+list.size());
		log.info(" ");
		
		
	}
}
