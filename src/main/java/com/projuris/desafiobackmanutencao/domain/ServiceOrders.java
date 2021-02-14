package com.projuris.desafiobackmanutencao.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "tb_ordem_servico")
public class ServiceOrders implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name = "id_ordem_servico")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "dh_inicio")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date startDateTime;
	
	@Column(name = "dh_fim")
	@JsonFormat(pattern = "dd/MM/yyyy HH:mm")
	private Date endDateTime;
	
	@Column(name = "ds_status_ordem")
	private String status;
	
	@ElementCollection
	@CollectionTable(name = "tb_comentarios_ordem")
	private Set<String> coments = new HashSet<>();

	@ManyToOne
	@JoinColumn(name = "id_cliente")
	private Client client;

	@JoinColumn
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "serviceOrder")
	private Equipament equipament;
	
	@ManyToOne
	@JoinColumn(name = "id_tecnico")
	private Specialist specialist;

	public ServiceOrders() {

	} 	

	public ServiceOrders(Integer id, Date startDateTime, Date endDateTime, String status) {
		super();
		this.id = id;
		this.startDateTime = startDateTime;
		this.endDateTime = endDateTime;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
		ServiceOrders other = (ServiceOrders) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
