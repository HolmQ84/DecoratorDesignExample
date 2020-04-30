public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Tegner en cirkel...");
    }
    @Override
    public void resize() {
        System.out.println("Ændrer størrelsen på cirkel...");
    }
    @Override
    public String description() {
        return "Circle object";
    }
    @Override
    public boolean isHide() {
        return false;
    }
}