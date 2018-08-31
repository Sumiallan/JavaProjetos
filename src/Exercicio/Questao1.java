package Exercicio;
//Faça um programa que receba o valor do salário de um funcionário e o percentual de aumento, calcule e mostre o valor do aumento e o novo salário. //
import java.util.Scanner;
import java.text.NumberFormat;
public class Questao1 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double salario, porc;
		NumberFormat moeda = NumberFormat.getCurrencyInstance();
		System.out.println("Entre com o seu salário: ");
		salario = entrada.nextDouble();
		System.out.println("Entre com a porcentagem que você deseja um aumento: ");
		porc = entrada.nextDouble();
		System.out.println("O seu novo salário é de :" +moeda.format(salario*(1+porc/100)));
		
		
		
	}
}
