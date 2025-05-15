package com.beneficiaryaccountmanager.controller;

import com.beneficiaryaccountmanager.model.Beneficiary;
import com.beneficiaryaccountmanager.repository.RecipientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/beneficiary")
public class RecipientController {

    @Autowired
    private RecipientRepository repository;

    @GetMapping
    public List<Beneficiary> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Beneficiary create(@RequestBody Beneficiary beneficiary) {
        return repository.save(beneficiary);
    }

    @PutMapping("/{id}")
    public Beneficiary update(@PathVariable Long id, @RequestBody Beneficiary beneficiary) {
        beneficiary.setId(id);
        return repository.save(beneficiary);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
