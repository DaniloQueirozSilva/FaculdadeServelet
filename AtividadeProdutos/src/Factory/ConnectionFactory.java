package Factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	static {
		try {
			System.out.println("Procurando o driver...");
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver encontrado com sucesso!");
		} catch (ClassNotFoundException ex) {
			System.err.println("Não foi possivel conectar!");
		}
	}
	
	public static Connection conectar() {
		try {
			return DriverManager
					.getConnection("jdbc:mysql://localhost/web_produtos", 
							"BancoDanilo", "7532159");
		} catch (SQLException ex) {
			System.err.println("Não foi possivel conectar!");
			ex.printStackTrace();
			return null;
		}
	}
	
}
