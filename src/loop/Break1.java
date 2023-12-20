package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(true){ //조건이 true니까 무한반복됨
            sum = sum + i;
            if(sum > 10){
                System.out.println("합이 10보다 크면 종료 : i=" + i + " sum: " + sum);
                break;
            }
            i ++;
        }

        i = 10; //밖에서도 i를 쓸수 있음 == while과 for문의 차이점
    }
}
