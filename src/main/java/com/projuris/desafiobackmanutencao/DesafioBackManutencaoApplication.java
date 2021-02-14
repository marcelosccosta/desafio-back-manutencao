package com.projuris.desafiobackmanutencao;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.projuris.desafiobackmanutencao.domain.Client;
import com.projuris.desafiobackmanutencao.repositories.ClientRepository;

@SpringBootApplication
public class DesafioBackManutencaoApplication implements CommandLineRunner{

	@Autowired
	private ClientRepository clientRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(DesafioBackManutencaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Client cli1 = new Client(null, "Marcos Santos", "marcos@gmail.com");		
		cli1.getPhones().addAll(Arrays.asList("81977443322", "81999996666"));		
		clientRepository.saveAll(Arrays.asList(cli1));
		
		
	}
	
}
