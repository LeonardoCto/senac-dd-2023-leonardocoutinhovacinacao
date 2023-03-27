package executavel;

import java.time.LocalDate;

import model.DAO.PessoaDAO;
import model.VO.Pessoa;
import model.VO.TipoPessoa;

public class Executavel {
	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Leonardo Coutinho", TipoPessoa.VOLUNTARIOS, "54865901845", LocalDate.of(2002,10, 24), "Masculino");
		PessoaDAO dbaDePessoas = new PessoaDAO();

		dbaDePessoas.cadastrarPessoa(pessoa1);
		
		//Vacina vacina1 = new Vacina();
		///VacinaDAO dbaDeVacinas = new VacinaDAO();
		
		//dbaDeVacinas.cadastrarVacina(vacina1);
	}
}
