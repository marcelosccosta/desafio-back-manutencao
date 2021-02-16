package com.projuris.desafiobackmanutencao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projuris.desafiobackmanutencao.domain.Address;
import com.projuris.desafiobackmanutencao.domain.City;
import com.projuris.desafiobackmanutencao.domain.Client;
import com.projuris.desafiobackmanutencao.domain.Equipament;
import com.projuris.desafiobackmanutencao.domain.ServiceOrder;
import com.projuris.desafiobackmanutencao.domain.Specialist;
import com.projuris.desafiobackmanutencao.domain.State;
import com.projuris.desafiobackmanutencao.domain.enums.StatusOerderType;
import com.projuris.desafiobackmanutencao.repositories.AddressRepository;
import com.projuris.desafiobackmanutencao.repositories.CityRepository;
import com.projuris.desafiobackmanutencao.repositories.ClientRepository;
import com.projuris.desafiobackmanutencao.repositories.EquipamentRepository;
import com.projuris.desafiobackmanutencao.repositories.ServiceOrderRepository;
import com.projuris.desafiobackmanutencao.repositories.SpecialistRepository;
import com.projuris.desafiobackmanutencao.repositories.StateRepository;

@SpringBootApplication
public class DesafioBackManutencaoApplication implements CommandLineRunner{

	@Autowired
	private ClientRepository clientRepository;
	@Autowired
	private ServiceOrderRepository serviceOrderRepository;
	@Autowired
	private SpecialistRepository specialistRepository;
	@Autowired
	private EquipamentRepository equipamentRepository;
	@Autowired
	private AddressRepository addressRepository;
	@Autowired
	private CityRepository cityRepository;
	@Autowired
	private StateRepository stateRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DesafioBackManutencaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		State st1 = new State(null, "Pernambuco");
		City c1 = new City(null, "Paulista", st1);
		
		stateRepository.saveAll(Arrays.asList(st1));
		cityRepository.saveAll(Arrays.asList(c1));
		
		Client cli1 = new Client(null, "Marcos Santos", "marcos@gmail.com");		
		cli1.getPhones().addAll(Arrays.asList("81977443322", "81999996666"));
		
		Client cli2 = new Client(null, "Fabio Silva", "fabio@gmail.com");
		cli2.getPhones().addAll(Arrays.asList("8133442222", "818888555"));
		
		Address add1 = new Address(null, "Av A", "13", "Condomínio Luz", "Maranguape II", "5321-234", cli1, c1);
		Address add2 = new Address(null, "Av B", "14", "Em frente ao campo de futebol", "Jardim prima vera", "53423-221", cli1, c1);		
		cli1.getAddresses().addAll(Arrays.asList(add1, add2));
		
		clientRepository.saveAll(Arrays.asList(cli1));
		addressRepository.saveAll(Arrays.asList(add1));
		
		Specialist spe1 = new Specialist(null, "Jobson Oliveira");
		specialistRepository.saveAll(Arrays.asList(spe1));
		
		
		Equipament eq1 = new Equipament(null, "informatica", "Dell");
		
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm");
		ServiceOrder os1 = new ServiceOrder(null, sdf.parse("10/02/2021 10:32"), sdf.parse("12/02/2021 10:32"), StatusOerderType.IN_PROGRESS, cli1, spe1, eq1);
		
		os1.getComents().addAll(Arrays.asList("Analisando ordem de serviço"));
		
		equipamentRepository.saveAll(Arrays.asList(eq1));
		serviceOrderRepository.saveAll(Arrays.asList(os1));	
		
		
			
		
		
		
		
		/*
		 
		 * 
		 * 
		 * 
		 * SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm"); ServiceOrder
		 * os1 = new ServiceOrder(null, sdf.parse("10/02/2021 10:32"),
		 * sdf.parse("12/02/2021 10:32"), StatusOerderType.IN_PROGRESS, cli1, spe1);
		 * os1.getComents().addAll(Arrays.asList("Analisando ordem de serviço"));
		 * 
		 * serviceOrderRepository.saveAll(Arrays.asList(os1));
		 */
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
