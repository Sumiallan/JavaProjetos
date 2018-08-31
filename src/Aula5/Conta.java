package Aula5;

public class Conta {
	private String nome;
	private Double saldo;
	private long numeroConta; 
	private Double sacar;
	private Double valorDeposito;
	
	
	

	public double obterSaldo(long numeroConta) {
		if(this.numeroConta==numeroConta) {
			return this.saldo;
		}
		return 0.0;
	}
	
	public void extrato() {
		System.out.println("Nome: "+ nome);
		System.out.println("Numero Conta: " + numeroConta);
		System.out.println("Saldo: " + saldo);
	}
	
	
	public void deposito(double valorDeposito) {
		this.saldo+= valorDeposito;
		System.out.println("Valor depositado: " + valorDeposito);
		}
	
	public void sacar(double valorSacar) {
		this.saldo+= valorSacar;
		System.out.println("Valor sacado: " + valorSacar);
	}


	
	public String getNome() {
	return nome;
}

	public void setNome(String nome) {
	this.nome = nome;
}

	public Double getSaldo() {
	return saldo;
}

	public void setSaldo(Double saldo) {
	this.saldo = saldo;
}

	public long getNumeroConta() {
	return numeroConta;
}

	public void setNumeroConta(long numeroConta) {
	this.numeroConta = numeroConta;
}

	public Double getSacar() {
	return sacar;
}

	public void setSacar(Double sacar) {
	this.sacar = sacar;
}

	public Double getValorDeposito() {
	return valorDeposito;
}

	public void setValorDeposito(Double valorDeposito) {
	this.valorDeposito = valorDeposito;
	}
}