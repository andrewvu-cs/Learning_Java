// package OOP.Circle;
public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The color of the circle is: " + c1.getColor() + 
        "\nThe radius of the circle is " + c1.getRadius() +
        "\nThe Area of the circle is " + Math.round(c1.getArea() * 100.0) / 100.0);


        Circle c2 = new Circle("Orange", 5.0);
        System.out.println("The color of the circle is: " + c2.getColor() + 
            "\nThe radius of the circle is " + c2.getRadius() +
            "\nThe Area of the circle is " + Math.round(c2.getArea() * 100.0) / 100.0);

    }
    
}