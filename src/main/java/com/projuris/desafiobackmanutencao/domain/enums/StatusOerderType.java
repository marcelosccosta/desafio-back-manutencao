package com.projuris.desafiobackmanutencao.domain.enums;


public enum StatusOerderType {
	
	OPEN(1, "aberto"),
	IN_PROGRESS(2,"em andamento"),
	INTERRUPTED(3,"interrompido"),
	PENDENT(4,"pendente"),
	CLOSED(5,"fechado"),
	RESOLVED(6, "resolvido");
	
	private int cod;
	private String descricao;
	
	private StatusOerderType(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static StatusOerderType toEnum(Integer cod) {
		
		if(cod == null ) {
			return null;
		}
		for(StatusOerderType x : StatusOerderType.values()) {
			
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Código: " + cod + " inválido");
	}

}
