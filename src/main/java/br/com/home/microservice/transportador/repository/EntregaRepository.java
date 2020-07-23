package br.com.home.microservice.transportador.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.home.microservice.transportador.model.Entrega;

@Repository
public interface EntregaRepository extends CrudRepository<Entrega, Long>{

}
