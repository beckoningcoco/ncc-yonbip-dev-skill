/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.upc.service.api.dto;

public class ProductTplDTO {
    private Long id;
    private String name;
    private String name2;
    private String name3;
    private Long freeCT;
    private Long skuPropCT;
    private Long materialPropCT;

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public void setFreeCT(Long freeCT) {
        this.freeCT = freeCT;
    }

    public void setSkuPropCT(Long skuPropCT) {
        this.skuPropCT = skuPropCT;
    }

    public void setMaterialPropCT(Long materialPropCT) {
        this.materialPropCT = materialPropCT;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getName2() {
        return this.name2;
    }

    public String getName3() {
        return this.name3;
    }

    public Long getFreeCT() {
        return this.freeCT;
    }

    public Long getSkuPropCT() {
        return this.skuPropCT;
    }

    public Long getMaterialPropCT() {
        return this.materialPropCT;
    }
}

