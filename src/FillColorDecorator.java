public class FillColorDecorator extends ShapeDecorator {
    protected Color color;

    public FillColorDecorator(Shape decoratedShape, Color color) {
        super(decoratedShape);
        this.color = color;
    }

    public void changeColor(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Fyldningsfarve: " + color);
    }
    // Ingen ændring i funktionaliteten.
    // we can add in the functionality if we like. there is no restriction
    // except we need to maintain the structure of the Shape APIs
    @Override
    public void resize() {
        decoratedShape.resize();
    }
    @Override
    public String description() {
        return decoratedShape.description() + " fyldt med " + color + " farve.";
    }
    // Ingen ændring i funktionaliteten.
    @Override
    public boolean isHide() {
        return decoratedShape.isHide();
    }
}