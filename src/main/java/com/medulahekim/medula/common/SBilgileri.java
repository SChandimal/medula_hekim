package com.medulahekim.medula.common;

import javax.persistence.*;

@Entity
@Table(name = "tb_sut_Information")
public class SBilgileri {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sutid")
    private int sid;

    @Column(name = "sutHeader")
    private String sutHeader;

    @Column(name = "durationExpired")
    private String maksOdenenSure;

    @Column(name = "maximumUsage")
    private String maksimumKullanım;

    @Column(name = "gender")
    private String sutCinsiyet;

    @Column(name = "ageRange")
    private String yasAralıgı;

    @Column(name = "trackingMethod")
    private String takipYontemi;

    @Column(name = "amountOfDrug")
    private String takipliIlacMiktarı;

    @Column(name = "activeIngredient")
    private String etkinMadde;

    @Column(name = "prescriptionWarningCode")
    private String receteUyarıKodu;

    @Column(name = "facilityTypeRecipe")
    private String tesisTuruRecete;

    @Column(name = "summer")
    private String recYazBranslar;

    @Column(name = "report")
    private String sutRapor;

    @Column(name = "rapSummer")
    private String rapYazBranslar;

    @Column(name = "facilityType")
    private String tesisTuruRapor;

    @Column(name = "maximumReportDate")
    private String maksimumRaporTarihi;

    @Column(name = "MaReportDuration")
    private String maksRaporSuresi;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSutHeader() {
        return sutHeader;
    }

    public void setSutHeader(String sutHeader) {
        this.sutHeader = sutHeader;
    }

    public String getMaksOdenenSure() {
        return maksOdenenSure;
    }

    public void setMaksOdenenSure(String maksOdenenSure) {
        this.maksOdenenSure = maksOdenenSure;
    }

    public String getMaksimumKullanım() {
        return maksimumKullanım;
    }

    public void setMaksimumKullanım(String maksimumKullanım) {
        this.maksimumKullanım = maksimumKullanım;
    }

    public String getSutCinsiyet() {
        return sutCinsiyet;
    }

    public void setSutCinsiyet(String sutCinsiyet) {
        this.sutCinsiyet = sutCinsiyet;
    }

    public String getYasAralıgı() {
        return yasAralıgı;
    }

    public void setYasAralıgı(String yasAralıgı) {
        this.yasAralıgı = yasAralıgı;
    }

    public String getTakipYontemi() {
        return takipYontemi;
    }

    public void setTakipYontemi(String takipYontemi) {
        this.takipYontemi = takipYontemi;
    }

    public String getTakipliIlacMiktarı() {
        return takipliIlacMiktarı;
    }

    public void setTakipliIlacMiktarı(String takipliIlacMiktarı) {
        this.takipliIlacMiktarı = takipliIlacMiktarı;
    }

    public String getEtkinMadde() {
        return etkinMadde;
    }

    public void setEtkinMadde(String etkinMadde) {
        this.etkinMadde = etkinMadde;
    }

    public String getReceteUyarıKodu() {
        return receteUyarıKodu;
    }

    public void setReceteUyarıKodu(String receteUyarıKodu) {
        this.receteUyarıKodu = receteUyarıKodu;
    }

    public String getTesisTuruRecete() {
        return tesisTuruRecete;
    }

    public void setTesisTuruRecete(String tesisTuruRecete) {
        this.tesisTuruRecete = tesisTuruRecete;
    }

    public String getRecYazBranslar() {
        return recYazBranslar;
    }

    public void setRecYazBranslar(String recYazBranslar) {
        this.recYazBranslar = recYazBranslar;
    }

    public String getSutRapor() {
        return sutRapor;
    }

    public void setSutRapor(String sutRapor) {
        this.sutRapor = sutRapor;
    }

    public String getRapYazBranslar() {
        return rapYazBranslar;
    }

    public void setRapYazBranslar(String rapYazBranslar) {
        this.rapYazBranslar = rapYazBranslar;
    }

    public String getTesisTuruRapor() {
        return tesisTuruRapor;
    }

    public void setTesisTuruRapor(String tesisTuruRapor) {
        this.tesisTuruRapor = tesisTuruRapor;
    }

    public String getMaksimumRaporTarihi() {
        return maksimumRaporTarihi;
    }

    public void setMaksimumRaporTarihi(String maksimumRaporTarihi) {
        this.maksimumRaporTarihi = maksimumRaporTarihi;
    }

    public String getMaksRaporSuresi() {
        return maksRaporSuresi;
    }

    public void setMaksRaporSuresi(String maksRaporSuresi) {
        this.maksRaporSuresi = maksRaporSuresi;
    }
}
