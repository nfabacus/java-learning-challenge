public class switchBreakContinue {
    public static void main(String[] args) {
        // Switch statement
        int month = 5;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("Some other month");
        }

        // Break statement
        System.out.println("Break Statement");
        for (int i =1; i < 10; i++) {
            if(i==5)
                break;
            System.out.println(i);
        }
        // Continue statement
        System.out.println("Continue Statement");
        for (int i =1; i < 10; i++) {
            if(i==5)
                continue;
            System.out.println(i);
        }
    }
}
