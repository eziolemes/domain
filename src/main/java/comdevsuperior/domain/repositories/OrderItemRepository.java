package comdevsuperior.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import comdevsuperior.domain.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}