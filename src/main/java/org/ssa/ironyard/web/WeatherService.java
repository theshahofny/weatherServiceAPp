package org.ssa.ironyard.web;



import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Component;

@Component 
public class WeatherService {

	
	public Weather getWeather(String state, String city)
	{
		final String uri = "http://api.wunderground.com/api/7a676479a8e14d1e/conditions/q/" + state + "/" + city + ".json";
		//final String uri = "http://api.wunderground.com/api/7a676479a8e14d1e/conditions/q/CA/San_Francisco.json";
		RestTemplate restTemplate = new RestTemplate();
		Weather result = restTemplate.getForObject(uri,  Weather.class);
		return result;
	}
	
}
