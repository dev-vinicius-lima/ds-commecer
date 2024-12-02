package com.viniciuslima.dscommerce.repositories;

import com.viniciuslima.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
