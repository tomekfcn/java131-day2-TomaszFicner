package ex8;

public class Validator {
    public void isDimensionViable(Parcel parcel) {

        if (parcel.getxLenght() + parcel.getzLenght() + parcel.getyLenght() <= 300) {
            System.out.println("Paczka" + parcel.toString() + "jest właściwych rozmiarów");
        } else {
            System.out.println("Paczka" + parcel.toString() + "ma niewłaściwe wymiary");
        }
    }
    public void isWeightAlright(Parcel parcel){
        if (parcel.getWeight() <= 30 && !parcel.isExpress()){
            System.out.println("Paczka" + parcel + "jest standardowa");
        } else if (parcel.getWeight() <= 15 && !parcel.isExpress()) {
            System.out.println("Paczka" + parcel + "jest exprasowa");
        } else {
            System.out.println("Paczka" + parcel + "Paczka Niestandardowa!");
        }
    }

    public void validate(Parcel parcel){

        isDimensionViable(parcel);
        isWeightAlright(parcel);
    }


}
