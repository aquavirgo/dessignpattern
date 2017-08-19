package interfacesparametryzowany;

public class MyClass<T> implements  Containment{
T[] arrayRef;

    @Override
    public boolean contains(Object o) {
        for (T x:arrayRef)
            if(x.equals(o)) return  true;
        return false;
    }

    MyClass(T[] o){
        arrayRef=o;
    }



}
