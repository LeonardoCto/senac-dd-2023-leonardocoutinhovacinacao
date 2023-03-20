package executavel;

import model.DAO.PessoaDAO;
import model.VO.Pessoa;

public class Executavel {
	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Leonardo Coutinho", "10066001919", "24/10/2002", "Masculino");
		PessoaDAO dbaDePessoas = new PessoaDAO();

		dbaDePessoas.cadastrarPessoa(pessoa1);
	}
}
