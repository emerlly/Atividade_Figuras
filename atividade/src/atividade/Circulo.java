package atividade;

public class Circulo extends Figura {
    public Circulo(double base, double altura) {
        super(base, altura);
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * entrada[0] * entrada[0];
    }
    
    @Override
    public String nomeFigura() {
        return "Circulo";
    }
}