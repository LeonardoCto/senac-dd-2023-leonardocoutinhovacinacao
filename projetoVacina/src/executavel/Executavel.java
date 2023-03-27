package executavel;

import java.time.LocalDateTime;

import model.DAO.PessoaDAO;
import model.DAO.VacinaDAO;
import model.VO.EstagioPesquisa;
import model.VO.Pessoa;
import model.VO.TipoPessoa;
import model.VO.Vacina;

public class Executavel {
	public static void main(String[] args) {

		// CADASTRO DE PESSOA
		Pessoa pessoa1 = new Pessoa(null, "Leonardo Coutinho", TipoPessoa.VOLUNTARIOS, "54865901845",
				LocalDateTime.of(2002, 10, 24, 0, 0), 'M');
		Pessoa pessoa2 = new Pessoa(null, "Joao Gomes", TipoPessoa.PUBLICO_GERAL, "10044587954",
				LocalDateTime.of(2002, 15, 5, 0, 0), 'M');
		PessoaDAO dbaDePessoas = new PessoaDAO();

		dbaDePessoas.inserir(pessoa1);
		dbaDePessoas.inserir(pessoa2);

		// ATUALIZAR PESSOA

		Pessoa pessoaCadastrada = dbaDePessoas.consultarPorId(4);
		pessoaCadastrada.setCpf("10066001812");

		// Excluir Pessoa
		
		if (dbaDePessoas.excluir(2)) {
		} else {
			System.out.println("Erro ao excluir pessoa!");
		}

		// Consultar Todas Pessoas
		for (Pessoa pessoa : dbaDePessoas.consultarTodos()) {
			System.out.println(pessoa.getNome());
		}

		// Consultar pessoa por ID
		System.out.println(dbaDePessoas.consultarPorId(3).getNome());
		
		// Cadastro de Vacina
				Vacina vacina1 = new Vacina(null, "COVID", EstagioPesquisa.APLICACAO_EM_MASSA, "Brasil", LocalDateTime.now(), dbaDePessoas.consultarPorId(2));
				Vacina vacina2 = new Vacina(null, "H1N1", EstagioPesquisa.INICIAL ,"Estados Unidos",  LocalDateTime.now(), dbaDePessoas.consultarPorId(1));
				Vacina vacina3 = new Vacina(null, "DENGUE", EstagioPesquisa.TESTES, "Brasil", LocalDateTime.now(), dbaDePessoas.consultarPorId(3));
				VacinaDAO dbaDeVacina = new VacinaDAO();
				
				dbaDeVacina.inserir(vacina1);
				dbaDeVacina.inserir(vacina2);
				dbaDeVacina.inserir(vacina3);
				
				if (vacina3.getId() != null) {
					System.out.println("Nova vacina cadastrada!");
				} else {
					System.out.println("Erro ao cadastrar nova vacina!");
				}
				
				// Atualizar Vacina
				Vacina vacinaExistente = dbaDeVacina.consultarPorId(1);
				vacinaExistente.setPesquisador(dbaDePessoas.consultarPorId(4));
				vacinaExistente.setPaisDeOrigem("Brasil");
			boolean atualizou = dbaDeVacina.atualizar(vacinaExistente);
			
				if (atualizou) {
					System.out.println("Vacina foi atualizada!");
				} else {
					System.out.println("Erro ao atualizar vacina!");
				}
				
				// Excluir Vacina
				if (dbaDeVacina.excluir(2)) {
					System.out.println("Vacina foi excluida!");
				} else {
					System.out.println("Erro ao excluir vacina!");
				}
				
				// Consultar Todas Vacinas
				for (Vacina vacina : dbaDeVacina.consultarTodos()) {
					System.out.println(vacina.getNome() + ", Pesquisador responsável: " + vacina.getPesquisador().getNome());
				}
				
				// Consultar Vacina por ID
				System.out.println(dbaDeVacina.consultarPorId(1).getNome());

			}

		
	
}
