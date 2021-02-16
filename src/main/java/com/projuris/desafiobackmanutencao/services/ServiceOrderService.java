package com.projuris.desafiobackmanutencao.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projuris.desafiobackmanutencao.domain.Address;
import com.projuris.desafiobackmanutencao.domain.City;
import com.projuris.desafiobackmanutencao.domain.Client;
import com.projuris.desafiobackmanutencao.domain.Equipament;
import com.projuris.desafiobackmanutencao.domain.ServiceOrder;
import com.projuris.desafiobackmanutencao.domain.Specialist;
import com.projuris.desafiobackmanutencao.domain.dto.ClientNewDTO;
import com.projuris.desafiobackmanutencao.domain.dto.ServiceOrderNewDTO;
import com.projuris.desafiobackmanutencao.domain.enums.StatusOerderType;
import com.projuris.desafiobackmanutencao.repositories.ServiceOrderRepository;
import com.projuris.desafiobackmanutencao.services.exceptions.ObjectNotFoundException;

@Service
public class ServiceOrderService {

	@Autowired
	private ServiceOrderRepository serviceOrderRepository;

	public ServiceOrder find(Integer id) {

		Optional<ServiceOrder> obj = serviceOrderRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + ServiceOrder.class.getName()));

	}

	public ServiceOrder insert(ServiceOrder obj) {
		obj.setId(null);
		serviceOrderRepository.save(obj);
		return obj;
	}

	public ServiceOrder fromDTO(ServiceOrderNewDTO objDTO) {
		Client cli = new Client(objDTO.getClient_id(), null, null);
		Specialist spe = new Specialist(objDTO.getSpecialist_id(), null);
		Equipament eqp = new Equipament(objDTO.getEquipament_id(), null, null);

		ServiceOrder os = new ServiceOrder(null, objDTO.getStartDateTime(), objDTO.getEndDateTime(),
				StatusOerderType.toEnum(objDTO.getStatus()), cli, spe, eqp);
		os.getComents().add(objDTO.getComent1());	
		
		return os;

	}
}