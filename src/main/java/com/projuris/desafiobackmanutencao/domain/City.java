package com.projuris.desafiobackmanutencao.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_cidade")
public class City implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "id_cidade")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nm_cidade")
	private String name;

	@JsonIgnore
	@OneToMany
	private List<Address> address = new ArrayList<>();

	
	@ManyToOne
	@JoinColumn(name = "id_estado")
	private State state;
	
	public City() {
		
	}

	public City(Integer id, String name, List<Address> address, State state) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.state = state;
	}
	
	

}
