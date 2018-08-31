package Aula5;

public class UsaConta {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setNome("Allan");
		conta.setNumeroConta(1234561);
		conta.setSaldo(0.0);
		
		conta.deposito(250);
		conta.deposito(300);
		

	}

}
