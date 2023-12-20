package loop;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;
        int z = 10;
        for(int i = 1;;i++){ //조건이 true니까 무한반복됨
            sum = sum + i;
            if(sum > 10){
                System.out.println("합이 10보다 크면 종료 : i=" + i + " sum: " + sum);
                break;
            }

        }
        //i =10; 아 밖에서 i를 쓸수 없어짐
    }
}
