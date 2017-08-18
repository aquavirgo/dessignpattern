package designpattern.obserwator;

import designpattern.obserwator.DanePogodowe;
import designpattern.obserwator.Obserwator;
import designpattern.obserwator.Podmiot;
import designpattern.obserwator.WyswietlElement;

import java.util.*;

public class ForecastDisplay implements Obserwator, WyswietlElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private Podmiot DanePogodowe;

	public ForecastDisplay(Podmiot DanePogodowe) {
		this.DanePogodowe = DanePogodowe;
		DanePogodowe.zarejestrujObserwatora((Obserwator) this);
	}

	public void update(float temp, float humidity, float pressure) {
                lastPressure = currentPressure;
		currentPressure = pressure;

		display();
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}

	@Override
	public void wyswietl() {
		display();
	}


	@Override
	public void aktualizacja(float temp, float wilgotnosc, float cisnienie) {
		update(temp,wilgotnosc,cisnienie);
	}
}
