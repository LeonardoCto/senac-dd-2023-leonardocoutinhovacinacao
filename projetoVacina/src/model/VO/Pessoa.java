package model.VO;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pessoa {
	private Integer idPessoa;
	private Integer id;
	private String nome;
	private TipoPessoa tipoPessoa;
	private String cpf;
	private LocalDateTime dataNascimento;
	private String sexo;


	public Pessoa(String nome, TipoPessoa tipoPessoa, String cpf, LocalDateTime dataNascimento, String sexo) {
		super();
		this.nome = nome;
		this.tipoPessoa = tipoPessoa;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.cpf = cpf;
	}

	public Pessoa(Integer idPessoa, Integer id, String nome, TipoPessoa tipoPessoa, String cpf,
			LocalDateTime dataNascimento, String sexo) {
		super();
		this.idPessoa = idPessoa;
		this.id = id;
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

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}

	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDateTime dataNascimento) {
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
	private String validarData(LocalDateTime data) {
		String resultado = "";
		if(data != null) {
			resultado = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		}
		return resultado;
	}

}
