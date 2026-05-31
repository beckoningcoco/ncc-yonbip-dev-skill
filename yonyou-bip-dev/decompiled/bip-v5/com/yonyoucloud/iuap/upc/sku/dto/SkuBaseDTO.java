/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.yonyou.iuap.international.MultiLangText
 */
package com.yonyoucloud.iuap.upc.sku.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyoucloud.iuap.upc.dto.common.CoredocBaseDTO;
import java.math.BigDecimal;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class SkuBaseDTO
extends CoredocBaseDTO {
    private Long id;
    public String code;
    public String name;
    public MultiLangText name_multilang;
    private Long productId;
    public String productCode;
    public String productName;
    public MultiLangText productName_multilang;
    public String productErpCode;
    private String shortName;
    public String erpCode;
    public String modelDescription;
    public MultiLangText modelDescription_multilang;
    public String model;
    public MultiLangText model_multilang;
    public Long batchUnit;
    public BigDecimal batchRate;
    private Boolean defaultSKU;
    public BigDecimal weight;
    public BigDecimal volume;
    public String specIds;
    public String specs;
    public String specNames;
    public String free1;
    public String free2;
    public String free3;
    public String free4;
    public String free5;
    public String free6;
    public String free7;
    public String free8;
    public String free9;
    public String free10;
    public String skuDefine1;
    public String skuDefine2;
    public String skuDefine3;
    public String skuDefine4;
    public String skuDefine5;
    public String skuDefine6;
    public String skuDefine7;
    public String skuDefine8;
    public String skuDefine9;
    public String skuDefine10;
    public String skuDefine11;
    public String skuDefine12;
    public String skuDefine13;
    public String skuDefine14;
    public String skuDefine15;
    public String skuDefine16;
    public String skuDefine17;
    public String skuDefine18;
    public String skuDefine19;
    public String skuDefine20;
    public String skuDefine21;
    public String skuDefine22;
    public String skuDefine23;
    public String skuDefine24;
    public String skuDefine25;
    public String skuDefine26;
    public String skuDefine27;
    public String skuDefine28;
    public String skuDefine29;
    public String skuDefine30;
    public String skuDefine31;
    public String skuDefine32;
    public String skuDefine33;
    public String skuDefine34;
    public String skuDefine35;
    public String skuDefine36;
    public String skuDefine37;
    public String skuDefine38;
    public String skuDefine39;
    public String skuDefine40;
    public String skuDefine41;
    public String skuDefine42;
    public String skuDefine43;
    public String skuDefine44;
    public String skuDefine45;
    public String skuDefine46;
    public String skuDefine47;
    public String skuDefine48;
    public String skuDefine49;
    public String skuDefine50;
    public String skuDefine51;
    public String skuDefine52;
    public String skuDefine53;
    public String skuDefine54;
    public String skuDefine55;
    public String skuDefine56;
    public String skuDefine57;
    public String skuDefine58;
    public String skuDefine59;
    public String skuDefine60;

    public Long getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public MultiLangText getName_multilang() {
        return this.name_multilang;
    }

    public Long getProductId() {
        return this.productId;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public String getProductName() {
        return this.productName;
    }

    public MultiLangText getProductName_multilang() {
        return this.productName_multilang;
    }

    public String getProductErpCode() {
        return this.productErpCode;
    }

    public String getShortName() {
        return this.shortName;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public String getModelDescription() {
        return this.modelDescription;
    }

    public MultiLangText getModelDescription_multilang() {
        return this.modelDescription_multilang;
    }

    public String getModel() {
        return this.model;
    }

    public MultiLangText getModel_multilang() {
        return this.model_multilang;
    }

    public Long getBatchUnit() {
        return this.batchUnit;
    }

    public BigDecimal getBatchRate() {
        return this.batchRate;
    }

    public Boolean getDefaultSKU() {
        return this.defaultSKU;
    }

    public BigDecimal getWeight() {
        return this.weight;
    }

    public BigDecimal getVolume() {
        return this.volume;
    }

    public String getSpecIds() {
        return this.specIds;
    }

    public String getSpecs() {
        return this.specs;
    }

    public String getSpecNames() {
        return this.specNames;
    }

    public String getFree1() {
        return this.free1;
    }

    public String getFree2() {
        return this.free2;
    }

    public String getFree3() {
        return this.free3;
    }

    public String getFree4() {
        return this.free4;
    }

    public String getFree5() {
        return this.free5;
    }

    public String getFree6() {
        return this.free6;
    }

    public String getFree7() {
        return this.free7;
    }

    public String getFree8() {
        return this.free8;
    }

    public String getFree9() {
        return this.free9;
    }

    public String getFree10() {
        return this.free10;
    }

    public String getSkuDefine1() {
        return this.skuDefine1;
    }

    public String getSkuDefine2() {
        return this.skuDefine2;
    }

    public String getSkuDefine3() {
        return this.skuDefine3;
    }

    public String getSkuDefine4() {
        return this.skuDefine4;
    }

    public String getSkuDefine5() {
        return this.skuDefine5;
    }

    public String getSkuDefine6() {
        return this.skuDefine6;
    }

    public String getSkuDefine7() {
        return this.skuDefine7;
    }

    public String getSkuDefine8() {
        return this.skuDefine8;
    }

    public String getSkuDefine9() {
        return this.skuDefine9;
    }

    public String getSkuDefine10() {
        return this.skuDefine10;
    }

    public String getSkuDefine11() {
        return this.skuDefine11;
    }

    public String getSkuDefine12() {
        return this.skuDefine12;
    }

    public String getSkuDefine13() {
        return this.skuDefine13;
    }

    public String getSkuDefine14() {
        return this.skuDefine14;
    }

    public String getSkuDefine15() {
        return this.skuDefine15;
    }

    public String getSkuDefine16() {
        return this.skuDefine16;
    }

    public String getSkuDefine17() {
        return this.skuDefine17;
    }

    public String getSkuDefine18() {
        return this.skuDefine18;
    }

    public String getSkuDefine19() {
        return this.skuDefine19;
    }

    public String getSkuDefine20() {
        return this.skuDefine20;
    }

    public String getSkuDefine21() {
        return this.skuDefine21;
    }

    public String getSkuDefine22() {
        return this.skuDefine22;
    }

    public String getSkuDefine23() {
        return this.skuDefine23;
    }

    public String getSkuDefine24() {
        return this.skuDefine24;
    }

    public String getSkuDefine25() {
        return this.skuDefine25;
    }

    public String getSkuDefine26() {
        return this.skuDefine26;
    }

    public String getSkuDefine27() {
        return this.skuDefine27;
    }

    public String getSkuDefine28() {
        return this.skuDefine28;
    }

    public String getSkuDefine29() {
        return this.skuDefine29;
    }

    public String getSkuDefine30() {
        return this.skuDefine30;
    }

    public String getSkuDefine31() {
        return this.skuDefine31;
    }

    public String getSkuDefine32() {
        return this.skuDefine32;
    }

    public String getSkuDefine33() {
        return this.skuDefine33;
    }

    public String getSkuDefine34() {
        return this.skuDefine34;
    }

    public String getSkuDefine35() {
        return this.skuDefine35;
    }

    public String getSkuDefine36() {
        return this.skuDefine36;
    }

    public String getSkuDefine37() {
        return this.skuDefine37;
    }

    public String getSkuDefine38() {
        return this.skuDefine38;
    }

    public String getSkuDefine39() {
        return this.skuDefine39;
    }

    public String getSkuDefine40() {
        return this.skuDefine40;
    }

    public String getSkuDefine41() {
        return this.skuDefine41;
    }

    public String getSkuDefine42() {
        return this.skuDefine42;
    }

    public String getSkuDefine43() {
        return this.skuDefine43;
    }

    public String getSkuDefine44() {
        return this.skuDefine44;
    }

    public String getSkuDefine45() {
        return this.skuDefine45;
    }

    public String getSkuDefine46() {
        return this.skuDefine46;
    }

    public String getSkuDefine47() {
        return this.skuDefine47;
    }

    public String getSkuDefine48() {
        return this.skuDefine48;
    }

    public String getSkuDefine49() {
        return this.skuDefine49;
    }

    public String getSkuDefine50() {
        return this.skuDefine50;
    }

    public String getSkuDefine51() {
        return this.skuDefine51;
    }

    public String getSkuDefine52() {
        return this.skuDefine52;
    }

    public String getSkuDefine53() {
        return this.skuDefine53;
    }

    public String getSkuDefine54() {
        return this.skuDefine54;
    }

    public String getSkuDefine55() {
        return this.skuDefine55;
    }

    public String getSkuDefine56() {
        return this.skuDefine56;
    }

    public String getSkuDefine57() {
        return this.skuDefine57;
    }

    public String getSkuDefine58() {
        return this.skuDefine58;
    }

    public String getSkuDefine59() {
        return this.skuDefine59;
    }

    public String getSkuDefine60() {
        return this.skuDefine60;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName_multilang(MultiLangText name_multilang) {
        this.name_multilang = name_multilang;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductName_multilang(MultiLangText productName_multilang) {
        this.productName_multilang = productName_multilang;
    }

    public void setProductErpCode(String productErpCode) {
        this.productErpCode = productErpCode;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
    }

    public void setModelDescription_multilang(MultiLangText modelDescription_multilang) {
        this.modelDescription_multilang = modelDescription_multilang;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setModel_multilang(MultiLangText model_multilang) {
        this.model_multilang = model_multilang;
    }

    public void setBatchUnit(Long batchUnit) {
        this.batchUnit = batchUnit;
    }

    public void setBatchRate(BigDecimal batchRate) {
        this.batchRate = batchRate;
    }

    public void setDefaultSKU(Boolean defaultSKU) {
        this.defaultSKU = defaultSKU;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public void setSpecIds(String specIds) {
        this.specIds = specIds;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public void setSpecNames(String specNames) {
        this.specNames = specNames;
    }

    public void setFree1(String free1) {
        this.free1 = free1;
    }

    public void setFree2(String free2) {
        this.free2 = free2;
    }

    public void setFree3(String free3) {
        this.free3 = free3;
    }

    public void setFree4(String free4) {
        this.free4 = free4;
    }

    public void setFree5(String free5) {
        this.free5 = free5;
    }

    public void setFree6(String free6) {
        this.free6 = free6;
    }

    public void setFree7(String free7) {
        this.free7 = free7;
    }

    public void setFree8(String free8) {
        this.free8 = free8;
    }

    public void setFree9(String free9) {
        this.free9 = free9;
    }

    public void setFree10(String free10) {
        this.free10 = free10;
    }

    public void setSkuDefine1(String skuDefine1) {
        this.skuDefine1 = skuDefine1;
    }

    public void setSkuDefine2(String skuDefine2) {
        this.skuDefine2 = skuDefine2;
    }

    public void setSkuDefine3(String skuDefine3) {
        this.skuDefine3 = skuDefine3;
    }

    public void setSkuDefine4(String skuDefine4) {
        this.skuDefine4 = skuDefine4;
    }

    public void setSkuDefine5(String skuDefine5) {
        this.skuDefine5 = skuDefine5;
    }

    public void setSkuDefine6(String skuDefine6) {
        this.skuDefine6 = skuDefine6;
    }

    public void setSkuDefine7(String skuDefine7) {
        this.skuDefine7 = skuDefine7;
    }

    public void setSkuDefine8(String skuDefine8) {
        this.skuDefine8 = skuDefine8;
    }

    public void setSkuDefine9(String skuDefine9) {
        this.skuDefine9 = skuDefine9;
    }

    public void setSkuDefine10(String skuDefine10) {
        this.skuDefine10 = skuDefine10;
    }

    public void setSkuDefine11(String skuDefine11) {
        this.skuDefine11 = skuDefine11;
    }

    public void setSkuDefine12(String skuDefine12) {
        this.skuDefine12 = skuDefine12;
    }

    public void setSkuDefine13(String skuDefine13) {
        this.skuDefine13 = skuDefine13;
    }

    public void setSkuDefine14(String skuDefine14) {
        this.skuDefine14 = skuDefine14;
    }

    public void setSkuDefine15(String skuDefine15) {
        this.skuDefine15 = skuDefine15;
    }

    public void setSkuDefine16(String skuDefine16) {
        this.skuDefine16 = skuDefine16;
    }

    public void setSkuDefine17(String skuDefine17) {
        this.skuDefine17 = skuDefine17;
    }

    public void setSkuDefine18(String skuDefine18) {
        this.skuDefine18 = skuDefine18;
    }

    public void setSkuDefine19(String skuDefine19) {
        this.skuDefine19 = skuDefine19;
    }

    public void setSkuDefine20(String skuDefine20) {
        this.skuDefine20 = skuDefine20;
    }

    public void setSkuDefine21(String skuDefine21) {
        this.skuDefine21 = skuDefine21;
    }

    public void setSkuDefine22(String skuDefine22) {
        this.skuDefine22 = skuDefine22;
    }

    public void setSkuDefine23(String skuDefine23) {
        this.skuDefine23 = skuDefine23;
    }

    public void setSkuDefine24(String skuDefine24) {
        this.skuDefine24 = skuDefine24;
    }

    public void setSkuDefine25(String skuDefine25) {
        this.skuDefine25 = skuDefine25;
    }

    public void setSkuDefine26(String skuDefine26) {
        this.skuDefine26 = skuDefine26;
    }

    public void setSkuDefine27(String skuDefine27) {
        this.skuDefine27 = skuDefine27;
    }

    public void setSkuDefine28(String skuDefine28) {
        this.skuDefine28 = skuDefine28;
    }

    public void setSkuDefine29(String skuDefine29) {
        this.skuDefine29 = skuDefine29;
    }

    public void setSkuDefine30(String skuDefine30) {
        this.skuDefine30 = skuDefine30;
    }

    public void setSkuDefine31(String skuDefine31) {
        this.skuDefine31 = skuDefine31;
    }

    public void setSkuDefine32(String skuDefine32) {
        this.skuDefine32 = skuDefine32;
    }

    public void setSkuDefine33(String skuDefine33) {
        this.skuDefine33 = skuDefine33;
    }

    public void setSkuDefine34(String skuDefine34) {
        this.skuDefine34 = skuDefine34;
    }

    public void setSkuDefine35(String skuDefine35) {
        this.skuDefine35 = skuDefine35;
    }

    public void setSkuDefine36(String skuDefine36) {
        this.skuDefine36 = skuDefine36;
    }

    public void setSkuDefine37(String skuDefine37) {
        this.skuDefine37 = skuDefine37;
    }

    public void setSkuDefine38(String skuDefine38) {
        this.skuDefine38 = skuDefine38;
    }

    public void setSkuDefine39(String skuDefine39) {
        this.skuDefine39 = skuDefine39;
    }

    public void setSkuDefine40(String skuDefine40) {
        this.skuDefine40 = skuDefine40;
    }

    public void setSkuDefine41(String skuDefine41) {
        this.skuDefine41 = skuDefine41;
    }

    public void setSkuDefine42(String skuDefine42) {
        this.skuDefine42 = skuDefine42;
    }

    public void setSkuDefine43(String skuDefine43) {
        this.skuDefine43 = skuDefine43;
    }

    public void setSkuDefine44(String skuDefine44) {
        this.skuDefine44 = skuDefine44;
    }

    public void setSkuDefine45(String skuDefine45) {
        this.skuDefine45 = skuDefine45;
    }

    public void setSkuDefine46(String skuDefine46) {
        this.skuDefine46 = skuDefine46;
    }

    public void setSkuDefine47(String skuDefine47) {
        this.skuDefine47 = skuDefine47;
    }

    public void setSkuDefine48(String skuDefine48) {
        this.skuDefine48 = skuDefine48;
    }

    public void setSkuDefine49(String skuDefine49) {
        this.skuDefine49 = skuDefine49;
    }

    public void setSkuDefine50(String skuDefine50) {
        this.skuDefine50 = skuDefine50;
    }

    public void setSkuDefine51(String skuDefine51) {
        this.skuDefine51 = skuDefine51;
    }

    public void setSkuDefine52(String skuDefine52) {
        this.skuDefine52 = skuDefine52;
    }

    public void setSkuDefine53(String skuDefine53) {
        this.skuDefine53 = skuDefine53;
    }

    public void setSkuDefine54(String skuDefine54) {
        this.skuDefine54 = skuDefine54;
    }

    public void setSkuDefine55(String skuDefine55) {
        this.skuDefine55 = skuDefine55;
    }

    public void setSkuDefine56(String skuDefine56) {
        this.skuDefine56 = skuDefine56;
    }

    public void setSkuDefine57(String skuDefine57) {
        this.skuDefine57 = skuDefine57;
    }

    public void setSkuDefine58(String skuDefine58) {
        this.skuDefine58 = skuDefine58;
    }

    public void setSkuDefine59(String skuDefine59) {
        this.skuDefine59 = skuDefine59;
    }

    public void setSkuDefine60(String skuDefine60) {
        this.skuDefine60 = skuDefine60;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SkuBaseDTO)) {
            return false;
        }
        SkuBaseDTO other = (SkuBaseDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        Long this$batchUnit = this.getBatchUnit();
        Long other$batchUnit = other.getBatchUnit();
        if (this$batchUnit == null ? other$batchUnit != null : !((Object)this$batchUnit).equals(other$batchUnit)) {
            return false;
        }
        Boolean this$defaultSKU = this.getDefaultSKU();
        Boolean other$defaultSKU = other.getDefaultSKU();
        if (this$defaultSKU == null ? other$defaultSKU != null : !((Object)this$defaultSKU).equals(other$defaultSKU)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        MultiLangText this$name_multilang = this.getName_multilang();
        MultiLangText other$name_multilang = other.getName_multilang();
        if (this$name_multilang == null ? other$name_multilang != null : !this$name_multilang.equals(other$name_multilang)) {
            return false;
        }
        String this$productCode = this.getProductCode();
        String other$productCode = other.getProductCode();
        if (this$productCode == null ? other$productCode != null : !this$productCode.equals(other$productCode)) {
            return false;
        }
        String this$productName = this.getProductName();
        String other$productName = other.getProductName();
        if (this$productName == null ? other$productName != null : !this$productName.equals(other$productName)) {
            return false;
        }
        MultiLangText this$productName_multilang = this.getProductName_multilang();
        MultiLangText other$productName_multilang = other.getProductName_multilang();
        if (this$productName_multilang == null ? other$productName_multilang != null : !this$productName_multilang.equals(other$productName_multilang)) {
            return false;
        }
        String this$productErpCode = this.getProductErpCode();
        String other$productErpCode = other.getProductErpCode();
        if (this$productErpCode == null ? other$productErpCode != null : !this$productErpCode.equals(other$productErpCode)) {
            return false;
        }
        String this$shortName = this.getShortName();
        String other$shortName = other.getShortName();
        if (this$shortName == null ? other$shortName != null : !this$shortName.equals(other$shortName)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        String this$modelDescription = this.getModelDescription();
        String other$modelDescription = other.getModelDescription();
        if (this$modelDescription == null ? other$modelDescription != null : !this$modelDescription.equals(other$modelDescription)) {
            return false;
        }
        MultiLangText this$modelDescription_multilang = this.getModelDescription_multilang();
        MultiLangText other$modelDescription_multilang = other.getModelDescription_multilang();
        if (this$modelDescription_multilang == null ? other$modelDescription_multilang != null : !this$modelDescription_multilang.equals(other$modelDescription_multilang)) {
            return false;
        }
        String this$model = this.getModel();
        String other$model = other.getModel();
        if (this$model == null ? other$model != null : !this$model.equals(other$model)) {
            return false;
        }
        MultiLangText this$model_multilang = this.getModel_multilang();
        MultiLangText other$model_multilang = other.getModel_multilang();
        if (this$model_multilang == null ? other$model_multilang != null : !this$model_multilang.equals(other$model_multilang)) {
            return false;
        }
        BigDecimal this$batchRate = this.getBatchRate();
        BigDecimal other$batchRate = other.getBatchRate();
        if (this$batchRate == null ? other$batchRate != null : !((Object)this$batchRate).equals(other$batchRate)) {
            return false;
        }
        BigDecimal this$weight = this.getWeight();
        BigDecimal other$weight = other.getWeight();
        if (this$weight == null ? other$weight != null : !((Object)this$weight).equals(other$weight)) {
            return false;
        }
        BigDecimal this$volume = this.getVolume();
        BigDecimal other$volume = other.getVolume();
        if (this$volume == null ? other$volume != null : !((Object)this$volume).equals(other$volume)) {
            return false;
        }
        String this$specIds = this.getSpecIds();
        String other$specIds = other.getSpecIds();
        if (this$specIds == null ? other$specIds != null : !this$specIds.equals(other$specIds)) {
            return false;
        }
        String this$specs = this.getSpecs();
        String other$specs = other.getSpecs();
        if (this$specs == null ? other$specs != null : !this$specs.equals(other$specs)) {
            return false;
        }
        String this$specNames = this.getSpecNames();
        String other$specNames = other.getSpecNames();
        if (this$specNames == null ? other$specNames != null : !this$specNames.equals(other$specNames)) {
            return false;
        }
        String this$free1 = this.getFree1();
        String other$free1 = other.getFree1();
        if (this$free1 == null ? other$free1 != null : !this$free1.equals(other$free1)) {
            return false;
        }
        String this$free2 = this.getFree2();
        String other$free2 = other.getFree2();
        if (this$free2 == null ? other$free2 != null : !this$free2.equals(other$free2)) {
            return false;
        }
        String this$free3 = this.getFree3();
        String other$free3 = other.getFree3();
        if (this$free3 == null ? other$free3 != null : !this$free3.equals(other$free3)) {
            return false;
        }
        String this$free4 = this.getFree4();
        String other$free4 = other.getFree4();
        if (this$free4 == null ? other$free4 != null : !this$free4.equals(other$free4)) {
            return false;
        }
        String this$free5 = this.getFree5();
        String other$free5 = other.getFree5();
        if (this$free5 == null ? other$free5 != null : !this$free5.equals(other$free5)) {
            return false;
        }
        String this$free6 = this.getFree6();
        String other$free6 = other.getFree6();
        if (this$free6 == null ? other$free6 != null : !this$free6.equals(other$free6)) {
            return false;
        }
        String this$free7 = this.getFree7();
        String other$free7 = other.getFree7();
        if (this$free7 == null ? other$free7 != null : !this$free7.equals(other$free7)) {
            return false;
        }
        String this$free8 = this.getFree8();
        String other$free8 = other.getFree8();
        if (this$free8 == null ? other$free8 != null : !this$free8.equals(other$free8)) {
            return false;
        }
        String this$free9 = this.getFree9();
        String other$free9 = other.getFree9();
        if (this$free9 == null ? other$free9 != null : !this$free9.equals(other$free9)) {
            return false;
        }
        String this$free10 = this.getFree10();
        String other$free10 = other.getFree10();
        if (this$free10 == null ? other$free10 != null : !this$free10.equals(other$free10)) {
            return false;
        }
        String this$skuDefine1 = this.getSkuDefine1();
        String other$skuDefine1 = other.getSkuDefine1();
        if (this$skuDefine1 == null ? other$skuDefine1 != null : !this$skuDefine1.equals(other$skuDefine1)) {
            return false;
        }
        String this$skuDefine2 = this.getSkuDefine2();
        String other$skuDefine2 = other.getSkuDefine2();
        if (this$skuDefine2 == null ? other$skuDefine2 != null : !this$skuDefine2.equals(other$skuDefine2)) {
            return false;
        }
        String this$skuDefine3 = this.getSkuDefine3();
        String other$skuDefine3 = other.getSkuDefine3();
        if (this$skuDefine3 == null ? other$skuDefine3 != null : !this$skuDefine3.equals(other$skuDefine3)) {
            return false;
        }
        String this$skuDefine4 = this.getSkuDefine4();
        String other$skuDefine4 = other.getSkuDefine4();
        if (this$skuDefine4 == null ? other$skuDefine4 != null : !this$skuDefine4.equals(other$skuDefine4)) {
            return false;
        }
        String this$skuDefine5 = this.getSkuDefine5();
        String other$skuDefine5 = other.getSkuDefine5();
        if (this$skuDefine5 == null ? other$skuDefine5 != null : !this$skuDefine5.equals(other$skuDefine5)) {
            return false;
        }
        String this$skuDefine6 = this.getSkuDefine6();
        String other$skuDefine6 = other.getSkuDefine6();
        if (this$skuDefine6 == null ? other$skuDefine6 != null : !this$skuDefine6.equals(other$skuDefine6)) {
            return false;
        }
        String this$skuDefine7 = this.getSkuDefine7();
        String other$skuDefine7 = other.getSkuDefine7();
        if (this$skuDefine7 == null ? other$skuDefine7 != null : !this$skuDefine7.equals(other$skuDefine7)) {
            return false;
        }
        String this$skuDefine8 = this.getSkuDefine8();
        String other$skuDefine8 = other.getSkuDefine8();
        if (this$skuDefine8 == null ? other$skuDefine8 != null : !this$skuDefine8.equals(other$skuDefine8)) {
            return false;
        }
        String this$skuDefine9 = this.getSkuDefine9();
        String other$skuDefine9 = other.getSkuDefine9();
        if (this$skuDefine9 == null ? other$skuDefine9 != null : !this$skuDefine9.equals(other$skuDefine9)) {
            return false;
        }
        String this$skuDefine10 = this.getSkuDefine10();
        String other$skuDefine10 = other.getSkuDefine10();
        if (this$skuDefine10 == null ? other$skuDefine10 != null : !this$skuDefine10.equals(other$skuDefine10)) {
            return false;
        }
        String this$skuDefine11 = this.getSkuDefine11();
        String other$skuDefine11 = other.getSkuDefine11();
        if (this$skuDefine11 == null ? other$skuDefine11 != null : !this$skuDefine11.equals(other$skuDefine11)) {
            return false;
        }
        String this$skuDefine12 = this.getSkuDefine12();
        String other$skuDefine12 = other.getSkuDefine12();
        if (this$skuDefine12 == null ? other$skuDefine12 != null : !this$skuDefine12.equals(other$skuDefine12)) {
            return false;
        }
        String this$skuDefine13 = this.getSkuDefine13();
        String other$skuDefine13 = other.getSkuDefine13();
        if (this$skuDefine13 == null ? other$skuDefine13 != null : !this$skuDefine13.equals(other$skuDefine13)) {
            return false;
        }
        String this$skuDefine14 = this.getSkuDefine14();
        String other$skuDefine14 = other.getSkuDefine14();
        if (this$skuDefine14 == null ? other$skuDefine14 != null : !this$skuDefine14.equals(other$skuDefine14)) {
            return false;
        }
        String this$skuDefine15 = this.getSkuDefine15();
        String other$skuDefine15 = other.getSkuDefine15();
        if (this$skuDefine15 == null ? other$skuDefine15 != null : !this$skuDefine15.equals(other$skuDefine15)) {
            return false;
        }
        String this$skuDefine16 = this.getSkuDefine16();
        String other$skuDefine16 = other.getSkuDefine16();
        if (this$skuDefine16 == null ? other$skuDefine16 != null : !this$skuDefine16.equals(other$skuDefine16)) {
            return false;
        }
        String this$skuDefine17 = this.getSkuDefine17();
        String other$skuDefine17 = other.getSkuDefine17();
        if (this$skuDefine17 == null ? other$skuDefine17 != null : !this$skuDefine17.equals(other$skuDefine17)) {
            return false;
        }
        String this$skuDefine18 = this.getSkuDefine18();
        String other$skuDefine18 = other.getSkuDefine18();
        if (this$skuDefine18 == null ? other$skuDefine18 != null : !this$skuDefine18.equals(other$skuDefine18)) {
            return false;
        }
        String this$skuDefine19 = this.getSkuDefine19();
        String other$skuDefine19 = other.getSkuDefine19();
        if (this$skuDefine19 == null ? other$skuDefine19 != null : !this$skuDefine19.equals(other$skuDefine19)) {
            return false;
        }
        String this$skuDefine20 = this.getSkuDefine20();
        String other$skuDefine20 = other.getSkuDefine20();
        if (this$skuDefine20 == null ? other$skuDefine20 != null : !this$skuDefine20.equals(other$skuDefine20)) {
            return false;
        }
        String this$skuDefine21 = this.getSkuDefine21();
        String other$skuDefine21 = other.getSkuDefine21();
        if (this$skuDefine21 == null ? other$skuDefine21 != null : !this$skuDefine21.equals(other$skuDefine21)) {
            return false;
        }
        String this$skuDefine22 = this.getSkuDefine22();
        String other$skuDefine22 = other.getSkuDefine22();
        if (this$skuDefine22 == null ? other$skuDefine22 != null : !this$skuDefine22.equals(other$skuDefine22)) {
            return false;
        }
        String this$skuDefine23 = this.getSkuDefine23();
        String other$skuDefine23 = other.getSkuDefine23();
        if (this$skuDefine23 == null ? other$skuDefine23 != null : !this$skuDefine23.equals(other$skuDefine23)) {
            return false;
        }
        String this$skuDefine24 = this.getSkuDefine24();
        String other$skuDefine24 = other.getSkuDefine24();
        if (this$skuDefine24 == null ? other$skuDefine24 != null : !this$skuDefine24.equals(other$skuDefine24)) {
            return false;
        }
        String this$skuDefine25 = this.getSkuDefine25();
        String other$skuDefine25 = other.getSkuDefine25();
        if (this$skuDefine25 == null ? other$skuDefine25 != null : !this$skuDefine25.equals(other$skuDefine25)) {
            return false;
        }
        String this$skuDefine26 = this.getSkuDefine26();
        String other$skuDefine26 = other.getSkuDefine26();
        if (this$skuDefine26 == null ? other$skuDefine26 != null : !this$skuDefine26.equals(other$skuDefine26)) {
            return false;
        }
        String this$skuDefine27 = this.getSkuDefine27();
        String other$skuDefine27 = other.getSkuDefine27();
        if (this$skuDefine27 == null ? other$skuDefine27 != null : !this$skuDefine27.equals(other$skuDefine27)) {
            return false;
        }
        String this$skuDefine28 = this.getSkuDefine28();
        String other$skuDefine28 = other.getSkuDefine28();
        if (this$skuDefine28 == null ? other$skuDefine28 != null : !this$skuDefine28.equals(other$skuDefine28)) {
            return false;
        }
        String this$skuDefine29 = this.getSkuDefine29();
        String other$skuDefine29 = other.getSkuDefine29();
        if (this$skuDefine29 == null ? other$skuDefine29 != null : !this$skuDefine29.equals(other$skuDefine29)) {
            return false;
        }
        String this$skuDefine30 = this.getSkuDefine30();
        String other$skuDefine30 = other.getSkuDefine30();
        if (this$skuDefine30 == null ? other$skuDefine30 != null : !this$skuDefine30.equals(other$skuDefine30)) {
            return false;
        }
        String this$skuDefine31 = this.getSkuDefine31();
        String other$skuDefine31 = other.getSkuDefine31();
        if (this$skuDefine31 == null ? other$skuDefine31 != null : !this$skuDefine31.equals(other$skuDefine31)) {
            return false;
        }
        String this$skuDefine32 = this.getSkuDefine32();
        String other$skuDefine32 = other.getSkuDefine32();
        if (this$skuDefine32 == null ? other$skuDefine32 != null : !this$skuDefine32.equals(other$skuDefine32)) {
            return false;
        }
        String this$skuDefine33 = this.getSkuDefine33();
        String other$skuDefine33 = other.getSkuDefine33();
        if (this$skuDefine33 == null ? other$skuDefine33 != null : !this$skuDefine33.equals(other$skuDefine33)) {
            return false;
        }
        String this$skuDefine34 = this.getSkuDefine34();
        String other$skuDefine34 = other.getSkuDefine34();
        if (this$skuDefine34 == null ? other$skuDefine34 != null : !this$skuDefine34.equals(other$skuDefine34)) {
            return false;
        }
        String this$skuDefine35 = this.getSkuDefine35();
        String other$skuDefine35 = other.getSkuDefine35();
        if (this$skuDefine35 == null ? other$skuDefine35 != null : !this$skuDefine35.equals(other$skuDefine35)) {
            return false;
        }
        String this$skuDefine36 = this.getSkuDefine36();
        String other$skuDefine36 = other.getSkuDefine36();
        if (this$skuDefine36 == null ? other$skuDefine36 != null : !this$skuDefine36.equals(other$skuDefine36)) {
            return false;
        }
        String this$skuDefine37 = this.getSkuDefine37();
        String other$skuDefine37 = other.getSkuDefine37();
        if (this$skuDefine37 == null ? other$skuDefine37 != null : !this$skuDefine37.equals(other$skuDefine37)) {
            return false;
        }
        String this$skuDefine38 = this.getSkuDefine38();
        String other$skuDefine38 = other.getSkuDefine38();
        if (this$skuDefine38 == null ? other$skuDefine38 != null : !this$skuDefine38.equals(other$skuDefine38)) {
            return false;
        }
        String this$skuDefine39 = this.getSkuDefine39();
        String other$skuDefine39 = other.getSkuDefine39();
        if (this$skuDefine39 == null ? other$skuDefine39 != null : !this$skuDefine39.equals(other$skuDefine39)) {
            return false;
        }
        String this$skuDefine40 = this.getSkuDefine40();
        String other$skuDefine40 = other.getSkuDefine40();
        if (this$skuDefine40 == null ? other$skuDefine40 != null : !this$skuDefine40.equals(other$skuDefine40)) {
            return false;
        }
        String this$skuDefine41 = this.getSkuDefine41();
        String other$skuDefine41 = other.getSkuDefine41();
        if (this$skuDefine41 == null ? other$skuDefine41 != null : !this$skuDefine41.equals(other$skuDefine41)) {
            return false;
        }
        String this$skuDefine42 = this.getSkuDefine42();
        String other$skuDefine42 = other.getSkuDefine42();
        if (this$skuDefine42 == null ? other$skuDefine42 != null : !this$skuDefine42.equals(other$skuDefine42)) {
            return false;
        }
        String this$skuDefine43 = this.getSkuDefine43();
        String other$skuDefine43 = other.getSkuDefine43();
        if (this$skuDefine43 == null ? other$skuDefine43 != null : !this$skuDefine43.equals(other$skuDefine43)) {
            return false;
        }
        String this$skuDefine44 = this.getSkuDefine44();
        String other$skuDefine44 = other.getSkuDefine44();
        if (this$skuDefine44 == null ? other$skuDefine44 != null : !this$skuDefine44.equals(other$skuDefine44)) {
            return false;
        }
        String this$skuDefine45 = this.getSkuDefine45();
        String other$skuDefine45 = other.getSkuDefine45();
        if (this$skuDefine45 == null ? other$skuDefine45 != null : !this$skuDefine45.equals(other$skuDefine45)) {
            return false;
        }
        String this$skuDefine46 = this.getSkuDefine46();
        String other$skuDefine46 = other.getSkuDefine46();
        if (this$skuDefine46 == null ? other$skuDefine46 != null : !this$skuDefine46.equals(other$skuDefine46)) {
            return false;
        }
        String this$skuDefine47 = this.getSkuDefine47();
        String other$skuDefine47 = other.getSkuDefine47();
        if (this$skuDefine47 == null ? other$skuDefine47 != null : !this$skuDefine47.equals(other$skuDefine47)) {
            return false;
        }
        String this$skuDefine48 = this.getSkuDefine48();
        String other$skuDefine48 = other.getSkuDefine48();
        if (this$skuDefine48 == null ? other$skuDefine48 != null : !this$skuDefine48.equals(other$skuDefine48)) {
            return false;
        }
        String this$skuDefine49 = this.getSkuDefine49();
        String other$skuDefine49 = other.getSkuDefine49();
        if (this$skuDefine49 == null ? other$skuDefine49 != null : !this$skuDefine49.equals(other$skuDefine49)) {
            return false;
        }
        String this$skuDefine50 = this.getSkuDefine50();
        String other$skuDefine50 = other.getSkuDefine50();
        if (this$skuDefine50 == null ? other$skuDefine50 != null : !this$skuDefine50.equals(other$skuDefine50)) {
            return false;
        }
        String this$skuDefine51 = this.getSkuDefine51();
        String other$skuDefine51 = other.getSkuDefine51();
        if (this$skuDefine51 == null ? other$skuDefine51 != null : !this$skuDefine51.equals(other$skuDefine51)) {
            return false;
        }
        String this$skuDefine52 = this.getSkuDefine52();
        String other$skuDefine52 = other.getSkuDefine52();
        if (this$skuDefine52 == null ? other$skuDefine52 != null : !this$skuDefine52.equals(other$skuDefine52)) {
            return false;
        }
        String this$skuDefine53 = this.getSkuDefine53();
        String other$skuDefine53 = other.getSkuDefine53();
        if (this$skuDefine53 == null ? other$skuDefine53 != null : !this$skuDefine53.equals(other$skuDefine53)) {
            return false;
        }
        String this$skuDefine54 = this.getSkuDefine54();
        String other$skuDefine54 = other.getSkuDefine54();
        if (this$skuDefine54 == null ? other$skuDefine54 != null : !this$skuDefine54.equals(other$skuDefine54)) {
            return false;
        }
        String this$skuDefine55 = this.getSkuDefine55();
        String other$skuDefine55 = other.getSkuDefine55();
        if (this$skuDefine55 == null ? other$skuDefine55 != null : !this$skuDefine55.equals(other$skuDefine55)) {
            return false;
        }
        String this$skuDefine56 = this.getSkuDefine56();
        String other$skuDefine56 = other.getSkuDefine56();
        if (this$skuDefine56 == null ? other$skuDefine56 != null : !this$skuDefine56.equals(other$skuDefine56)) {
            return false;
        }
        String this$skuDefine57 = this.getSkuDefine57();
        String other$skuDefine57 = other.getSkuDefine57();
        if (this$skuDefine57 == null ? other$skuDefine57 != null : !this$skuDefine57.equals(other$skuDefine57)) {
            return false;
        }
        String this$skuDefine58 = this.getSkuDefine58();
        String other$skuDefine58 = other.getSkuDefine58();
        if (this$skuDefine58 == null ? other$skuDefine58 != null : !this$skuDefine58.equals(other$skuDefine58)) {
            return false;
        }
        String this$skuDefine59 = this.getSkuDefine59();
        String other$skuDefine59 = other.getSkuDefine59();
        if (this$skuDefine59 == null ? other$skuDefine59 != null : !this$skuDefine59.equals(other$skuDefine59)) {
            return false;
        }
        String this$skuDefine60 = this.getSkuDefine60();
        String other$skuDefine60 = other.getSkuDefine60();
        return !(this$skuDefine60 == null ? other$skuDefine60 != null : !this$skuDefine60.equals(other$skuDefine60));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof SkuBaseDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        Long $batchUnit = this.getBatchUnit();
        result = result * 59 + ($batchUnit == null ? 43 : ((Object)$batchUnit).hashCode());
        Boolean $defaultSKU = this.getDefaultSKU();
        result = result * 59 + ($defaultSKU == null ? 43 : ((Object)$defaultSKU).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        MultiLangText $name_multilang = this.getName_multilang();
        result = result * 59 + ($name_multilang == null ? 43 : $name_multilang.hashCode());
        String $productCode = this.getProductCode();
        result = result * 59 + ($productCode == null ? 43 : $productCode.hashCode());
        String $productName = this.getProductName();
        result = result * 59 + ($productName == null ? 43 : $productName.hashCode());
        MultiLangText $productName_multilang = this.getProductName_multilang();
        result = result * 59 + ($productName_multilang == null ? 43 : $productName_multilang.hashCode());
        String $productErpCode = this.getProductErpCode();
        result = result * 59 + ($productErpCode == null ? 43 : $productErpCode.hashCode());
        String $shortName = this.getShortName();
        result = result * 59 + ($shortName == null ? 43 : $shortName.hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        String $modelDescription = this.getModelDescription();
        result = result * 59 + ($modelDescription == null ? 43 : $modelDescription.hashCode());
        MultiLangText $modelDescription_multilang = this.getModelDescription_multilang();
        result = result * 59 + ($modelDescription_multilang == null ? 43 : $modelDescription_multilang.hashCode());
        String $model = this.getModel();
        result = result * 59 + ($model == null ? 43 : $model.hashCode());
        MultiLangText $model_multilang = this.getModel_multilang();
        result = result * 59 + ($model_multilang == null ? 43 : $model_multilang.hashCode());
        BigDecimal $batchRate = this.getBatchRate();
        result = result * 59 + ($batchRate == null ? 43 : ((Object)$batchRate).hashCode());
        BigDecimal $weight = this.getWeight();
        result = result * 59 + ($weight == null ? 43 : ((Object)$weight).hashCode());
        BigDecimal $volume = this.getVolume();
        result = result * 59 + ($volume == null ? 43 : ((Object)$volume).hashCode());
        String $specIds = this.getSpecIds();
        result = result * 59 + ($specIds == null ? 43 : $specIds.hashCode());
        String $specs = this.getSpecs();
        result = result * 59 + ($specs == null ? 43 : $specs.hashCode());
        String $specNames = this.getSpecNames();
        result = result * 59 + ($specNames == null ? 43 : $specNames.hashCode());
        String $free1 = this.getFree1();
        result = result * 59 + ($free1 == null ? 43 : $free1.hashCode());
        String $free2 = this.getFree2();
        result = result * 59 + ($free2 == null ? 43 : $free2.hashCode());
        String $free3 = this.getFree3();
        result = result * 59 + ($free3 == null ? 43 : $free3.hashCode());
        String $free4 = this.getFree4();
        result = result * 59 + ($free4 == null ? 43 : $free4.hashCode());
        String $free5 = this.getFree5();
        result = result * 59 + ($free5 == null ? 43 : $free5.hashCode());
        String $free6 = this.getFree6();
        result = result * 59 + ($free6 == null ? 43 : $free6.hashCode());
        String $free7 = this.getFree7();
        result = result * 59 + ($free7 == null ? 43 : $free7.hashCode());
        String $free8 = this.getFree8();
        result = result * 59 + ($free8 == null ? 43 : $free8.hashCode());
        String $free9 = this.getFree9();
        result = result * 59 + ($free9 == null ? 43 : $free9.hashCode());
        String $free10 = this.getFree10();
        result = result * 59 + ($free10 == null ? 43 : $free10.hashCode());
        String $skuDefine1 = this.getSkuDefine1();
        result = result * 59 + ($skuDefine1 == null ? 43 : $skuDefine1.hashCode());
        String $skuDefine2 = this.getSkuDefine2();
        result = result * 59 + ($skuDefine2 == null ? 43 : $skuDefine2.hashCode());
        String $skuDefine3 = this.getSkuDefine3();
        result = result * 59 + ($skuDefine3 == null ? 43 : $skuDefine3.hashCode());
        String $skuDefine4 = this.getSkuDefine4();
        result = result * 59 + ($skuDefine4 == null ? 43 : $skuDefine4.hashCode());
        String $skuDefine5 = this.getSkuDefine5();
        result = result * 59 + ($skuDefine5 == null ? 43 : $skuDefine5.hashCode());
        String $skuDefine6 = this.getSkuDefine6();
        result = result * 59 + ($skuDefine6 == null ? 43 : $skuDefine6.hashCode());
        String $skuDefine7 = this.getSkuDefine7();
        result = result * 59 + ($skuDefine7 == null ? 43 : $skuDefine7.hashCode());
        String $skuDefine8 = this.getSkuDefine8();
        result = result * 59 + ($skuDefine8 == null ? 43 : $skuDefine8.hashCode());
        String $skuDefine9 = this.getSkuDefine9();
        result = result * 59 + ($skuDefine9 == null ? 43 : $skuDefine9.hashCode());
        String $skuDefine10 = this.getSkuDefine10();
        result = result * 59 + ($skuDefine10 == null ? 43 : $skuDefine10.hashCode());
        String $skuDefine11 = this.getSkuDefine11();
        result = result * 59 + ($skuDefine11 == null ? 43 : $skuDefine11.hashCode());
        String $skuDefine12 = this.getSkuDefine12();
        result = result * 59 + ($skuDefine12 == null ? 43 : $skuDefine12.hashCode());
        String $skuDefine13 = this.getSkuDefine13();
        result = result * 59 + ($skuDefine13 == null ? 43 : $skuDefine13.hashCode());
        String $skuDefine14 = this.getSkuDefine14();
        result = result * 59 + ($skuDefine14 == null ? 43 : $skuDefine14.hashCode());
        String $skuDefine15 = this.getSkuDefine15();
        result = result * 59 + ($skuDefine15 == null ? 43 : $skuDefine15.hashCode());
        String $skuDefine16 = this.getSkuDefine16();
        result = result * 59 + ($skuDefine16 == null ? 43 : $skuDefine16.hashCode());
        String $skuDefine17 = this.getSkuDefine17();
        result = result * 59 + ($skuDefine17 == null ? 43 : $skuDefine17.hashCode());
        String $skuDefine18 = this.getSkuDefine18();
        result = result * 59 + ($skuDefine18 == null ? 43 : $skuDefine18.hashCode());
        String $skuDefine19 = this.getSkuDefine19();
        result = result * 59 + ($skuDefine19 == null ? 43 : $skuDefine19.hashCode());
        String $skuDefine20 = this.getSkuDefine20();
        result = result * 59 + ($skuDefine20 == null ? 43 : $skuDefine20.hashCode());
        String $skuDefine21 = this.getSkuDefine21();
        result = result * 59 + ($skuDefine21 == null ? 43 : $skuDefine21.hashCode());
        String $skuDefine22 = this.getSkuDefine22();
        result = result * 59 + ($skuDefine22 == null ? 43 : $skuDefine22.hashCode());
        String $skuDefine23 = this.getSkuDefine23();
        result = result * 59 + ($skuDefine23 == null ? 43 : $skuDefine23.hashCode());
        String $skuDefine24 = this.getSkuDefine24();
        result = result * 59 + ($skuDefine24 == null ? 43 : $skuDefine24.hashCode());
        String $skuDefine25 = this.getSkuDefine25();
        result = result * 59 + ($skuDefine25 == null ? 43 : $skuDefine25.hashCode());
        String $skuDefine26 = this.getSkuDefine26();
        result = result * 59 + ($skuDefine26 == null ? 43 : $skuDefine26.hashCode());
        String $skuDefine27 = this.getSkuDefine27();
        result = result * 59 + ($skuDefine27 == null ? 43 : $skuDefine27.hashCode());
        String $skuDefine28 = this.getSkuDefine28();
        result = result * 59 + ($skuDefine28 == null ? 43 : $skuDefine28.hashCode());
        String $skuDefine29 = this.getSkuDefine29();
        result = result * 59 + ($skuDefine29 == null ? 43 : $skuDefine29.hashCode());
        String $skuDefine30 = this.getSkuDefine30();
        result = result * 59 + ($skuDefine30 == null ? 43 : $skuDefine30.hashCode());
        String $skuDefine31 = this.getSkuDefine31();
        result = result * 59 + ($skuDefine31 == null ? 43 : $skuDefine31.hashCode());
        String $skuDefine32 = this.getSkuDefine32();
        result = result * 59 + ($skuDefine32 == null ? 43 : $skuDefine32.hashCode());
        String $skuDefine33 = this.getSkuDefine33();
        result = result * 59 + ($skuDefine33 == null ? 43 : $skuDefine33.hashCode());
        String $skuDefine34 = this.getSkuDefine34();
        result = result * 59 + ($skuDefine34 == null ? 43 : $skuDefine34.hashCode());
        String $skuDefine35 = this.getSkuDefine35();
        result = result * 59 + ($skuDefine35 == null ? 43 : $skuDefine35.hashCode());
        String $skuDefine36 = this.getSkuDefine36();
        result = result * 59 + ($skuDefine36 == null ? 43 : $skuDefine36.hashCode());
        String $skuDefine37 = this.getSkuDefine37();
        result = result * 59 + ($skuDefine37 == null ? 43 : $skuDefine37.hashCode());
        String $skuDefine38 = this.getSkuDefine38();
        result = result * 59 + ($skuDefine38 == null ? 43 : $skuDefine38.hashCode());
        String $skuDefine39 = this.getSkuDefine39();
        result = result * 59 + ($skuDefine39 == null ? 43 : $skuDefine39.hashCode());
        String $skuDefine40 = this.getSkuDefine40();
        result = result * 59 + ($skuDefine40 == null ? 43 : $skuDefine40.hashCode());
        String $skuDefine41 = this.getSkuDefine41();
        result = result * 59 + ($skuDefine41 == null ? 43 : $skuDefine41.hashCode());
        String $skuDefine42 = this.getSkuDefine42();
        result = result * 59 + ($skuDefine42 == null ? 43 : $skuDefine42.hashCode());
        String $skuDefine43 = this.getSkuDefine43();
        result = result * 59 + ($skuDefine43 == null ? 43 : $skuDefine43.hashCode());
        String $skuDefine44 = this.getSkuDefine44();
        result = result * 59 + ($skuDefine44 == null ? 43 : $skuDefine44.hashCode());
        String $skuDefine45 = this.getSkuDefine45();
        result = result * 59 + ($skuDefine45 == null ? 43 : $skuDefine45.hashCode());
        String $skuDefine46 = this.getSkuDefine46();
        result = result * 59 + ($skuDefine46 == null ? 43 : $skuDefine46.hashCode());
        String $skuDefine47 = this.getSkuDefine47();
        result = result * 59 + ($skuDefine47 == null ? 43 : $skuDefine47.hashCode());
        String $skuDefine48 = this.getSkuDefine48();
        result = result * 59 + ($skuDefine48 == null ? 43 : $skuDefine48.hashCode());
        String $skuDefine49 = this.getSkuDefine49();
        result = result * 59 + ($skuDefine49 == null ? 43 : $skuDefine49.hashCode());
        String $skuDefine50 = this.getSkuDefine50();
        result = result * 59 + ($skuDefine50 == null ? 43 : $skuDefine50.hashCode());
        String $skuDefine51 = this.getSkuDefine51();
        result = result * 59 + ($skuDefine51 == null ? 43 : $skuDefine51.hashCode());
        String $skuDefine52 = this.getSkuDefine52();
        result = result * 59 + ($skuDefine52 == null ? 43 : $skuDefine52.hashCode());
        String $skuDefine53 = this.getSkuDefine53();
        result = result * 59 + ($skuDefine53 == null ? 43 : $skuDefine53.hashCode());
        String $skuDefine54 = this.getSkuDefine54();
        result = result * 59 + ($skuDefine54 == null ? 43 : $skuDefine54.hashCode());
        String $skuDefine55 = this.getSkuDefine55();
        result = result * 59 + ($skuDefine55 == null ? 43 : $skuDefine55.hashCode());
        String $skuDefine56 = this.getSkuDefine56();
        result = result * 59 + ($skuDefine56 == null ? 43 : $skuDefine56.hashCode());
        String $skuDefine57 = this.getSkuDefine57();
        result = result * 59 + ($skuDefine57 == null ? 43 : $skuDefine57.hashCode());
        String $skuDefine58 = this.getSkuDefine58();
        result = result * 59 + ($skuDefine58 == null ? 43 : $skuDefine58.hashCode());
        String $skuDefine59 = this.getSkuDefine59();
        result = result * 59 + ($skuDefine59 == null ? 43 : $skuDefine59.hashCode());
        String $skuDefine60 = this.getSkuDefine60();
        result = result * 59 + ($skuDefine60 == null ? 43 : $skuDefine60.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "SkuBaseDTO(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", name_multilang=" + this.getName_multilang() + ", productId=" + this.getProductId() + ", productCode=" + this.getProductCode() + ", productName=" + this.getProductName() + ", productName_multilang=" + this.getProductName_multilang() + ", productErpCode=" + this.getProductErpCode() + ", shortName=" + this.getShortName() + ", erpCode=" + this.getErpCode() + ", modelDescription=" + this.getModelDescription() + ", modelDescription_multilang=" + this.getModelDescription_multilang() + ", model=" + this.getModel() + ", model_multilang=" + this.getModel_multilang() + ", batchUnit=" + this.getBatchUnit() + ", batchRate=" + this.getBatchRate() + ", defaultSKU=" + this.getDefaultSKU() + ", weight=" + this.getWeight() + ", volume=" + this.getVolume() + ", specIds=" + this.getSpecIds() + ", specs=" + this.getSpecs() + ", specNames=" + this.getSpecNames() + ", free1=" + this.getFree1() + ", free2=" + this.getFree2() + ", free3=" + this.getFree3() + ", free4=" + this.getFree4() + ", free5=" + this.getFree5() + ", free6=" + this.getFree6() + ", free7=" + this.getFree7() + ", free8=" + this.getFree8() + ", free9=" + this.getFree9() + ", free10=" + this.getFree10() + ", skuDefine1=" + this.getSkuDefine1() + ", skuDefine2=" + this.getSkuDefine2() + ", skuDefine3=" + this.getSkuDefine3() + ", skuDefine4=" + this.getSkuDefine4() + ", skuDefine5=" + this.getSkuDefine5() + ", skuDefine6=" + this.getSkuDefine6() + ", skuDefine7=" + this.getSkuDefine7() + ", skuDefine8=" + this.getSkuDefine8() + ", skuDefine9=" + this.getSkuDefine9() + ", skuDefine10=" + this.getSkuDefine10() + ", skuDefine11=" + this.getSkuDefine11() + ", skuDefine12=" + this.getSkuDefine12() + ", skuDefine13=" + this.getSkuDefine13() + ", skuDefine14=" + this.getSkuDefine14() + ", skuDefine15=" + this.getSkuDefine15() + ", skuDefine16=" + this.getSkuDefine16() + ", skuDefine17=" + this.getSkuDefine17() + ", skuDefine18=" + this.getSkuDefine18() + ", skuDefine19=" + this.getSkuDefine19() + ", skuDefine20=" + this.getSkuDefine20() + ", skuDefine21=" + this.getSkuDefine21() + ", skuDefine22=" + this.getSkuDefine22() + ", skuDefine23=" + this.getSkuDefine23() + ", skuDefine24=" + this.getSkuDefine24() + ", skuDefine25=" + this.getSkuDefine25() + ", skuDefine26=" + this.getSkuDefine26() + ", skuDefine27=" + this.getSkuDefine27() + ", skuDefine28=" + this.getSkuDefine28() + ", skuDefine29=" + this.getSkuDefine29() + ", skuDefine30=" + this.getSkuDefine30() + ", skuDefine31=" + this.getSkuDefine31() + ", skuDefine32=" + this.getSkuDefine32() + ", skuDefine33=" + this.getSkuDefine33() + ", skuDefine34=" + this.getSkuDefine34() + ", skuDefine35=" + this.getSkuDefine35() + ", skuDefine36=" + this.getSkuDefine36() + ", skuDefine37=" + this.getSkuDefine37() + ", skuDefine38=" + this.getSkuDefine38() + ", skuDefine39=" + this.getSkuDefine39() + ", skuDefine40=" + this.getSkuDefine40() + ", skuDefine41=" + this.getSkuDefine41() + ", skuDefine42=" + this.getSkuDefine42() + ", skuDefine43=" + this.getSkuDefine43() + ", skuDefine44=" + this.getSkuDefine44() + ", skuDefine45=" + this.getSkuDefine45() + ", skuDefine46=" + this.getSkuDefine46() + ", skuDefine47=" + this.getSkuDefine47() + ", skuDefine48=" + this.getSkuDefine48() + ", skuDefine49=" + this.getSkuDefine49() + ", skuDefine50=" + this.getSkuDefine50() + ", skuDefine51=" + this.getSkuDefine51() + ", skuDefine52=" + this.getSkuDefine52() + ", skuDefine53=" + this.getSkuDefine53() + ", skuDefine54=" + this.getSkuDefine54() + ", skuDefine55=" + this.getSkuDefine55() + ", skuDefine56=" + this.getSkuDefine56() + ", skuDefine57=" + this.getSkuDefine57() + ", skuDefine58=" + this.getSkuDefine58() + ", skuDefine59=" + this.getSkuDefine59() + ", skuDefine60=" + this.getSkuDefine60() + ")";
    }
}

