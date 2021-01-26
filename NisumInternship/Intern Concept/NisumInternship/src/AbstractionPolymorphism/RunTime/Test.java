package AbstractionPolymorphism.RunTime;

public class Test {

    public static void main(String[] args) {

        Shape circle = new Circle(2);
        Shape triangle = new Triangle(12.4,25);
        Shape rectangle = new Rectangle(20,12);


        System.out.println(circle.calculateArea());
        System.out.println(triangle.calculateArea());
        System.out.println(rectangle.calculateArea());
    }
}

//object bound at run time
//method overriding
//dynamic or late binding


