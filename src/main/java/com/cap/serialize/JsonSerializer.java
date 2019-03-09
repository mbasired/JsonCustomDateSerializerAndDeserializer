package com.cap.serialize;

import java.io.IOException;
import java.util.Date;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.cap.model.Address;
import com.cap.model.Employee;

public class JsonSerializer {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		Employee employee = new Employee();
		Address address = new Address();
		address.setCity("PUNE");
		address.setStreet("HINJEWADI");
		address.setZipcode(411057);

		employee.setId(1);
		employee.setName("Maheswara");
		employee.setPermanent(true);
		long[] phoneNumbers = new long[] { 123, 345 };
		employee.setPhoneNumbers(phoneNumbers);
		employee.setRole("DEVELOPER");
		Date dob = new Date();
		employee.setDob(dob);
		employee.setAddress(address);
		String result = null;
		try {
			result = mapper.writeValueAsString(employee);
			System.out.println(result);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
