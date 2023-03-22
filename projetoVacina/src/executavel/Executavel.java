package executavel;

import model.DAO.PessoaDAO;
import model.DAO.VacinaDAO;
import model.VO.Pessoa;
import model.VO.Vacina;

public class Executavel {
	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();
		PessoaDAO dbaDePessoas = new PessoaDAO();

		dbaDePessoas.cadastrarPessoa(pessoa1);
		
		Vacina vacina1 = new Vacina();
		VacinaDAO dbaDeVacinas = new VacinaDAO();
		
		dbaDeVacinas.cadastrarVacina(vacina1);
	}
}
