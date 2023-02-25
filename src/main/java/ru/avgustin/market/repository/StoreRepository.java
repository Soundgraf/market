package ru.avgustin.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.avgustin.market.model.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store, Long> {
}
