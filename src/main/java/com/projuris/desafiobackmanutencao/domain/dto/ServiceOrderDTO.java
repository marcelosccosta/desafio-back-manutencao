package com.projuris.desafiobackmanutencao.domain.dto;

import java.util.Date;

import com.projuris.desafiobackmanutencao.domain.Equipament;
import com.projuris.desafiobackmanutencao.domain.ServiceOrder;
import com.projuris.desafiobackmanutencao.domain.Specialist;

public class ServiceOrderDTO {

	private Integer id;

	private Date  startDateTime;

	private Date  endDateTime;
	
	private Integer status;
	
	private Equipament equipament;
	
	private Specialist specialist;

	public ServiceOrderDTO() {
		
	}
	
	public ServiceOrderDTO(ServiceOrder obj) {
		id = obj.getId();
		startDateTime = obj.getStartDateTime();
		endDateTime = obj.getEndDateTime();
		status = obj.getStatus();
		specialist = obj.getSpecialist();
		equipament = obj.getEquipament();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date  getStartDateTime() {
		return startDateTime;
	}

	public void setStartDateTime(Date  startDateTime) {
		this.startDateTime = startDateTime;
	}

	public Date  getEndDateTime() {
		return endDateTime;
	}

	public void setEndDateTime(Date  endDateTime) {
		this.endDateTime = endDateTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Equipament getEquipament() {
		return equipament;
	}

	public void setEquipament(Equipament equipament) {
		this.equipament = equipament;
	}

	public Specialist getSpecialist() {
		return specialist;
	}

	public void setSpecialist(Specialist specialist) {
		this.specialist = specialist;
	}
	
	
	
	

}
