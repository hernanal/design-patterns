package designPatterns.observerPattern.weatherStation.display;

import designPatterns.observerPattern.observer.Observer;
import designPatterns.observerPattern.weatherStation.weatherData.WeatherData;

public class StatsDisplay implements DisplayElement, Observer {
	
	private float averageTemp;
	private float minTemp;
	private float maxTemp;
	
	private WeatherData weatherData;
	
	public StatsDisplay(WeatherData weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}	

	@Override
	public void update() {
		this.averageTemp = weatherData.getTemperature();
		this.maxTemp = weatherData.getTemperature();
		this.minTemp = weatherData.getTemperature();
		display();
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + averageTemp + "/" + maxTemp + "/" + minTemp);
	}

}
