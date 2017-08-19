package referencjekonstruktorow;

public class ConstruktorRef {
    public static void main(String[] args) {
        MyFunc myFunc = MyClass::new;
        MyClass myClass = myFunc.func("Testujemy");
        System.out.println("Lancuchem w zmiennej mc jest: "+ myClass.getStr());
    }

}
