package com.example.demo.service;

import com.example.demo.MallAdmin;
import com.example.demo.repository.IMallAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    @Autowired
    private IMallAdminRepository repository;

    public List<MallAdmin> getAllMallAdmins() {
        return repository.findAll();
    }

    public Optional<MallAdmin> getMallAdminById(Long id) {
        return repository.findById(id);
    }

    public MallAdmin saveMallAdmin(MallAdmin mallAdmin) {
        return repository.save(mallAdmin);
    }

    public MallAdmin updateMallAdmin(MallAdmin mallAdmin) {
        if (repository.existsById(mallAdmin.getId())) {
            return repository.save(mallAdmin);
        } else {
            throw new RuntimeException("MallAdmin not found with id: " + mallAdmin.getId());
        }
    }

    public void deleteMallAdmin(Long id) {
        repository.deleteById(id);
    }
}
