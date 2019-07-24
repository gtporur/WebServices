package org.usa.WebServiceEx1;

import org.json.simple.JSONArray;

public class JsonArr {

	public static void main(String[] args) {
	
		JSONArray ja=new JSONArray();
		ja.add("vigugambakkam");
		ja.add("Chennai");
		ja.add("TamilNadu");
		System.out.println(ja.toJSONString());

	}

}
