package com.projuris.desafiobackmanutencao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projuris.desafiobackmanutencao.domain.City;

public interface CityRepository extends JpaRepository<City, Integer>{

}
