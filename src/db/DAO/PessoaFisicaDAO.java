package db.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;
import entity.PessoaFisica;

public class PessoaFisicaDAO {
	
	public void insert (PessoaFisica pf) {
		
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			System.out.println("Entrei na tabela cliente...");
			conn = DB.getConnection();
			st = conn.prepareStatement("INSERT INTO cliente "
										+ "(nome, email, cpf, senha, confirmarSenha) "
										+ "VALUES "
										+ "(?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
			st.setString(1, pf.getNome());
			st.setString(2, pf.getEmail());
			st.setString(3, pf.getCpf());
			st.setString(4, pf.getSenha());
			st.setString(5, pf.getConfirmarSenha());
			
			st.execute();

		}catch (SQLException e){
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
		}
	}
}
