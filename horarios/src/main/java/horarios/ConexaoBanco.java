package horarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoBanco {

	private static String driver = "";
	private static String url = "jdbc:hsqldb:hsql://10.8.53.47/banco";
	private static String senha = "";
	private static String usuario = "sa";

	public static void main(String[] args) throws SQLException {

		Connection conexão = DriverManager.getConnection(url, usuario, senha);
		Statement consulta = conexão.createStatement();

		ResultSet resultado = consulta.executeQuery("SELECT ID AS OID, COORDENADOR, CURSO FROM HORARIO");
		while (resultado.next()) {
			int id = resultado.getInt(resultado.findColumn("OID"));
			String nome = resultado.getString(resultado.findColumn("COORDENADOR"));
			String coordenador = resultado.getString(resultado.findColumn("CURSO"));
			System.out.println(id);
			System.out.println(nome + coordenador);
		}
		conexão.close();

	}

}
