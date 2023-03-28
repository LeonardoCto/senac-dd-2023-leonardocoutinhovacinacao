package model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import model.VO.Pessoa;
import model.VO.TipoPessoa;

public class PessoaDAO {
	public Pessoa inserir(Pessoa novaPessoa) {

		Connection conexao = Banco.getConnection();
		String sql = "INSERT INTO pessoa (nome, DT_NASCIMENTO, sexo, cpf, TIPO ) "
				+ " VALUES (?, ?, ?, ?, ?)";

		PreparedStatement query = Banco.getPreparedStatementWithPk(conexao, sql);
		try {
			query.setString(1, novaPessoa.getNome());
			query.setObject(2, novaPessoa.getDataNascimento());
			query.setString(3, String.valueOf(novaPessoa.getSexo()));
			query.setString(4, novaPessoa.getCpf());
			query.setInt(5, novaPessoa.getTipoPessoa().getValor());
			query.execute();

			ResultSet resultado = query.getGeneratedKeys();
			if (resultado.next()) {
				novaPessoa.setId(resultado.getInt(1));
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

	// UPDATE pessoa
	public boolean atualizar(Pessoa pessoaEditada) {
		boolean atualizou = false;
		Connection conexao = Banco.getConnection();
		String sql = " UPDATE PESSOA "
				+ " SET IDTIPOPUBLICOVACINA = ?, NOME = ?, CPF = ?, DATA_NASCIMENTO = ?, SEXO = ? "
				+ "	WHERE IDPESSOA = ? ";
		PreparedStatement query = Banco.getPreparedStatement(conexao, sql);
		try {
			query.setInt(1, pessoaEditada.getTipoPessoa().getValor());
			query.setString(2, pessoaEditada.getNome());
			query.setString(3, pessoaEditada.getCpf());
			query.setObject(4, pessoaEditada.getDataNascimento());
			query.setString(5, String.valueOf(pessoaEditada.getSexo()));
			query.setInt(6, pessoaEditada.getId());

			int qtdeLinhasAtualizadas = query.executeUpdate();
			atualizou = qtdeLinhasAtualizadas > 0;
		} catch (SQLException erro) {
			System.out.println("Erro ao atualizar a pessoa." + "\nCausa: " + erro.getMessage());
		} finally {
			Banco.closePreparedStatement(query);
			Banco.closeConnection(conexao);
		}
		return atualizou;
	}

	// Executar DELETE
	public boolean excluir(int id) {
		boolean excluiu = false;
		Connection conexao = Banco.getConnection();
		String sql = " DELETE FROM PESSOA " + "	WHERE IDPESSOA = ? ";
		PreparedStatement query = Banco.getPreparedStatement(conexao, sql);

		try {
			query.setInt(1, id);
			int qtdeLinhasAtualizadas = query.executeUpdate();
			excluiu = qtdeLinhasAtualizadas > 0;
		} catch (SQLException erro) {
			System.out.println("Erro ao excluir pessoa." + "\nCausa: " + erro.getMessage());
		} finally {
			Banco.closePreparedStatement(query);
			Banco.closeConnection(conexao);
		}
		return excluiu;
	}

	// Executar Consulta por ID
	public Pessoa consultarPorId(int id) {
		Pessoa pessoaConsultada = null;
		Connection conexao = Banco.getConnection();
		String sql = " SELECT * FROM PESSOA " + "	WHERE IDPESSOA = ? ";
		PreparedStatement query = Banco.getPreparedStatement(conexao, sql);
		try {
			query.setInt(1, id);
			ResultSet resultado = query.executeQuery();
			if (resultado.next()) {
				pessoaConsultada = converterResultSetParaEntidade(resultado);
			}
		} catch (SQLException erro) {
			System.out.println("Erro ao buscar pessoa com id: " + id + "\nCausa: " + erro.getMessage());
		} finally {
			Banco.closePreparedStatement(query);
			Banco.closeConnection(conexao);
		}
		return pessoaConsultada;
	}

	// Executar Consultar Todos
	public List<Pessoa> consultarTodos() {
		Connection conexao = Banco.getConnection();
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		String sql = " SELECT * FROM PESSOA ";
		PreparedStatement query = Banco.getPreparedStatement(conexao, sql);
		try {
			ResultSet resultado = query.executeQuery();
			while (resultado.next()) {
				Pessoa pessoaConsultada = converterResultSetParaEntidade(resultado);
				pessoas.add(pessoaConsultada);
			}
		} catch (SQLException erro) {
			System.out.println("Erro ao buscar todas as pessoas." + "\nCausa: " + erro.getMessage());
		} finally {
			Banco.closePreparedStatement(query);
			Banco.closeConnection(conexao);
		}
		return pessoas;
	}

	// Método para deixar o código clean e evitar repetição
	private Pessoa converterResultSetParaEntidade(ResultSet resultado) throws SQLException {
		Pessoa pessoaConsultada = new Pessoa();
		pessoaConsultada.setId(resultado.getInt("idpessoa"));
		pessoaConsultada.setTipoPessoa(TipoPessoa.getTipoPessoaPorValor(resultado.getInt("idtipopublicovacina")));
		pessoaConsultada.setNome(resultado.getString("nome"));
		pessoaConsultada.setCpf(resultado.getString("cpf"));
		pessoaConsultada.setDataNascimento(LocalDateTime.parse(resultado.getString("data_nascimento"),
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		pessoaConsultada.setSexo(resultado.getString("sexo").charAt(0));
		return pessoaConsultada;
	}
}
