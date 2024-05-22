package jpabook.jpashop.domain;

import jakarta.persistence.Entity;


@Entity
public class AlBum extends Item {
    private String artist;
    private String etc;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }

    public String getEtc() {
        return etc;
    }
}
