package threads;

public class WatkiPiotrekTest implements Runnable {
    private static final int SIZE = 6;
    private Thread w;

    private WatkiPiotrekTest() {
        w = new Thread(this);
    }

    public static void main(String[] args) throws InterruptedException {
        WatkiPiotrekTest[] p = new WatkiPiotrekTest[SIZE];
        for (int i = 0; i < p.length; i++) {
            p[i] = new WatkiPiotrekTest();
            p[i].w.start();  // na rzecz watku tego obietku wywołuje metode run(poprzez metode start())
            Thread.sleep(2000);
        }


    }

    @Override
    public void run() {
        System.out.println("Biegnie: " + Thread.currentThread().getId());

    }

}