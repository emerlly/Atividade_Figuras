package atividade;

public abstract class Figura {
    protected double[] entrada;
    
    public Figura(double... entrada) {
        this.entrada = entrada;
    }
    
    public abstract double calcularArea();
    public abstract String nomeFigura();
    public void imprimirArea() {
        System.out.println("A figura é um "+ nomeFigura() + ": Sua Area é de "+ calcularArea());
    }
}
