package konstruktorysparametryzowane;

public class GenConsDemo {
    public static void main(String[] args) {
        Summation summation = new Summation(5.0);

        System.out.println("Wynik wynosi " + summation.getSum());
    }
}
