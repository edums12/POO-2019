package Atividade2;

public class Triangulo {
    private double altura;
    private double base;

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public double getArea() {
        return (this.base * this.altura) / 2;
    }

    public Triangulo(double altura, double base)
    {
        this.altura = altura;
        this.base = base;
    }


}
