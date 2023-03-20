package model.VO;

import java.time.LocalDateTime;

public class Vacina {
	private int idVacina;
	private String paisDeOrigem;
	private String estagioPesquisa;
	private LocalDateTime dataInicioPesquisa;
	private Pesquisador responsavel;

	public Vacina() {

	}

	public Vacina(int idVacina, String paisDeOrigem, String estagioPesquisa, LocalDateTime dataInicioPesquisa,
			Pesquisador responsavel) {
		super();
		this.idVacina = idVacina;
		this.paisDeOrigem = paisDeOrigem;
		this.estagioPesquisa = estagioPesquisa;
		this.dataInicioPesquisa = dataInicioPesquisa;
		this.responsavel = responsavel;
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

	public String getEstagioPesquisa() {
		return estagioPesquisa;
	}

	public void setEstagioPesquisa(String estagioPesquisa) {
		this.estagioPesquisa = estagioPesquisa;
	}

	public LocalDateTime getDataInicioPesquisa() {
		return dataInicioPesquisa;
	}

	public void setDataInicioPesquisa(LocalDateTime dataInicioPesquisa) {
		this.dataInicioPesquisa = dataInicioPesquisa;
	}

	public Pesquisador getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Pesquisador responsavel) {
		this.responsavel = responsavel;
	}

}
