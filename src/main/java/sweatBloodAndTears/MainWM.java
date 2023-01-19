package sweatBloodAndTears;

import java.util.concurrent.TimeUnit;

public class MainWM {
    public static void main(String[] args) throws InterruptedException {
        WashingMachine washingMachine = new WashingMachine();

        washingMachine.start();
        TimeUnit.SECONDS.sleep(10);
        washingMachine.stop();

    }
}