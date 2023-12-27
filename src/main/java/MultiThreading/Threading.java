package MultiThreading;


class MyThread2 implements Runnable{


    public void run() {

        while (true){
            System.out.println("Inside the 2nd Thread ");
        }

    }
}


class MyThread extends Thread {

    public void run(){

        while(true){

//            try {
//                System.out.println("The thred will sleep for 7 seconds now");
//                Thread.sleep(7000);
//                System.out.println("Thread woke up");
//
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
            System.out.println(" Thread 1 doing its tasks");
        }
    }

}


public class Threading {


    public static void main(String[] args) throws InterruptedException {

        //Thread starts from here :

        MyThread myThread = new MyThread();;
        myThread.setPriority(10);
        myThread.start();


        Thread thread2 = new Thread(new MyThread2());
        thread2.start();

//
//        myThread.isAlive();
//
//        myThread.join();


        while(true){
            System.out.println("Inside the main thread");
        }


    }
}
