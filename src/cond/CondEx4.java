package cond;

public class CondEx4 {

    public static void main(String[] args) {
        double rating = 9.0;
        if ( rating <= 9){
            System.out.println("어바웃타임을 추천합니다.");
        }
        if ( rating <= 8){
            System.out.println("토이스토리를 추천합니다.");
        }
        if ( rating <= 7){
            System.out.println("고질라를 추천합니다.");
        }
    }
}
