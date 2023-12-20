package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {
        int rows = 6;
        for(int i = 1;i <= rows; i++){
            for(int j =1; j <= i; j++){ // j<i+1 로 표현했었음 == 가독성을 위해 바꿀 펼요가있다
                System.out.print("*");
            };
            System.out.println();
        }
    }
}
