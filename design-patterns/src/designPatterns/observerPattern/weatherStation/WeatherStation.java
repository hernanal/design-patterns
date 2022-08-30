package designPatterns.observerPattern.weatherStation;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

import designPatterns.observerPattern.weatherStation.display.CurrentConditionsDisplay;
import designPatterns.observerPattern.weatherStation.display.ForecastDisplay;
import designPatterns.observerPattern.weatherStation.display.HeatIndexDisplay;
import designPatterns.observerPattern.weatherStation.display.StatsDisplay;
import designPatterns.observerPattern.weatherStation.pojos.CurrentWeatherData;
import designPatterns.observerPattern.weatherStation.pojos.RealTimeApiResponse;
import designPatterns.observerPattern.weatherStation.weatherData.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		String apiKey = "99b79593d4ec4ca9b56150430221607";
		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		StatsDisplay statsDisplay = new StatsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
		CurrentWeatherData currentWeather = null;

		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("http://api.weatherapi.com/v1/current.json?key=" + apiKey + "&q=New_York")).build();
		try {
			HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
			currentWeather = new Gson().fromJson(response.body(), RealTimeApiResponse.class).getCurrent();
		} catch (IOException e) {
			System.out.println("IOException getting weather api response");
			e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException getting weather api response");
			e.printStackTrace();
		}

		weatherData.setMeasurementsChanged(currentWeather.getTemp_f(), currentWeather.getHumidity(),
				currentWeather.getPressure_in());
//		weatherData.setMeasurementsChanged(82, 70, 29.2f);
//		weatherData.setMeasurementsChanged(78, 90, 29.2f);
	}

}
