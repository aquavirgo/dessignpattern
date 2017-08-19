package lambdablokowa;

public class Blokowa {



    public static void main(String[] args) {
        Value values = (m,n)->{
            int value;
            if(m>n){
                value=2;
            }else{
                value=3;
            }
            return value;
        };
        System.out.println("Lambda blokowa "   + values.takeNum(12,14));
    }


}
