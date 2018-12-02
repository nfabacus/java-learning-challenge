public class ClassesMain {
    public static void main(String[] args) {
        // example of class instances with polymorphism
        Car testCar = new Car();
        testCar.display();

        Car oneParamCar = new Car("Tony");
        Car oneNumberCar = new Car(5);

        Car ferrari = new Car("Ferrari F430", "Red", 4);
        ferrari.display();
    }
}
