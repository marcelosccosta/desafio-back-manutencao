package com.projuris.desafiobackmanutencao.resources;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.projuris.desafiobackmanutencao.domain.Client;
import com.projuris.desafiobackmanutencao.domain.ServiceOrder;
import com.projuris.desafiobackmanutencao.domain.dto.ClientNewDTO;
import com.projuris.desafiobackmanutencao.domain.dto.ServiceOrderNewDTO;
import com.projuris.desafiobackmanutencao.services.ServiceOrderService;


@RestController
@RequestMapping(value = "/serviceOrders")
public class ServiceOrderResource {
	
	@Autowired
	private ServiceOrderService serviceOrderService;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<ServiceOrder> find(@PathVariable Integer id) {
		
		ServiceOrder obj = serviceOrderService.find(id);		
		return ResponseEntity.ok().body(obj);
		
	}
	
	@RequestMapping(method = RequestMethod.POST)	
	public ResponseEntity<Void> insert(@Valid @RequestBody ServiceOrderNewDTO objDTO)	{
		ServiceOrder obj = serviceOrderService.fromDTO(objDTO);
		obj = serviceOrderService.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

}
