package com.projuris.desafiobackmanutencao.domain.dto;

import com.projuris.desafiobackmanutencao.domain.Client;

public class ClientDTO {

	private Integer id;
	private String name;
	private String email;
	
	public ClientDTO() {
		
	}
	
	public ClientDTO(Client obj) {
		id = obj.getId();
		name = obj.getName();
		email = obj.getEmail();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
