package sweatBloodAndTears;

import java.util.ArrayList;
import java.util.List;

public class Load {

    List<Cloth> load = new ArrayList<>();

    public List<Cloth> getLoad() {
        return load;
    }

    public void clothAdd(Cloth cloth) {
        load.add(cloth);
    }

    public void clothRemove() {
        load.remove(0);
    }

    public float weightSum() {
        float weightSum = 0;

        for (Cloth cloth : load) {
            float weight = cloth.getWeight();

            weightSum = weightSum + weight;
        }

        return weightSum;
    }

}
