package AbstractionPolymorphism.CompileTime;

public class Shape {

    //area of CIRCLE
    public double calculateArea(double radius){
        return 3.1415*(radius*radius);
    }

    //area of TRIANGLE
    public double calculateArea(double base, double height){
        return ((base*height)/2);
    }

    //area of RECTANGLE
    public int calculateArea(int width, int length){
       return width*length;
    }
}
