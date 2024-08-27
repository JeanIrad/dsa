public class MultiThreads{

    public static void main(String[] args) {
        for(int i = 1; i <6; i++){
            Thread1 myThread = new Thread1(i);
            myThread.start();
        }
    }
}
