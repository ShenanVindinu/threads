package lk.ijse;



public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread( () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("One");

                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {
                    System.out.println(e);
                }

            }
        });

        Thread t2 = new Thread( () -> {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Two");


                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {
                    System.out.println(e);
                }


            }
        });


        t1.start();

        t2.start();

    }

}