package casting;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 3 /2;
        System.out.println("div1 = " + div1); //1   int 간 계산 -> int타입 결과

        double div2 = 3 / 2;
        System.out.println("div2 = " + div2); // 1.0    int 간 계산 -> int타입 결과가 나오고 나서 double로 변화됨

        double div3 = 3.0 /2;
        System.out.println("div3 = " + div3); // 1.5    double과 int간 계산 -> double로 계산

        double div4 = (double) 3 /2;
        System.out.println("div4 = " + div4); //1.5     double 3 / int 2 므로 double로서 계산 됨

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result); // 1.5

    }

}
