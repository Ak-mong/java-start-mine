package cond;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 85;
        if(score >= 90){
            System.out.println("학점은 A입니다.");
        }else if(score >= 80){
            System.out.println("학점은 B입니다.");
        }else if(score >= 70){
            System.out.println("학점은 C입니다.");
        }else if(score >= 60){
            System.out.println("학점은 D입니다.");
        }else
            System.out.println("학점은 F입니다.");
        }
//단순 값 비교기 때문에 switch문이 부적합하다 (내 실수)
//        switch (score){
//            case score >= 90:
//                System.out.println("score = " + score);
//                System.out.println("출력 : 학점은 A입니다");
//                break;
//            case score >= 80:
//                System.out.println("score = " + score);
//                System.out.println("출력 : 학점은 B입니다");
//                break;
//            case score >= 70:
//                System.out.println("score = " + score);
//                System.out.println("출력 : 학점은 C입니다");
//                break;
//            case score >= 60:
//                System.out.println("score = " + score);
//                System.out.println("출력 : 학점은 D입니다");
//                break;
//            default:
//                System.out.println("score = " + score);
//                System.out.println("출력 : 학점은 F입니다");
//                break;
//        }
//    }
}
