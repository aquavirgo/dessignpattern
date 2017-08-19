package referencjemetodinstancyjnych;

public class MethodRef2 {
    public static void main(String[] args) {
        boolean result;

        MyIntNum myIntNum = new MyIntNum(12);

        IntPredicate ip = myIntNum::isFactor;

        result=ip.test(3);
        if(result){
            System.out.println("3 jest czynnikiem "+ myIntNum.getNum());
        }
    }
}
