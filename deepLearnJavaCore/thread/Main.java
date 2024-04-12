package dataStructureAlgorithm.deepLearnJavaCore.thread;

public class Main {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread thread = new Thread(thread1);

        Thread2 thread2 = new Thread2();
        thread.start();
        thread2.start();

    }
}
