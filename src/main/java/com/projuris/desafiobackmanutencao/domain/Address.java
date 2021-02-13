package com.projuris.desafiobackmanutencao.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_endereco")
public class Address implements Serializable{
	private static final long serialVersionUID = 1L;
	
	 @Column(name = "id_endereco")
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	 
	 @Column(name = "ds_logradouro")
	 private String publicPlace;
	 
	 @Column(name = "ds_numero")
	 private String number;
	 
	 @Column(name = "ds_complemento")
	 private String additionalInfo;
	 
	 @Column(name = "ds_bairro")
	 private String district; 
	 
	 @Column(name = "ds_cep")
	 private String zipCode;
	 
	 @ManyToOne
	 @JoinColumn(name = "id_cidade")
	 private City city;
	 
	 @ManyToOne
	 @JoinColumn(name = "id_cliente")
	 private Client client;
	 
	 public Address() {
		 
	 }	 

	public Address(Integer id, String publicPlace, String number, String additionalInfo, String district,
			String zipCode, City city, Client client) {
		super();
		this.id = id;
		this.publicPlace = publicPlace;
		this.number = number;
		this.additionalInfo = additionalInfo;
		this.district = district;
		this.zipCode = zipCode;
		this.city = city;
		this.client = client;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPublicPlace() {
		return publicPlace;
	}

	public void setPublicPlace(String publicPlace) {
		this.publicPlace = publicPlace;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
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
		Address other = (Address) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	 
}
