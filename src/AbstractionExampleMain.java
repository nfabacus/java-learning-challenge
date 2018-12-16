public class AbstractionExampleMain {
    public static void main(String[] args) {
        AutoMobile car1 = new Ferrari();
        AutoMobile car2 = new Audi();
        CarRepair carRepair = new CarRepair();
        carRepair.repairCar(car1);
        carRepair.repairCar(car2);

    }
}
