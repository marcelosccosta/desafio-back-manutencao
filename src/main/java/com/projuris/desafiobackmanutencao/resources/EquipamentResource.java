package com.projuris.desafiobackmanutencao.resources;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.projuris.desafiobackmanutencao.domain.Equipament;
import com.projuris.desafiobackmanutencao.domain.dto.EquipamentDTO;
import com.projuris.desafiobackmanutencao.services.EquipamentService;

@RestController
@RequestMapping(value = "/equipament")
public class EquipamentResource {

	@Autowired
	private EquipamentService equipamentService;	
	
	@RequestMapping(method = RequestMethod.POST)	
	public ResponseEntity<Void> insert(@Valid @RequestBody EquipamentDTO objDTO)	{
		Equipament obj = equipamentService.fromDTO(objDTO);
		obj = equipamentService.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
		
	}

