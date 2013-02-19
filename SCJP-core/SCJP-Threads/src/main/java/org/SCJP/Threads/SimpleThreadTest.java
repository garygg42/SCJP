package org.SCJP.Threads;

public class SimpleThreadTest {

    public static void main(String[] args) {
        final int THREADS = 50;
        MyRunnable[] r = new MyRunnable[THREADS];
        for (int i = 0; i < r.length; i++) {
            r[i] = new MyRunnable();
        }
        Thread[] t = new Thread[THREADS];
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(r[i], "TT " + i);
            t[i].start();
            try {
                t[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 50; i++) {
            System.out.println("MAIN ACTION");
        }
    }

}

class MyRunnable implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " number: "
                    + i);
        }
    }

}