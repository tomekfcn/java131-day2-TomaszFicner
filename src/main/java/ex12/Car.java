package ex12;

import java.math.BigDecimal;
import java.time.Year;
import java.util.List;
import java.util.Objects;

public class Car {
    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public Car(String name, String model, String price, int yearOfProduction, List<Manufacturer> manufacturers, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = new BigDecimal(price);
        this.yearOfProduction = Year.of(yearOfProduction);
        this.manufacturers = manufacturers;
        this.engineType = engineType;
    }

    private String name ;
    private String model;
    private BigDecimal price;
    private Year yearOfProduction;
    private List<Manufacturer> manufacturers;
    private EngineType engineType;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(price, car.price) && Objects.equals(yearOfProduction, car.yearOfProduction) && Objects.equals(manufacturers, car.manufacturers) && engineType == car.engineType;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfProduction, manufacturers, engineType);
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Year getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfProduction=" + yearOfProduction +
                ", manufacturers=" + manufacturers +
                ", engineType=" + engineType +
                '}';
    }
}

