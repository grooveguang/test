package com.grooveguang.bean;

import java.math.BigDecimal;
import java.util.Date;

public class MallShoppingCar {
    private Integer id;

    private String skuMch;

    private BigDecimal skuJg;

    private Integer tjshl;

    private BigDecimal hj;

    private Integer yhId;

    private Integer shpId;

    private Date chjshj;

    private Integer skuId;

    private String shpTp;

    private String shfxz;

    private String kcdz;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSkuMch() {
        return skuMch;
    }

    public void setSkuMch(String skuMch) {
        this.skuMch = skuMch == null ? null : skuMch.trim();
    }

    public BigDecimal getSkuJg() {
        return skuJg;
    }

    public void setSkuJg(BigDecimal skuJg) {
        this.skuJg = skuJg;
    }

    public Integer getTjshl() {
        return tjshl;
    }

    public void setTjshl(Integer tjshl) {
        this.tjshl = tjshl;
    }

    public BigDecimal getHj() {
        return hj;
    }

    public void setHj(BigDecimal hj) {
        this.hj = hj;
    }

    public Integer getYhId() {
        return yhId;
    }

    public void setYhId(Integer yhId) {
        this.yhId = yhId;
    }

    public Integer getShpId() {
        return shpId;
    }

    public void setShpId(Integer shpId) {
        this.shpId = shpId;
    }

    public Date getChjshj() {
        return chjshj;
    }

    public void setChjshj(Date chjshj) {
        this.chjshj = chjshj;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getShpTp() {
        return shpTp;
    }

    public void setShpTp(String shpTp) {
        this.shpTp = shpTp == null ? null : shpTp.trim();
    }

    public String getShfxz() {
        return shfxz;
    }

    public void setShfxz(String shfxz) {
        this.shfxz = shfxz == null ? null : shfxz.trim();
    }

    public String getKcdz() {
        return kcdz;
    }

    public void setKcdz(String kcdz) {
        this.kcdz = kcdz == null ? null : kcdz.trim();
    }
}