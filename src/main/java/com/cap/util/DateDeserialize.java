package com.cap.util;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;

public class DateDeserialize extends JsonDeserializer<Date>{

	DateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
	@Override
	public Date deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {
		
		String date  = null;
		try {
			 date  = jp.getText();
			System.out.println(date);
			//System.out.println(sdf.parse(date));
			return sdf.parse(date);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}
	

}
