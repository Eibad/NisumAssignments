package Multithreading;

import org.omg.CORBA.Current;

public class MyThread implements Runnable {

    long timeTaken;
    int sleep;
    String name;
    MyThread(int sleep,String name){
        this.sleep = sleep;
        this.name = name;
        this.timeTaken = System.currentTimeMillis();
    }
    @Override
    public void run() {
        for(int i =0 ; i< 5; i++){

            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println(name+" : "+i);
        }
//        System.out.println("Thread is running...");

        System.out.println(name+"time Taken = "+(System.currentTimeMillis()-timeTaken));

    }
}
