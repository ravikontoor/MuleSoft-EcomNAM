package com.kontoorbrands;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.Normalizer;
import java.text.SimpleDateFormat;
/**import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.apache.commons.io.IOUtils;

*/
//import com.github.sardine.*;
//import com.github.sardine.impl.SardineException;

public class LangConverter {
	
	public LangConverter() {}

	
	public String converter(String InputStream)
	{
		String convertedString = "";
		//System.out.println("testing..."); 
		System.out.println("InputStream--"+ InputStream); 
		
		
		//String characters =  InputStream.replaceAll("Ł", "L").replaceAll("ł", "l").replaceAll("Æ", "AE").replaceAll("æ", "ae").replaceAll("Ø", "OE").replaceAll("Ð", "D").replaceAll("ß", "ss").replaceAll("ø", "oe");
		String characters =  InputStream.replaceAll("Ł", "L").replaceAll("ł", "l");
		convertedString = Normalizer.normalize(characters, Normalizer.Form.NFD).replaceAll("\\p{M}", "");
		System.out.println("convertedString--"+ convertedString); 
		return convertedString;
	}
}
	// List files 
	
	/*public static void listResources() {
		
		
		try {

				// TODO Auto-generated method stub
				Sardine sardine = SardineFactory.begin("vivek.chandran@appirio.com", "Test@2020");
				List<DavResource> resources = sardine.list("https://staging-eu01-kontoor.demandware.net:443/on/demandware.servlet/webdav/Sites/Impex/src/order/");
			
				
				/*for (DavResource res : resources)
				{
				     System.out.println(res);
				} //
				
			}
			catch (SardineException e)
				{
					System.out.println(e); 				
				}
			catch (IOException ioe)
			{
				System.out.println(ioe); 			
			}
		}
		*/
	//Order Files retrieve
	/*
	public  ArrayList<String> returnOrderFile(String inputFile, String jUserName, String jPassword, String jHost) {
		
		String result = null;
		ArrayList<String> resultsList = null;

	try {
		
		
			// TODO Auto-generated method stub
			Sardine sardine = SardineFactory.begin(jUserName, jPassword);
			List<DavResource> res = sardine.list(jHost);	

			//-----New Block-----//

		    DavResource[] resources = res.toArray(new DavResource[0]);
		    	  
	        String[] arr = new String[res.size()]; 
	  
	        // DavResource to String Array Conversion 
	        for (int i =0; i < res.size(); i++) 
	            arr[i] = resources[i].getName();
	        //for(String a : arr)
	        	// System.out.println("Printing arr -> " + a);
	        
		     
		       // for (String x : arr) 
		         //   System.out.print(x + " \n");
		
			Date date = new Date();
			 
			 // Current time and date
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			System.out.println("date ------: " + dateFormat.format(date));
			// String filename = "/on/demandware.servlet/webdav/Sites/Impex/src/order/" + "orders-Wrangler-" + dateFormat.format(date);
			//-commented-  String filenameInput = "orders-"+ inputFile + "-" + dateFormat.format(date);
			// String filenameInput = "order_export";
			String filenameInput = "orders-"+ inputFile + "-" + dateFormat.format(date);
			//String filenameInput = "orders-"+ inputFile + "-20200327";
			// String filenameWra =  "orders-Wrangler-" + dateFormat.format(date);
			
			 //System.out.println("filename Lee------: " + filenameLee + ", filename Wra------: " + filenameWra);
			 System.out.println("filename Input------: " + filenameInput);
			 
	         //ArrayList<String> resultsList = new ArrayList<String>();

	     /*    Pattern pattern = Pattern.compile(filenameLee);
	         for (String string : arr) {
	        	 Matcher matcher = pattern.matcher(string);
	                if (matcher.find()) {
	                    resultsList.add(string);
	                }
	            }**/
	         
	    /*     Pattern patternWra = Pattern.compile(filenameInput);
	         for (String string : arr) {
	        	 Matcher matcher = patternWra.matcher(string);
	        	 		if(matcher.find() && resultsList == null)
	        	 		  {resultsList = new ArrayList<String>(); resultsList.add(string);}
	                if (matcher.find() && resultsList != null) {
	                    resultsList.add(string);
	                }
	            }
	         
			 
	         System.out.println("resultsList-------: " + resultsList);
				 
	         
	       //  System.out.println("File-------->>>" + "https://staging-eu01-kontoor.demandware.net:443/on/demandware.servlet/webdav/Sites/Impex/src/order/" + resultsList.get(0));
				 //-----End of New Block-----//
				    
		
			InputStream is = resultsList != null ? sardine.get(jHost + resultsList.get(0))  : null;
			if(is != null)result = IOUtils.toString(is, StandardCharsets.UTF_8);

			//System.out.println("File: " + resultsList.get(0) + ":>>>>>>>>> \n" + result);
		}
		catch (SardineException e)
			{
				System.out.println(e);
			}
		catch (IOException ioe)
		{
			System.out.println(ioe); 			
		}
			return resultsList;
		
	}
	
/*	public static void main(String[] args) throws IOException {
		
		returnOrderFile("Wrangler","dev");

		/*File file = new File("src/main/resources/config/api-dev-config.yaml");
		String parent = file.getAbsoluteFile().getParent();
		System.out.println(parent); 
		FileReader reader=new FileReader("/Users/appirio-13826/AnypointStudio/Kontoor Brands Final /prc-adsr-api/src/main/resources/config/api-dev-config.yaml");
		Properties p=new Properties();  
	    p.load(reader); 
	    
	    System.out.println("hello starting"); 
	    System.out.println(p); 
	    System.out.println(p.getProperty("javaHost"));  
	    System.out.println(p.getProperty("javaUserName"));  
	    System.out.println(p.getProperty("javaPassword"));  
	}
	
}*/
