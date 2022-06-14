package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DB {

	private static Connection conn = null;
/***********************************************************************************************************/
	public static Connection getConnection() {
		if (conn == null) {
			try {
				Properties props = loadProperties(); //Metodo que criei logo abaixo
				String url = props.getProperty("dburl"); //dburl esta definido em db.propeties
				conn = DriverManager.getConnection(url, props); //CONECTANDO COM O BANCO DE DADOS
				// Instanciando um objeto do tipo CONECTION
				
			}catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
		return conn; 
	}	
/***********************************************************************************************************/	
	public static void closeConnection () {
		try {
			if (conn != null) {
				conn.close();
			}
		}catch (SQLException e) {
			throw new DbException(e.getMessage());
		}	
	}
/***********************************************************************************************************/	
	//Carregar os dados de db.properties
	private static Properties loadProperties() {
		try (FileInputStream fs = new FileInputStream("db.properties")){
			Properties props = new Properties();
			props.load(fs);
			//load le o arquivo props que está apontado pelo arquivo FileInputStream e vai guardar os dados dentro do objeto props
			return props;
		}catch (IOException e) {
			throw new DbException(e.getMessage()); //Lança a exception personalizada que eu criei
		}
	}
/***********************************************************************************************************/
	public static void closeStatement(Statement st) {
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
/***********************************************************************************************************/	
	public static void closeResultSet(ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}
	
}
