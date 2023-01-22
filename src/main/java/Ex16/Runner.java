package Ex16;

import java.util.Arrays;
import java.util.stream.Collectors;

public enum Runner {
    BEGINNER(240, Integer.MAX_VALUE),
    INTERMEDIATE(160, 239),
    ADVANCED(0, 159);

    private int minTime;
    private int maxTime;

    public int getMinTime() {
        return minTime;
    }

    public int getMaxTime() {
        return maxTime;
    }

    Runner(int minTime, int maxTime) {
        this.minTime=minTime;
        this.maxTime=maxTime;

    }


    public static Runner getFitnessLevel(int time) {
        if (BEGINNER.minTime <= time) {
            return BEGINNER;
        } else if (INTERMEDIATE.minTime <= time && time <= INTERMEDIATE.maxTime) {
            return INTERMEDIATE;
        } else {
            return ADVANCED;
        }
    }


        public static Runner getFitnessLevel2(int time){
            for (Runner runner : Runner.values()) {
                if (runner.minTime <= time && time <= runner.maxTime){
                    return runner;
                }
            }
            return null;

    }

public static Runner getFitnessLevel3(int time){
    return Arrays.stream(Runner.values())
            .filter(runner -> runner.minTime <= time && runner.minTime >= time)
            .findFirst()
            .orElseGet(() -> {
                System.out.println("nie znalazłem pozimu biegacza");
                return null;
            });
}

}