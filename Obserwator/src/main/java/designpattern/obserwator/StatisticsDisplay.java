package designpattern.obserwator;

import designpattern.obserwator.Obserwator;
import designpattern.obserwator.Podmiot;
import designpattern.obserwator.WyswietlElement;

import java.util.*;

public class StatisticsDisplay implements Obserwator,WyswietlElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private Podmiot DanePogodowe;

	public StatisticsDisplay(Podmiot DanePogodowe) {
		this.DanePogodowe = DanePogodowe;
		DanePogodowe.zarejestrujObserwatora(this);
	}

	public void update(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}
 
		if (temp < minTemp) {
			minTemp = temp;
		}

		display();
	}

	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}

	@Override
	public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
		update(temp,wilgotnosc,cisnienie);
	}

	@Override
	public void wyswietl() {
display();
	}
}
