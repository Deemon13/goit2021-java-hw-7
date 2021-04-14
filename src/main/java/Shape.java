public interface Shape {

    String printName();
}

class Figure implements Shape{
    private String name;

    public Figure(String name) {
        this.name = name;
    }

    @Override
    public String printName() {
        return "FigureName: " + name;
    }
}

class PrintFigureName {
    public void printFigure(Shape shape) {
        System.out.println(shape.printName());
    }
}

class ShapeTest {
    public static void main(String[] args) {
        PrintFigureName newFigure = new PrintFigureName();

        Shape circle = new Figure("Circle");
        newFigure.printFigure(circle);

        Shape quad = new Figure("Quad");
        newFigure.printFigure(quad);

        Shape triangle = new Figure("Triangle");
        newFigure.printFigure(triangle);

        Shape rectangle = new Figure("Rectangle");
        newFigure.printFigure(rectangle);

        Shape rhombus = new Figure("Rhombus");
        newFigure.printFigure(rhombus);
    }
}

