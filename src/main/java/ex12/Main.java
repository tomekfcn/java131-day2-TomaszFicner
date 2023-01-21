package ex12;

import java.util.List;

public class Main{
    public static void main(String[] args) {

        Manufacturer manufacturer1 = new Manufacturer("Ford", 1940, "USA");
        Manufacturer manufacturer2 = new Manufacturer("Ford", 1940, "USA");

        System.out.println(manufacturer1.equals(manufacturer2));
        System.out.println(manufacturer1);
        System.out.println(manufacturer2);
        //manufacturer2.setName("Mercedes");
        System.out.println(manufacturer1);
        System.out.println(manufacturer2);

        List<Manufacturer> manufacturers = List.of(manufacturer1, manufacturer2);

        Car car1 = new Car("Ferrari", "LaFerrari", "300000", 2010, List.of(manufacturer1, manufacturer2), EngineType.V12 );
        Car car2 = new Car("Ferrari", "FF", "130000", 2010, List.of(manufacturer1, manufacturer2), EngineType.V12 );

        System.out.println(car1.equals(car2));
    }


}
