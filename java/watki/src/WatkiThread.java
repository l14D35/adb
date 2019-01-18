public class WatkiThread extends Thread {

    public static void main(String[] args) {
/*
        Integer SIZE = 10;
        Thread[] t = new Thread[SIZE];

        for (int i = 0; i < t.length; i++) {
            t[i] = new WatkiThread();
            t[i].start();
        }
*/

        WatkiThread piotrek = new WatkiThread();

        System.out.println(piotrek.getClass().getSimpleName());
        piotrek.start();
    }

    @Override
    public void run() {
        System.out.println("Pracuje: " + Thread.currentThread().getId());
    }
}
