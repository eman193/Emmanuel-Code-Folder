public class Geometry {
    private double P, SA, A;

    // Perimeter of a rectangle
    public void perimeter(double len, double wid) {
        P = 2*(len + wid);
        System.out.printf("The perimeter of the rectangle is: " + "%.2f" ,P);
    }

    // Surface area of a cube
    public void surfaceArea(double side) {
        SA = (6*side)*(6*side);
        System.out.printf("\nThe surface area of the cube is: " + "%.2f" ,SA);
    }

    // Area of a circle
    public void circleArea(double radius) {
        A = Math.PI*(radius*radius);
        System.out.printf("\nThe area of your circle is: " + "%.2f" ,A);
    }
}
