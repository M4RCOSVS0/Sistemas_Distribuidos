public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio da minha thread main");
        Thread t1 = new Thread(new MinhaRunnable(), "Thread1");
        Thread t2 = new Thread(new MinhaRunnable(), "\t\tThread2");
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }

        System.out.println("*** As duas Threads foram encerradas ***");
    }
}