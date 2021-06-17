package com.ezz.mizan.controller;

import com.ezz.mizan.common.AyaWeight;
import com.ezz.mizan.model.FullAya;
import com.ezz.mizan.model.QuranText;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.Normalizer;

@RestController
public class MizanController {

    //@Autowired
    //private QuranTextRepository  quranTextRepository;

    @GetMapping("/mizan/{aya}")
    FullAya all(@PathVariable("aya") String aya) {//
        FullAya fullAyaWeights = AyaWeight.getAyaWeight(aya);
        return fullAyaWeights;
    }

    @GetMapping("/mizan/{sura}/aya/{aya}")
    private ResponseEntity<QuranText> autoAyaMizan(@PathVariable("sura") int sura,
                                                   @PathVariable("aya") int aya)
    {
        QuranText quranText = new QuranText();//quranTextRepository.findBySuraAndAya(sura,aya);
        return ResponseEntity.ok().body(quranText);

    }
}
