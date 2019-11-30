package dad.javafx.geo.logic;


import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import javafx.scene.image.Image;




public class GeoServicio {
private LocationMessage locationMensagge;
	public GeoServicio() {
		Unirest.setObjectMapper(new UnirestObjectMapper());
		
	}
	public LocationMessage  getLocationData(String ip)  {
		String url="http://api.ipapi.com/api/"+ip+"?access_key=b6de150fe3dc84e294eb55d640ed3e14";
			
			try {
				locationMensagge = Unirest.get(url).asObject(LocationMessage.class)
						.getBody();
				
				return locationMensagge;
			} catch (UnirestException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		return null;

	}
	
}
