public class LineColorDecorator extends ShapeDecorator {
    protected Color color;
    public LineColorDecorator(Shape decoratedShape, Color color) {
        super(decoratedShape);
        this.color = color;
    }
    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Linje farve: " + color);
    }
    // Ingen ændring i funktionaliteten.
    @Override
    public void resize() {
        decoratedShape.resize();
    }
    @Override
    public String description() {
        return decoratedShape.description() + " tegnet med " + color + " farve.";
    }
    // Ingen ændring i funktionaliteten.
    @Override
    public boolean isHide() {
        return decoratedShape.isHide();
    }
}