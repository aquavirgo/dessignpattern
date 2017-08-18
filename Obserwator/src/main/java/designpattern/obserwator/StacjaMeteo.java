package designpattern.obserwator;

public class StacjaMeteo {
    public static void main(String[] args) {
        DanePogodowe danePogodowe = new DanePogodowe();
        WarunkiBierzaceWyswietl warunkiBierzaceWyswietl = new WarunkiBierzaceWyswietl(danePogodowe);

        danePogodowe.ustawOdczyt(23.1f,51.1f,1000.2f);
    }
}
