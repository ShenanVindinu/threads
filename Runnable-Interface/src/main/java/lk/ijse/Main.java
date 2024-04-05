package lk.ijse;

class One implements Runnable {

    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("one");

            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }

        }

    }
}

class Two implements Runnable {

    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Two");

        }

        try {
            Thread.sleep(10);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

    }
}



public class Main {

    public static void main(String[] args) {

        One one = new One();
        Two two = new Two();

        Thread t1 = new Thread(one);
        Thread t2 = new Thread(two);

        t1.start();

        try {
            Thread.sleep(10);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        t2.start();

    }

}