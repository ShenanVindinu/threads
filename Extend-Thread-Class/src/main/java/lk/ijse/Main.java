package lk.ijse;

class One extends Thread {

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

class Two extends Thread {

    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Two");

            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }

        }



    }
}



public class Main {

    public static void main(String[] args) {

        One one = new One();
        Two two = new Two();

        one.start();

        try {
            Thread.sleep(10);
        }
        catch (InterruptedException e) {
            System.out.println(e);
        }

        two.start();

    }

}