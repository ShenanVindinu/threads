package lk.ijse;


public class Main {

    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();

        MyThread myThread = new MyThread();

        //start Thread
        myThread.start();
        myRunnable.run();

    }
}