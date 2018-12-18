package com.medulahekim.medula.common;

import javax.persistence.*;

@Entity
@Table(name = "tb_ilac_Bilgileri")
public class IlacBilgileri {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ilacId")
    private int ilacId;

    @Column(name = "drugName")
    private String ilacAdı;

    @Column(name = "packingQuantity")
    private String ambalajMiktari;

    @Column(name = "pharmaceuticalForm")
    private String farmasotikFormu;

    @Column(name = "singleDoseQuantity")
    private String tekDozMiktari;

    @Column(name = "durationofUse")
    private String kullanimSuresi;

    @Column(name = "ilacGender")
    private String ilacCinsiyet;

    @Column(name = "ageRange")
    private String yasAraligi;

    @Column(name = "retailPaidPrice")
    private String perakendeOdenenFiyat;

    @Column(name = "publicDiscountRate")
    private String kamuIndirimOrani;

    @Column(name = "recipeType")
    private String receteTuru;

    @Column(name = "kamukodNo")
    private String kamukodNo;

    @Column(name = "treatmentSchemeRequired")
    private String tedaviSemasiGerekli;

    @Column(name = "monthRange")
    private String ayAraligi;

    @Column(name = "outpatientPrescription")
    private String ayaktanRecetesi;

    @Column(name = "recipePrescription")
    private String yatanRecetesi;

    @Column(name = "outpatientMaxAshDose")
    private String ayaktanMaksKulDoz;

    @Column(name = "recliningMaxAshDose")
    private String yatanMaksKulDoz;

    @Column(name = "raporluMaksKulDoz")
    private String raporluMaksKulDoz;

    @Column(name = "numberofdrugs")
    private String takipliIlacSayisi;

    @Column(name = "activeIngredient")
    private String etkinMadde;

    public int getIlacId() {
        return ilacId;
    }

    public void setIlacId(int ilacId) {
        this.ilacId = ilacId;
    }

    public String getIlacAdı() {
        return ilacAdı;
    }

    public void setIlacAdı(String ilacAdı) {
        this.ilacAdı = ilacAdı;
    }

    public String getAmbalajMiktari() {
        return ambalajMiktari;
    }

    public void setAmbalajMiktari(String ambalajMiktari) {
        this.ambalajMiktari = ambalajMiktari;
    }

    public String getFarmasotikFormu() {
        return farmasotikFormu;
    }

    public void setFarmasotikFormu(String farmasotikFormu) {
        this.farmasotikFormu = farmasotikFormu;
    }

    public String getTekDozMiktari() {
        return tekDozMiktari;
    }

    public void setTekDozMiktari(String tekDozMiktari) {
        this.tekDozMiktari = tekDozMiktari;
    }

    public String getKullanimSuresi() {
        return kullanimSuresi;
    }

    public void setKullanimSuresi(String kullanimSuresi) {
        this.kullanimSuresi = kullanimSuresi;
    }

    public String getIlacCinsiyet() {
        return ilacCinsiyet;
    }

    public void setIlacCinsiyet(String ilacCinsiyet) {
        this.ilacCinsiyet = ilacCinsiyet;
    }

    public String getYasAraligi() {
        return yasAraligi;
    }

    public void setYasAraligi(String yasAraligi) {
        this.yasAraligi = yasAraligi;
    }

    public String getPerakendeOdenenFiyat() {
        return perakendeOdenenFiyat;
    }

    public void setPerakendeOdenenFiyat(String perakendeOdenenFiyat) {
        this.perakendeOdenenFiyat = perakendeOdenenFiyat;
    }

    public String getKamuIndirimOrani() {
        return kamuIndirimOrani;
    }

    public void setKamuIndirimOrani(String kamuIndirimOrani) {
        this.kamuIndirimOrani = kamuIndirimOrani;
    }

    public String getReceteTuru() {
        return receteTuru;
    }

    public void setReceteTuru(String receteTuru) {
        this.receteTuru = receteTuru;
    }

    public String getKamukodNo() {
        return kamukodNo;
    }

    public void setKamukodNo(String kamukodNo) {
        this.kamukodNo = kamukodNo;
    }

    public String getTedaviSemasiGerekli() {
        return tedaviSemasiGerekli;
    }

    public void setTedaviSemasiGerekli(String tedaviSemasiGerekli) {
        this.tedaviSemasiGerekli = tedaviSemasiGerekli;
    }

    public String getAyAraligi() {
        return ayAraligi;
    }

    public void setAyAraligi(String ayAraligi) {
        this.ayAraligi = ayAraligi;
    }

    public String getAyaktanRecetesi() {
        return ayaktanRecetesi;
    }

    public void setAyaktanRecetesi(String ayaktanRecetesi) {
        this.ayaktanRecetesi = ayaktanRecetesi;
    }

    public String getYatanRecetesi() {
        return yatanRecetesi;
    }

    public void setYatanRecetesi(String yatanRecetesi) {
        this.yatanRecetesi = yatanRecetesi;
    }

    public String getAyaktanMaksKulDoz() {
        return ayaktanMaksKulDoz;
    }

    public void setAyaktanMaksKulDoz(String ayaktanMaksKulDoz) {
        this.ayaktanMaksKulDoz = ayaktanMaksKulDoz;
    }

    public String getYatanMaksKulDoz() {
        return yatanMaksKulDoz;
    }

    public void setYatanMaksKulDoz(String yatanMaksKulDoz) {
        this.yatanMaksKulDoz = yatanMaksKulDoz;
    }

    public String getRaporluMaksKulDoz() {
        return raporluMaksKulDoz;
    }

    public void setRaporluMaksKulDoz(String raporluMaksKulDoz) {
        this.raporluMaksKulDoz = raporluMaksKulDoz;
    }

    public String getTakipliIlacSayisi() {
        return takipliIlacSayisi;
    }

    public void setTakipliIlacSayisi(String takipliIlacSayisi) {
        this.takipliIlacSayisi = takipliIlacSayisi;
    }

    public String getEtkinMadde() {
        return etkinMadde;
    }

    public void setEtkinMadde(String etkinMadde) {
        this.etkinMadde = etkinMadde;
    }
}