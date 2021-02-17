package com.projuris.desafiobackmanutencao.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projuris.desafiobackmanutencao.domain.Client;
import com.projuris.desafiobackmanutencao.domain.Equipament;
import com.projuris.desafiobackmanutencao.domain.ServiceOrder;
import com.projuris.desafiobackmanutencao.domain.Specialist;
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
	
	public List<ServiceOrder> findAll(){
		return serviceOrderRepository.findAll();		
	}

	public ServiceOrder insert(ServiceOrder obj) {
		obj.setId(null);
		serviceOrderRepository.save(obj);
		return obj;
	}
	
	public ServiceOrder osInterrupt(ServiceOrder obj) {
		ServiceOrder newObj = find(obj.getId());
		updateData(newObj, obj);
		return serviceOrderRepository.save(newObj);
	}
	
	public ServiceOrder endOs(ServiceOrder obj) {
		ServiceOrder newObj = find(obj.getId());
		endOs(newObj, obj);
		return serviceOrderRepository.save(newObj);
	}

	public ServiceOrder fromDTONewService(ServiceOrderNewDTO objDTO) {
		Client cli = new Client(objDTO.getClient_id(), null, null);
		Specialist spe = new Specialist(objDTO.getSpecialist_id(), null);
		Equipament eqp = new Equipament(objDTO.getEquipament_id(), null, null);
		
		Date date = new Date(System.currentTimeMillis());
		
		ServiceOrder os = new ServiceOrder(null, date, null, StatusOerderType.toEnum(objDTO.getStatus()) , cli, spe, eqp);
		os.getComents().add(objDTO.getComent1());
		if(objDTO.getComent2() != null) {
			os.getComents().add(objDTO.getComent2());
		}
		if(objDTO.getComent3() != null) {
			os.getComents().add(objDTO.getComent3());
		}
		if(objDTO.getComent4() != null) {
			os.getComents().add(objDTO.getComent4());
		}		
		
		return os;

	}
	
	private void updateData(ServiceOrder newObj, ServiceOrder obj) {
		newObj.setStatus(obj.getStatus());
		newObj.setComents(obj.getComents());
	}
	private void endOs(ServiceOrder newObj, ServiceOrder obj) {
		newObj.setEndDateTime(obj.getEndDateTime());
		newObj.setStatus(obj.getStatus());
		newObj.setComents(obj.getComents());
	}
}