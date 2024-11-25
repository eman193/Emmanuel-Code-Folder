public class RandNums {
    public static void main ( String[] args ) { 
        int t = 0;
        while (t<11){
            t= t + 1;
            double y = Math.random() * (-2147483647) + 2147483647;
            int x = (int) y;
            double m = Math.random() * (-2147483647) + 2147483647;
            int n = (int) m;
            System.out.print("\n\nHere are two random numbers:\n" + x + " and " + n);
            if (x < n) {
                System.out.println("\n\nthe smallest is " + x + "\nthe biggest is " + n);
            } else if (n < x) {
                System.out.println("\n\nthe smallest is " + x + "\nthe biggest is " + n);
            }
    }
}
}