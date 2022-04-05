package Assignment7;

public class ApplicationTest {
    public static void main(String[] args)  {

        /** This is another example shows threading with huge value of data */
    Test t1 = new Test();
    Test t2 = new Test();
        Thread t1run =new Thread(t1);
        Thread t2run =new Thread(t2);

        t1run.start();
        t2run.start();
    }


    public static class Test implements Runnable {
    int  counter = 1;
    @Override
    public void run() {
        int i = 0;
        while( i <1000){
            System.out.println(Thread.currentThread().getName() + " // I= " + counter++);
            i++;
        }
    }
}

}
