package Entities;

public class MInhaRunnable implements Runnable {

    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " rodando");
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            if (i % 3 == 0) {
                try {
                    Thread.sleep(2000); //dorme 2 seg
                }
                catch (InterruptedException e) {}
            }
        }
        System.out.println(name + " FIM ****");
    }
}
