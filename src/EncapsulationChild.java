public class EncapsulationChild {
    private int var = 50;

    // in intelliJ, you can set getter and setter automatically by right click -> generate -> select variable.
    public int getVar(){
        // we can make var to be read only.
        return var;
    }
    public void setVar(int var) {
        // can add logic here to limit the range of the var for example.
        // this will avoid var to be accessed and overwritten from outside class without using this method.
        this.var = var;
    }
}
