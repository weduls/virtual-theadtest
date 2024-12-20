package javas.main.wedul;

import javas.main.VThreadRunner;

public class JavaApplication {

    public static void main(String[] args) throws Exception {
        VThreadRunner.run(() -> {
            Wedul w = new Wedul();
            w.start();
        });
    }


}
