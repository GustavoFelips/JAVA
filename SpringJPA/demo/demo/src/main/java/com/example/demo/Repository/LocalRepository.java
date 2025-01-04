package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Model.Local;

public interface LocalRepository extends JpaRepository<Local, Long> {
    List<Local> findByUf(String uf);
}
