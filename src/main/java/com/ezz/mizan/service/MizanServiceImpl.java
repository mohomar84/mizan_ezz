package com.ezz.mizan.service;

import com.ezz.mizan.utility.AyaWeight;

public class MizanServiceImpl implements MizanService {

    @Override
    public void ayaMizan(String aya) {
        AyaWeight.getAyaWeight(aya);
    }

}
