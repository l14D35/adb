package threads;

public class WatkiRunnable implements Runnable {
    private Thread t;

    private WatkiRunnable() {
        t = new Thread(this);
    }

    public static void main(String[] args) {
        WatkiRunnable piotrek = new WatkiRunnable();
        WatkiRunnable daniel = new WatkiRunnable();
        //piotrek.t.start();
        //daniel.t.start();

    }

    @Override
    public void run() {
        System.out.println("Pracuje: " + Thread.currentThread().getId());
    }

}
