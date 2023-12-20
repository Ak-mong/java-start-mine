package scope;

public class Scope3 {
    public static void main(String[] args) {
        int m = 10; //m 생존 시작
        int temp = 0; // if문에서만 쓰지만, 이렇게 선언할 경우, 불필요하게 머리에 넣어두고 쓰는것 같아짐
        if (m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("if 절 밖(main)의 m = " + m);
    } //m 생존 종료
}
