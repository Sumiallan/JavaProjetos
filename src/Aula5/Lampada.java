package Aula5;

public class Lampada {
	private boolean estaAcesa = false;
	
	
	public boolean getAcesa() {
		return this.estaAcesa;
	}
	public void acender() {
		
		if(estaAcesa == false) {
			this.estaAcesa = true;
		}else {
			System.out.println("Lampada j� acesa!");
		}
			
		
	}
	
	public void apagar() {
		
		if(estaAcesa == true) {
			this.estaAcesa = false;
		}else {
			System.out.println("Lampada j� apagada!");
		}
				
		
	}
}
