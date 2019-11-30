package dad.javafx.geo.logic;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UnirestObjectMapper implements com.mashape.unirest.http.ObjectMapper {

	private ObjectMapper mapper=new ObjectMapper();
	
	public <T> T readValue(String value, Class<T> valueType) {
		// TODO Auto-generated method stub
		try {
			return mapper.readValue(value, valueType);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public String writeValue(Object value) {
		// TODO Auto-generated method stub
		try {
			return mapper.writeValueAsString(value);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
