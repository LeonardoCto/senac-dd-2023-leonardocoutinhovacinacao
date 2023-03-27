package model.VO;

import java.time.LocalDateTime;

public class Pessoa {
	private Integer id;
	private String nome;
	private TipoPessoa tipoPessoa;
	private String cpf;
	private LocalDateTime dataNascimento;
	private char sexo;


	public Pessoa() {
		
	}
	public Pessoa(Integer id, String nome, TipoPessoa tipoPessoa, String cpf, LocalDateTime dataNascimento, char sexo) {
		super();
		this.nome = nome;
		this.tipoPessoa = tipoPessoa;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.cpf = cpf;
	}

	public Pessoa(Integer id, String nome, String cpf,LocalDateTime dataNascimento, char sexo) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.sexo = sexo;
		this.cpf = cpf;
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

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

	}


