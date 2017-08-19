package meteodysparametryzowane;

public class GenericMethod {
static <T extends Comparable<T>,V extends T> boolean arraysEqual(T[] x,V[] y){

    if(x.length!=y.length) return false;

return  true;
}

    public static void main(String[] args) {
        Integer nums[] = {1,2,3,4,5};
        Integer nums2[] = {1,2,3,4,5};

        if(arraysEqual(nums,nums)){
            System.out.println("Dlugosc jest rowna");
        }

    }

}
