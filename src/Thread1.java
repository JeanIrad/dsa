public class Thread1 extends Thread {
    private int threadNumber;
    public Thread1(int threadNumber) {
this.threadNumber = threadNumber;
    }

    @Override
   public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i+ " From thread "+ threadNumber);
//            if(threadNumber == 2) throw new RuntimeException();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
