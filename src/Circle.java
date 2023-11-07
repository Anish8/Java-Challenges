public class Circle {

//    Write a Java program to create a class called "Circle" with a radius attribute.
//    You can access and modify this attribute. Calculate the area and circumference of the circle.

    private double radius;

    public double getArea(double r){
        return (3.7*r*r);
    }

    public double getPerimeter(double r){
        return (2*3.7*r);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }




}
