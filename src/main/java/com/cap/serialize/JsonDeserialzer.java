package com.cap.serialize;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.cap.model.Employee;

public class JsonDeserialzer {

	public static void main(String[] args) {
		ObjectMapper om = new ObjectMapper();
		File file = new File("E:\\Practice\\Capgemini\\JacksonJson\\src\\main\\java\\employee.json");
		try {
			// DateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yyyy");
			// om.setDateFormat(dateFormat);
			Employee employee = om.readValue(file, Employee.class);
			System.out.println(employee);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
