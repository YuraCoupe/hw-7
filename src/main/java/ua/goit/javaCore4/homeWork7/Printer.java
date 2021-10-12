package ua.goit.javaCore4.homeWork7;

public class Printer {
    public void print(Shape shape) {
        shape.print();
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print (new Circle());
        printer.print(new Elipse());
        printer.print(new Quad());
        printer.print(new Rectangle());
        printer.print(new Triangle());
    }
}
