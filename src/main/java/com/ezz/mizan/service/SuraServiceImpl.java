package com.ezz.mizan.service;

import com.ezz.mizan.model.Sura;
import com.ezz.mizan.repository.SuraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SuraServiceImpl {

    @Autowired
    private SuraRepository repository;

    public List<Sura> findAll() {
        return repository.findAll().stream()
                .map(entity -> new Sura(entity.getSuraIndex(), entity.getSuraName()))
                .collect(Collectors.toList());
    }
}
