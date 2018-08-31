package Exercicio;
// Faça um programa que leia 10 números inteiros e exiba na tela a mensagem ‘Par’ se ele for um número par, ou ‘Ímpar’ se ele for um número ímpar. (Comando if).//

public class Questao2 {
	
	public static void main(String[] args) {
		int i;
		for(i = 1; i < 11; i++) {
			if(i%2 == 0) {
				System.out.println("\n Numero par: " +i);
			}else {
				System.out.println("\n Numero impar: "+i);
			}
		}
	}
}
