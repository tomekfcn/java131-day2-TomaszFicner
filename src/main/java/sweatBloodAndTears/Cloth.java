package sweatBloodAndTears;

public class Cloth {

//    static Cloth coat = new Cloth(1.5f, "wool");
//    static Cloth shirt = new Cloth(0.3f, "cotton");
//    static Cloth dress = new Cloth(0.7f, "polyester");
//    static Cloth sox = new Cloth(0.1f, "wool");
//    static Cloth pants = new Cloth(1f, "jeans");
    public float weight = 0f;
    public String fabric;
    public Cloth(float weight, String fabric) {
        this.weight = weight;
        this.fabric = fabric;
    }

    public float getWeight() {
        return weight;
    }

    public String getFabric() {
        return fabric;
    }
}
