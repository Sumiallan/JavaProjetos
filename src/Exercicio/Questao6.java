package Exercicio;
import java.util.*;
//A prefeitura de Jo�o Pessoa abriu uma linha de cr�dito para os funcion�rios municipais. O valor m�ximo da presta��o n�o poder� ultrapassar 30% do sal�rio bruto. Fazer um algoritmo que permita entrar com o sal�rio bruto e o valor da presta��o e informar se o empr�stimo pode ou n�o ser concedido. (comando if) 
public class Questao6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double salario, prest, emprest;
		System.out.println("Digite o salario do funcionario: ");
		salario = entrada.nextDouble();
		System.out.println("Digite o valor da presta��o do emprestimo: ");
		prest= entrada.nextDouble();
		emprest = salario*0.30;
		if(prest <= emprest) {
			System.out.println("Emprestimo aprovado!");
		}else {
			System.out.println("Emprestimo n�o aceito!");
		}
	entrada.close();
	}
}
