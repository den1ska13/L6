import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        boolean b = true;
        do {
            int secret = r.nextInt(100) + 1;
            System.out.println("Угадываем");
            for (int i = 7; i > 0; i--) {
                int k = sc.nextInt();
                if (k == secret) {
                    System.out.println("Вы выиграли!!!");
                    break;
                }
                if (k < secret) System.out.println("Мало");
                if (k > secret) System.out.println("Много");
                System.out.println("Осталось "+(i-1));

            }
            b = false;
            System.out.println("Хотите сыграть еще? 1)Да  2)Нет");
            int e = sc.nextInt();
            if (e == 1) b = true;
        } while (b == true);

    }
}
