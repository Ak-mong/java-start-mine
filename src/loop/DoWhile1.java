package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        int i = 10;
//일단 do하고 while조건이 참일경우 또 실행한다. 최초한번은 꼭 실행할 때 사용됨
        do {
            System.out.println("혀재 숫자는: "+ i);;
            i++;
        }        while(i < 3);

    }
}
