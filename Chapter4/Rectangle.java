public class Rectangle
{
    float length = 1.0f;
    float width = 1.0f;
    Rectangle(){}
    Rectangle(final float length, final float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return this.length;
    }

    public void setLength(final float length) {
        this.length = length;
    }

    public float getWidth() {
        return this.width;
    }

    public void setWidth(final float width) {
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

    public String toString() {
        System.out.printf("Rectangle[length = %f,width = %f]\n", this.length, this.width);
        return "";
    }

    public static void main(final String[] args) {
        System.out.println("New对象，长为5，宽为4");
        final Rectangle r = new Rectangle(5, 4);
        System.out.printf("Length: %f\n", r.getLength());
        System.out.printf("Width: %f\n", r.getWidth());
        System.out.println("修改长为6，宽为8");
        r.setLength(6);
        r.setWidth(8);
        System.out.printf("Area :%f\n", r.getArea());
        System.out.printf("Perimeter :%f\n", r.getPerimeter());
        r.toString();
    }
}