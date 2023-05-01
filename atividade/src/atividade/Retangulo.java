package atividade;

public class Retangulo extends Figura {
    public Retangulo(double base, double altura) {
        super(base, altura);
    }
    
    @Override
    public double calcularArea() {
        return entrada[0] * entrada[1];
    }
    
    @Override
    public String nomeFigura() {
        return "retângulo";
    }
}
