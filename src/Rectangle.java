public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Tegner en firkant...");
    }
    @Override
    public void resize() {
        System.out.println("Ændrer størrelse på firkant...");
    }
    @Override
    public String description() {
        return "Rectangle object";
    }
    @Override
    public boolean isHide() {
        return false;
    }
}