package AbstractionPolymorphism.RunTime;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {

        return 2*3.1415*radius;
    }
}
