package com.projuris.desafiobackmanutencao.domain.dto;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

public class ClientNewDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//Data clients
	private String name;
	private String email;

	private String phone1;
	private String phone2;
	private String phone3;
	
	//Data address
	private String publicPlace;
	private String number;
	private String additionalInfo;
	private String district;
	private String zipCode;
	
	//Id Cty
	private Integer cityId;
	
	public ClientNewDTO() {
		
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

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String telefone1) {
		this.phone1 = telefone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String telefone2) {
		this.phone2 = telefone2;
	}

	public String getPhone3() {
		return phone3;
	}

	public void setPhone3(String telefone3) {
		this.phone3 = telefone3;
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

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	
	
}
