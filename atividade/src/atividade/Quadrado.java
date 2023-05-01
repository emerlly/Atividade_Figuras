package atividade;

public class Quadrado extends Figura {
    public Quadrado(double base, double altura) {
        super(base, altura);
    }
    
    @Override
    public double calcularArea() {
        return (entrada[0] * entrada[1]);
    }
    
    @Override
    public String nomeFigura() {
        return "Quadrado";
    }
}