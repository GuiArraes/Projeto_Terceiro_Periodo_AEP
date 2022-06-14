package db.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import entity.Endereco;

public class EnderecoDAO {

	public void insert (Endereco endereco) {
		
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			System.out.println("Entrei na tabela endereco...");
			conn = DB.getConnection();
			st = conn.prepareStatement("INSERT INTO endereco "
										+ "(cep, logradouro, numero, complemento, bairro, cidade) "
										+ "VALUES "
										+ "(?, ?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			st.setString(1, endereco.getCep());
			st.setString(2, endereco.getLogradouro());
			st.setString(3, endereco.getNumero());
			st.setString(4, endereco.getComplemento());
			st.setString(5, endereco.getBairro());
			st.setString(6, endereco.getCidade());
			
			st.execute();

		}catch (SQLException e){
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
		}
	}
	
}
