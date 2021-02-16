package com.projuris.desafiobackmanutencao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projuris.desafiobackmanutencao.domain.Address;

public interface AddressRepository extends JpaRepository<Address, Integer>{

}
