package com.recep.tasktracker.model;

public class Task {
    private static int idCounter = 1;

    private int id;
    private String ad;
    private String aciklama;
    private String durum;

    public Task(String ad, String aciklama) {
        this.id = idCounter++;
        this.ad = ad;
        this.aciklama = aciklama;
        this.durum = "TODO";
    }

    public int getId() {
        return id;
    }

    public String getAd() {
        return ad;
    }

    public String getAciklama() {
        return aciklama;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + ad + " - " + aciklama + " (" + durum + ")";
    }
}
