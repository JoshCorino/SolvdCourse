package com.solvd.projectUniversity.file;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;


public class UniqueStringsCount {
	public static void main(String[] args) throws IOException {
	

		String text = FileUtils.readFileToString(new File("src/main/resources/file.txt"), "UTF-8").toLowerCase();
		Map<String,Integer> result = new HashMap<String,Integer> ();
		for(String s : StringUtils.split(text)) {
			if(result.containsKey(s)) {
				result.put(s, result.get(s)+1);
			}
			else {
				result.put(s,1);
			}
		}
		File f2=new File("src/main/resources/result.txt");
		f2.delete();
		FileUtils.writeStringToFile(new File("src/main/resources/result.txt"), "The Number of ocurrences of each words in the file is: "+ result.toString(), "UTF-8");
	    
	}
}

