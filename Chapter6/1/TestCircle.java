public class TestCircle {
    public static void main(String[] args) {
        MovableCircle moveableCircle = new MovableCircle(1,3,2,4,6);
        System.out.println(moveableCircle.toString());
        moveableCircle.moveDown();
        moveableCircle.moveLeft();
    }
}