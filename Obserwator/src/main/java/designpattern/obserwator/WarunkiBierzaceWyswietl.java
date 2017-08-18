package designpattern.obserwator;

public class WarunkiBierzaceWyswietl implements Obserwator, WyswietlElement {
    private float temperatura;
    private float wilgotnosc;
    private Podmiot DanePogodowe;

    public WarunkiBierzaceWyswietl(Podmiot DanePogodowe){
        this.DanePogodowe=DanePogodowe;
        DanePogodowe.zarejestrujObserwatora(this);

    }

    @Override
    public void aktualizacja(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatura =temperatura;
        this.wilgotnosc=wilgotnosc;
        wyswietl();
    }

    @Override
    public void wyswietl() {
        System.out.println("Warunki bierzace "+temperatura+ " stopni C oraz "+wilgotnosc+" % wilgotnosc");
    }
}
