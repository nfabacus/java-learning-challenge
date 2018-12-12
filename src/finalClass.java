final public class finalClass {  //final class cannot be inherited.
    public static void main(String[] args) {
        demoMethod();
    }

    // final method - will not allow child class to override the method
    final static void demoMethod(){
        System.out.println("final class cannot be inherited.");
    }
}
