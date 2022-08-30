package designPatterns.observerPattern.weatherStation.pojos;

public class CurrentWeatherData {

	private String last_updated;
	private int last_updated_epoch;
	private float temp_c;
	private float temp_f;
	private float feelslike_c;
	private float feelslike_f;
	private CurrentWeatherConditions condition;
	private float wind_mph;
	private float wind_kph;
	private int wind_degree;
	private String wind_dir;
	private float pressure_mb;
	private float pressure_in;
	private float precip_mm;
	private float precip_in;
	private int humidity;
	private int cloud;
	private int is_day;
	private float uv;
	private float gust_mph;
	private float gust_kph;
	
	public CurrentWeatherData() {
		// TODO Auto-generated constructor stub
	}

	public String getLast_updated() {
		return last_updated;
	}

	public void setLast_updated(String last_updated) {
		this.last_updated = last_updated;
	}

	public int getLast_updated_epoch() {
		return last_updated_epoch;
	}

	public void setLast_updated_epoch(int last_updated_epoch) {
		this.last_updated_epoch = last_updated_epoch;
	}

	public float getTemp_c() {
		return temp_c;
	}

	public void setTemp_c(float temp_c) {
		this.temp_c = temp_c;
	}

	public float getTemp_f() {
		return temp_f;
	}

	public void setTemp_f(float temp_f) {
		this.temp_f = temp_f;
	}

	public float getFeelslike_c() {
		return feelslike_c;
	}

	public void setFeelslike_c(float feelslike_c) {
		this.feelslike_c = feelslike_c;
	}

	public float getFeelslike_f() {
		return feelslike_f;
	}

	public void setFeelslike_f(float feelslike_f) {
		this.feelslike_f = feelslike_f;
	}

	public CurrentWeatherConditions getCondition() {
		return condition;
	}

	public void setCondition(CurrentWeatherConditions condition) {
		this.condition = condition;
	}

	public float getWind_mph() {
		return wind_mph;
	}

	public void setWind_mph(float wind_mph) {
		this.wind_mph = wind_mph;
	}

	public float getWind_kph() {
		return wind_kph;
	}

	public void setWind_kph(float wind_kph) {
		this.wind_kph = wind_kph;
	}

	public int getWind_degree() {
		return wind_degree;
	}

	public void setWind_degree(int wind_degree) {
		this.wind_degree = wind_degree;
	}

	public String getWind_dir() {
		return wind_dir;
	}

	public void setWind_dir(String wind_dir) {
		this.wind_dir = wind_dir;
	}

	public float getPressure_mb() {
		return pressure_mb;
	}

	public void setPressure_mb(float pressure_mb) {
		this.pressure_mb = pressure_mb;
	}

	public float getPressure_in() {
		return pressure_in;
	}

	public void setPressure_in(float pressure_in) {
		this.pressure_in = pressure_in;
	}

	public float getPrecip_mm() {
		return precip_mm;
	}

	public void setPrecip_mm(float precip_mm) {
		this.precip_mm = precip_mm;
	}

	public float getPrecip_in() {
		return precip_in;
	}

	public void setPrecip_in(float precip_in) {
		this.precip_in = precip_in;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}

	public int getCloud() {
		return cloud;
	}

	public void setCloud(int cloud) {
		this.cloud = cloud;
	}

	public int getIs_day() {
		return is_day;
	}

	public void setIs_day(int is_day) {
		this.is_day = is_day;
	}

	public float getUv() {
		return uv;
	}

	public void setUv(float uv) {
		this.uv = uv;
	}

	public float getGust_mph() {
		return gust_mph;
	}

	public void setGust_mph(float gust_mph) {
		this.gust_mph = gust_mph;
	}

	public float getGust_kph() {
		return gust_kph;
	}

	public void setGust_kph(float gust_kph) {
		this.gust_kph = gust_kph;
	}
	
	
}
