package Assignment7;

public class ApplicationCopy {
    public static void main(String[] args) {
        /** By extends class Thread */
        StartCopying thread1 = new StartCopying();
        thread1.start();

        /** By Implements Runnable interface  */
        RunCall thread2 = new RunCall();
        Thread thread2Call= new Thread(thread2);
        thread2Call.start();

        /** By using an Anonymous class */
        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println("== Start copy == (3)");
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("== Copy termination == (3)");
            }
        };
        t1.start();

    }

/**This is the first way by extend class "Thread"  */
public static class StartCopying extends Thread {
    @Override
    public void run() {
        System.out.println("== Start copy == (1)");
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("== Copy termination == (1)");
    }
}

public static class RunCall implements Runnable {
    @Override
    public void run() {
        System.out.println("== Start copy == (2)");
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("== Copy termination == (2)");
    }
}



}
