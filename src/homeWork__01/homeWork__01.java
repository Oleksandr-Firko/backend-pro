package homeWork__01;

public class homeWork__01 {
    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();
        int counter = 0;
        for (int i = 0; i <= 2000000; i++) {
            if (i % 21 == 0 && String.valueOf(i).contains("3")) {
                counter++;
            }
        }
        System.out.println(Thread.currentThread().getName() + " - contains: (" + counter + ")numbers");
        firstThread.start();
        Thread thread = new Thread(secondThread);
        thread.start();
        System.out.println("Should be 22314 and 22297 it equals 44611");
    }
}
