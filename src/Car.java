// Constructors Examples

public class Car {
    public String model;
    public String color;
    public int seats;

    // constructors cannot be inherited.
    // check ClassesMain to see how this class is instantiated.
    // access modifier (e.g.public) followed by the class name. e.g. pubic Car
    public Car() {  // constructor without parameters
        System.out.println("First constructor");
        model = "Test model";
        color = "Test color";
        seats = 4;
    }

    public Car(String a) {
        System.out.println("Hello, " + a + " Constructor witn one integer is called");
    }
    public Car(int a) {
        System.out.println(a + " is a number.");
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
