package com.viniciuslima.dscommerce.repositories;

import com.viniciuslima.dscommerce.entities.OrderItem;
import com.viniciuslima.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
