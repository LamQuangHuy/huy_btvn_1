import java.util.Arrays;

public class btvn1{
    public static int sum(int[]a){
        int sum=0;
        for(int s:a ){
            sum+=s;
        }
        return sum;
    }
    public static int sum2(int[]a)
    {
        return Arrays.stream(a).sum();
    }
    public static void main(String[] args) {
        int a[]={2,6,4,1,9};
        System.out.println(sum(a));
        // System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(a);

    }
}