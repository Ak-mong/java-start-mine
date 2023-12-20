package loop.ex;

public class ForEx {
    public static void main(String[] args) {
        int num = 1;
        while(num<=10){
            System.out.println(num*2);
            num = num +1;
        }

        for(num=1;num<=10;num++){
            System.out.println(num * 2);
        }
    }
}
