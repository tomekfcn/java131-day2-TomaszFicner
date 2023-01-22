package ex12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceMain {
    public static void main(String[] args) {
        CarService carService = new CarService();
        Manufacturer manufacturer1 = new Manufacturer("Ford", 1940, "USA");
        Manufacturer manufacturer2 = new Manufacturer("Ford", 1950, "UK");
        Manufacturer manufacturer3 = new Manufacturer("Ford", 1949, "Germany");
        Manufacturer manufacturer4 = new Manufacturer("Tatra", 1849, "CzechRepublic");

        List <Manufacturer> manufacturers = new ArrayList<>();
        List<Manufacturer> manufacturers1 = new ArrayList<>();
        manufacturers.add(manufacturer1);
        manufacturers1.add(manufacturer1);
        manufacturers1.add(manufacturer2);
        manufacturers1.add(manufacturer3);

        Car car = new Car("Audi", "A4", "30000", 2006, manufacturers, EngineType.V12);
        Car car1 = new Car("Audi", "A6", "50000", 2008,manufacturers1, EngineType.S6);
        Car car2 = new Car("Audi", "A8", "50000", 2008,manufacturers, EngineType.S6);
        Car car7 = new Car("Ferrari", "FF", "500000", 2018,manufacturers, EngineType.S6);
        carService.addCar(car);
        carService.addCar(car1);
        carService.addCar(car2);
        carService.removedCar(car);
        System.out.println(carService.getAllV12());
        System.out.println(carService.getAllBefore2007());
        System.out.println(carService.getCheapestCar2());
        System.out.println(carService.getMultiManufacturerCar());
        System.out.println(carService.getSortedList(SortOrder.ASCENDING));
        System.out.println(carService.getSortedList(SortOrder.DESCENDING));
        System.out.println(carService.isOnList(car1));
        System.out.println(carService.isOnList(car));
        System.out.println(carService.getAllProductetBy(manufacturer2));

        var carNames = carService.getAllProductetBy(manufacturer1).stream()
                .map(cars -> car.getName())
                .map(carName -> "Nazwa samochodu " + carName)
                .map(carName -> carName.length())
                .collect(Collectors.toList());
        System.out.println(carNames);
        }
    }

