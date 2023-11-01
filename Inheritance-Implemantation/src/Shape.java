public class Shape {
    protected double x;
    protected double y;
    public Shape(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double calculateArea(){
        return 0;
    }
    public double calculateCircumference(){
        return 0;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
