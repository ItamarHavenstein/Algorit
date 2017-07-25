package Interfaces;

public  class ContaPoupanca extends Conta implements Banco{
	
	

	private double saldo;
	private double juros;
	
	public ContaPoupanca(String nome, String numConta, double saldo, double juros) {
		super(nome, numConta);
		this.setSaldo(saldo);
		this.setJuros(juros);
	}
	
	@Override
	public String geradordeExtrato() {
		return super.geradordeExtrato()+"\nSaldo da Conta Poupança: "+this.getSaldo()+
				"\nJuros do mês: "+this.getJuros();
	}
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;
		
	}

	@Override
	public void saca(double valor) {
		this.saldo -= valor;
		
	}
	

}
