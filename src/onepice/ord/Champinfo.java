package onepice.ord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.json.simple.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Champinfo {
	
	

	
	static GsonBean champinfo(String name){
		Gson gson = new Gson();
		 GsonBean staff=null;

	        try (Reader reader = new FileReader("src/json/hero.json")) {
	        	JsonObject jsonObject=(JsonObject)JsonParser.parseReader(reader);
	        	JsonElement data=jsonObject.get(name);
	        	System.out.println(data.toString());
	            // Convert JSON File to Java Object
	            staff = gson.fromJson(data, GsonBean.class);
				
				// print staff 
	            System.out.println(staff.getName());

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        return staff;
	}

	/*public Champinfo() {
		// TODO Auto-generated constructor stub
		readJson readjson =new readJson();
		readjson.setJson("examjson");
		String json=readjson.getJson();
		Gson gson =new Gson();
		JsonParser parser =new JsonParser();
		JsonElement jsondata = parser.parse(json);
		String name=jsondata.getAsJsonArray().get(0).getAsString();
		System.out.println(name);
	}*/
	 
		
}
