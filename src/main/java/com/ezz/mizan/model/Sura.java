package com.ezz.mizan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sura")
public class Sura {

    @Id
    @Column(name = "sura_index")
    private int suraIndex;
    @Column(name = "sura_name")
    private String suraName;

    public Sura() {
    }

    public Sura(int suraIndex, String suraName) {
        this.suraIndex = suraIndex;
        this.suraName = suraName;
    }

    public int getSuraIndex() {
        return suraIndex;
    }

    public void setSuraIndex(int suraIndex) {
        this.suraIndex = suraIndex;
    }

    public String getSuraName() {
        return suraName;
    }

    public void setSuraName(String suraName) {
        this.suraName = suraName;
    }
}
