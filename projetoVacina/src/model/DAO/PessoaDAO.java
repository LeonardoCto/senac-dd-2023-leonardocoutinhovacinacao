package model.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.VO.Pessoa;

public class PessoaDAO {
	public Pessoa cadastrarPessoa(Pessoa novaPessoa) {

		Connection conexao = Banco.getConnection();
		String sql = "INSERT INTO pessoa (nome, dataNascimento, sexo, cpf) "
						+ " VALUES (?, ?, ?, ?)";

		PreparedStatement query = Banco.getPreparedStatementWithPk(conexao, sql);
		try {
			query.setInt(1, novaPessoa.getIdPessoa());
			query.setString(2, novaPessoa.getNome());
			query.setString(3, novaPessoa.getDataNascimento());
			query.setString(4, novaPessoa.getSexo());
			query.setString(5, novaPessoa.getCpf());
			query.execute();	

			ResultSet resultado = query.getGeneratedKeys();
			if (resultado.next()) {
				novaPessoa.setId(resultado.getInt(1));
			}
		} catch (SQLException e) {
			System.out.println("Erro ao executar a query do método cadastrarPessoa!");
			System.out.println("Erro: " + e.getMessage());
		} finally {
			Banco.closeStatement(query);
			Banco.closeConnection(conexao);
		}
		return novaPessoa;
	}

}

