public class EncapsulationMain {
    public static void main(String[] args) {
        EncapsulationChild a = new EncapsulationChild();
        // a.var = 40;  //this will not work as a.var is private
        // Getter
        System.out.println("Value in var is " + a.getVar());
        // Setter
        a.setVar(100);
        // see the output
        System.out.println("Value in var is " + a.getVar());
    }
}
