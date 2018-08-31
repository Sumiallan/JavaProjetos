package Exercicio;
import java.text.NumberFormat;
//Um motorista parou no posto de gasolina, comprou dois refrigerantes e abasteceu o seu carro com gasolina. Leia a quantidade de litros de gasolina foram necessários para abastecer o veículo e informe o valor total da conta desse cliente, sabendo-se que cada refrigerante custou R$3,00 e o litro de gasolina está custando R$2,50. (Estrutura Sequencial). 
import java.util.*;
public class Questao5 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double litros, valorf;
		double gaso = 2.50;
		double refri = 3.00;
		NumberFormat moeda = NumberFormat.getCurrencyInstance();
		System.out.println("Quantos litros foram abastecido?");
		litros= entrada.nextInt();
		String x = moeda.format(litros*gaso);
		System.out.println("Valor da gasolina: "+x);
		String y = moeda.format((refri*2));
		System.out.println("Dois Refrigerantes: "+y);
		String z = moeda.format((litros*gaso)+(refri*2));
		System.out.println("Valor total da conta foi: "+z);
		entrada.close();	
	}
	
}
