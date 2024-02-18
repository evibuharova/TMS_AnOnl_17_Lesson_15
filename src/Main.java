import java.util.concurrent.locks.ReentrantLock;

public class Main {
    //буфер
    public static int number = 0;
    public static ReentrantLock reentrantLock=new ReentrantLock();

    public static void main(String[] args) {

        Thread myThread1=new Thread() {
            //поток 1
            @Override
            public void run() {
                for (int i = 0; i < 25000; i++) {
                    reentrantLock.lock();
                    number++;
                    reentrantLock.unlock();
                }
            }
        };
        //поток 2
        Thread myThread2=new Thread() {
            //поток 1
            @Override
            public void run() {
                for (int i = 0; i < 25000; i++) {
                    reentrantLock.lock();
                    number++;
                    reentrantLock.unlock();
                }
            }
        };
        //поток 3
        Thread myThread3=new Thread() {
            //поток 1
            @Override
            public void run() {
                for (int i = 0; i < 25000; i++) {
                    reentrantLock.lock();
                    number++;
                    reentrantLock.unlock();
                }
            }
        };
        try {
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread1.join();
        myThread2.join();
        myThread3.join();
        }
        catch (Exception exception) {}
        System.out.println(number);
    }
}
