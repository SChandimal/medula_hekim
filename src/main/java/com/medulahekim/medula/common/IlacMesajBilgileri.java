package com.medulahekim.medula.common;

import javax.persistence.*;

@Entity
@Table(name = "tb_ilac_mesaj_bilgileri")
public class IlacMesajBilgileri {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ilac_ID")
    private int ilacId;

    @Column(name = "ilac_Name")
    private String ilacName;

    @Column(name = "ilac_description")
    private String ilacDescription;

    public int getIlacId() {
        return ilacId;
    }

    public void setIlacId(int ilacId) {
        this.ilacId = ilacId;
    }

    public String getIlacName() {
        return ilacName;
    }

    public void setIlacName(String ilacName) {
        this.ilacName = ilacName;
    }

    public String getIlacDescription() {
        return ilacDescription;
    }

    public void setIlacDescription(String ilacDescription) {
        this.ilacDescription = ilacDescription;
    }
}
