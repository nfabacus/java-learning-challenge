public class ArraysExample {
    public static void main(String[] args) {

        // 1. declare arrays
        int a[];
        int[] b;

        // 2. allocate memory
        a = new int[5]; // 5 spaces are allocated

        // 3. initialise values
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 80;

        for (int i =0; i < a.length; i++)
            System.out.println("Value of a [" + i + "]: " + a[i]);

        // combined way
        int c[] = new int[5];

        int d[] = new int[]{4,2,7,4,5};

        for (int i =0; i < a.length; i++)
            System.out.println("Value of a [" + i + "]: " + d[i]);
    }
}
