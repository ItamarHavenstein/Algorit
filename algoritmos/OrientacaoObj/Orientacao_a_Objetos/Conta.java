package Orientacao_a_Objetos;

import java.text.DecimalFormat;

public class Conta {
	//para utilizar onde haverá valores de saldo,limite transferencia e etc.
	DecimalFormat df = new DecimalFormat("#0.00");
	
	String numeroConta;
	double saldoConta;
	double limiteConta = 100.00d;
	AgenciaBanco numero;
	
	//metodo
	public void deposita (double valor){
		this.saldoConta += valor;
	}
	//metodo
	public void saca (double valor){
		this.saldoConta -= valor;
	}
	//metodo
	public  String extrato () {
		String extrato = "";
		extrato += "\n Numero da Conta: "+this.numeroConta;
		extrato += "\n Saldo da conta: "+df.format(this.saldoConta)+"R$";
		extrato += "\n Limite da conta: "+df.format(this.limiteConta)+"R$";
		extrato += "\n Numero da agência: "+this.numero.numeroAgencia;
		return extrato;
	}
	//metodo
	public double saldoDisponivel(){
		return this.saldoConta + this.limiteConta;
	}
	//Construtor
	public Conta(String numero, double saldo){
		this.numeroConta = numero;
		this.saldoConta = saldo;
	}
	//metodo padrao
	public Conta(){
	}
	//construtor para  fazer a transferencia entre contas
	public void transfere(Conta destino, double valor) {
		this.saldoConta -= valor;
		destino.saldoConta += valor;
	}
}
