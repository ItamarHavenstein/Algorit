package JavaPolimorfismo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionarios {

	private int codigo;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/ yyyy HH:mm:ss");

	public void registraEntrada(Funcionarios f) {
	Date agora = new Date();
	System.out.println("ENTRADA : " + f.getCodigo());
	System.out.println("DATA : " + sdf.format(agora));
	}

	public void registraSaida ( Funcionarios f ) {
	Date agora = new Date();
	System.out.println("SAÍDA : " + f.getCodigo());
	System.out.println("DATA : " + sdf.format(agora));
}
}