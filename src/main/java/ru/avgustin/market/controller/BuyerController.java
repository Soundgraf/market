package ru.avgustin.market.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.avgustin.market.model.Buyer;
import ru.avgustin.market.service.BuyerService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/buyers")
public class BuyerController {

    private final BuyerService buyerService;

    @GetMapping("/{id}")
    public Buyer getById(@PathVariable Long id) {
        return buyerService.findById(id);
    }

    @GetMapping
    public List<Buyer> getAll() {
        return buyerService.findAll();
    }

    @PostMapping
    public Buyer create(@RequestBody Buyer entity) {
        return buyerService.save(entity);
    }
    // TODO: 25.02.2023 Работает только как обновление

    @PutMapping("/{id}")
    public Buyer update(@PathVariable Long id, @RequestBody Buyer entity) {
        Buyer buyer = buyerService.findById(id);
        buyer.setName(entity.getName());
        return buyerService.update(buyer);
    }

    @DeleteMapping("/{id}")
    public Boolean delete(@PathVariable Long id) {
        return buyerService.delete(id);
    }
}
