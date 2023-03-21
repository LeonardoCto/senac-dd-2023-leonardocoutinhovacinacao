package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.VO.Vacina;

public class VacinaDAO {
	
	public Vacina cadastrarVacina(Vacina novaVacina) {
		
		Connection conexao = Banco.getConnection();
		String sql = "INSERT INTO VACINA (PAISDEORIGEM, ESTAGIOPESQUISA, DATAINICIO) "
				+ " VALUES (?, ?, ?, ? )";
		
		PreparedStatement query = Banco.getPreparedStatementWithPk(conexao, sql);
		
		try {
			query.setString(1, novaVacina.getPaisDeOrigem());
			query.setInt(2, novaVacina.getEstagioPesquisa());
			query.setObject(3, novaVacina.getDataInicioPesquisa());
			query.execute();
			
			ResultSet resultado = query.getGeneratedKeys();
			
			if (resultado.next()) {
				novaVacina.setIdVacina(resultado.getInt(1));
			}

		} catch (SQLException e) {
			System.out.println("Erro ao inserir endere�o. " + " \nCausa: " + e.getMessage());
		} finally {
			// FECHAR A CONEX�O
			Banco.closePreparedStatement(query);
			Banco.closeConnection(conexao);
		}

		return novaVacina;
	}
}
