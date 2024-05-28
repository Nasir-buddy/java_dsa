package Thread;

public class LearnThread {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        Thread tt1 = new Thread(t1);

        MyThread2 t2 = new MyThread2();
        Thread tt2 = new Thread(t2);

        tt1.start();
        tt2.start();
    }
}
class MyThread1 implements Runnable {
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.println("I am a thread 1");
        }
    }
}
class MyThread2 implements Runnable {
    public void run(){
        for(int i = 0; i < 1000; i++){
        System.out.println("i am a thread 2");

        }
    }
}