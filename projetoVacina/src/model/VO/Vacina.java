package model.VO;

import java.sql.Date;
import java.time.LocalDateTime;

public class Vacina {

	private int idVacina;
	private String paisDeOrigem;
	private int estagioPesquisa;
	private LocalDateTime dataInicioPesquisa;
	private String pesquisadorResposavel;

	public Vacina() {

	}

	public Vacina(int idVacina, String paisDeOrigem, int estagioPesquisa, LocalDateTime dataInicioPesquisa,
			String pesquisadorResposavel) {
		super();
		this.idVacina = idVacina;
		this.paisDeOrigem = paisDeOrigem;
		this.estagioPesquisa = estagioPesquisa;
		this.dataInicioPesquisa = dataInicioPesquisa;
		this.pesquisadorResposavel = pesquisadorResposavel;
	}

	public Vacina(String paisDeOrigem, int estagioPesquisa, LocalDateTime dataInicioPesquisa,
			String pesquisadorResposavel) {
		super();
		this.paisDeOrigem = paisDeOrigem;
		this.estagioPesquisa = estagioPesquisa;
		this.dataInicioPesquisa = dataInicioPesquisa;
		this.pesquisadorResposavel = pesquisadorResposavel;
	}

	public int getIdVacina() {
		return idVacina;
	}

	public void setIdVacina(int idVacina) {
		this.idVacina = idVacina;
	}

	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}

	public void setPaisDeOrigem(String paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}

	public int getEstagioPesquisa() {
		return estagioPesquisa;
	}

	public void setEstagioPesquisa(int estagioPesquisa) {
		this.estagioPesquisa = estagioPesquisa;
	}

	public LocalDateTime getDataInicioPesquisa() {
		return dataInicioPesquisa;
	}

	public void setDataInicioPesquisa(LocalDateTime dataInicioPesquisa) {
		this.dataInicioPesquisa = dataInicioPesquisa;
	}

	public String getPesquisadorResposavel() {
		return pesquisadorResposavel;
	}

	public void setPesquisadorResposavel(String pesquisadorResposavel) {
		this.pesquisadorResposavel = pesquisadorResposavel;
	}

}
