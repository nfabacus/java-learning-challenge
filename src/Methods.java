public class Methods {
    public static void main(String[] args) {
        sayHello();
        greeting("Toby", 5);
        int max = maxValue(12, 4);
        System.out.println("Maximum is : " + max);
    }

    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    public static void greeting(String name, int counter) {
        for (int i=0; i<counter; i++) {
            System.out.println("Hello, " + name + "!");
        }
    }

    public static int maxValue(int number1, int number2) {
        int max;
        if(number1 > number2) {
            max = number1;
        } else {
            max = number2;
        }
        return max;
    }
}
