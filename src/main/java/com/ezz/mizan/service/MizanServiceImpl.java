package com.ezz.mizan.service;

import com.ezz.mizan.common.AyaWeight;
import org.springframework.stereotype.Service;

@Service
public class MizanServiceImpl implements MizanService{
    @Override
    public void ayaMizan(String aya) {
        AyaWeight.getAyaWeight(aya);
    }
}
