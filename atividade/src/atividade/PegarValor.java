package atividade;
import java.util.Scanner;

public class PegarValor {
	private float base;
	private float altura;
	private Scanner entrada = new Scanner(System.in);

	public float getBase() {
		System.out.println("Qual o valor da base?");
		float base = entrada.nextFloat();
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		System.out.println("Qual o valor da Altura?");
		float altura = entrada.nextFloat();
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
}
