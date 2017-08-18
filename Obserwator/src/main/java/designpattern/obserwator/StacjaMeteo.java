package designpattern.obserwator;

public class StacjaMeteo {
    public static void main(String[] args) {
        DanePogodowe danePogodowe = new DanePogodowe();
        WarunkiBierzaceWyswietl warunkiBierzaceWyswietl = new WarunkiBierzaceWyswietl(danePogodowe);
        ForecastDisplay forecastDisplay = new ForecastDisplay(danePogodowe);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(danePogodowe);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(danePogodowe);

        danePogodowe.ustawOdczyt(23.1f,51.1f,1000.2f);
    }
}
