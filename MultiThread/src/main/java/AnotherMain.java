public class AnotherMain {
    public static void main(String []args) {
        Thread th = Thread.currentThread();
        System.out.println(th.isInterrupted());
        System.out.println("End");
        Object ob = new Object();
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

