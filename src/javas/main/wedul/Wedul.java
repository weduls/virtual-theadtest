package javas.main.wedul;

public class Wedul {

    public synchronized void start() throws InterruptedException {
        System.out.println("start");
        Thread.sleep(1000);
    }
}
