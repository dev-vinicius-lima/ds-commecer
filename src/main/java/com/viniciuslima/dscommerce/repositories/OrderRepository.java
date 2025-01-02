package com.viniciuslima.dscommerce.repositories;

import com.viniciuslima.dscommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
