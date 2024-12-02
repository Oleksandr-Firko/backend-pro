package homeWork__01;

public class SecondThread implements Runnable {
    @Override
    public void run() {
        int counter = 0;
        for (int i = 1_000_001; i <= 2000000; i++) {
            if (i % 21 == 0 && String.valueOf(i).contains("3")) {
                counter++;
            }
        }
        System.out.println(Thread.currentThread().getName() + " - second numbers part from 1_000_001 to 2_000_000 contains: (" + counter + ") numbers");
    }
}
