package ua.goit.javaCore4.homeWork7;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }

}
