package AbstractionPolymorphism.CompileTime;

public class Test {
    public static void main(String[] args) {

        Shape circle = new Shape();
        Shape triangle = new Shape();
        Shape rectangle = new Shape();

        System.out.println(circle.calculateArea(2));
        System.out.println(triangle.calculateArea(12.4,25));
        System.out.println(rectangle.calculateArea(20,12));
    }
}
//check by method signature
//bind on compile time
//acheive by method overloading
//static or eraly binding