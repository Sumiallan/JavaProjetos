package Exercicio;
// Fa�a um programa que leia 10 n�meros inteiros e exiba na tela a mensagem �Par� se ele for um n�mero par, ou ��mpar� se ele for um n�mero �mpar. (Comando if).//

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
