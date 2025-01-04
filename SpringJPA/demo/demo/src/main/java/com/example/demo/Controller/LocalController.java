package com.example.demo.Controller;


import com.example.demo.Model.Local;
import com.example.demo.Service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/locais")
public class LocalController {

    @Autowired
    private LocalService localService;

    @GetMapping
    public List<Local> getAll() {
        return localService.findAll();
    }

    @GetMapping("/{id}")
    public Local getById(@PathVariable Long id) {
        return localService.findById(id);
    }

    @GetMapping("/uf/{uf}")
    public List<Local> getLocaisPorUf(@PathVariable String uf) {
        return localService.getLocaisByUf(uf);
    }
}
