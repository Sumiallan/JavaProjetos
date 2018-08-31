package Aula4;

public class Switch {

	public static void main(String[] args) {
		int x = 1;
		
		switch (x) {
			case 1:
				System.out.println("Deu um");
				break;
			case 2:
				System.out.println("Deu dois");
			case 3:
				System.out.println("Continuando...");
				break;
			default:
				System.out.println("Não foi ninguem");
		}

	}

}
