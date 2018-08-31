package Exercicio;
import java.util.*;
//A prefeitura de João Pessoa abriu uma linha de crédito para os funcionários municipais. O valor máximo da prestação não poderá ultrapassar 30% do salário bruto. Fazer um algoritmo que permita entrar com o salário bruto e o valor da prestação e informar se o empréstimo pode ou não ser concedido. (comando if) 
public class Questao6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double salario, prest, emprest;
		System.out.println("Digite o salario do funcionario: ");
		salario = entrada.nextDouble();
		System.out.println("Digite o valor da prestação do emprestimo: ");
		prest= entrada.nextDouble();
		emprest = salario*0.30;
		if(prest <= emprest) {
			System.out.println("Emprestimo aprovado!");
		}else {
			System.out.println("Emprestimo não aceito!");
		}
	entrada.close();
	}
}
