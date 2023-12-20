package loop.ex;

public class SumEx {
    public static void main(String[] args) {
        int i = 1;
        int max = 10 ;
        int sum = 0;
        while(i<=max){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
        System.out.println();
        int sum2 = 0;
        for (i = 1; i <= max; i++) {
            sum2 = sum2 + i;
        }
        System.out.println("for문으로 하면: "+ sum2);
    }

}
