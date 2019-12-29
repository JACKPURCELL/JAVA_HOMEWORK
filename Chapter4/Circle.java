public class Circle{
    double radius = 1.0;
    Circle(){}
    Circle(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        return this.radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double getArea()
    {
        return this.radius*this.radius*Math.PI;
    }
    public double getCircumference()
	{
		return this.radius*2*Math.PI;
	}
	public String toString()
	{
        System.out.printf("Circle[radius=%f]\n",this.radius);
        return "";
	}
    public static void main (String []args)
    {
        System.out.println("New对象，radius为5.0");
        Circle c = new Circle(5);
        System.out.printf("radius=%f\n",c.getRadius());
        System.out.println("修改radius为8.0");
        c.setRadius(8.0);
        System.out.println("面积："+c.getArea());
        System.out.println("周长："+c.getCircumference());
        c.toString();
    }
}
