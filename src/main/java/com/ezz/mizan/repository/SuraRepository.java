package com.ezz.mizan.repository;

import com.ezz.mizan.model.Sura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuraRepository extends JpaRepository<Sura, Long> {

    //List<QuranText> findBySura(int suraNum);
    // QuranText findBySuraAndAya(int sura, int aya);
}
