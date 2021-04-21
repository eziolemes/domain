package comdevsuperior.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import comdevsuperior.domain.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

}