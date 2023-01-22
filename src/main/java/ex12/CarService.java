package ex12;

import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> cars = new ArrayList<>();

    @Override
    public String toString() {
        return "CarService{" +
                "cars=" + cars +
                '}';
    }

    public void addCar(Car car) {
        cars.add(car);
        // System.out.println(cars);

    }

    public void removedCar(Car car) {
        cars.remove(car);
        System.out.println(cars);
    }

    public List<Car> getAllV12() {
        List<Car> result = cars.stream()
                .filter(car -> EngineType.V12 == car.getEngineType())
                .collect(Collectors.toList());
        return result;
    }

    public List<Car> getAllBefore2007() {
        List<Car> result = cars.stream()
                .filter(car -> Year.of(2007).isAfter(car.getYearOfProduction()))
                .collect(Collectors.toList());
        return result;
    }

    public Car getMostExpensive() {

        Car mostExpensiveCar = null;

        for (Car car : cars) {
            if (mostExpensiveCar == null) {
                mostExpensiveCar = car;
            }
            if (mostExpensiveCar.getPrice().compareTo(car.getPrice()) < 0) {
                mostExpensiveCar = car;
            }
        }
        return mostExpensiveCar;

    }

    public Car getMostExpensive2() {
        final var sortedCars = cars.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .collect(Collectors.toList());

        final var carsIterator = sortedCars.iterator();

        if (carsIterator.hasNext()) {
            return carsIterator.next();
        } else {
            return null;
        }
    }

    public Car getCheaestcar() {

        Car cheapestcar = null;

        for (Car car : cars) {
            if (cheapestcar == null) {
                cheapestcar = car;
            }
            if (cheapestcar.getPrice().compareTo(car.getPrice()) > 0) {
                cheapestcar = car;
            }
        }
        return cheapestcar;

    }
    public Car getCheapestCar2() {
        final var sortedCars = cars.stream()
                .sorted(Comparator.comparing(Car::getPrice))
                .collect(Collectors.toList());

        final var carsIterator = sortedCars.iterator();

        if (carsIterator.hasNext()) {
            return carsIterator.next();
        } else {
            return null;
        }

    }
    public List<Car> getMultiManufacturerCar(){
        return cars.stream()
                .filter(car -> car.getManufacturers().size()>=3)
                .collect(Collectors.toList());
    }
    public List<Car> getSortedList(SortOrder sortOrder) {
        List<Car> result = cars.stream()
                .sorted(Comparator.comparing(Car::getYearOfProduction).reversed())
                .collect(Collectors.toList());
        if (SortOrder.DESCENDING == sortOrder){
        return result;}
        else {
            return cars.stream()
                 .sorted(Comparator.comparing(car -> car.getYearOfProduction()))
                    .collect(Collectors.toList());
        }
    }
    public boolean isOnList(Car car){

        if (cars.contains(car)){
            return true;
        } else {
            return false;
        }
    }
    public List<Car> getAllProductetBy(Manufacturer manufacturer){
        return cars.stream()
                .filter(car -> car.getManufacturers().contains(manufacturer))
                .collect(Collectors.toList());
    }

}