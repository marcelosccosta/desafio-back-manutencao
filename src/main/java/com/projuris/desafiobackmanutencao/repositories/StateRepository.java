package com.projuris.desafiobackmanutencao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projuris.desafiobackmanutencao.domain.State;

public interface StateRepository extends JpaRepository<State, Integer> {

}
