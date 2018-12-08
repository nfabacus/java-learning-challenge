public class OverridingMain extends A {
    // Overriding method
    @Override
    void display() {
        System.out.println("Display of OverridingMain");
    }

    public static void main(String[] args) {
        OverridingMain overridingMain = new OverridingMain();
        overridingMain.display();
    }
}
