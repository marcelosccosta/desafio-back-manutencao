package com.projuris.desafiobackmanutencao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projuris.desafiobackmanutencao.domain.Client;
import com.projuris.desafiobackmanutencao.domain.ServiceOrder;

public interface ServiceOrderRepository extends JpaRepository<ServiceOrder, Integer>{

}
