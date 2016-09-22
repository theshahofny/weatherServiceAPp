package org.ssa.ironyard.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.InternalResourceView;


@RestController 
@RequestMapping("/weatherService")
public class WeatherController {
	
		
		@Autowired
		WeatherService weather;
		
		public WeatherController(WeatherService ws){
			this.weather = ws;
		}		
		
		@RequestMapping(value = "")
	    public View weatherService()
	    {
	        return new InternalResourceView("WeatherConditions.html");
	    }
		
		@RequestMapping(value ="{state}/{city}", method = RequestMethod.GET)
		@ResponseBody
		public Weather weather(@PathVariable String state, @PathVariable String city){
		
			return weather.getWeather(state,city);
		}
	
}
