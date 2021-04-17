public interface Graphics {

}

abstract class Shape implements Graphics {

    public abstract String printName();
}

class Circle extends Shape{
    private String name;

    public Circle(String name) {
        this.name = name;
    }

    @Override
    public String printName() {
        return "FigureName: " + name;
    }
}

class Quad extends Shape{
    private String name;

    public Quad(String name) {
        this.name = name;
    }

    @Override
    public String printName() {
        return "FigureName: " + name;
    }
}

class Triangle extends Shape{
    private String name;

    public Triangle(String name) {
        this.name = name;
    }

    @Override
    public String printName() {
        return "FigureName: " + name;
    }
}

class Rectangle extends Shape{
    private String name;

    public Rectangle(String name) {
        this.name = name;
    }

    @Override
    public String printName() {
        return "FigureName: " + name;
    }
}

class Rhombus extends Shape{
    private String name;

    public Rhombus(String name) {
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

        Shape circle = new Circle("Circle");
        newFigure.printFigure(circle);

        Shape quad = new Quad("Quad");
        newFigure.printFigure(quad);

        Shape triangle = new Triangle("Triangle");
        newFigure.printFigure(triangle);

        Shape rectangle = new Rectangle("Rectangle");
        newFigure.printFigure(rectangle);

        Shape rhombus = new Rhombus("Rhombus");
        newFigure.printFigure(rhombus);
    }
}

