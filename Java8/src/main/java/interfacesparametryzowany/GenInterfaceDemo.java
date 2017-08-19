package interfacesparametryzowany;

public class GenInterfaceDemo {
    public static void main(String[] args) {
        Integer x[] = {1,2,3};

        MyClass<Integer> ob = new MyClass<>(x);
        if(ob.contains(2))System.out.println("Zawiera 2");
        else
            System.out.println("Nie zawiera 2");
    }
}
