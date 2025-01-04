package com.example.demo.Service;

import com.example.demo.Model.Local;
import com.example.demo.Repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocalService {

    @Autowired
    private LocalRepository localRepository;

    public List<Local> findAll() {
        return localRepository.findAll();
    }

    public Local findById(Long id) {
        return localRepository.findById(id).orElse(null);
    }

    public List<Local> getLocaisByUf(String uf) {
        return localRepository.findByUf(uf);
    }
}

