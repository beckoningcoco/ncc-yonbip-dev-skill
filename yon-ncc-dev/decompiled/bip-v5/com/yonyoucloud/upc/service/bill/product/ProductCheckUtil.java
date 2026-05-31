/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyoucloud.upc.pc.product.OptionalTypeEnum
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.RealProductAttributeEnum
 *  com.yonyoucloud.upc.pc.product.RealProductAttributeTypeEnum
 *  com.yonyoucloud.upc.pc.product.VirtualProductAttributeEnum
 *  org.apache.commons.lang3.ObjectUtils
 *  org.imeta.orm.base.BizObject
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.bill.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyoucloud.upc.pc.product.OptionalTypeEnum;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.RealProductAttributeEnum;
import com.yonyoucloud.upc.pc.product.RealProductAttributeTypeEnum;
import com.yonyoucloud.upc.pc.product.VirtualProductAttributeEnum;
import com.yonyoucloud.upc.service.bill.BillBusinessHandleDTO;
import java.text.MessageFormat;
import java.util.Objects;
import org.apache.commons.lang3.ObjectUtils;
import org.imeta.orm.base.BizObject;
import org.springframework.stereotype.Service;

@Service
public class ProductCheckUtil {
    public static void checkProductAttributeForInsert(Product product) throws Exception {
        ProductCheckUtil.checkProductProperties(product);
        ProductCheckUtil.checkRealProductAttr(product);
        ProductCheckUtil.checkVirtualProductAttr(product);
    }

    public static void checkProductAttributeForUpdate(BillBusinessHandleDTO checkDto) throws Exception {
        if (!Objects.isNull(checkDto.getData())) {
            Product product = (Product)checkDto.getData();
            BizObject productInDB = checkDto.getDataInDB();
            if (ProductCheckUtil.isModifyFieldValue((BizObject)product, "realProductAttribute", product.get("realProductAttribute"), productInDB.get("realProductAttribute"))) {
                ProductCheckUtil.checkProductProperties(product);
            }
            if (ProductCheckUtil.isModifyFieldValue((BizObject)product, "realProductAttributeType", product.get("realProductAttributeType"), productInDB.get("realProductAttributeType"))) {
                ProductCheckUtil.checkRealProductAttr(product);
            }
            if (ProductCheckUtil.isModifyFieldValue((BizObject)product, "virtualProductAttribute", product.get("virtualProductAttribute"), productInDB.get("virtualProductAttribute"))) {
                ProductCheckUtil.checkVirtualProductAttr(product);
            }
        }
    }

    private static void checkVirtualProductAttr(Product product) {
        if (product.get("virtualProductAttribute") != null) {
            if (VirtualProductAttributeEnum.GiftCard.getValue().equals(product.get("virtualProductAttribute").toString())) {
                if (product.get("giftCardId") == null && product.get("giftCardId_Code") == null && product.get("giftCardId_Name") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800545);
                }
                if (product.get("couponId") != null || product.get("couponId_Code") != null || product.get("couponId_Name") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800546);
                }
            } else if (VirtualProductAttributeEnum.Coupon.getValue().equals(product.get("virtualProductAttribute").toString())) {
                if (product.get("couponId") == null && product.get("couponId_Code") == null && product.get("couponId_Name") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800547);
                }
                if (product.get("giftCardId") != null || product.get("giftCardId_Code") != null || product.get("giftCardId_Name") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800548);
                }
            }
        }
    }

    private static void checkRealProductAttr(Product product) {
        if (product.get("realProductAttributeType") != null) {
            if (RealProductAttributeEnum.Coupon.getValue().equals(product.get("realProductAttributeType").toString()) && product.get("couponId") == null && product.get("couponId_Code") == null && product.get("couponId_Name") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800543);
            }
            if (!(RealProductAttributeEnum.Coupon.getValue().equals(product.get("realProductAttributeType").toString()) || product.get("couponId") == null && product.get("couponId_Code") == null && product.get("couponId_Name") == null)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800544);
            }
        }
    }

    private static void checkProductProperties(Product product) {
        if (product.get("realProductAttribute") != null) {
            if (RealProductAttributeTypeEnum.PhysicalMaterials.getValue().equals(product.get("realProductAttribute").toString())) {
                if (product.get("realProductAttributeType") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800538);
                }
                if (product.get("virtualProductAttribute") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800539);
                }
                if (product.get("giftCardId") != null || product.get("giftCardId_Code") != null || product.get("giftCardId_Name") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800540);
                }
            } else if (RealProductAttributeTypeEnum.VirtualMaterials.getValue().equals(product.get("realProductAttribute").toString())) {
                if (product.get("virtualProductAttribute") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800541);
                }
                if (product.get("realProductAttributeType") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800542);
                }
            }
        }
    }

    public static void checkOptionBusinessForInsert(Product product, Product optionalMaterial) throws Exception {
        if (BooleanUtil.isTrue((Object)product.get("isOptionalMaterial")) && OptionalTypeEnum.CHARACTER_OPTION.getValue().equals(product.getOptionalType()) && product.getProductTemplate() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800536);
        }
        if (BooleanUtil.isTrue((Object)product.get("isDerivedMaterial")) && product.getOptionalMaterialId() != null && ObjectUtils.isNotEmpty((Object)optionalMaterial) && !OptionalTypeEnum.CHARACTER_OPTION.getValue().equals(optionalMaterial.getOptionalType())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800537);
        }
    }

    public static void checkWeightVolumeForInsert(Product product) {
        if (product.get("weight") != null && product.get("weightUnit") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800594);
        }
        if (product.get("volume") != null && product.get("volumeUnit") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800595);
        }
        if (product.get("netWeight") != null && product.get("netWeightUnit") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800596);
        }
    }

    public static void checkWeightVolumeForUpdate(BillBusinessHandleDTO businessHandleDTO) {
    }

    public static boolean areEqual(Object value1, Object value2) {
        if (value1 == null && value2 == null) {
            return true;
        }
        if (value1 == null || value2 == null) {
            return false;
        }
        return value1.toString().equals(value2.toString());
    }

    public static boolean isModifyFieldValue(BizObject product, String field, Object value1, Object value2) {
        return product.containsKey((Object)field) && !ProductCheckUtil.areEqual(value1, value2);
    }

    public static String buildErrorMsg(String uniqueKey, String errMsg) {
        return MessageFormat.format("\u7269\u6599[{0}]\uff0c{1}", uniqueKey, errMsg);
    }
}

