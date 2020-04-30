public class LineThicknessDecorator extends ShapeDecorator {
    protected double thickness;
    public LineThicknessDecorator(Shape decoratedShape, double thickness) {
        super(decoratedShape);
        this.thickness = thickness;
    }
    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Line tykkelse: " + thickness);
    }
    // Ingen ændring i funktionaliteten.
    @Override
    public void resize() {
        decoratedShape.resize();
    }
    @Override
    public String description() {
        return decoratedShape.description() + " tegnet med linje tykkelse " + thickness + ".";
    }
    // Ingen ændring i funktionaliteten.
    @Override
    public boolean isHide() {
        return decoratedShape.isHide();
    }
}