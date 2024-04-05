package lk.ijse;



public class Main {

    public static void main(String[] args) throws InterruptedException {

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
        } );

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

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);


        t1.start();

        System.out.println("Thread one status:" + t1.getName() + " " + t1.isAlive());
        System.out.println("Priority " + t1.getPriority());
        System.out.println(Thread.currentThread());
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Thread one status:" + t2.getName() + " " + t2.isAlive());
        System.out.println("Priority " + t2.getPriority());
        System.out.println(Thread.currentThread());

        System.out.println("Bye");

    }

}