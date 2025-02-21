import Entities.MInhaRunnable;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.next();
        System.out.println("INICIO DA THREAD MAIN");
        Thread t1 = new Thread(new MInhaRunnable());
        Thread t2 = new Thread(new MInhaRunnable());
        t1.start();
        t2.start();
    }
}