package comdevsuperior.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import comdevsuperior.domain.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
}