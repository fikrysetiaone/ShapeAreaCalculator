public class Main {
    public static void main(String[] args) {
        // Create objects from each derived class.
        Shape circle = new Circle(7);
        Shape square = new Square(5);
        Shape triangle = new Triangle(8, 6);

        // Display the area of each shape.
        System.out.printf("Area of Circle: %.2f%n", circle.calculateArea());
        System.out.printf("Area of Square: %.2f%n", square.calculateArea());
        System.out.printf("Area of Triangle: %.2f%n", triangle.calculateArea());
    }
}
