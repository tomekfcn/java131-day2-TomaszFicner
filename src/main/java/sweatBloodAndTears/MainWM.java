package sweatBloodAndTears;


import java.util.concurrent.TimeUnit;

public class MainWM {
    public static void main(String[] args) throws InterruptedException {
        WashingMachine washingMachine = new WashingMachine();
        Load load = new Load();

        if (load.weightSum() > 9) {
            System.out.println("To many clothes in the washing machine");
            load.clothRemove();
        } else

            washingMachine.start();
        TimeUnit.SECONDS.sleep(10);
        washingMachine.stop();
    }
}
