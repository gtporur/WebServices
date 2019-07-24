package org.usa.WebServiceEx2;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestMain {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		String res="{\"address\":[\"vigugambakkam\",\"Chennai\",\"TamilNadu\"],\"name\":\"Arun\",\"id\":\"121\"}";
		 ObjectMapper om = new ObjectMapper();
		 Employee e = om.readValue(res, Employee.class);
		 System.out.println(e.getId());
		 System.out.println(e.getName());
		 System.out.println(e.getAddress()[0]);
		 System.out.println(e.getAddress()[1]);
		 System.out.println(e.getAddress()[2]);
	}
}
