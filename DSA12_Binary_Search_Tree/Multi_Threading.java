package DSA12_Binary_Search_Tree;

public class Multi_Threading {
    public static void main(String[] args) {
        for (int i=1;i<100;i++){
            TestThread1 testThread = new TestThread1(i);
            Thread thread  = new Thread(testThread);
            thread.start();
//            thread.run();         //run thi output line ma ave
        }

//        for (int i=0;i<100;i++){
//            TestThread testThread = new TestThread(i);
//            testThread.start();
//        }
    }
}

//Creating thread by implementing Runnable interface
class TestThread1 implements Runnable{
    int i;
    public TestThread1(int i) {
        this.i = i;
    }
    public void run(){
        System.out.print(i+" ");
    }
}


class TestThread extends Thread{
    int i;
    public TestThread(int i){
        this.i=i;
    }
    public void run(){
        System.out.print(i+" ");
    }
}