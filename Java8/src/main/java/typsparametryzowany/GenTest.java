package typsparametryzowany;

public class GenTest {
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);

        iOb.showType();
        System.out.println(iOb.getOb());

    }
}
