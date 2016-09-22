package org.ssa.ironyard.web;


public class CurrentObservation {

	private String weather;
	private double temp_f;
	

	public CurrentObservation() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public double getTemp_f() {
		return temp_f;
	}
	public String getWeather() {
		return weather;
	}public void setTemp_f(double temp_f) {
		this.temp_f = temp_f;
	}public void setWeather(String weather) {
		this.weather = weather;
	}
	
	@Override
	public String toString() {
		return "Current Observation Condition " + weather + ", temp =" + temp_f + "]";
	}

}
