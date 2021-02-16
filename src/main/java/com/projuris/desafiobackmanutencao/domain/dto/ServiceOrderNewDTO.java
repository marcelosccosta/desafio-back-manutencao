package com.projuris.desafiobackmanutencao.domain.dto;

import java.util.Date;

public class ServiceOrderNewDTO {

	
	private Date startDateTime;
	private Date endDateTime;
	private Integer status;
	private String coment1; 
	private String coment2;
	private String coment3; 
	private String coment4; 

	private Integer client_id;
	private Integer equipament_id;
	private Integer specialist_id;

	public ServiceOrderNewDTO() {

	}

	public Date getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(Date startDateTime) {
		this.startDateTime = startDateTime;
	}

	public Date getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(Date endDateTime) {
		this.endDateTime = endDateTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	
	
	public String getComent1() {
		return coment1;
	}

	public void setComent1(String coment1) {
		this.coment1 = coment1;
	}

	public String getComent2() {
		return coment2;
	}

	public void setComent2(String coment2) {
		this.coment2 = coment2;
	}

	public String getComent3() {
		return coment3;
	}

	public void setComent3(String coment3) {
		this.coment3 = coment3;
	}

	public String getComent4() {
		return coment4;
	}

	public void setComent4(String coment4) {
		this.coment4 = coment4;
	}

	public Integer getClient_id() {
		return client_id;
	}

	public void setClient_id(Integer client_id) {
		this.client_id = client_id;
	}

	public Integer getEquipament_id() {
		return equipament_id;
	}

	public void setEquipament_id(Integer equipament_id) {
		this.equipament_id = equipament_id;
	}

	public Integer getSpecialist_id() {
		return specialist_id;
	}

	public void setSpecialist_id(Integer specialist_id) {
		this.specialist_id = specialist_id;
	}

}
