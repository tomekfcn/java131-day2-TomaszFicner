package ex8;

public class MainEx8 {
    public static void main(String[] args) {

    Parcel parcel1 = new Parcel(100, 100, 100, 30, true);
    Parcel parcel2 = new Parcel(100, 100, 100, 10, true);
    Parcel parcel3 = new Parcel(110, 100, 100, 20, false);
    Parcel parcel4 = new Parcel(110, 100, 100, 20, true);

    Validator validator = new Validator();

    validator.validate(parcel1);
        System.out.println("\n");
    validator.validate(parcel2);
        System.out.println("\n");
    validator.validate(parcel3);
        System.out.println("\n");
    validator.validate(parcel4);
    }

}


