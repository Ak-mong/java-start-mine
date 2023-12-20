package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10; //m 생존 시작

        if (m > 0) {
        int temp = m * 2; //if문 안으로 넣어진 temp 변수
            System.out.println("temp = " + temp);
        }
        System.out.println("if 절 밖(main)의 m = " + m);
    } //m 생존 종료
}
//for문이 구조적으로 깔끔한 이유
// ==> 스코프 기능 때문
// while은 지역변수의 번위를 넓게 사용할수 밖에 없는데, for문은 좁게 사용하는것이 가능하기 때문