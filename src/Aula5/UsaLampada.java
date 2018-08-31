package Aula5;

public class UsaLampada {

	public static void main(String[] args) {
		
		Lampada l1 = new Lampada();
		Lampada l2 = l1;
		Lampada	l3 = new Lampada();
		Lampada	l4 = l2;

		l2.acender();
		l3 = null;
		l1 = l3;
		
		
	}

}
