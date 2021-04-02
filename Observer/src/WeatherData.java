import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
	private List<Observer> observers;
	private float temp;
	private float humnidity;
	private float pressure;

	public WeatherData() {
		super();
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registarObsorver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);

	}

	@Override
	public void removeObsorver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if (i >= 0) {
		observers.remove(i);
		}
	}

	@Override
	public void notifyObsorver() {
		// TODO Auto-generated method stub
		observers.stream().forEach(e -> e.update(temp, humnidity, pressure));
	}

	public void measurementsChanged() {
		notifyObsorver();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temp = temperature;
		this.humnidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
