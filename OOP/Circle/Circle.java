// package OOP.Circle;

class Circle{
    private String color;
    private double radius;

    public Circle(){
        this.color = "red";
        this.radius = 1.0;
    }

    // Circle(String color, double radius){
    //     this.color = color;
    //     this.radius = radius;
    // }

    public Circle(String color, double radius){
        this.color = color;
        this.radius = radius;
    }

    public String getColor(){
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return  Math.PI * radius * radius;
    }
}
