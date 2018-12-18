package com.medulahekim.medula.common;

import javax.persistence.*;

@Entity
@Table(name = "tb_ozel_durum_bilgileri")
public class OzelDurumBilgileri {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ozel_id")
    private int ozelId;

    @Column(name = "ozel_Item_Name")
    private String ozelName;

    public int getOzelId() {
        return ozelId;
    }

    public void setOzelId(int ozelId) {
        this.ozelId = ozelId;
    }

    public String getOzelName() {
        return ozelName;
    }

    public void setOzelName(String ozelName) {
        this.ozelName = ozelName;
    }
}
