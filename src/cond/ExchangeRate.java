package cond;

public class ExchangeRate {
    public static void main(String[] args) {
        int dollar = 3;
        if(dollar > 0){
            System.out.println("환전됨 금액은 "+ (1300 * dollar) + "원 입니다.");
        }else if(dollar == 0){
            System.out.println("환전할 금액이 없습니다.");
        }else {
            System.out.println("잘못된 금액입니다.");
        }
    }
}
