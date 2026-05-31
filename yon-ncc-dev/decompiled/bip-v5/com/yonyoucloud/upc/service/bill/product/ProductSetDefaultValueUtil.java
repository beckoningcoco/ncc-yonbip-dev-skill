/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyoucloud.upc.pc.product.AssistUnitType
 *  com.yonyoucloud.upc.pc.product.BusinessAttributeEnum
 *  com.yonyoucloud.upc.pc.product.DeliveryMethodEnum
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange
 *  com.yonyoucloud.upc.pc.product.ProductExtend
 *  com.yonyoucloud.upc.pc.product.RealProductAttributeEnum
 *  com.yonyoucloud.upc.pc.product.RealProductAttributeTypeEnum
 *  com.yonyoucloud.upc.pc.product.UnitExchangeType
 *  com.yonyoucloud.upc.pc.product.UnitUseTypeEnum
 *  com.yonyoucloud.upc.pc.product.VirtualProductAttributeEnum
 *  org.apache.commons.lang3.ObjectUtils
 */
package com.yonyoucloud.upc.service.bill.product;

import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyoucloud.upc.pc.product.AssistUnitType;
import com.yonyoucloud.upc.pc.product.BusinessAttributeEnum;
import com.yonyoucloud.upc.pc.product.DeliveryMethodEnum;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange;
import com.yonyoucloud.upc.pc.product.ProductExtend;
import com.yonyoucloud.upc.pc.product.RealProductAttributeEnum;
import com.yonyoucloud.upc.pc.product.RealProductAttributeTypeEnum;
import com.yonyoucloud.upc.pc.product.UnitExchangeType;
import com.yonyoucloud.upc.pc.product.UnitUseTypeEnum;
import com.yonyoucloud.upc.pc.product.VirtualProductAttributeEnum;
import java.math.BigDecimal;
import org.apache.commons.lang3.ObjectUtils;

public class ProductSetDefaultValueUtil {
    public static void setProductAttribute(Product product) {
        ProductExtend detail;
        if (RealProductAttributeTypeEnum.PhysicalMaterials.getValue().equals(String.valueOf(product.getRealProductAttribute())) && product.getRealProductAttributeType() == null) {
            product.setRealProductAttributeType(Integer.valueOf(Integer.parseInt(RealProductAttributeEnum.Common.getValue())));
        } else if (RealProductAttributeTypeEnum.VirtualMaterials.getValue().equals(String.valueOf(product.getRealProductAttribute())) && product.getVirtualProductAttribute() == null) {
            product.setVirtualProductAttribute(Integer.valueOf(Integer.parseInt(VirtualProductAttributeEnum.Service.getValue())));
        }
        if (product.detail() != null && (detail = product.detail()).getBusinessAttribute() == null) {
            detail.setBusinessAttribute("1,7");
        }
    }

    public static void setAssistUnit(Product product, boolean isOpenNultiFloat) {
        if (UnitUseTypeEnum.USE_PRODUCT.getValue() == product.getUnitUseType().shortValue()) {
            ProductExtend detail;
            if (product.getEnableAssistUnit() == null) {
                product.setEnableAssistUnit(Boolean.valueOf(false));
            }
            if (ProductSetDefaultValueUtil.hasBusinessUnitIsNull(detail = product.detail()) && product.getUnit() != null) {
                Long businessUnitDefaultValue = product.getUnit();
                if (!isOpenNultiFloat && ProductSetDefaultValueUtil.enableFloatingAssistUnit(product)) {
                    businessUnitDefaultValue = ((ProductAssistUnitExchange)product.productAssistUnitExchanges().get(0)).getAssistUnit();
                }
                for (AssistUnitType unitType : AssistUnitType.values()) {
                    if (detail.get(unitType.toString()) != null) continue;
                    if (AssistUnitType.offlineUnit.equals((Object)unitType) || AssistUnitType.batchPriceUnit.equals((Object)unitType) || AssistUnitType.purchasePriceUnit.equals((Object)unitType)) {
                        detail.put(unitType.toString(), (Object)product.getUnit());
                        continue;
                    }
                    detail.put(unitType.toString(), (Object)businessUnitDefaultValue);
                }
            }
            if (ObjectUtils.isNotEmpty((Object)product.productAssistUnitExchanges())) {
                for (ProductAssistUnitExchange assistUnitExchange : product.productAssistUnitExchanges()) {
                    Object mainUnitCount;
                    if (assistUnitExchange == null || assistUnitExchange.getMainUnitCountNew() != null || null == (mainUnitCount = assistUnitExchange.get("mainUnitCount"))) continue;
                    assistUnitExchange.setMainUnitCountNew(new BigDecimal(mainUnitCount.toString()));
                }
            }
        }
    }

