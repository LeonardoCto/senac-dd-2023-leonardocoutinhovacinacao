package model.VO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Vacina {

	private int idVacina;
	private EstagioPesquisa estagioPesquisa;
	private String paisDeOrigem;
	private LocalDateTime dataInicioPesquisa;
	private String pesquisadorResposavel;

	public Vacina() {

	}

	public Vacina(EstagioPesquisa estagioPesquisa, String paisDeOrigem, LocalDateTime dataInicioPesquisa,
			String pesquisadorResposavel) {
		super();
		this.estagioPesquisa = estagioPesquisa;
		this.paisDeOrigem = paisDeOrigem;
		this.dataInicioPesquisa = dataInicioPesquisa;
		this.pesquisadorResposavel = pesquisadorResposavel;
	}

	public Vacina(int idVacina, EstagioPesquisa estagioPesquisa, String paisDeOrigem, LocalDateTime dataInicioPesquisa,
			String pesquisadorResposavel) {
		super();
		this.idVacina = idVacina;
		this.estagioPesquisa = estagioPesquisa;
		this.paisDeOrigem = paisDeOrigem;
		this.dataInicioPesquisa = dataInicioPesquisa;
		this.pesquisadorResposavel = pesquisadorResposavel;
	}

	public int getIdVacina() {
		return idVacina;
	}

	public void setIdVacina(int idVacina) {
		this.idVacina = idVacina;
	}

	public EstagioPesquisa getEstagioPesquisa() {
		return estagioPesquisa;
	}

	public void setEstagioPesquisa(EstagioPesquisa estagioPesquisa) {
		this.estagioPesquisa = estagioPesquisa;
	}

	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}

	public void setPaisDeOrigem(String paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
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
	public void imprimir() {
		System.out.printf("\n%3d  %-20s  %-20s  %-11s  %-25s ", 
		this.getIdVacina(),
		this.getEstagioPesquisa(),
		this.getPaisDeOrigem(),
		this.validarData(this.getDataInicioPesquisa()),
		this.getPesquisadorResposavel());
	}
	private String validarData(LocalDateTime data) {
		String resultado = "";
		if(data != null) {
			resultado = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		}
		return resultado;
	}

}

