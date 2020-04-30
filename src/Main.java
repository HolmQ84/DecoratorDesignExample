public class Main {
    public static void main(String[] args) {
        System.out.println("Laver nogle simple formede objekter...");
        Shape rectangle = new Rectangle();
        Shape circle = new Circle();
        System.out.println("Tegner nogle simple formede objekter...");
        rectangle.draw();
        System.out.println();
        circle.draw();
        System.out.println();
        System.out.println("Laver en dekorativ cirkel med rød farve, blå linjer med prikket mønster og en tykkelse på 2...");
        Shape circle1 = new FillColorDecorator(new LineColorDecorator(new LineStyleDecorator(
                new LineThicknessDecorator(new Circle(), 2.0d), LineStyle.PRIKKET), Color.BLÅ), Color.RØD);
        circle1.draw();
        System.out.println();
        // order of decorator is also not much important here since all are unique functionalities.
        // we can also do this nesting of functionalities in separate statements.
        System.out.println("Laver et objekt med lignende funktionalitet i seperate kald.");
        Circle c = new Circle();
        LineThicknessDecorator lt = new LineThicknessDecorator(c, 2.0d);
        LineStyleDecorator ls = new LineStyleDecorator(lt, LineStyle.PRIKKET);
        LineColorDecorator lc = new LineColorDecorator(ls, Color.BLÅ);
        FillColorDecorator fc = new FillColorDecorator(lc, Color.RØD);
        Shape circle3 = fc;
        circle3.draw();
        System.out.println();
        System.out.println("Cirkel 2: Laver en dekoreret cirkel med grøn farve og sorte linjer...");
        Shape circle2 = new FillColorDecorator(new LineColorDecorator(new Circle(), Color.SORT), Color.GRØN);
        circle2.draw();
        System.out.println();
        System.out.println("Laver en dekoreret firkant med gul farve og røde linjer...");
        Shape rectangle1 = new FillColorDecorator(new LineColorDecorator(new Rectangle(), Color.RØD), Color.GUL);
        rectangle1.draw();
        System.out.println();

        System.out.println("Ændrer cirkel 2:");
        circle2 = new FillColorDecorator(new LineColorDecorator(new Circle(), Color.RØD), Color.GUL);
        circle2.draw();
        System.out.println();
    }
}