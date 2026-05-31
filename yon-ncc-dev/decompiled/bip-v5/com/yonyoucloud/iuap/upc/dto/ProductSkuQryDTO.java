/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.SkuTagQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductSkuQryDTO
extends UPCPager
implements Serializable {
    private String[] fields;
    private Long id;
    private List<String> idList;
    private String code;
    private List<String> codeList;
    private List<Long> productIdList;
    @Deprecated
    private List<Long> productapplyIdList;
    private String productCode;
    private List<String> productCodeList;
    private String productName;
    private List<String> productNameList;
    private String shortName;
    private String orgId;
    private List<Long> orgIdList;
    private List<String> orgIdStrList;
    private List<Long> productClassIdList;
    private List<Long> managerClassIdList;
    private String manageClassCode;
    private List<String> managerClassCodeList;
    private Boolean stopStatus;
    private List<Long> shopId;
    private String erpCode;
    private List<String> erpCodeList;
    private List<String> barCodeList;
    private String mnemonicCode;
    private String modelDescription;
    private Boolean defaultSKU;
    private List<String> skuMd5KeyList;
    private SkuTagQryDTO skuTagQry;
    private Boolean needTags = false;
    private Map<String, Object> productSkuCharacterDefFuzzy;
    private Map<String, Object> skuFreeCharacterFuzzy;
    private String nameOrCodeOrBarCodeFuzzy;
    private Date pubts;
    private Date lastUpdate;
    private Map<String, Object> productSkuCharacterDef;
    private Map<String, Object> skuFreeCharacter;
    private Map<String, Object> skuPropCharacter;

    public String[] getFields() {
        return this.fields;
    }

    public Long getId() {
        return this.id;
    }

    public List<String> getIdList() {
        return this.idList;
    }

    public String getCode() {
        return this.code;
    }

    public List<String> getCodeList() {
        return this.codeList;
    }

    public List<Long> getProductIdList() {
        return this.productIdList;
    }

    @Deprecated
    public List<Long> getProductapplyIdList() {
        return this.productapplyIdList;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public List<String> getProductCodeList() {
        return this.productCodeList;
    }

    public String getProductName() {
        return this.productName;
    }

    public List<String> getProductNameList() {
        return this.productNameList;
    }

    public String getShortName() {
        return this.shortName;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public List<Long> getOrgIdList() {
        return this.orgIdList;
    }

    public List<String> getOrgIdStrList() {
        return this.orgIdStrList;
    }

    public List<Long> getProductClassIdList() {
        return this.productClassIdList;
    }

    public List<Long> getManagerClassIdList() {
        return this.managerClassIdList;
    }

    public String getManageClassCode() {
        return this.manageClassCode;
    }

    public List<String> getManagerClassCodeList() {
        return this.managerClassCodeList;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public List<Long> getShopId() {
        return this.shopId;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public List<String> getErpCodeList() {
        return this.erpCodeList;
    }

    public List<String> getBarCodeList() {
        return this.barCodeList;
    }

    public String getMnemonicCode() {
        return this.mnemonicCode;
    }

    public String getModelDescription() {
        return this.modelDescription;
    }

    public Boolean getDefaultSKU() {
        return this.defaultSKU;
    }

    public List<String> getSkuMd5KeyList() {
        return this.skuMd5KeyList;
    }

    public SkuTagQryDTO getSkuTagQry() {
        return this.skuTagQry;
    }

    public Boolean getNeedTags() {
        return this.needTags;
    }

    public Map<String, Object> getProductSkuCharacterDefFuzzy() {
        return this.productSkuCharacterDefFuzzy;
    }

    public Map<String, Object> getSkuFreeCharacterFuzzy() {
        return this.skuFreeCharacterFuzzy;
    }

    public String getNameOrCodeOrBarCodeFuzzy() {
        return this.nameOrCodeOrBarCodeFuzzy;
    }

    public Date getPubts() {
        return this.pubts;
    }

    public Date getLastUpdate() {
        return this.lastUpdate;
    }

    public Map<String, Object> getProductSkuCharacterDef() {
        return this.productSkuCharacterDef;
    }

    public Map<String, Object> getSkuFreeCharacter() {
        return this.skuFreeCharacter;
    }

    public Map<String, Object> getSkuPropCharacter() {
        return this.skuPropCharacter;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCodeList(List<String> codeList) {
        this.codeList = codeList;
    }

    public void setProductIdList(List<Long> productIdList) {
        this.productIdList = productIdList;
    }

    @Deprecated
    public void setProductapplyIdList(List<Long> productapplyIdList) {
        this.productapplyIdList = productapplyIdList;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductCodeList(List<String> productCodeList) {
        this.productCodeList = productCodeList;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductNameList(List<String> productNameList) {
        this.productNameList = productNameList;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setOrgIdList(List<Long> orgIdList) {
        this.orgIdList = orgIdList;
    }

    public void setOrgIdStrList(List<String> orgIdStrList) {
        this.orgIdStrList = orgIdStrList;
    }

    public void setProductClassIdList(List<Long> productClassIdList) {
        this.productClassIdList = productClassIdList;
    }

    public void setManagerClassIdList(List<Long> managerClassIdList) {
        this.managerClassIdList = managerClassIdList;
    }

    public void setManageClassCode(String manageClassCode) {
        this.manageClassCode = manageClassCode;
    }

    public void setManagerClassCodeList(List<String> managerClassCodeList) {
        this.managerClassCodeList = managerClassCodeList;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setShopId(List<Long> shopId) {
        this.shopId = shopId;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setErpCodeList(List<String> erpCodeList) {
        this.erpCodeList = erpCodeList;
    }

    public void setBarCodeList(List<String> barCodeList) {
        this.barCodeList = barCodeList;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public void setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
    }

    public void setDefaultSKU(Boolean defaultSKU) {
        this.defaultSKU = defaultSKU;
    }

    public void setSkuMd5KeyList(List<String> skuMd5KeyList) {
        this.skuMd5KeyList = skuMd5KeyList;
    }

    public void setSkuTagQry(SkuTagQryDTO skuTagQry) {
        this.skuTagQry = skuTagQry;
    }

    public void setNeedTags(Boolean needTags) {
        this.needTags = needTags;
    }

    public void setProductSkuCharacterDefFuzzy(Map<String, Object> productSkuCharacterDefFuzzy) {
        this.productSkuCharacterDefFuzzy = productSkuCharacterDefFuzzy;
    }

    public void setSkuFreeCharacterFuzzy(Map<String, Object> skuFreeCharacterFuzzy) {
        this.skuFreeCharacterFuzzy = skuFreeCharacterFuzzy;
    }

    public void setNameOrCodeOrBarCodeFuzzy(String nameOrCodeOrBarCodeFuzzy) {
        this.nameOrCodeOrBarCodeFuzzy = nameOrCodeOrBarCodeFuzzy;
    }

    public void setPubts(Date pubts) {
        this.pubts = pubts;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public void setProductSkuCharacterDef(Map<String, Object> productSkuCharacterDef) {
        this.productSkuCharacterDef = productSkuCharacterDef;
    }

    public void setSkuFreeCharacter(Map<String, Object> skuFreeCharacter) {
        this.skuFreeCharacter = skuFreeCharacter;
    }

    public void setSkuPropCharacter(Map<String, Object> skuPropCharacter) {
        this.skuPropCharacter = skuPropCharacter;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductSkuQryDTO)) {
            return false;
        }
        ProductSkuQryDTO other = (ProductSkuQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        Boolean this$defaultSKU = this.getDefaultSKU();
        Boolean other$defaultSKU = other.getDefaultSKU();
        if (this$defaultSKU == null ? other$defaultSKU != null : !((Object)this$defaultSKU).equals(other$defaultSKU)) {
            return false;
        }
        Boolean this$needTags = this.getNeedTags();
        Boolean other$needTags = other.getNeedTags();
        if (this$needTags == null ? other$needTags != null : !((Object)this$needTags).equals(other$needTags)) {
            return false;
        }
        if (!Arrays.deepEquals(this.getFields(), other.getFields())) {
            return false;
        }
        List<String> this$idList = this.getIdList();
        List<String> other$idList = other.getIdList();
        if (this$idList == null ? other$idList != null : !((Object)this$idList).equals(other$idList)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        List<String> this$codeList = this.getCodeList();
        List<String> other$codeList = other.getCodeList();
        if (this$codeList == null ? other$codeList != null : !((Object)this$codeList).equals(other$codeList)) {
            return false;
        }
        List<Long> this$productIdList = this.getProductIdList();
        List<Long> other$productIdList = other.getProductIdList();
        if (this$productIdList == null ? other$productIdList != null : !((Object)this$productIdList).equals(other$productIdList)) {
            return false;
        }
        List<Long> this$productapplyIdList = this.getProductapplyIdList();
        List<Long> other$productapplyIdList = other.getProductapplyIdList();
        if (this$productapplyIdList == null ? other$productapplyIdList != null : !((Object)this$productapplyIdList).equals(other$productapplyIdList)) {
            return false;
        }
        String this$productCode = this.getProductCode();
        String other$productCode = other.getProductCode();
        if (this$productCode == null ? other$productCode != null : !this$productCode.equals(other$productCode)) {
            return false;
        }
        List<String> this$productCodeList = this.getProductCodeList();
        List<String> other$productCodeList = other.getProductCodeList();
        if (this$productCodeList == null ? other$productCodeList != null : !((Object)this$productCodeList).equals(other$productCodeList)) {
            return false;
        }
        String this$productName = this.getProductName();
        String other$productName = other.getProductName();
        if (this$productName == null ? other$productName != null : !this$productName.equals(other$productName)) {
            return false;
        }
        List<String> this$productNameList = this.getProductNameList();
        List<String> other$productNameList = other.getProductNameList();
        if (this$productNameList == null ? other$productNameList != null : !((Object)this$productNameList).equals(other$productNameList)) {
            return false;
        }
        String this$shortName = this.getShortName();
        String other$shortName = other.getShortName();
        if (this$shortName == null ? other$shortName != null : !this$shortName.equals(other$shortName)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        List<Long> this$orgIdList = this.getOrgIdList();
        List<Long> other$orgIdList = other.getOrgIdList();
        if (this$orgIdList == null ? other$orgIdList != null : !((Object)this$orgIdList).equals(other$orgIdList)) {
            return false;
        }
        List<String> this$orgIdStrList = this.getOrgIdStrList();
        List<String> other$orgIdStrList = other.getOrgIdStrList();
        if (this$orgIdStrList == null ? other$orgIdStrList != null : !((Object)this$orgIdStrList).equals(other$orgIdStrList)) {
            return false;
        }
        List<Long> this$productClassIdList = this.getProductClassIdList();
        List<Long> other$productClassIdList = other.getProductClassIdList();
        if (this$productClassIdList == null ? other$productClassIdList != null : !((Object)this$productClassIdList).equals(other$productClassIdList)) {
            return false;
        }
        List<Long> this$managerClassIdList = this.getManagerClassIdList();
        List<Long> other$managerClassIdList = other.getManagerClassIdList();
        if (this$managerClassIdList == null ? other$managerClassIdList != null : !((Object)this$managerClassIdList).equals(other$managerClassIdList)) {
            return false;
        }
        String this$manageClassCode = this.getManageClassCode();
        String other$manageClassCode = other.getManageClassCode();
        if (this$manageClassCode == null ? other$manageClassCode != null : !this$manageClassCode.equals(other$manageClassCode)) {
            return false;
        }
        List<String> this$managerClassCodeList = this.getManagerClassCodeList();
        List<String> other$managerClassCodeList = other.getManagerClassCodeList();
        if (this$managerClassCodeList == null ? other$managerClassCodeList != null : !((Object)this$managerClassCodeList).equals(other$managerClassCodeList)) {
            return false;
        }
        List<Long> this$shopId = this.getShopId();
        List<Long> other$shopId = other.getShopId();
        if (this$shopId == null ? other$shopId != null : !((Object)this$shopId).equals(other$shopId)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        List<String> this$erpCodeList = this.getErpCodeList();
        List<String> other$erpCodeList = other.getErpCodeList();
        if (this$erpCodeList == null ? other$erpCodeList != null : !((Object)this$erpCodeList).equals(other$erpCodeList)) {
            return false;
        }
        List<String> this$barCodeList = this.getBarCodeList();
        List<String> other$barCodeList = other.getBarCodeList();
        if (this$barCodeList == null ? other$barCodeList != null : !((Object)this$barCodeList).equals(other$barCodeList)) {
            return false;
        }
        String this$mnemonicCode = this.getMnemonicCode();
        String other$mnemonicCode = other.getMnemonicCode();
        if (this$mnemonicCode == null ? other$mnemonicCode != null : !this$mnemonicCode.equals(other$mnemonicCode)) {
            return false;
        }
        String this$modelDescription = this.getModelDescription();
        String other$modelDescription = other.getModelDescription();
        if (this$modelDescription == null ? other$modelDescription != null : !this$modelDescription.equals(other$modelDescription)) {
            return false;
        }
        List<String> this$skuMd5KeyList = this.getSkuMd5KeyList();
        List<String> other$skuMd5KeyList = other.getSkuMd5KeyList();
        if (this$skuMd5KeyList == null ? other$skuMd5KeyList != null : !((Object)this$skuMd5KeyList).equals(other$skuMd5KeyList)) {
            return false;
        }
        SkuTagQryDTO this$skuTagQry = this.getSkuTagQry();
        SkuTagQryDTO other$skuTagQry = other.getSkuTagQry();
        if (this$skuTagQry == null ? other$skuTagQry != null : !((Object)this$skuTagQry).equals(other$skuTagQry)) {
            return false;
        }
        Map<String, Object> this$productSkuCharacterDefFuzzy = this.getProductSkuCharacterDefFuzzy();
        Map<String, Object> other$productSkuCharacterDefFuzzy = other.getProductSkuCharacterDefFuzzy();
        if (this$productSkuCharacterDefFuzzy == null ? other$productSkuCharacterDefFuzzy != null : !((Object)this$productSkuCharacterDefFuzzy).equals(other$productSkuCharacterDefFuzzy)) {
            return false;
        }
        Map<String, Object> this$skuFreeCharacterFuzzy = this.getSkuFreeCharacterFuzzy();
        Map<String, Object> other$skuFreeCharacterFuzzy = other.getSkuFreeCharacterFuzzy();
        if (this$skuFreeCharacterFuzzy == null ? other$skuFreeCharacterFuzzy != null : !((Object)this$skuFreeCharacterFuzzy).equals(other$skuFreeCharacterFuzzy)) {
            return false;
        }
        String this$nameOrCodeOrBarCodeFuzzy = this.getNameOrCodeOrBarCodeFuzzy();
        String other$nameOrCodeOrBarCodeFuzzy = other.getNameOrCodeOrBarCodeFuzzy();
        if (this$nameOrCodeOrBarCodeFuzzy == null ? other$nameOrCodeOrBarCodeFuzzy != null : !this$nameOrCodeOrBarCodeFuzzy.equals(other$nameOrCodeOrBarCodeFuzzy)) {
            return false;
        }
        Date this$pubts = this.getPubts();
        Date other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !((Object)this$pubts).equals(other$pubts)) {
            return false;
        }
        Date this$lastUpdate = this.getLastUpdate();
        Date other$lastUpdate = other.getLastUpdate();
        if (this$lastUpdate == null ? other$lastUpdate != null : !((Object)this$lastUpdate).equals(other$lastUpdate)) {
            return false;
        }
        Map<String, Object> this$productSkuCharacterDef = this.getProductSkuCharacterDef();
        Map<String, Object> other$productSkuCharacterDef = other.getProductSkuCharacterDef();
        if (this$productSkuCharacterDef == null ? other$productSkuCharacterDef != null : !((Object)this$productSkuCharacterDef).equals(other$productSkuCharacterDef)) {
            return false;
        }
        Map<String, Object> this$skuFreeCharacter = this.getSkuFreeCharacter();
        Map<String, Object> other$skuFreeCharacter = other.getSkuFreeCharacter();
        if (this$skuFreeCharacter == null ? other$skuFreeCharacter != null : !((Object)this$skuFreeCharacter).equals(other$skuFreeCharacter)) {
            return false;
        }
        Map<String, Object> this$skuPropCharacter = this.getSkuPropCharacter();
        Map<String, Object> other$skuPropCharacter = other.getSkuPropCharacter();
        return !(this$skuPropCharacter == null ? other$skuPropCharacter != null : !((Object)this$skuPropCharacter).equals(other$skuPropCharacter));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof ProductSkuQryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        Boolean $defaultSKU = this.getDefaultSKU();
        result = result * 59 + ($defaultSKU == null ? 43 : ((Object)$defaultSKU).hashCode());
        Boolean $needTags = this.getNeedTags();
        result = result * 59 + ($needTags == null ? 43 : ((Object)$needTags).hashCode());
        result = result * 59 + Arrays.deepHashCode(this.getFields());
        List<String> $idList = this.getIdList();
        result = result * 59 + ($idList == null ? 43 : ((Object)$idList).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        List<String> $codeList = this.getCodeList();
        result = result * 59 + ($codeList == null ? 43 : ((Object)$codeList).hashCode());
        List<Long> $productIdList = this.getProductIdList();
        result = result * 59 + ($productIdList == null ? 43 : ((Object)$productIdList).hashCode());
        List<Long> $productapplyIdList = this.getProductapplyIdList();
        result = result * 59 + ($productapplyIdList == null ? 43 : ((Object)$productapplyIdList).hashCode());
        String $productCode = this.getProductCode();
        result = result * 59 + ($productCode == null ? 43 : $productCode.hashCode());
        List<String> $productCodeList = this.getProductCodeList();
        result = result * 59 + ($productCodeList == null ? 43 : ((Object)$productCodeList).hashCode());
        String $productName = this.getProductName();
        result = result * 59 + ($productName == null ? 43 : $productName.hashCode());
        List<String> $productNameList = this.getProductNameList();
        result = result * 59 + ($productNameList == null ? 43 : ((Object)$productNameList).hashCode());
        String $shortName = this.getShortName();
        result = result * 59 + ($shortName == null ? 43 : $shortName.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        List<Long> $orgIdList = this.getOrgIdList();
        result = result * 59 + ($orgIdList == null ? 43 : ((Object)$orgIdList).hashCode());
        List<String> $orgIdStrList = this.getOrgIdStrList();
        result = result * 59 + ($orgIdStrList == null ? 43 : ((Object)$orgIdStrList).hashCode());
        List<Long> $productClassIdList = this.getProductClassIdList();
        result = result * 59 + ($productClassIdList == null ? 43 : ((Object)$productClassIdList).hashCode());
        List<Long> $managerClassIdList = this.getManagerClassIdList();
        result = result * 59 + ($managerClassIdList == null ? 43 : ((Object)$managerClassIdList).hashCode());
        String $manageClassCode = this.getManageClassCode();
        result = result * 59 + ($manageClassCode == null ? 43 : $manageClassCode.hashCode());
        List<String> $managerClassCodeList = this.getManagerClassCodeList();
        result = result * 59 + ($managerClassCodeList == null ? 43 : ((Object)$managerClassCodeList).hashCode());
        List<Long> $shopId = this.getShopId();
        result = result * 59 + ($shopId == null ? 43 : ((Object)$shopId).hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        List<String> $erpCodeList = this.getErpCodeList();
        result = result * 59 + ($erpCodeList == null ? 43 : ((Object)$erpCodeList).hashCode());
        List<String> $barCodeList = this.getBarCodeList();
        result = result * 59 + ($barCodeList == null ? 43 : ((Object)$barCodeList).hashCode());
        String $mnemonicCode = this.getMnemonicCode();
        result = result * 59 + ($mnemonicCode == null ? 43 : $mnemonicCode.hashCode());
        String $modelDescription = this.getModelDescription();
        result = result * 59 + ($modelDescription == null ? 43 : $modelDescription.hashCode());
        List<String> $skuMd5KeyList = this.getSkuMd5KeyList();
        result = result * 59 + ($skuMd5KeyList == null ? 43 : ((Object)$skuMd5KeyList).hashCode());
        SkuTagQryDTO $skuTagQry = this.getSkuTagQry();
        result = result * 59 + ($skuTagQry == null ? 43 : ((Object)$skuTagQry).hashCode());
        Map<String, Object> $productSkuCharacterDefFuzzy = this.getProductSkuCharacterDefFuzzy();
        result = result * 59 + ($productSkuCharacterDefFuzzy == null ? 43 : ((Object)$productSkuCharacterDefFuzzy).hashCode());
        Map<String, Object> $skuFreeCharacterFuzzy = this.getSkuFreeCharacterFuzzy();
        result = result * 59 + ($skuFreeCharacterFuzzy == null ? 43 : ((Object)$skuFreeCharacterFuzzy).hashCode());
        String $nameOrCodeOrBarCodeFuzzy = this.getNameOrCodeOrBarCodeFuzzy();
        result = result * 59 + ($nameOrCodeOrBarCodeFuzzy == null ? 43 : $nameOrCodeOrBarCodeFuzzy.hashCode());
        Date $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : ((Object)$pubts).hashCode());
        Date $lastUpdate = this.getLastUpdate();
        result = result * 59 + ($lastUpdate == null ? 43 : ((Object)$lastUpdate).hashCode());
        Map<String, Object> $productSkuCharacterDef = this.getProductSkuCharacterDef();
        result = result * 59 + ($productSkuCharacterDef == null ? 43 : ((Object)$productSkuCharacterDef).hashCode());
        Map<String, Object> $skuFreeCharacter = this.getSkuFreeCharacter();
        result = result * 59 + ($skuFreeCharacter == null ? 43 : ((Object)$skuFreeCharacter).hashCode());
        Map<String, Object> $skuPropCharacter = this.getSkuPropCharacter();
        result = result * 59 + ($skuPropCharacter == null ? 43 : ((Object)$skuPropCharacter).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ProductSkuQryDTO(fields=" + Arrays.deepToString(this.getFields()) + ", id=" + this.getId() + ", idList=" + this.getIdList() + ", code=" + this.getCode() + ", codeList=" + this.getCodeList() + ", productIdList=" + this.getProductIdList() + ", productapplyIdList=" + this.getProductapplyIdList() + ", productCode=" + this.getProductCode() + ", productCodeList=" + this.getProductCodeList() + ", productName=" + this.getProductName() + ", productNameList=" + this.getProductNameList() + ", shortName=" + this.getShortName() + ", orgId=" + this.getOrgId() + ", orgIdList=" + this.getOrgIdList() + ", orgIdStrList=" + this.getOrgIdStrList() + ", productClassIdList=" + this.getProductClassIdList() + ", managerClassIdList=" + this.getManagerClassIdList() + ", manageClassCode=" + this.getManageClassCode() + ", managerClassCodeList=" + this.getManagerClassCodeList() + ", stopStatus=" + this.getStopStatus() + ", shopId=" + this.getShopId() + ", erpCode=" + this.getErpCode() + ", erpCodeList=" + this.getErpCodeList() + ", barCodeList=" + this.getBarCodeList() + ", mnemonicCode=" + this.getMnemonicCode() + ", modelDescription=" + this.getModelDescription() + ", defaultSKU=" + this.getDefaultSKU() + ", skuMd5KeyList=" + this.getSkuMd5KeyList() + ", skuTagQry=" + this.getSkuTagQry() + ", needTags=" + this.getNeedTags() + ", productSkuCharacterDefFuzzy=" + this.getProductSkuCharacterDefFuzzy() + ", skuFreeCharacterFuzzy=" + this.getSkuFreeCharacterFuzzy() + ", nameOrCodeOrBarCodeFuzzy=" + this.getNameOrCodeOrBarCodeFuzzy() + ", pubts=" + this.getPubts() + ", lastUpdate=" + this.getLastUpdate() + ", productSkuCharacterDef=" + this.getProductSkuCharacterDef() + ", skuFreeCharacter=" + this.getSkuFreeCharacter() + ", skuPropCharacter=" + this.getSkuPropCharacter() + ")";
    }
}

