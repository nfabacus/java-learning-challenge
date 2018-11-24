public class Car {
    public String model;
    public String color;
    public int seats;

    // constructors cannot be inherited.

    public Car() {  // constructor without parameters
        System.out.println("First constructor");
        model = "Test model";
        color = "Test color";
        seats = 4;
    }

    public Car(String model, String color, int seats) {  // constructor with parameters
        this.model = model;
        this.color = color;
        this.seats = seats;
    }

    public void display() {
        System.out.println("Model is: " + model);
        System.out.println("Color is: " + color);
        System.out.println("Seats is: " + seats);
    }
}
