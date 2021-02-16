package com.projuris.desafiobackmanutencao.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projuris.desafiobackmanutencao.domain.Address;
import com.projuris.desafiobackmanutencao.domain.City;
import com.projuris.desafiobackmanutencao.domain.Client;
import com.projuris.desafiobackmanutencao.domain.dto.ClientNewDTO;
import com.projuris.desafiobackmanutencao.repositories.AddressRepository;
import com.projuris.desafiobackmanutencao.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private AddressRepository addressRepository;
	
	public List<Client> findAll(){
		return clientRepository.findAll();		
	}
	
	public Client insert(Client obj) {
		obj.setId(null);
		clientRepository.save(obj);
		addressRepository.saveAll(obj.getAddresses());
		return obj;		
	}
	
	public Client fromDTO(ClientNewDTO objDTO) {
		Client cli = new Client(null, objDTO.getName(), objDTO.getEmail());
		City city = new City(objDTO.getCityId(), null, null);
		Address addr = new Address(null, objDTO.getPublicPlace(), objDTO.getNumber(), objDTO.getAdditionalInfo(), objDTO.getDistrict(), objDTO.getZipCode(), cli, city);
		cli.getAddresses().add(addr);
		cli.getPhones().add(objDTO.getPhone1());
		if(objDTO.getPhone2() != null) {
			cli.getPhones().add(objDTO.getPhone2());
		}
		if(objDTO.getPhone3() != null) {
			cli.getPhones().add(objDTO.getPhone3());
		}
		
		return cli;
	}
	
}
