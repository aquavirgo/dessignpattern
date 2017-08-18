package designpattern.obserwator;

public interface Podmiot {
    public void zarejestrujObserwatora(Obserwator o);
    public void usunObserwatora(Obserwator o);
    public void powiadomObserwatorow();
}
