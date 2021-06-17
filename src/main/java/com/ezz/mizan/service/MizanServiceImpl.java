package com.ezz.mizan.service;

import com.ezz.mizan.common.AyaWeight;

public class MizanServiceImpl implements MizanService{

   // @Autowired
   // QuranTextRepository quranTextRepository;

    @Override
    public void ayaMizan(String aya) {
        AyaWeight.getAyaWeight(aya);
    }

   // @Override
  //  public QuranText ayaMizan(int sura, int aya) {
   //   return quranTextRepository.findBySuraAndAya(sura,aya);
  //  }

}
