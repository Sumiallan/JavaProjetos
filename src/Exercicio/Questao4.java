package Exercicio;
//Uma empresa decidiu dar 20% de aumento aos funcionários cujos salários são inferiores a 500 reais. 
//Escreva um programa que leia o salário de vários funcionários se mostre o valor do salário reajustado ou uma mensagem caso o funcionário não tenha direito ao aumento. 
//O programa será encerrado quando se digitar “fim” para o nome do funcionário. (Comando while) 
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
			System.out.println("Digite o valor do salário do funcionario : ");
			salario= Double.parseDouble(entrada.nextLine());
			if(salario < 500) {
				System.out.print(" Novo salário de : " +nome );
				String x = moeda.format(salario*(1+porc/100));
				System.out.println(" "+x);
			}else {
				System.out.println("O funcionario não tem direito a reajuste do salário.");
			}

	
		}	
	
	}
}