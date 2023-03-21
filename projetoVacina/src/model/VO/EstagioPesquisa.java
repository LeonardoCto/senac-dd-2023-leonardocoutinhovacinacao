package model.VO;

public enum EstagioPesquisa {
	
	INICIAL (1),
	TESTES (2),
	APLICACAO_EM_MASSA (3);
	
	
	private int valor;

	private EstagioPesquisa(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public static EstagioPesquisa getEstagioPesquisaPorValor(int valor) {
		EstagioPesquisa estagioPesquisa = null;
		for(EstagioPesquisa elemento: EstagioPesquisa.values()) {
			if(elemento.getValor() == valor) {
				estagioPesquisa = elemento;
			}
		}
		return estagioPesquisa;
	}

	}


