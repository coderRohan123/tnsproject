package com.example.demo.controller;

import com.example.demo.MallAdmin;
import com.example.demo.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/mall-admins")
public class MallAdminController {

    @Autowired
    private AdminService service;

    @GetMapping("/view")
    public List<MallAdmin> getAllMallAdmins() {
        return service.getAllMallAdmins();
    }

    @GetMapping("/{id}")
    public Optional<MallAdmin> getMallAdminById(@PathVariable Long id) {
        return service.getMallAdminById(id);
    }

    @PostMapping
    public MallAdmin createMallAdmin(@RequestBody MallAdmin mallAdmin) {
        return service.saveMallAdmin(mallAdmin);
    }

    @PutMapping("/{id}")
    public MallAdmin updateMallAdmin(@PathVariable Long id, @RequestBody MallAdmin mallAdmin) {
        mallAdmin.setId(id);
        return service.updateMallAdmin(mallAdmin);
    }

    @DeleteMapping("/{id}")
    public void deleteMallAdmin(@PathVariable Long id) {
        service.deleteMallAdmin(id);
    }
}

