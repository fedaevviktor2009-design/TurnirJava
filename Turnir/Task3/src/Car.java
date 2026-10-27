public class Car {
    private String brand;
    private int manufactureYear;
    private double engineDisplacement;

    public Car(String brand, int manufactureYear, double engineDisplacement) {
        this.brand = brand;
        this.manufactureYear = manufactureYear;
        this.engineDisplacement = engineDisplacement;
    }

    public void getInfo() {
        System.out.println("Машина марки " + brand + ", выпущенная в " + manufactureYear + " году, с объёмом двигателя, равным " + engineDisplacement + " литра");
    }

    public String getBrand() {
        return brand;
    }
}
