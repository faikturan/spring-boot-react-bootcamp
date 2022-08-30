package com.example.springboot03datajpapostgresql.repo;

import com.example.springboot03datajpapostgresql.entity.Adres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdresRepository extends JpaRepository<Adres, Long> {
}
