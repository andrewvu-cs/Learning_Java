public class TestRectangle{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        System.out.println("The length of the Rect: " + r1.getLength() 
            + "\nThe width of the Rect " + r1.getWidth() 
            + "\nThe area of the Rect " + r1.getArea()
            + "\nThe Perimeter of the Rect " + r1.getPerimeter()
            + "\n" + r1.toString());

        Rectangle r2 = new Rectangle(10.0f, 20.2f);
        System.out.println("The length of the Rect: " + r2.getLength() 
            + "\nThe width of the Rect " + r2.getWidth() 
            + "\nThe area of the Rect " + Math.round(r2.getArea() * 100.0) / 100.0
            + "\nThe Perimeter of the Rect " + Math.round(r2.getPerimeter() * 100.00) / 100.00
            + "\n" + r2.toString());

        if (r1.getArea() > r2.getArea()){
            System.out.println("Rectangle 1 is bigger than Rectangle 2");
        }
        else{
            System.out.println("Rectangle 2 is the same size or bigger than Rectangle 1");
        }
    }
}