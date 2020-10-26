package com.ezz.mizan.controller;

import com.ezz.mizan.common.AyaWeight;
import com.ezz.mizan.model.FullAya;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MizanController {


    @GetMapping("/mizan/{aya}")
    FullAya all(@PathVariable("aya") String aya) {//
        //mizanService.ayaMizan(aya);
        System.out.println("**********************************");
        System.out.println(aya);
        FullAya fullAyaWeights = AyaWeight.getAyaWeight(aya);
        System.err.println(fullAyaWeights.getAyaWeight());
        return fullAyaWeights;
    }
}
