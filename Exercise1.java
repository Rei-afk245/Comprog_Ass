public class Exercise1 {
    private double length;
    private double width;

    public Exercise1(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public Exercise1() {
        length = 0.0;
        width = 0.0;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public double getArea() {
        return getLength() * getWidth();
    }

    public void display() {
        System.out.println("The area of rectangle is " + getArea());
    }
}
