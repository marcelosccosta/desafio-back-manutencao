package com.projuris.desafiobackmanutencao.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tb_cliente")
public class Client  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Column(name = "id_cliente")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nm_cliente")	
	private String name;
	
	@Column(name = "ds_email")	
	private String email;
	
	@JsonIgnore
	@OneToMany
	private List<ServiceOrders> serviceOrders = new ArrayList<>();
	
	@ElementCollection
	@CollectionTable(name = "telefone")
	private Set<String> phones = new HashSet<>();
	
	@OneToMany
	@Column(name = "id_endereco")
	private List<Address> addresses = new ArrayList<>();
	
	
	
	public Client() {
		
	}

	public Client(Integer id, String name, String email, List<ServiceOrders> serviceOrders, Set<String> phones) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.serviceOrders = serviceOrders;
		this.phones = phones;
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

	public Set<String> getPhones() {
		return phones;
	}

	public void setPhones(Set<String> phones) {
		this.phones = phones;
	}
	
	public List<ServiceOrders> getServiceOrders() {
		return serviceOrders;
	}

	public void setServiceOrders(List<ServiceOrders> serviceOrders) {
		this.serviceOrders = serviceOrders;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}