package executavel;

import model.DAO.PessoaDAO;
import model.VO.Pessoa;
import model.VO.Vacina;

public class Executavel {
	public static void main(String[] args) {

	Pessoa pessoa1 = new Pessoa("Leonardo", 3, "10066001919" ," data", "Masculino");
		PessoaDAO dbaDePessoas = new PessoaDAO();

		dbaDePessoas.cadastrarPessoa(pessoa1);
		
		Vacina vacina1 = new Vacina();
	}
}
