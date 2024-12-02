package homeWork__01;

public class FirstThread extends Thread {
    @Override
    public void run() {
        int counter = 0;
        for (int i = 1; i <= 1000000; i++) {
            if (i % 21 == 0 && String.valueOf(i).contains("3")) {
                counter++;
            }
        }
        System.out.println(Thread.currentThread().getName()+" - first numbers part from 1 to 1_000_000 contains: (" + counter + ") numbers");
    }
}
