package Exercicio;
//Fa�a um programa que receba o valor do sal�rio de um funcion�rio e o percentual de aumento, calcule e mostre o valor do aumento e o novo sal�rio. //
import java.util.Scanner;
import java.text.NumberFormat;
public class Questao1 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double salario, porc;
		NumberFormat moeda = NumberFormat.getCurrencyInstance();
		System.out.println("Entre com o seu sal�rio: ");
		salario = entrada.nextDouble();
		System.out.println("Entre com a porcentagem que voc� deseja um aumento: ");
		porc = entrada.nextDouble();
		System.out.println("O seu novo sal�rio � de :" +moeda.format(salario*(1+porc/100)));
		
		
		
	}
}
