package atividade;
import java.util.Scanner;

public class PegarEscolha {
	private Scanner entrada = new Scanner(System.in);
	private PegarValor valor = new PegarValor();
	
	public void Jogada() {
		System.out.println("------------------------");
		System.out.println("Digite 1 para Retangulo!");
		System.out.println("Digite 2 para Triangulo!");
		System.out.println("Digite 3 para Circulo!");
		System.out.println("Digite 4 para Quadrado!");
		System.out.println("------------------------");
		
		int escolha = entrada.nextInt();    	
		if(escolha == 1) {			
		    Figura retangulo = new Retangulo(valor.getBase(),valor.getAltura());
			retangulo.imprimirArea(); 
		    }
		if(escolha == 2) {
		    Figura triangulo = new Triangulo(valor.getBase(),valor.getAltura());
		    triangulo.imprimirArea(); 
		}
		if(escolha == 3) {
			System.out.println("Qual o Raio??");
		   	float x = entrada.nextFloat();
		   	Figura circulo = new Circulo(x,0);
		   	circulo.imprimirArea(); 
		}
		if(escolha == 4) {
			Figura quadrado = new Quadrado(valor.getBase(),valor.getAltura());
		   	quadrado.imprimirArea(); 
		}
	}
}
