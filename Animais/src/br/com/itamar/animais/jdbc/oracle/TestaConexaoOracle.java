package br.com.itamar.animais.jdbc.oracle;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.itamar.animais.jdbc.oracle.ConnectionPoolOracle;

public class TestaConexaoOracle {
	public static void main(String[] args) throws SQLException {
		ConnectionPoolOracle database = new ConnectionPoolOracle();
		Connection connection = database.getConnection();
		System.out.println("Conex�o aberta!");
		connection.close();
	}
}
