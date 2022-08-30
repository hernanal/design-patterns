package designPatterns.observerPattern.weatherStation.pojos;

public class RealTimeApiResponse {
	private CurrentWeatherData current;
	private LocationWeatherData location;
	
	public RealTimeApiResponse() {
		// TODO Auto-generated constructor stub
	}

	public CurrentWeatherData getCurrent() {
		return current;
	}

	public void setCurrent(CurrentWeatherData current) {
		this.current = current;
	}

	public LocationWeatherData getLocation() {
		return location;
	}

	public void setLocation(LocationWeatherData location) {
		this.location = location;
	}
	
	
}
