package com.example.demo.repository;

import com.example.demo.MallAdmin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMallAdminRepository extends JpaRepository<MallAdmin, Long> {
}
