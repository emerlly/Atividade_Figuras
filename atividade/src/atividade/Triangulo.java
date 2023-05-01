package atividade;

public class Triangulo extends Figura {
    public Triangulo(double base, double altura) {
        super(base, altura);
    }
    
    @Override
    public double calcularArea() {
        return (entrada[0] * entrada[1])/2;
    }
    
    @Override
    public String nomeFigura() {
        return "Triangulo";
    }
}
