package casting;

public class Casting {
    public static void main (String [] args) {

        double floatingPoint = 112.35;
        int wholeNumber = 112;

        System.out.println("Double: " + floatingPoint);
        System.out.println("Integer: " + wholeNumber);

        String data = "49";
        System.out.println("The string value is: " + data);

        int num = Integer.parseInt(data);
        System.out.println("The integer value is: " + num);
    }
}

