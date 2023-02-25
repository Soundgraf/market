package ru.avgustin.market.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.avgustin.market.model.Buyer;
import ru.avgustin.market.repository.BuyerRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class BuyerService {

    private final BuyerRepository buyerRepository;

    @Transactional(readOnly = true)
    public Buyer findById(Long id) {
        return buyerRepository.findById(id).orElseThrow();
    }

    @Transactional(readOnly = true)
    public List<Buyer> findAll() {
        return buyerRepository.findAll();
    }

    public Buyer save(Buyer entity) {
        return buyerRepository.save(entity);
    }

    public Buyer update(Buyer entity) {
        if (entity.getId() != null) {
            buyerRepository.save(entity);
        }
        return entity;
    }

    public Boolean delete(Long id) {
        if (buyerRepository.existsById(id)) {
            buyerRepository.deleteById(id);
        }
        return true;
    }
}
