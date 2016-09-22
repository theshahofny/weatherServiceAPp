package com.weatherservice.WeatherService;

import org.junit.Test;
import org.ssa.ironyard.web.WeatherService;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void test(){
		WeatherService ws = new WeatherService();
		System.err.println(ws.getWeather("MD","Baltimore"));
		System.err.println(ws.getWeather("CA", "San_Francisco"));
	}
	
}
