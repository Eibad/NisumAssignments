package Multithreading;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        Thread mainThread = Thread.currentThread();
//        MainThread myMainThread = new MainThread();
//        Thread mainThread = new Thread(myMainThread);
//        System.out.println("MAIN THREAD STARTING : "+mainThread.getId()+"   "+mainThread.getClass());

        MyThread myThread1  = new MyThread(1000, "mythread_1");
        MyThread myThread2 = new MyThread(500,"mythread_2");
        Thread thread1  = new Thread(myThread1);
        Thread thread2 = new Thread(myThread2);
      //  Thread thread2 = new Thread(new Program());


        thread1.start();
        thread2.start();
//        thread2.start();


//        if(!(thread.isAlive() && thread1.isAlive() && thread2.isAlive())) {
//            System.out.println("MAIN THREAD ending : " + mainThread.getId() + "   " + mainThread.getClass());
//        }


//        myThread.run();
//        System.out.println("12"+myThread.getClass());
//        System.out.println("13"+thread.getId());
//        System.out.println("14"+thread1.getId());


        thread1.join();
        thread2.join();


        System.out.println("Finishing MAin");


    }

}
