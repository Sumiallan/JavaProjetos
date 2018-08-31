package Exercicio;
//Faça um programa em Java que permita ao usuário escolher a tabuada que deseja ver. Mostrar a tabuada escolhida. (Comando for)//
import java.util.Scanner;
public class Questao3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, i;
		System.out.println("Digite a tabuada que voce quer ver: ");
		num = entrada.nextInt();
		for(i= 1; i < 10; i++) {
			System.out.println("A tabuada de multiplicação de " +num);
			System.out.println(i*num);
			entrada.close();
		}
		
	}
	

}
