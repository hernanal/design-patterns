package designPatterns.observerPattern.weatherStation.display;

import designPatterns.observerPattern.observer.Observer;
import designPatterns.observerPattern.weatherStation.weatherData.WeatherData;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	private float temperature;
	private float humidity;
	
	private WeatherData weatherData;

	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}

	@Override
	public void update() {
		this.temperature = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		display();
	}

}
