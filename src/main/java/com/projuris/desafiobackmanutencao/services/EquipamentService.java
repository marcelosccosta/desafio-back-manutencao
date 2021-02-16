package com.projuris.desafiobackmanutencao.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projuris.desafiobackmanutencao.domain.Equipament;
import com.projuris.desafiobackmanutencao.domain.dto.EquipamentDTO;
import com.projuris.desafiobackmanutencao.repositories.EquipamentRepository;

@Service
public class EquipamentService {

	@Autowired
	private EquipamentRepository equipamentRepository;
	
	public Equipament insert(Equipament obj) {
		obj.setId(null);
		equipamentRepository.save(obj);
		return obj;		
	}
	
	public Equipament fromDTO(EquipamentDTO objDto) {
		return new Equipament(objDto.getId(), objDto.getType(), objDto.getBrand());
	}
	
}
