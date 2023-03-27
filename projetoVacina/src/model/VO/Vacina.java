package model.VO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Vacina {

	private Integer id;
	private String nome;
	private EstagioPesquisa estagioPesquisa;
	private String paisDeOrigem;
	private LocalDateTime dataInicioPesquisa;
	private Pessoa pesquisador;

	public Vacina() {

	}

	public Vacina(Integer id, String nome, EstagioPesquisa estagioPesquisa, String paisDeOrigem,
			LocalDateTime dataInicioPesquisa, Pessoa pesquisador) {
		super();
		this.id = id;
		this.nome = nome;
		this.estagioPesquisa = estagioPesquisa;
		this.paisDeOrigem = paisDeOrigem;
		this.dataInicioPesquisa = dataInicioPesquisa;
		this.pesquisador = pesquisador;
	}

	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public Pessoa getPesquisador() {
		return pesquisador;
	}

	public void setPesquisador(Pessoa pesquisador) {
		this.pesquisador = pesquisador;
	}
	
	public String toString() {
		return 	"\nID: " + this.getId()
				+ "\nNome: " + this.getNome()
				+ "\nPaís de origem: " + this.getPaisDeOrigem() 
				+ "\nFase da vacina: " + this.getEstagioPesquisa() 
				+ "\nData de início da pesquisa: " + this.getDataInicioPesquisa().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) 
				+ "\nPesquisador: " + this.getPesquisador().getNome();
	}
}

	
