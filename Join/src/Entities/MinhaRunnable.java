package Entities;

public class MinhaRunnable implements Runnable {
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " executando...");
        for (int i = 0; i < 10; i++) {
            System.out.println(name + ": " + i);
        }
        System.out.println(name + " FIM...");
    }
}
