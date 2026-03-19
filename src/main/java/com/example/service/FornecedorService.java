
package com.example.service;

import com.example.entity.Fornecedor;
import com.example.repository.FornecedorRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    private final FornecedorRepository repository;

    public FornecedorService(FornecedorRepository repository) {
        this.repository = repository;
    }

    public Fornecedor save(Fornecedor obj) {
        return repository.save(obj);
    }

    public List<Fornecedor> findAll() {
        return repository.findAll();
    }

    public Optional<Fornecedor> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