    private static void setSaleChannel(Product product) {
        ProductExtend detail = product.detail();
        if (detail != null && detail.getSaleChannel() == null && detail.getBusinessAttribute() != null && detail.getBusinessAttribute().contains(String.valueOf(BusinessAttributeEnum.SALE.getValue()))) {
            if (product.getRealProductAttributeType() != null) {
                if (Integer.valueOf(RealProductAttributeEnum.Common.getValue()).equals(product.getRealProductAttributeType())) {
                    detail.setSaleChannel("1,2,3");
                } else if (Integer.valueOf(RealProductAttributeEnum.Coupon.getValue()).equals(product.getRealProductAttributeType())) {
                    detail.setSaleChannel("1,3");
                } else if (Integer.valueOf(RealProductAttributeEnum.CardStored.getValue()).equals(product.getRealProductAttributeType())) {
                    detail.setSaleChannel("3");
                } else if (Integer.valueOf(RealProductAttributeEnum.Equipment.getValue()).equals(product.getRealProductAttributeType())) {
                    detail.setSaleChannel("1");
                }
            } else if (product.getVirtualProductAttribute() != null) {
                if (Integer.valueOf(VirtualProductAttributeEnum.Service.getValue()).equals(product.getVirtualProductAttribute()) || Integer.valueOf(VirtualProductAttributeEnum.Other.getValue()).equals(product.getVirtualProductAttribute()) || Integer.valueOf(VirtualProductAttributeEnum.PTO.getValue()).equals(product.getVirtualProductAttribute())) {
                    detail.setSaleChannel("1,2,3");
                } else if (Integer.valueOf(VirtualProductAttributeEnum.Virtual.getValue()).equals(product.getVirtualProductAttribute())) {
                    detail.setSaleChannel("1");
                } else if (Integer.valueOf(VirtualProductAttributeEnum.Coupon.getValue()).equals(product.getVirtualProductAttribute()) || Integer.valueOf(VirtualProductAttributeEnum.CardStored.getValue()).equals(product.getVirtualProductAttribute()) || Integer.valueOf(VirtualProductAttributeEnum.Package.getValue()).equals(product.getVirtualProductAttribute())) {
                    detail.setSaleChannel("2,3");
                } else if (Integer.valueOf(VirtualProductAttributeEnum.GiftCard.getValue()).equals(product.getVirtualProductAttribute())) {
                    detail.setSaleChannel("2");
                } else if (Integer.valueOf(VirtualProductAttributeEnum.TaoJian.getValue()).equals(product.getVirtualProductAttribute())) {
                    detail.setSaleChannel("1,2");
                }
            }
        }
    }

    private static boolean hasBusinessUnitIsNull(ProductExtend detail) {
        if (detail != null) {
            for (AssistUnitType unitType : AssistUnitType.values()) {
                if (detail.get(unitType.toString()) != null) continue;
                return true;
            }
        }
        return false;
    }

    private static boolean enableFloatingAssistUnit(Product product) {
        return BooleanUtil.isTrue((Object)product.getEnableAssistUnit()) && ObjectUtils.isNotEmpty((Object)product.productAssistUnitExchanges()) && product.productAssistUnitExchanges().size() == 1 && product.productAssistUnitExchanges().get(0) != null && UnitExchangeType.floating.equals((Object)((ProductAssistUnitExchange)product.productAssistUnitExchanges().get(0)).getUnitExchangeType());
    }

    public static void setInspection(Product product) {
        if (product.detail() != null) {
            ProductExtend detail = product.detail();
            if (detail.getInspectionType() == null) {
                detail.setInspectionType(Integer.valueOf(0));
            }
            if (detail.getInspectionControlPoint() == null && detail.getInspectionType() == 1) {
                detail.setInspectionControlPoint(Integer.valueOf(0));
            }
            if (detail.getProductInspection() == null) {
                detail.setProductIInspection(Integer.valueOf(0));
            }
            if (detail.getProductInspectionCtrlPoint() == null && detail.getProductInspection() == 1) {
                detail.setProductInspectionCtrlPoint(Integer.valueOf(0));
            }
            if (detail.getOutSourceInspection() == null) {
                detail.setOutSourceInspection(Integer.valueOf(0));
            }
            if (detail.getTransferInspection() == null) {
                detail.setTransferInspection(Integer.valueOf(0));
            }
            if (detail.getProductFirstInspection() == null) {
                detail.setProductFirstInspection(Integer.valueOf(0));
            }
        }
    }

    public static void setDistributionManagement(Product product) {
        ProductExtend detail;
        if (product.detail() != null && !(detail = product.detail()).containsKey((Object)"deliveryMethod")) {
            detail.put("deliveryMethod", (Object)DeliveryMethodEnum.getValuesAsString((DeliveryMethodEnum[])new DeliveryMethodEnum[]{DeliveryMethodEnum.PICKED_UP_IN_STORED, DeliveryMethodEnum.STORE_DELIVERY, DeliveryMethodEnum.EXPRESS_LOGISTIC}));
        }
    }
}

