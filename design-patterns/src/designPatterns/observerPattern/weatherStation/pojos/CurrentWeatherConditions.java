package designPatterns.observerPattern.weatherStation.pojos;

public class CurrentWeatherConditions {

	private String text;
	private String icon;
	private int code;
	
	public CurrentWeatherConditions() {
		// TODO Auto-generated constructor stub
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
}
