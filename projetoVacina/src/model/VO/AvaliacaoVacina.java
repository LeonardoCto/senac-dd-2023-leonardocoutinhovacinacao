package model.VO;

public enum AvaliacaoVacina {
	
	PESSIMA(1), RUIM(2), OK(3), BOA(4), OTIMA(5);

	private int valor;

	private AvaliacaoVacina(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public static AvaliacaoVacina getAvaliacaoVacinaPorValor(int valor) {
		AvaliacaoVacina avaliacaoVacina = null;
		for (AvaliacaoVacina elemento : AvaliacaoVacina.values()) {
			if (elemento.getValor() == valor) {
				avaliacaoVacina = elemento;
			}
		}
		return avaliacaoVacina;
	}
}


