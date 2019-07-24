package org.usa.WebServiceEx1;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSonObj {

	public static void main(String[] args) {
		
		JSONObject jb=new JSONObject();
		jb.put("id", "121");
		jb.put("name", "Arun");
		
		JSONArray ja=new JSONArray();
		ja.add("vigugambakkam");
		ja.add("Chennai");
		ja.add("TamilNadu");
		
		jb.put("address", ja);
		
		System.out.println(jb.toJSONString());
		
		
	}
}
