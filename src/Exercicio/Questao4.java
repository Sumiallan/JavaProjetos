package Exercicio;
//Uma empresa decidiu dar 20% de aumento aos funcion�rios cujos sal�rios s�o inferiores a 500 reais. 
//Escreva um programa que leia o sal�rio de v�rios funcion�rios se mostre o valor do sal�rio reajustado ou uma mensagem caso o funcion�rio n�o tenha direito ao aumento. 
//O programa ser� encerrado quando se digitar �fim� para o nome do funcion�rio. (Comando while) 
import java.util.*;
import java.text.NumberFormat;

public class Questao4 {
	



	public static void main(String[] args) {
		double porc = 20, salario;
		
		NumberFormat moeda = NumberFormat.getCurrencyInstance();
		
		String nome= "a";
		
		while(!nome.equals("fim")) {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Digite o nome do funcionario: ");
			nome= entrada.nextLine();
			System.out.println("Digite o valor do sal�rio do funcionario : ");
			salario= Double.parseDouble(entrada.nextLine());
			if(salario < 500) {
				System.out.print(" Novo sal�rio de : " +nome );
				String x = moeda.format(salario*(1+porc/100));
				System.out.println(" "+x);
			}else {
				System.out.println("O funcionario n�o tem direito a reajuste do sal�rio.");
			}

	
		}	
	
	}
}