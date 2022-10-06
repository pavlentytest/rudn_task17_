import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        for(int i=0;i<10;i++) {
            if(i == 3) continue; // переход на следующую итерацию
            System.out.println("i="+i);
            if(i == 7) break; // прерываем выполнение цикла
        }
         */

        Scanner scanner = new Scanner(System.in);
        int x;
        int sum=0;
        while(true) {
            x = scanner.nextInt();
            if(!(x>9 && x<100)) {
                break;
            } else {
              int d = x/10;
              int e = x%10;
              sum += (d+e);
            }
        }
        System.out.println(sum);
    }
}