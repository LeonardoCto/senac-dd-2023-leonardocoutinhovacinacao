package model.VO;

public class Pessoa {
		private Integer idPessoa;
		private Integer id;
		private String nome;
		private String dataNascimento;
		private String sexo;
		private String cpf;

		public Pessoa() {

		}

		public Pessoa(String nome, String dataNascimento, String sexo, String cpf) {
			super();
			this.nome = nome;
			this.dataNascimento = dataNascimento;
			this.sexo = sexo;
			this.cpf = cpf;
		}

		public Pessoa(Integer idPessoa, Integer id, String nome, String dataNascimento, String sexo, String cpf) {
			super();
			this.idPessoa = idPessoa;
			this.id = id;
			this.nome = nome;
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

		public String getDataNascimento() {
			return dataNascimento;
		}

		public void setDataNascimento(String dataNascimento) {
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

	}


