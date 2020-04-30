public class LineStyleDecorator extends ShapeDecorator {
    protected LineStyle style;
    public LineStyleDecorator(Shape decoratedShape, LineStyle style) {
        super(decoratedShape);
        this.style = style;
    }
    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Linje stil: " + style);
    }
    // Ingen ændring i funktionaliteten.
    @Override
    public void resize() {
        decoratedShape.resize();
    }
    @Override
    public String description() {
        return decoratedShape.description() + " tegnet med " + style + " linjer.";
    }
    // Ingen ændring i funktionaliteten.
    @Override
    public boolean isHide() {
        return decoratedShape.isHide();
    }
}