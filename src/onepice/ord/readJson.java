package onepice.ord;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class readJson {

	String s="";
	String fileName="";
	
	
	public String getJson(){
		BufferedReader bReader = null;
		
		 try {
	            
	            File file = new File("src/json/"+fileName+".json");
	            bReader = new BufferedReader(new FileReader(file));
	            
	            // 더이상 읽어들일게 없을 때까지 읽어들이게 합니다.
	            Scanner scan = new Scanner(file);
	            while(scan.hasNextLine()){
	                s+=scan.nextLine();
	            }
	            //System.out.println(scan.useDelimiter("\\z").next());
	        }catch (FileNotFoundException e) {
	            // TODO: handle exception
	        }
		 System.out.println(s);
		return s;
	}
	public void setJson(String name){
		fileName=name;
	}
	JsonArray array =new JsonArray();
}
