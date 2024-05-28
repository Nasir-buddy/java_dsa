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
    @Override
    public void run(){
        int i = 0; 
        while(i < 100){
            if(i % 2 == 0){
                System.out.println("Even thread is running" + i);
            }
            i++;
        }
    }
}
class MyThread2 implements Runnable {
    @Override
    public void run(){
        int i = 0; 
        while(i < 100){
            if(i % 2 != 0){
                System.out.println("Odd thread is running. " + i);
            }
            i++;
        }
    }
}