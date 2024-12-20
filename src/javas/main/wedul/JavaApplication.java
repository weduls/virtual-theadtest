package javas.main.wedul;

import javas.main.VThreadRunner;

public class JavaApplication {

    public static void main(String[] args) throws Exception {
        Wedul w = new Wedul();
        VThreadRunner.run(w::start);
        VThreadRunner.run(w::start);
    }


}
