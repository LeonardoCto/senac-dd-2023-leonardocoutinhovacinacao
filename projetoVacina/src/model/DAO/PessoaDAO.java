package model.DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.VO.Pessoa;

public class PessoaDAO {
	public Pessoa cadastrarPessoa(Pessoa novaPessoa) {

		Connection conexao = Banco.getConnection();
		String sql = "INSERT INTO pessoa (idPessoa, nome, tipoPessoa, dataNascimento, sexo, cpf) "
						+ " VALUES (?, ?, ?, ?, ?, ?)";

		PreparedStatement query = Banco.getPreparedStatementWithPk(conexao, sql);
		try {
			query.setInt(1, novaPessoa.getIdPessoa());
			query.setString(2, novaPessoa.getNome());
			query.setInt(3, novaPessoa.getTipoPessoa().getValor());
			query.setObject(4, novaPessoa.getDataNascimento());
			query.setString(5, novaPessoa.getSexo());
			query.setString(6, novaPessoa.getCpf());
			query.execute();	

			ResultSet resultado = query.getGeneratedKeys();
			if (resultado.next()) {
				novaPessoa.setIdPessoa(resultado.getInt(1));
				System.out.println("Pessoa cadastrada com sucesso!");
			}
		} catch (SQLException e) {
			System.out.println("Erro ao executar a query do método cadastrar Pessoa!");
			System.out.println("Erro: " + e.getMessage());
		} finally {
			Banco.closeStatement(query);
			Banco.closeConnection(conexao);
		}
		return novaPessoa;
	}

}

