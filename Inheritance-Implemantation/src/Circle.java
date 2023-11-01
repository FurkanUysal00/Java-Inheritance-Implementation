public class Circle extends Shape{
    private double radius;
    public Circle(double x,double y,double radius){
        super(x,y);
        this.radius=radius;
    }

    @Override
    public double calculateArea() {
        return (Math.PI*Math.pow(radius,2));
    }

    @Override
    public double calculateCircumference() {
        return (2*Math.PI*radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                ", Area="+ calculateArea()+
                ", Circumference="+ calculateCircumference()+
                '}';
    }
}
