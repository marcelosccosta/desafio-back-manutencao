package com.projuris.desafiobackmanutencao.domain.dto;

public class EquipamentDTO {

	private Integer id;

	private String type;

	private String brand;

	public EquipamentDTO() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
