package ru.avgustin.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.avgustin.market.model.Buyer;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Long> {
}
