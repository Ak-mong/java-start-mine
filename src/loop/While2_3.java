package loop;

public class While2_3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int endNum = 3;

        while (i<=endNum) { //지역변수인 i 범위를 넓게 사용이 강제됨
            sum = sum + i;
            System.out.println("i=" + i + " sum = " + sum);
            i++;
        }
        //3번 선언하는걸 줄였다
//        sum = sum + i;
//        System.out.println("i=" + i + " sum = " + sum);
//        i++;
//
//        sum = sum + i;
//        System.out.println("i=" + i + " sum = " + sum);
    }
}
