package com.local.log4jApp;

import java.io.BufferedReader;
import java.io.FileReader;

import org.apache.log4j.Logger;


public class Log4JExample {
	final static Logger LOGGER = Logger.getLogger(Log4JExample.class);
	
	public static void main(String[] args) {
		LOGGER.info("Program Strated..");
		String path = "C:/Tool/newfile.txt";
		try {
			LOGGER.info("Creating FileReader object");
			FileReader in = new FileReader(path);
			BufferedReader reader = new BufferedReader(in);
			LOGGER.info("The file reading started...");
			String line = "";
			while((line= reader.readLine())!= null){
				System.out.println(line);
			}
//			int i = 20/0;
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
			LOGGER.error(e.getMessage());
		}
		LOGGER.info("Ended...");
	}
}
