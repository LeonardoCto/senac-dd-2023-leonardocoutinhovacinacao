package model.VO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
	private int idPessoa;
	private String nome;
	private TipoPessoa tipoPessoa;
	private String cpf;
	private LocalDate dataNascimento;
	private String sexo;


	public Pessoa(String nome, TipoPessoa tipoPessoa, String cpf, LocalDate dataNascimento, String sexo) {
		super();
		this.nome = nome;
		this.tipoPessoa = tipoPessoa;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.cpf = cpf;
	}

	public Pessoa(int idPessoa, String nome, TipoPessoa tipoPessoa, String cpf,
			LocalDate dataNascimento, String sexo) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.tipoPessoa = tipoPessoa;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.cpf = cpf;
	}

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void imprimir() {
		System.out.printf("\n%3d  %-20s  %-20s  %-11s  %-25s  %-13s  %-10s ", 
		this.getIdPessoa(),
		this.getNome(),
		this.getTipoPessoa(),
		this.getCpf(),
		this.validarData(this.getDataNascimento()),
		this.getSexo());
	}
	private String validarData(LocalDate data) {
		String resultado = "";
		if(data != null) {
			resultado = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		}
		return resultado;
	}

}
