package com.ezz.mizan.controller;

import com.ezz.mizan.model.FullAya;
import com.ezz.mizan.model.QuranText;
import com.ezz.mizan.model.Sura;
import com.ezz.mizan.service.SuraServiceImpl;
import com.ezz.mizan.utility.AyaWeight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MizanController {

    @Autowired
    private SuraServiceImpl service;

    @GetMapping("/mizan/{aya}")
    FullAya all(@PathVariable("aya") String aya) {//
        FullAya fullAyaWeights = AyaWeight.getAyaWeight(aya);
        return fullAyaWeights;
    }

    @GetMapping("/mizan/sura/{sura}")
    private List<Sura> allSura(@PathVariable("sura") String aya) {

        return service.findAll();
    }

    @GetMapping("/mizan/{sura}/aya/{aya}")
    private ResponseEntity<QuranText> autoAyaMizan(@PathVariable("sura") int sura,
                                                   @PathVariable("aya") int aya) {
        QuranText quranText = new QuranText();//quranTextRepository.findBySuraAndAya(sura,aya);
        return ResponseEntity.ok().body(quranText);

    }
}
