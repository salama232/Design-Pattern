
public class ForecastDisplay implements Observer, Display {
	
	private float temperature;
	private float humidity;
	private float pressure;
	

	public ForecastDisplay(Subject weatherData) {
		weatherData.registarObsorver(this);
	}

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure=pressure;
		display();
	}

	public void display() {
		System.out.println("forecast: " + temperature + "F degrees and " + humidity + "% humidity and pressure is"+pressure);
	}
}