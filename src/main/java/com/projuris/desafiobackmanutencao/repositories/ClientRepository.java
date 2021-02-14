package com.projuris.desafiobackmanutencao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projuris.desafiobackmanutencao.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{

}
