// Polymorphism

public class OverloadingMain {

    public void add() {
        System.out.println("Output: " + 2);
    }

    public void add(int a) {
        System.out.println("Output: " + (a+a));
    }

    public void add(int a, int b) {
        System.out.println("Output: " + (a+b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Output: " + (a+b+c));
    }

    public static void main(String[] args) {
        OverloadingMain overloadingMain = new OverloadingMain();
        overloadingMain.add();
        overloadingMain.add(2);
        overloadingMain.add(2,3);
        overloadingMain.add(2,3,5);

        // Implicit Operator Overloading example below
        // There is no explicit overloading in java.
        // + operator behaves differently depending on the number and string adding.
        System.out.println(10+20);
        System.out.println(("Hello " + "Java"));
        System.out.println(("Hello " + "Java " + 10 + 30));
        System.out.println(("Hello " + "Java " + (10 + 30)));
        System.out.println((10 + 30 + " Hello " + "Java"));
    }
}
