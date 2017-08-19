package typsparametryzowany;

public class Gen<T> {
    T ob;
    Gen(T o){
        ob =o;
    }

    T getOb(){
        return ob;
    }
    void showType(){
        System.out.println("Typem T jest "+ ob.getClass().getName());
    }
}
