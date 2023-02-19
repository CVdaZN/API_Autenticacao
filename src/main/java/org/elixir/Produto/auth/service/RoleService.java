package org.elixir.Produto.auth.service;

import org.elixir.Produto.auth.entity.Role;
import org.elixir.Produto.auth.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {

    @Autowired
    private RoleRepository repository;

    public Role save(Role Role) {
        return repository.save(Role);
    }

    public Role findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Role> findAll() {
        return repository.findAll();
    }
}
