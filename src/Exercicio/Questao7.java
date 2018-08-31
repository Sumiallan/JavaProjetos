package Exercicio;
import java.util.*;
public class Questao7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double n1, n2, mA, mC = 0;
		int alunos = 6;
		int apr = 0, rep = 0, ex = 0, i;
		for(i=0; i<6; i++) {
			System.out.println("Digite suas notas: ");
			n1 = entrada.nextDouble();
			n2 = entrada.nextDouble();
			mA = (n1+n2)/2;
			mC +=mA/2;
			System.out.println("Media do aluno x: "+ mA);
			
			if(mA < 3.0) {
				System.out.println("\nReprovado!\n");
				rep++;
			}if(mA >=3.0 && mA < 7.0) {
				System.out.println("\nExame\n");
				ex++;
			}else if(mA > 7.0){
				System.out.println("\nAprovado!\n");
				apr++;
			}
			
			
		}
		
		System.out.println("\nMedia da classe foi: " + mC);
		System.out.println("\nAlunos aprovados: " + apr);
		System.out.println("\nAlunos Exames: " + ex);
		System.out.println("\nAlunos reprovados: " + rep);
		}
	
	}

