package ru.avgustin.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.avgustin.market.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
