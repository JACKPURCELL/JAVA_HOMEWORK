public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(8);
        System.out.println("radius: " + resizableCircle.getRadius()+"\n");
        System.out.println("Resize: 80%");
        resizableCircle.resize(80);
        System.out.println("radius: " + resizableCircle.getRadius());
        System.out.println("area: " + resizableCircle.getArea());
        System.out.println("perimeter: " + resizableCircle.getPerimeter());
    }
}