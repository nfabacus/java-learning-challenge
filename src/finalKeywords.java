public class finalKeywords {
    public static void main(String[] args) {
        int a = 10;
        a = 20;

        // final variable
        final int b = 30;
        // b = 40; This will not work.  final will make b unasignable, like const in javascript.
        System.out.println(a);
        System.out.println(b);

        demoMethod();
    }

    // final method - will not allow child class to override the method
    final static void demoMethod(){
        System.out.println("Hello, Java!");
    }
}
