package designPatterns.observerPattern.weatherStation.display;

import designPatterns.observerPattern.observer.Observer;
import designPatterns.observerPattern.weatherStation.weatherData.WeatherData;

public class ForecastDisplay implements DisplayElement, Observer {
	
	private float currentPressure;
	private float lastPressure;
	private WeatherData weatherData;
	
	public ForecastDisplay(WeatherData weatherData) {
		super();
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update() {
		lastPressure = currentPressure;
		currentPressure = weatherData.getPressure();
		display();
	}

	@Override
	public void display() {
		System.out.println("Barometric Pressure (Previous): " + lastPressure);
		System.out.println("Barometric Pressure (Current): " + currentPressure);
	}

}
