/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.basedoc.common.beans.ResultPager
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.customerdoc.service.dto.CustDocDTO
 *  com.yonyou.iuap.customerdoc.service.itf.ICustomerDocApiService
 *  com.yonyou.iuap.fileservice.sdk.module.CooperationFileService
 *  com.yonyou.iuap.ml.provider.ILanguageProvider
 *  com.yonyou.iuap.ml.vo.LanguageVO
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.QueryPagerVo
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyou.ucf.transtype.model.BdTransType
 *  com.yonyoucloud.iuap.upc.api.IUnitService
 *  com.yonyoucloud.iuap.upc.dto.UnitDTO
 *  com.yonyoucloud.upc.common.enums.StrategyComparisonRuleEnum
 *  com.yonyoucloud.upc.common.enums.ValueManageTypeEnum
 *  com.yonyoucloud.upc.pc.product.BusinessAttributeEnum
 *  com.yonyoucloud.upc.pc.product.ManufacturePlanMethod
 *  com.yonyoucloud.upc.pc.product.OptionalTypeEnum
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange
 *  com.yonyoucloud.upc.pc.product.ProductDepositTimeExtend
 *  com.yonyoucloud.upc.pc.product.ProductExtend
 *  com.yonyoucloud.upc.pc.product.RealProductAttributeTypeEnum
 *  com.yonyoucloud.upc.pc.product.VirtualProductAttributeEnum
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  com.yonyoucloud.upc.pc.tpl.ProductTpl
 *  com.yonyoucloud.upc.pc.userdef.UserDefClassMapEnum
 *  com.yonyoucloud.upc.utils.NumberCheckUtil
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.basedoc.common.beans.ResultPager;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.customerdoc.service.dto.CustDocDTO;
import com.yonyou.iuap.customerdoc.service.itf.ICustomerDocApiService;
import com.yonyou.iuap.fileservice.sdk.module.CooperationFileService;
import com.yonyou.iuap.ml.provider.ILanguageProvider;
import com.yonyou.iuap.ml.vo.LanguageVO;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.QueryPagerVo;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyou.ucf.transtype.model.BdTransType;
import com.yonyoucloud.iuap.upc.api.IUnitService;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.iuap.upc.dto.UnitDTO;
import com.yonyoucloud.upc.common.enums.StrategyComparisonRuleEnum;
import com.yonyoucloud.upc.common.enums.ValueManageTypeEnum;
import com.yonyoucloud.upc.pc.product.BusinessAttributeEnum;
import com.yonyoucloud.upc.pc.product.ManufacturePlanMethod;
import com.yonyoucloud.upc.pc.product.OptionalTypeEnum;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange;
import com.yonyoucloud.upc.pc.product.ProductDepositTimeExtend;
import com.yonyoucloud.upc.pc.product.ProductExtend;
import com.yonyoucloud.upc.pc.product.RealProductAttributeTypeEnum;
import com.yonyoucloud.upc.pc.product.VirtualProductAttributeEnum;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.pc.tpl.ProductTpl;
import com.yonyoucloud.upc.pc.userdef.UserDefClassMapEnum;
import com.yonyoucloud.upc.service.CoredocTransTypeService;
import com.yonyoucloud.upc.service.ProductDefaultValueService;
import com.yonyoucloud.upc.service.ProductReferenceCheckService;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.service.productapply.ProductApplyCheckService;
import com.yonyoucloud.upc.service.utils.OrgPermissionsUtil;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.NumberCheckUtil;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service(value="productCheckService")
public class ProductCheckService {
    private static final Logger log = LoggerFactory.getLogger(ProductCheckService.class);
    @Autowired
    ICustomerDocApiService customerDocApiService;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    CoredocTransTypeService coredocTransTypeService;
    @Autowired
    CooperationFileService cooperationFileService;
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    ProductApplyCheckService productApplyCheckService;
    @Autowired
    ILanguageProvider languageProvider;
    @Autowired
    IUnitService unitService;
    @Autowired
    ProductReferenceCheckService productReferenceCheckService;
    @Autowired
    private OrgPermissionsUtil orgPermissionsUtil;
    @Autowired
    private ProductDefaultValueService productDefaultValueService;
    static final Map<String, String> decimalFieldForCommonCheck = new HashMap<String, String>();
    static final List<String> REPEAT_CHECK_FIELD;
    static final Map<String, String> REPEAT_COLUMN_MAP;

    public void commonCheck(Product product) {
        if (product == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800591);
        }
        if (product.get("realProductAttribute") != null) {
            if ("1".equals(product.get("realProductAttribute").toString())) {
                if (product.get("realProductAttributeType") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800538);
                }
                if (product.get("virtualProductAttribute") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800539);
                }
                if (product.get("giftCardId") != null || product.get("giftCardId_Code") != null || product.get("giftCardId_Name") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800540);
                }
            } else if ("2".equals(product.get("realProductAttribute").toString())) {
                if (product.get("virtualProductAttribute") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800541);
                }
                if (product.get("realProductAttributeType") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800542);
                }
            }
        }
        if (product.get("realProductAttributeType") != null) {
            if ("2".equals(product.get("realProductAttributeType").toString()) && product.get("couponId") == null && product.get("couponId_Code") == null && product.get("couponId_Name") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800543);
            }
            if (!("2".equals(product.get("realProductAttributeType").toString()) || product.get("couponId") == null && product.get("couponId_Code") == null && product.get("couponId_Name") == null)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800544);
            }
        }
        if (product.get("virtualProductAttribute") != null) {
            if ("2".equals(product.get("virtualProductAttribute").toString())) {
                if (product.get("giftCardId") == null && product.get("giftCardId_Code") == null && product.get("giftCardId_Name") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800545);
                }
                if (product.get("couponId") != null || product.get("couponId_Code") != null || product.get("couponId_Name") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800546);
                }
            } else if ("3".equals(product.get("virtualProductAttribute").toString())) {
                if (product.get("couponId") == null && product.get("couponId_Code") == null && product.get("couponId_Name") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800547);
                }
                if (product.get("giftCardId") != null || product.get("giftCardId_Code") != null || product.get("giftCardId_Name") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800548);
                }
            }
        }
        if (product.get("unitUseType") != null) {
            if ("1".equals(product.get("unitUseType").toString()) && product.get("productTemplate") == null && product.get("productTemplate_Name") == null && product.get("productTemplate_Code") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800566);
            }
            if ("2".equals(product.get("unitUseType").toString()) && product.get("unit") == null && product.get("unit_Name") == null && product.get("unit_Code") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800567);
            }
        }
        if (product.get("enableAssistUnit") != null && Boolean.parseBoolean(product.get("enableAssistUnit").toString())) {
            if (product.get("productAssistUnitExchanges") == null && "2".equals(product.get("unitUseType").toString())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800592);
            }
        } else if (product.get("productAssistUnitExchanges") != null && ((List)product.get("productAssistUnitExchanges")).size() > 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800593);
        }
        if (product.get("weight") != null && product.get("weightUnit_Name") == null && product.get("weightUnit") == null && product.get("weightUnit_Code") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800594);
        }
        if (product.get("volume") != null && product.get("volumeUnit_Name") == null && product.get("volumeUnit") == null && product.get("volumeUnit_Code") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800595);
        }
        if (product.get("netWeight") != null && product.get("netWeightUnit_Name") == null && product.get("netWeightUnit") == null && product.get("netWeightUnit_Code") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800596);
        }
        if (product.get("productTemplate") == null && product.get("productTemplate_Name") == null && product.get("productTemplate_Code") == null && product.get("productCheckFrees") != null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800597);
        }
        if (product.get("transType") == null && product.get("transType_Code") == null && product.get("transType_Name") == null && product.get("materialStatus") != null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800598);
        }
        if (product.detail() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800600);
        }
        this.commonCheckForProductDetail(product);
        this.checkDecimalForCommonCheck(product.detail());
        if (product.time() != null) {
            ProductDepositTimeExtend time = product.time();
            if (time.get("ControlTimeType") != null) {
                if ("1".equals(time.get("ControlTimeType").toString()) && (time.get("dStartDate") != null || time.get("dEndDate") != null)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800601);
                }
            } else if (time.get("dStartDate") != null || time.get("dEndDate") != null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800602);
            }
            if (time.getIControlTime() != null) {
                if (!Boolean.parseBoolean(time.getIControlTime().toString())) {
                    if (time.get("dStartDate") != null || time.get("dEndDate") != null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800603);
                    }
                    if (time.get("RelativeDate") != null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800604);
                    }
                    if (time.get("durationDate") != null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800605);
                    }
                }
            } else {
                if (time.get("dStartDate") != null || time.get("dEndDate") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800606);
                }
                if (time.get("RelativeDate") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800607);
                }
                if (time.get("durationDate") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800608);
                }
            }
        }
    }

    public void commonCheckForImport(Product product) {
        if (product == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800591);
        }
        if (product.get("weight") != null && product.get("weightUnit_Name") == null && product.get("weightUnit") == null && product.get("weightUnit_Code") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800594);
        }
        if (product.get("volume") != null && product.get("volumeUnit_Name") == null && product.get("volumeUnit") == null && product.get("volumeUnit_Code") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800595);
        }
        if (product.get("netWeight") != null && product.get("netWeightUnit_Name") == null && product.get("netWeightUnit") == null && product.get("netWeightUnit_Code") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800596);
        }
        if (product.get("productTemplate") == null && product.get("productTemplate_Name") == null && product.get("productTemplate_Code") == null && ObjectUtils.isNotEmpty((Object)product.get("productCheckFrees"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800597);
        }
        if (product.get("transType") == null && product.get("transType_Code") == null && product.get("transType_Name") == null && product.get("materialStatus") != null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800598);
        }
        if (product.detail() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800600);
        }
        this.commonCheckForProductDetail(product);
        this.checkDecimalForCommonCheck(product.detail());
        if (product.time() != null) {
            ProductDepositTimeExtend time = product.time();
            if (time.get("ControlTimeType") != null) {
                if ("1".equals(time.get("ControlTimeType").toString()) && (time.get("dStartDate") != null || time.get("dEndDate") != null)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800601);
                }
            } else if (time.get("dStartDate") != null || time.get("dEndDate") != null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800602);
            }
            if (time.getIControlTime() != null) {
                if (!Boolean.parseBoolean(time.getIControlTime().toString())) {
                    if (time.get("dStartDate") != null || time.get("dEndDate") != null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800603);
                    }
                    if (time.get("RelativeDate") != null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800604);
                    }
                    if (time.get("durationDate") != null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800605);
                    }
                }
            } else {
                if (time.get("dStartDate") != null || time.get("dEndDate") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800606);
                }
                if (time.get("RelativeDate") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800607);
                }
                if (time.get("durationDate") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800608);
                }
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void commonCheckForProductDetail(Product product) {
        ProductExtend productDetail = product.detail();
        if (("1751963021784645639".equals(product.get("transType")) || "system_001".equals(this.getRefFieldValue((BizObject)product, "transType_Code", false)) || "\u8d39\u7528\u7c7b\u7269\u6599".equals(this.getRefFieldValue((BizObject)product, "transType_Name", true))) && Objects.isNull(productDetail.get("costItems")) && Objects.isNull(productDetail.get("costItems_Code")) && Objects.isNull(productDetail.get("costItems_Name"))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800599);
        }
        if (product.get("useSku") != null && UPCConstants.ISSKU_DEFAULT.toString().equals(product.get("useSku").toString()) && StringUtils.isNotEmpty((CharSequence)((CharSequence)productDetail.get("saleChannel")))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800609);
        }
        if (product.get("realProductAttributeType") != null) {
            if ("2".equals(product.get("realProductAttributeType").toString())) {
                if (productDetail.get("saleChannel") == null) throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800610);
                if (!productDetail.get("saleChannel").toString().contains("1")) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800610);
                }
            }
            if (productDetail.get("saleChannel") != null) {
                if ("3".equals(product.get("realProductAttributeType").toString()) && productDetail.get("saleChannel").toString().contains("1")) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800611);
                }
                if ("4".equals(product.get("realProductAttributeType").toString()) && (productDetail.get("saleChannel").toString().contains("2") || productDetail.get("saleChannel").toString().contains("4"))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800612);
                }
                if ("20".equals(product.get("realProductAttributeType").toString()) && (productDetail.get("saleChannel").toString().contains("2") || productDetail.get("saleChannel").toString().contains("4"))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800613);
                }
            }
        }
        if (product.get("virtualProductAttribute") != null && productDetail.get("saleChannel") != null) {
            if ("2".equals(product.get("virtualProductAttribute").toString()) && (productDetail.get("saleChannel").toString().contains("1") || productDetail.get("saleChannel").toString().contains("3"))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800614);
            }
            if ("10".equals(product.get("virtualProductAttribute").toString()) && (productDetail.get("saleChannel").toString().contains("2") || productDetail.get("saleChannel").toString().contains("3") || productDetail.get("saleChannel").toString().contains("4"))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800615);
            }
            if (VirtualProductAttributeEnum.CardStored.getValue().equals(product.get("virtualProductAttribute").toString()) && productDetail.get("saleChannel").toString().contains("1")) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800617);
            }
        }
        if (product.get("transType_Name") != null && "system_001".equals(product.get("transType_Name").toString()) && productDetail.get("costItems_Name") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800618);
        }
        if (productDetail.get("batchRule") != null && productDetail.get("batchRule").toString().contains("10") && productDetail.get("fixedQuantity") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800619);
        }
        if (productDetail.get("demandConsolidation") != null && "5".equals(productDetail.get("demandConsolidation").toString())) {
            if (productDetail.get("demandConsolidationType") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800620);
            }
            if (productDetail.get("demandConsolidationUnit") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800621);
            }
            if (productDetail.get("demandConsolidationNumber") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800622);
            }
            if (productDetail.get("demandConsolidationDateType") == null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.DEMAND_CONSOLIDATION_DATE_TYPE_IS_NULL);
            }
        }
        if (productDetail.get("isExpiryDateManage") != null) {
            if (Boolean.parseBoolean(productDetail.get("isExpiryDateManage").toString())) {
                if (productDetail.get("isBatchManage") == null || !Boolean.parseBoolean(productDetail.get("isBatchManage").toString())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800623);
                }
                if (productDetail.get("isExpiryDateCalculationMethod") == null) throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800626);
                if (!"2".equals(productDetail.get("isExpiryDateCalculationMethod").toString())) {
                    if (productDetail.get("expireDateNo") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800624);
                    }
                    if (productDetail.get("expireDateUnit") == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800625);
                    }
                }
            } else {
                if (productDetail.get("isExpiryDateCalculationMethod") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800627);
                }
                if (productDetail.get("isExpiryDateCalculationMethod") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800627);
                }
                if (productDetail.get("daysBeforeValidityReject") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800628);
                }
                if (productDetail.get("validityWarningDays") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800629);
                }
            }
        }
        if (productDetail.get("receiptModel") != null && ProductUtil.beyondLength(productDetail.get("receiptModel"), 50)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800630);
        }
        if (productDetail.get("receiptSpec") != null && ProductUtil.beyondLength(productDetail.get("receiptSpec"), 50)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800631);
        }
        if (productDetail.get("depositDealPayType") != null) {
            if ("0".equals(productDetail.get("depositDealPayType").toString()) && productDetail.get("depositPercentage") != null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800632);
            }
            if ("1".equals(productDetail.get("depositDealPayType").toString()) && productDetail.get("deposits") != null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800633);
            }
        } else if (productDetail.get("depositPercentage") != null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800634);
        }
        if (productDetail.getPlanMethod() != null && "10".equals(productDetail.getPlanMethod().toString())) {
            if (productDetail.get("leadTimeCoefficient") != null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800636);
            }
            if (productDetail.get("leadTimeQuantity") != null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800637);
            }
            if (productDetail.get("lossType") != null && !"0".equals(productDetail.get("lossType").toString())) {
                throw new CoreDocBusinessException(null, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CD1071205A00007", (String)"\u5f53\u8ba1\u5212\u65b9\u6cd5\u4e3a\u5e93\u5b58\u8ba1\u5212\u65f6\uff0c\u635f\u8017\u7c7b\u578b\u53c2\u6570\u9700\u8981\u4f20\u65e0\u635f\u8017\uff0c\u8bf7\u68c0\u67e5\uff01\uff01\uff01"));
            }
        }
        if (productDetail.get("inspectionType") != null) {
            if (productDetail.get("inspectionType").equals(0) && productDetail.getWarehousingByResult() != null && productDetail.getWarehousingByResult().equals(true)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800642);
            }
        } else if (productDetail.get("warehousingByResult") != null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800643);
        }
        if (productDetail.get("isDisplayPrice") != null) {
            if (Boolean.parseBoolean(productDetail.get("isDisplayPrice").toString()) && productDetail.get("priceAreaMessage") != null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800644);
            }
        } else if (productDetail.get("priceAreaMessage") != null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800645);
        }
        if (productDetail.get("enableStockExpireCheck") != null && "1".equals(productDetail.get("enableStockExpireCheck").toString())) {
            if (productDetail.get("effectiveLeadTime") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800646);
            }
        } else {
            if (productDetail.get("effectiveLeadTime") != null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800647);
            }
            if (productDetail.get("checkReminderLeadTime") != null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800648);
            }
        }
        if (productDetail.get("enableStockPeriodRecheck") != null && "1".equals(productDetail.get("enableStockPeriodRecheck").toString())) {
            if (productDetail.get("reviewCycle") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800649);
            }
        } else {
            if (productDetail.get("reviewCycle") != null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800650);
            }
            if (productDetail.get("recheckReminderLeadTime") != null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800651);
            }
        }
        if (productDetail.get("isProcess") != null && Boolean.parseBoolean(productDetail.get("isProcess").toString()) && productDetail.get("processType") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800652);
        }
        if (productDetail.get("isBatchManage") != null && Boolean.parseBoolean(productDetail.get("isBatchManage").toString()) && productDetail.get("processType") != null && "1".equals(productDetail.get("processType").toString())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800654);
        }
        if (product.get("transType") == null && product.get("transType_Code") == null && product.get("transType_Name") == null && productDetail.get("materialStatus") != null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800655);
        }
        if (StringUtils.isNotBlank((CharSequence)((CharSequence)productDetail.get("businessAttribute"))) && !this.checkNumbersAndCommas(productDetail.get("businessAttribute").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800656);
        }
        if (StringUtils.isNotBlank((CharSequence)((CharSequence)productDetail.get("saleChannel"))) && !this.checkNumbersAndCommas(productDetail.get("saleChannel").toString()).booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800657);
        }
        if (productDetail.get("saleStyle") != null && productDetail.get("saleStyle").toString().contains(",")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800658);
        }
        if (productDetail.containsKey((Object)"stopstatus") && productDetail.get("stopstatus") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800659);
        }
        if (productDetail.get("stopstatus") == null || !Boolean.parseBoolean(productDetail.get("stopstatus").toString()) && !"1".equals(productDetail.get("stopstatus").toString())) return;
        if (productDetail.get("iStatus") != null && (Boolean.parseBoolean(productDetail.get("iStatus").toString()) || "1".equals(productDetail.get("iStatus").toString()))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800660);
        }
        if (productDetail.get("iUOrderStatus") == null || !Boolean.parseBoolean(productDetail.get("iUOrderStatus").toString()) && !"1".equals(productDetail.get("iUOrderStatus").toString())) return;
        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800661);
    }

    public void checkDecimalForCommonCheck(ProductExtend productDetail) {
        if (decimalFieldForCommonCheck.keySet().size() > 0) {
            for (String field : decimalFieldForCommonCheck.keySet()) {
                if (productDetail.get(field) == null) continue;
                productDetail.put(field, (Object)new BigDecimal(((BigDecimal)productDetail.get(field)).stripTrailingZeros().toPlainString()));
            }
        }
        if (productDetail.get("fMarkPrice") != null && !this.checkDecimalDigits(productDetail.get("fMarkPrice").toString(), 2).booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800663);
        }
        if (productDetail.get("fSalePrice") != null && !this.checkDecimalDigits(productDetail.get("fSalePrice").toString(), 2).booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800664);
        }
        if (productDetail.get("fMarketPrice") != null && !this.checkDecimalDigits(productDetail.get("fMarketPrice").toString(), 2).booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800665);
        }
        if (productDetail.get("storageLossRate") != null && !this.checkDecimalDigits(productDetail.get("storageLossRate").toString(), 2).booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800666);
        }
        if (productDetail.get("doubleReplenish") != null && !this.checkDecimalDigits(productDetail.get("doubleReplenish").toString(), 2).booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800667);
        }
        if (productDetail.get("wastageRate") != null && !this.checkDecimalDigits(productDetail.get("wastageRate").toString(), 2).booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800668);
        }
        if (productDetail.get("fSettleAccountsRate") != null && !this.checkDecimalDigits(productDetail.get("fSettleAccountsRate").toString(), 2).booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800669);
        }
        if (productDetail.get("deposits") != null && !this.checkDecimalDigits(productDetail.get("deposits").toString(), 2).booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800670);
        }
        if (productDetail.get("depositPercentage") != null && !this.checkDecimalDigits(productDetail.get("depositPercentage").toString(), 2).booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800671);
        }
        if (productDetail.get("minimumDeposits") != null && !this.checkDecimalDigits(productDetail.get("minimumDeposits").toString(), 2).booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800672);
        }
        if (productDetail.get("fSettleAccountsRate") != null && !this.checkDecimalDigits(productDetail.get("fSettleAccountsRate").toString(), 2).booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800669);
        }
        if (productDetail.get("inStoreExcessLimit") != null && !this.checkDecimalDigits(productDetail.get("inStoreExcessLimit").toString(), 2).booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800673);
        }
        if (productDetail.get("outStoreExcessLimit") != null && !this.checkDecimalDigits(productDetail.get("outStoreExcessLimit").toString(), 2).booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800674);
        }
        if (productDetail.get("inStoreLessLimit") != null && !this.checkDecimalDigits(productDetail.get("inStoreLessLimit").toString(), 2).booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800675);
        }
        if (productDetail.get("outStoreLessLimit") != null && !this.checkDecimalDigits(productDetail.get("outStoreLessLimit").toString(), 2).booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800676);
        }
        if (productDetail.get("maximumTurnoverDays") != null && !NumberCheckUtil.isPositiveInt((Object)productDetail.get("maximumTurnoverDays").toString())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800677);
        }
    }

    private Object getRefFieldValue(BizObject data, String fieldName, boolean isPreValue) {
        if (data.get(fieldName) == null) {
            return null;
        }
        if (data.get(fieldName).toString().indexOf("##") > 0) {
            String[] value = data.get(fieldName).toString().split("##");
            return isPreValue ? value[0] : value[1];
        }
        return data.get(fieldName);
    }

    public void beforeInsertCheck(Product product) throws Exception {
        if (product == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800591);
        }
        if (product.detail() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800600);
        }
        ProductExtend productDetail = product.detail();
        this.productTemplateCheck(product, productDetail);
        this.couponIdCheck(product, productDetail);
        this.giftCardIdCheck(product, productDetail);
        this.materialStatusCheck(product, productDetail);
        this.checkAssistUnitCountPrecision(product);
    }

    private void materialStatusCheck(Product product, ProductExtend productDetail) throws Exception {
        if (product.getTransType() != null) {
            BdTransType bdTransType = this.coredocTransTypeService.getTransTypeDataById(product.getTransType());
            if (bdTransType != null && bdTransType.getExtendAttrsJson() != null) {
                Map extendAttrsMap = (Map)JSON.parseObject((String)bdTransType.getExtendAttrsJson(), HashMap.class);
                if (extendAttrsMap.get("lifeCycleTemplate") != null && !"".equals(extendAttrsMap.get("lifeCycleTemplate").toString())) {
                    product.put("lifeCycleTemplate", (Object)extendAttrsMap.get("lifeCycleTemplate").toString());
                    List<Map<String, Object>> lifeCycleDetails = this.productDefaultValueService.getMaterialStatusDataBylifeCycleTemplateId(extendAttrsMap.get("lifeCycleTemplate").toString());
                    if (!CollectionUtils.isEmpty(lifeCycleDetails)) {
                        List materialStatuIds = lifeCycleDetails.stream().map(lifeCycleDetail -> lifeCycleDetail.get("materialStatusId").toString()).collect(Collectors.toList());
                        if (product.get("materialStatus") != null && !materialStatuIds.contains(product.get("materialStatus").toString())) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800678);
                        }
                        if (productDetail.get("materialStatus") != null && !materialStatuIds.contains(productDetail.get("materialStatus").toString())) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800679);
                        }
                    } else {
                        if (product.get("materialStatus") != null) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800680);
                        }
                        if (productDetail.get("materialStatus") != null) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800681);
                        }
                    }
                } else {
                    if (product.get("materialStatus") != null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800682);
                    }
                    if (productDetail.get("materialStatus") != null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800683);
                    }
                }
            } else {
                if (product.get("materialStatus") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800682);
                }
                if (productDetail.get("materialStatus") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800683);
                }
            }
        }
    }

    private void couponIdCheck(Product product, ProductExtend productDetail) throws Exception {
        if (product.getCouponId() != null) {
            QueryConditionGroup realCouponconditiongroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)product.getCouponId())});
            QuerySchema realCouponschema = QuerySchema.create().addSelect("id,cTitle,iType,iQuantity,iElecCard").addCondition((ConditionExpression)realCouponconditiongroup);
            List mallCoupon = MetaDaoHelper.query((String)"uhybase.coupon.Coupon", (QuerySchema)realCouponschema, (String)"uhy");
            if (!CollectionUtils.isEmpty((Collection)mallCoupon)) {
                if (product.get("realProductAttributeType") != null && "2".equals(product.get("realProductAttributeType").toString())) {
                    if (!"1".equals(((Map)mallCoupon.get(0)).get("iElecCard").toString()) && Boolean.parseBoolean(((Map)mallCoupon.get(0)).get("iElecCard").toString())) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800684);
                    }
                    productDetail.put("lInventoryCount", (Object)ProductCheckService.turnBigDecimal(((Map)mallCoupon.get(0)).get("iQuantity")));
                } else if (product.get("virtualProductAttribute") != null && "3".equals(product.get("virtualProductAttribute").toString())) {
                    if (!"1".equals(((Map)mallCoupon.get(0)).get("iElecCard").toString()) && !Boolean.parseBoolean(((Map)mallCoupon.get(0)).get("iElecCard").toString())) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800685);
                    }
                    productDetail.put("lInventoryCount", (Object)ProductCheckService.turnBigDecimal(((Map)mallCoupon.get(0)).get("iQuantity")));
                }
            }
        }
    }

    private void giftCardIdCheck(Product product, ProductExtend productDetail) throws Exception {
        if (product.getGiftCardId() != null) {
            QueryConditionGroup giftCardconditiongroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)product.getGiftCardId())});
            QuerySchema giftCardschema = QuerySchema.create().addSelect("id,giftCardName,salePrice").addCondition((ConditionExpression)giftCardconditiongroup);
            List mallGiftCard = MetaDaoHelper.query((String)"pmc.giftcard.GiftCard", (QuerySchema)giftCardschema, (String)"upromotion");
            if (!CollectionUtils.isEmpty((Collection)mallGiftCard) && product.get("virtualProductAttribute") != null && "2".equals(product.get("virtualProductAttribute"))) {
                productDetail.put("fSalePrice", ((Map)mallGiftCard.get(0)).get("salePrice"));
                productDetail.put("fMarkPrice", ((Map)mallGiftCard.get(0)).get("salePrice"));
            }
        }
    }

    private void productTemplateCheck(Product product, ProductExtend productDetail) throws Exception {
        List productCheckFrees;
        List freeIds;
        if (product.getProductTemplate() != null && product.productCheckFrees() != null && !CollectionUtils.isEmpty(freeIds = (productCheckFrees = product.productCheckFrees()).stream().map(data -> data.getFreeId()).collect(Collectors.toList()))) {
            List freeInTemplates = MetaDaoHelper.query((String)"pc.tpl.ProductTplSpec", (QuerySchema)QuerySchema.create().distinct().addSelect("template,specification").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq((Object)product.getProductTemplate()), QueryCondition.name((String)"specification").in(freeIds)})));
            if (!CollectionUtils.isEmpty((Collection)freeInTemplates)) {
                Map<String, String> freeInTemplateMap = freeInTemplates.stream().collect(Collectors.toMap(x -> x.get("specification").toString(), y -> y.get("template").toString()));
                for (Long freeId : freeIds) {
                    if (freeInTemplateMap.containsKey(freeId.toString())) continue;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800686);
                }
            } else {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800686);
            }
        }
    }

    public void commonCheckForProductDetailImport(ProductExtend productDetail) throws Exception {
        if (productDetail.get("isExpiryDateCalculationMethod") != null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800690);
        }
        if (productDetail.get("expireDateNo") != null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800691);
        }
        if (productDetail.get("expireDateUnit") != null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800692);
        }
        if (productDetail.get("daysBeforeValidityReject") != null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800628);
        }
        if (productDetail.get("validityWarningDays") != null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800629);
        }
    }

    public void checkUserDefineClass(List<String> defineIds, Map<String, Object> userDefineClass, String classId) throws Exception {
        List userDefines = MetaDaoHelper.query((String)"pc.userdef.UserDefineClass", (QuerySchema)QuerySchema.create().addSelect("id,defineId,type,achiveDomain,achiveCode,achiveReturn,decimalDigits,achiveDefineCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"type").in(new Object[]{"ReferArchive", "CustArchive", "Double"}), QueryCondition.name((String)"classId").eq((Object)classId), QueryCondition.name((String)"defineId").in(defineIds)})));
        if (!CollectionUtils.isEmpty((Collection)userDefines)) {
            BillDataDto bill = new BillDataDto();
            Map<String, List<Map>> userDefineMap = userDefines.stream().collect(Collectors.groupingBy(data -> data.get("defineId").toString()));
            CustDocDTO custDocDTO = this.initCustDocDTO();
            for (String defineId : defineIds) {
                Boolean checkDecimal;
                if (!userDefineMap.containsKey(defineId)) continue;
                Map userDefine = userDefineMap.get(defineId).get(0);
                final String value = userDefineClass.get(UserDefClassMapEnum.findName((String)defineId)).toString();
                if ("ReferArchive".equals(userDefine.get("type").toString())) {
                    String refCode = userDefine.get("achiveDomain") + "." + userDefine.get("achiveCode");
                    bill = userDefine.get("achiveReturn") == null ? this.initBillDataDto("code", value, refCode) : this.initBillDataDto(userDefine.get("achiveReturn").toString(), value, refCode);
                    Pager result = (Pager)BillBiz.getRefData((BillDataDto)bill);
                    if (!CollectionUtils.isEmpty((Collection)result.getRecordList())) continue;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800693);
                }
                if ("CustArchive".equals(userDefine.get("type").toString())) {
                    ResultPager result;
                    custDocDTO.setCustDocDefCode(userDefine.get("achiveDefineCode").toString());
                    if (userDefine.get("achiveReturn") != null && "code".equals(userDefine.get("achiveReturn").toString())) {
                        custDocDTO.setCodes((List)new ArrayList<String>(){
                            {
                                this.add(value);
                            }
                        });
                        custDocDTO.setName(null);
                    } else {
                        custDocDTO.setName(value);
                        custDocDTO.setCodes(null);
                    }
                    if (!CollectionUtils.isEmpty((Collection)(result = this.customerDocApiService.queryByCondition(custDocDTO)).getRecordList())) continue;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800693);
                }
                if (!"Double".equals(userDefine.get("type").toString()) || (checkDecimal = this.checkDecimalDigitsForUserDefine(value, Integer.parseInt(userDefine.get("decimalDigits").toString()))).booleanValue()) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800694);
            }
        }
    }

    private BillDataDto initBillDataDto(String field, String value, String refCode) {
        BillDataDto bill = new BillDataDto();
        QueryPagerVo page = new QueryPagerVo();
        page.setPageIndex(1);
        page.setPageSize(20);
        bill.setPage(page);
        FilterVO condition = new FilterVO();
        SimpleFilterVO simpleFilterVO = new SimpleFilterVO();
        simpleFilterVO.setOp("eq");
        simpleFilterVO.setField(field);
        simpleFilterVO.setValue1((Object)value);
        condition.setSimpleVOs(new SimpleFilterVO[]{simpleFilterVO});
        condition.setIsExtend(true);
        bill.setCondition(condition);
        bill.setRefCode(refCode);
        bill.setDataType("grid");
        return bill;
    }

    private CustDocDTO initCustDocDTO() {
        CustDocDTO custDocDTO = new CustDocDTO();
        custDocDTO.setPageIndex(Integer.valueOf(1));
        custDocDTO.setPageSize(Integer.valueOf(20));
        return custDocDTO;
    }

    public Boolean checkDecimalDigits(String value, Integer digits) {
        Pattern pattern = Pattern.compile("^\\d+(.[0-9]{0," + digits + "})?$");
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }

    public Boolean checkDecimalDigitsForUserDefine(String value, Integer digits) {
        Pattern pattern = Pattern.compile("^([-+]?[0-9]*)+(.[0-9]{0," + digits + "})?$");
        Matcher matcher = pattern.matcher(value);
        return matcher.matches();
    }

    public Boolean checkNumbersAndCommas(String value) {
        String numbersAndCommas = "^(\\d[,])+\\d$|\\d$";
        return value.matches(numbersAndCommas);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void checkOptionalMaterial(final Product product) throws Exception {
        Iterator iterator;
        HashSet<Long> optionMaterialOption;
        HashSet<Long> optionalMaterialProp;
        HashSet<Long> derivedMaterial;
        HashSet<Long> derivedMaterialProp;
        block32: {
            block30: {
                block31: {
                    if (product.getIsOptionalMaterial() == null) break block30;
                    if (!"0".equals(product.getIsOptionalMaterial().toString())) break block31;
                    if (product.getOptionalType() != null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800695);
                    }
                    if (product.getIsDerivedMaterial() == null) return;
                    if ("1".equals(product.getIsDerivedMaterial().toString())) {
                        if (product.getOptionalMaterialId() == null) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800696);
                        }
                        QueryConditionGroup productQueryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)product.getOptionalMaterialId())});
                        QuerySchema schema = QuerySchema.create().addSelect("isOptionalMaterial, productTemplate").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{productQueryConditionGroup}));
                        final Map productMap = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)schema);
                        if (productMap == null || productMap.isEmpty()) throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800702);
                        if (productMap.get("isOptionalMaterial") != null && "0".equals(productMap.get("isOptionalMaterial").toString())) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800697);
                        }
                        if (productMap.get("productTemplate") == null) {
                            if (product.getProductTemplate() == null) return;
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800698);
                        }
                        if (product.getProductTemplate() == null) return;
                        if (productMap.get("productTemplate").toString().equals(product.getProductTemplate().toString())) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800701);
                        }
                        QueryConditionGroup tplQueryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)product.getProductTemplate())});
                        QuerySchema tplSchema = QuerySchema.create().addSelect("isOptionalTemplate").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{tplQueryConditionGroup}));
                        Map tpl = MetaDaoHelper.queryOne((String)"pc.tpl.ProductTpl", (QuerySchema)tplSchema);
                        if (tpl == null || tpl.isEmpty()) return;
                        if (tpl.get("isOptionalTemplate") != null && "1".equals(tpl.get("isOptionalTemplate").toString())) {
                            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_OPTIONAL_NO_PRODUCT_TEMPLATE_CHOOSE_ERROR);
                        }
                        ArrayList<Long> productTemplate = new ArrayList<Long>(){
                            {
                                this.add(product.getProductTemplate());
                                this.add((Long)productMap.get("productTemplate"));
                            }
                        };
                        QueryConditionGroup tplCharacterQueryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").in((Collection)productTemplate)});
                        QuerySchema tplCharacterSchema = QuerySchema.create().addSelect("template,characteristicsType,character").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{tplCharacterQueryConditionGroup}));
                        List tplCharacter = MetaDaoHelper.query((String)"pc.tpl.ProductTplCharacter", (QuerySchema)tplCharacterSchema);
                        if (CollectionUtils.isEmpty((Collection)tplCharacter)) {
                            return;
                        }
                        derivedMaterialProp = new HashSet<Long>(tplCharacter.size());
                        derivedMaterial = new HashSet<Long>(tplCharacter.size());
                        optionalMaterialProp = new HashSet<Long>(tplCharacter.size());
                        optionMaterialOption = new HashSet<Long>(tplCharacter.size());
                        iterator = tplCharacter.iterator();
                        break block32;
                    } else {
                        Integer isOptionalTemplate;
                        if (!"0".equals(product.getIsDerivedMaterial().toString())) return;
                        if (product.getOptionalMaterialId() != null) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800703);
                        }
                        if (null == product.getProductTemplate()) return;
                        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)product.getProductTemplate())});
                        QuerySchema schema = QuerySchema.create().addSelect("isOptionalTemplate").addCondition((ConditionExpression)queryConditionGroup);
                        List productTpls = this.productSkuService.query("pc.tpl.ProductTpl", schema);
                        if (CollectionUtils.isEmpty((Collection)productTpls) || 1 != (isOptionalTemplate = ((ProductTpl)productTpls.get(0)).getIsOptionalTemplate())) return;
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_OPTIONAL_NO_PRODUCT_TEMPLATE_CHOOSE_ERROR);
                    }
                }
                if (!"1".equals(product.getIsOptionalMaterial().toString())) return;
                if (product.getIsDerivedMaterial() != null && ("1".equals(product.getIsDerivedMaterial().toString()) || product.getOptionalMaterialId() != null)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800704);
                }
                if (product.getProductTemplate() != null) {
                    QuerySchema schema = QuerySchema.create().addSelect("isOptionalTemplate").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)product.getProductTemplate())}));
                    Map map = MetaDaoHelper.queryOne((String)"pc.tpl.ProductTpl", (QuerySchema)schema);
                    if (!ObjectUtils.isNotEmpty((Object)map) || map.get("isOptionalTemplate") == null) return;
                    if (BooleanUtil.isFalse((Object)map.get("isOptionalTemplate").toString()) && OptionalTypeEnum.CHARACTER_OPTION.getValue().equals(product.getOptionalType())) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800705);
                    }
                    if (!BooleanUtil.isTrue((Object)map.get("isOptionalTemplate").toString()) || !OptionalTypeEnum.COMPONENT_OPTION.getValue().equals(product.getOptionalType())) return;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800706);
                } else {
                    if (!OptionalTypeEnum.CHARACTER_OPTION.getValue().equals(product.getOptionalType())) return;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800536);
                }
            }
            if (product.getOptionalType() == null) return;
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800695);
        }
        while (iterator.hasNext()) {
            Map map = (Map)iterator.next();
            if (product.getProductTemplate().toString().equals(map.get("template").toString())) {
                if ("1".equals(map.get("characteristicsType").toString())) {
                    derivedMaterialProp.add((Long)map.get("character"));
                    derivedMaterial.add((Long)map.get("character"));
                    continue;
                }
                if (!"3".equals(map.get("characteristicsType").toString())) continue;
                derivedMaterial.add((Long)map.get("character"));
                continue;
            }
            if ("1".equals(map.get("characteristicsType").toString())) {
                optionalMaterialProp.add((Long)map.get("character"));
                continue;
            }
            if (!"4".equals(map.get("characteristicsType").toString())) continue;
            optionMaterialOption.add((Long)map.get("character"));
        }
        if (!CollectionUtils.isEmpty(optionalMaterialProp)) {
            for (Long aLong : optionalMaterialProp) {
                if (derivedMaterialProp.contains(aLong)) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800699);
            }
        }
        if (CollectionUtils.isEmpty(optionMaterialOption)) return;
        for (Long aLong : optionMaterialOption) {
            if (derivedMaterial.contains(aLong)) continue;
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800700);
        }
    }

    public void productOrgsCheck(String fullname, Product product) throws Exception {
        if (product.getOrgId() != null && product.productOrgs() != null) {
            Set<String> orgRangeShareSet = this.orgPermissionsUtil.getShareOrgDetailByManageOrg4BillDate("pc.product.Product", product.getOrgId(), (BizObject)product);
            List orgIds = product.productOrgs().stream().map(productApplyRange -> productApplyRange.getOrgId()).collect(Collectors.toList());
            HashSet orgIdSet = new HashSet(orgIds);
            orgIdSet.removeAll(orgRangeShareSet);
            if (!orgIdSet.isEmpty()) {
                List notExists = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)QuerySchema.create().addSelect(new String[]{"code", "name"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(orgIdSet)})), (String)"ucf-org-center");
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800707, new Object[]{product.getCode().toString(), notExists.stream().map(map -> map.get("code").toString()).collect(Collectors.toList())});
            }
        }
    }

    private static BigDecimal turnBigDecimal(Object value) {
        BigDecimal returnvalue = new BigDecimal(0);
        if (value != null && !"".equals(value.toString().trim())) {
            try {
                returnvalue = new BigDecimal(value.toString().trim());
            }
            catch (Exception e) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800708, new Object[]{value});
            }
        }
        return returnvalue;
    }

    public void checkManageByInventory(String manageByInventory, String checkByProject, String projectTrackStrategy) {
        if (BooleanUtil.isTrue((Object)manageByInventory) && BooleanUtil.isFalse((Object)projectTrackStrategy)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800709);
        }
        if (manageByInventory != null && checkByProject != null) {
            if (BooleanUtil.isFalse((Object)manageByInventory) && BooleanUtil.isTrue((Object)checkByProject)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800710);
            }
        } else {
            if ((manageByInventory == null || "null".equals(manageByInventory)) && checkByProject != null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800711);
            }
            if (manageByInventory != null && checkByProject == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800712);
            }
        }
    }

    public void checkValueManageType(String valueManageType, String checkByProject, String checkBySalesOrders, String checkByClient, String checkByOutsourcing) {
        if ("1".equals(checkByProject) || "1".equals(checkBySalesOrders) || "1".equals(checkByClient) || "1".equals(checkByOutsourcing)) {
            if (valueManageType != null && !ValueManageTypeEnum.InventoryAccounting.getValue().equals(valueManageType)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800713);
            }
            if (valueManageType == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800714);
            }
        }
    }

    public void checkProjectTrackStrategy(String projectTrackStrategy, String mtoStrategy, String manageByInventory, String strategyComparisonRule) {
        if (BooleanUtil.isTrue((Object)manageByInventory) && BooleanUtil.isTrue((Object)mtoStrategy) && !StrategyComparisonRuleEnum.severity.getValue().equals(strategyComparisonRule)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_MANAGE_STOCK_ERROR);
        }
        if (BooleanUtil.isTrue((Object)manageByInventory) && BooleanUtil.isTrue((Object)projectTrackStrategy) && BooleanUtil.isFalse((Object)mtoStrategy) && !StrategyComparisonRuleEnum.severity.getValue().equals(strategyComparisonRule)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800716);
        }
        if (BooleanUtil.isFalse((Object)manageByInventory) && BooleanUtil.isTrue((Object)projectTrackStrategy) && BooleanUtil.isFalse((Object)mtoStrategy) && !StrategyComparisonRuleEnum.mismatch.getValue().equals(strategyComparisonRule)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800717);
        }
        if (BooleanUtil.isFalse((Object)manageByInventory) && BooleanUtil.isFalse((Object)projectTrackStrategy) && BooleanUtil.isTrue((Object)mtoStrategy) && !StrategyComparisonRuleEnum.severity.getValue().equals(strategyComparisonRule) && !StrategyComparisonRuleEnum.nonStrict.getValue().equals(strategyComparisonRule)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800718);
        }
        if (BooleanUtil.isFalse((Object)manageByInventory) && BooleanUtil.isFalse((Object)projectTrackStrategy) && BooleanUtil.isFalse((Object)mtoStrategy) && !StrategyComparisonRuleEnum.nonStrict.getValue().equals(strategyComparisonRule)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800719);
        }
        if (BooleanUtil.isFalse((Object)manageByInventory) && BooleanUtil.isTrue((Object)mtoStrategy) && BooleanUtil.isTrue((Object)projectTrackStrategy)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MTO_STRATEGY_ERROR);
        }
    }

    public void checkPurchaseClassDataValidity(Product product) throws Exception {
        if (product.getPurchaseClass() != null) {
            QuerySchema schema = QuerySchema.create().addSelect(new String[]{"id", "isEnd"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)product.getPurchaseClass()), QueryCondition.name((String)"purchaseClassApplyRanges.orgGroupId.orgGroupDetailList.orgId").eq((Object)product.getOrgId())}));
            List purchaseClassList = MetaDaoHelper.query((String)"pc.cls.PurchaseClass", (QuerySchema)schema);
            if (CollectionUtils.isEmpty((Collection)purchaseClassList)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800721, new Object[]{product.getCode()});
            }
            if (((Map)purchaseClassList.get(0)).get("isEnd") == null || !Boolean.parseBoolean(((Map)purchaseClassList.get(0)).get("isEnd").toString())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800722, new Object[]{product.getCode()});
            }
        }
    }

    public void checkProductClassDataValidity(Product product) throws Exception {
        if (product.getProductClass() != null && !ProductCheckService.checkProductClassDataIsEnd(product.getProductClass())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800723, new Object[]{product.getCode()});
        }
    }

    public static boolean checkProductClassDataIsEnd(Long productClsId) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect(new String[]{"id", "isEnd"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productClsId)}));
        List productClassList = MetaDaoHelper.query((String)"pc.cls.PresentationClass", (QuerySchema)schema);
        return CollectionUtils.isEmpty((Collection)productClassList) || ((Map)productClassList.get(0)).get("isEnd") != null && Boolean.parseBoolean(((Map)productClassList.get(0)).get("isEnd").toString());
    }

    public void checkPlanClassDataValidity(Product product) throws Exception {
        QuerySchema schema;
        List planClassList;
        if (!(product.get("planClass") == null || CollectionUtils.isEmpty((Collection)(planClassList = MetaDaoHelper.query((String)"pc.cls.PlanClass", (QuerySchema)(schema = QuerySchema.create().addSelect(new String[]{"id", "isEnd"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)product.get("planClass").toString())})))))) || ((Map)planClassList.get(0)).get("isEnd") != null && Boolean.parseBoolean(((Map)planClassList.get(0)).get("isEnd").toString()))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800724, new Object[]{product.getCode()});
        }
    }

    public void checkNameAndModelDescription(Product product, ProductApply productApply, String billnum) throws Exception {
        if (!"productApply".equals(product.get("sourceMarker"))) {
            this.productApplyCheckService.uniqueProductApply(product, productApply);
        }
    }

    public boolean isRepeatNameEmpty(Product product, List<String> repeatNameList, LanguageVO languageVO) {
        boolean isRepeatNameEmpty = true;
        for (String repeatAttr : repeatNameList) {
            String langVal;
            if (null == product.get(repeatAttr) || !(product.get(repeatAttr) instanceof BizObject) || CollectionUtils.isEmpty((Map)((BizObject)product.get(repeatAttr))) || !StringUtils.isNotEmpty((CharSequence)(langVal = (String)((BizObject)product.get(repeatAttr)).get(languageVO.getLangCode())))) continue;
            isRepeatNameEmpty = false;
        }
        return isRepeatNameEmpty;
    }

    public void checksingleInspection(String singleInspection, String isSerialNoManage) {
        if (BooleanUtil.isFalse((Object)isSerialNoManage) && BooleanUtil.isTrue((Object)singleInspection)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800725);
        }
    }

    public void checkMtoStrategy(String mtoStrategy, String checkBySalesOrders) {
        if (BooleanUtil.isFalse((Object)mtoStrategy) && BooleanUtil.isTrue((Object)checkBySalesOrders)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800726);
        }
    }

    public void checkAssistUnitCountPrecision(Product product) throws Exception {
        if (product.productAssistUnitExchanges() != null) {
            Integer conversionAccuracy = Integer.valueOf(OptionUtils.getSysOptionByName((String)"conversionAccuracy").toString()) > 2 ? Integer.valueOf(OptionUtils.getSysOptionByName((String)"conversionAccuracy").toString()) : 2;
            List productAssistUnitExchanges = product.productAssistUnitExchanges().stream().filter(assistUnitExchange -> EntityStatus.Delete != assistUnitExchange.getEntityStatus()).collect(Collectors.toList());
            for (ProductAssistUnitExchange assistUnitExchange2 : productAssistUnitExchanges) {
                if (assistUnitExchange2.getAssistUnitCount() != null && !this.checkDecimalDigits(assistUnitExchange2.getAssistUnitCount().stripTrailingZeros().toPlainString(), conversionAccuracy).booleanValue()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800582);
                }
                if (assistUnitExchange2.getMainUnitCount() != null && !this.checkDecimalDigits(assistUnitExchange2.getMainUnitCount().stripTrailingZeros().toPlainString(), conversionAccuracy).booleanValue()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800583);
                }
                if (assistUnitExchange2.getMainUnitCountNew() == null || this.checkDecimalDigits(assistUnitExchange2.getMainUnitCountNew().stripTrailingZeros().toPlainString(), conversionAccuracy).booleanValue()) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800583);
            }
        }
    }

    public void productAssistUnitExchangesRepeatCheck(Product product) {
        boolean hasDuplicateCode;
        if (!CollectionUtils.isEmpty((Collection)product.productAssistUnitExchanges()) && (hasDuplicateCode = product.productAssistUnitExchanges().stream().filter(assistUnitExchange -> assistUnitExchange.getEntityStatus() != null && (assistUnitExchange.getEntityStatus() == EntityStatus.Insert || assistUnitExchange.getEntityStatus() == EntityStatus.Update)).collect(Collectors.groupingBy(assistUnitExchange -> assistUnitExchange.getAssistUnit().toString())).values().stream().anyMatch(list -> list.size() > 1))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800727, new Object[]{product.getCode()});
        }
    }

    public void checkMtoAndOtherField(String manufacturingStrategy, String manageByInventory) {
        if (Objects.nonNull(manageByInventory) && Objects.nonNull(manufacturingStrategy) && "MTO".equals(manufacturingStrategy) && BooleanUtil.isTrue((Object)manageByInventory)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800728);
        }
    }

    public void checkBusinessAttribute(String businessAttribute, String planDefaultAttribute, String planMethod) {
        if (Objects.nonNull(businessAttribute) && !businessAttribute.contains(String.valueOf(BusinessAttributeEnum.PURCHASE.getValue())) && !businessAttribute.contains(String.valueOf(BusinessAttributeEnum.OUT_SOURCING.getValue())) && !businessAttribute.contains(String.valueOf(BusinessAttributeEnum.SELF_CREATE.getValue()))) {
            if (Objects.nonNull(planDefaultAttribute)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800729);
            }
            if (Objects.nonNull(planMethod) && (String.valueOf(ManufacturePlanMethod.MRP.getValue()).equals(planMethod) || String.valueOf(ManufacturePlanMethod.MPS.getValue()).equals(planMethod))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800730);
            }
        }
    }

    public void checkPlanMethod(String planMethod, String specialMaterials, String prepareFeed) {
        if (StringUtils.isNotEmpty((CharSequence)planMethod) && ManufacturePlanMethod.noPlan.getValue() == Short.parseShort(planMethod)) {
            if (BooleanUtil.isTrue((Object)specialMaterials)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800731);
            }
            if (BooleanUtil.isTrue((Object)prepareFeed)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800732);
            }
        }
    }

    public void checkPlanCheckDays(Product product) {
        Object planCheckDays = product.detail().get("planCheckDays");
        Object inspectionType = product.detail().get("inspectionType");
        Object enableStockPeriodRecheck = product.detail().get("enableStockPeriodRecheck");
        Object enableStockExpireCheck = product.detail().get("enableStockExpireCheck");
        if (planCheckDays != null && !NumberCheckUtil.isPositiveInt((Object)planCheckDays)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800733, new Object[]{product.getCode()});
        }
        boolean inspectionTypeB = false;
        boolean enableStockPeriodRecheckB = false;
        boolean enableStockExpireCheckB = false;
        if (inspectionType != null && (Boolean.getBoolean(inspectionType.toString()) || "1".equals(inspectionType.toString()))) {
            inspectionTypeB = true;
        }
        if (enableStockPeriodRecheck != null && "1".equals(enableStockPeriodRecheck.toString())) {
            enableStockPeriodRecheckB = true;
        }
        if (enableStockExpireCheck != null && "1".equals(enableStockExpireCheck.toString())) {
            enableStockExpireCheckB = true;
        }
        if (!(inspectionTypeB || enableStockPeriodRecheckB || enableStockExpireCheckB)) {
            if (planCheckDays != null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800734, new Object[]{product.getCode()});
            }
            product.detail().put("planCheckDays", null);
        }
    }

    public void checkNetWeightPrecision(Product product) throws Exception {
        Integer netWeightUnitPrecision;
        if (product.getNetWeight() != null && product.getNetWeightUnit() != null && (netWeightUnitPrecision = this.getUnitPrecision(product.getNetWeightUnit())) != null && product.getNetWeight().scale() > netWeightUnitPrecision) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800735);
        }
    }

    public Integer getUnitPrecision(Long unitId) throws Exception {
        if (unitId != null) {
            QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)unitId)});
            QuerySchema querySchema = QuerySchema.create().addSelect("precision").addCondition((ConditionExpression)conditionGroup);
            List units = MetaDaoHelper.query((String)"pc.unit.Unit", (QuerySchema)querySchema);
            if (units != null && units.size() > 0) {
                return (Integer)((Map)units.get(0)).get("precision");
            }
        }
        return null;
    }

    public void checkTurnOverMaterials(Product product, String compensationAmount, String moldingTime, String moldCavities) {
        if (StringUtils.isNotEmpty((CharSequence)compensationAmount) || StringUtils.isNotEmpty((CharSequence)moldingTime) || StringUtils.isNotEmpty((CharSequence)moldCavities)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_TURNOVER_MATERIAL_ERROR, new Object[]{product.getCode()});
        }
    }

    public void checkTurnOverMaterialsRelateField(Product product, String turnoverMaterials, String amortizationMethod, String measurementCount, String measurementUnit) throws Exception {
        if (BooleanUtil.isTrue((Object)turnoverMaterials)) {
            if (product.getRealProductAttribute() != null && !RealProductAttributeTypeEnum.PhysicalMaterials.getValue().equals(String.valueOf(product.getRealProductAttribute()))) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_TRANSFORM_MATERIAL_ERROR, new Object[]{product.getCode()});
            }
            if (!"2".equals(amortizationMethod) && (StringUtils.isNotEmpty((CharSequence)measurementCount) || StringUtils.isNotEmpty((CharSequence)measurementUnit))) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_AMORTIZATIONMETHOD_NOT_MULTIPLE_ERROR, new Object[]{product.getCode()});
            }
            if (StringUtils.isNotEmpty((CharSequence)measurementCount) && StringUtils.isNotEmpty((CharSequence)measurementUnit)) {
                String[] fields = new String[]{"precision", "code", "name"};
                UnitDTO unitDTO = this.unitService.getUnitById(Long.valueOf(Long.parseLong(measurementUnit)), fields);
                BigDecimal bigDecimal = new BigDecimal(measurementCount).stripTrailingZeros();
                if (bigDecimal != null && unitDTO != null && bigDecimal.scale() > unitDTO.getPrecision()) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_ME_ERROR, new Object[]{product.getCode()});
                }
            } else if (!StringUtils.isEmpty((CharSequence)measurementCount) || !StringUtils.isEmpty((CharSequence)measurementUnit)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_ME_MATERIAL_ERROR, new Object[]{product.getCode()});
            }
        } else {
            if (StringUtils.isNotEmpty((CharSequence)amortizationMethod) && !"0".equals(amortizationMethod)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_AMORTIZATION_METHOD_ERROR, new Object[]{product.getCode()});
            }
            if (StringUtils.isNotEmpty((CharSequence)measurementCount) || StringUtils.isNotEmpty((CharSequence)measurementUnit)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_AMORTIZATION_METHOD_ERROR, new Object[]{product.getCode()});
            }
        }
    }

    public void checkCostItem(Product product) throws Exception {
        ProductExtend detail = null;
        if (product.detail() != null && null != product.detail().get("costItems")) {
            detail = product.detail();
        }
        if (product.productApplyRange() != null && product.productApplyRange().size() > 0 && ((ProductApplyRange)product.productApplyRange().get(0)).productAppliedDetail() != null) {
            detail = ((ProductApplyRange)product.productApplyRange().get(0)).productAppliedDetail();
        }
        if (product != null && detail != null && detail.get("costItems") != null && detail.get("costItems").toString().trim().length() > 0) {
            ProductCheckService.checkCostItemApply(product, (BizObject)detail);
        }
    }

    private static void checkCostItemApply(Product product, BizObject detail) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id,name,enabled,accentity").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(detail.get("costItems"))}));
        List list = MetaDaoHelper.query((String)"bd.expenseitem.ExpenseItem", (QuerySchema)schema, (String)"finbd");
        if (CollectionUtils.isEmpty((Collection)list)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800806, new Object[]{product.getCode()});
        }
        if (!(((Map)list.get(0)).get("accentity") != null && product.getOrgId().equals(((Map)list.get(0)).get("accentity").toString()) || product.get("productApplyRange_OrgId") != null && product.get("productApplyRange_OrgId").toString().equals(((Map)list.get(0)).get("accentity").toString()) || ((Map)list.get(0)).get("accentity") != null && "666666".equals(((Map)list.get(0)).get("accentity").toString()))) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_COSTITEM_ERROR, new Object[]{product.getCode()});
        }
    }

    public void checkTurnOverMaterialsFromTrue(BillContext billContext, Map<String, Object> paramMap, Product product, BizObject productOrgField) {
        if (product != null && productOrgField != null && productOrgField.get("turnoverMaterials") != null && BooleanUtil.isTrue((Object)productOrgField.get("turnoverMaterials")) && product.detail() != null && product.detail().get("turnoverMaterials") != null && BooleanUtil.isFalse((Object)product.detail().get("turnoverMaterials"))) {
            this.productReferenceCheckService.productCheckRule(billContext, paramMap, "detail!turnoverMaterials", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1E1AF70604E00009", (String)"\u5468\u8f6c\u6750"));
        }
    }

    public void checkisBatchManageForInsert(Product product) {
        if (product.getEntityStatus() == EntityStatus.Insert && product.detail() != null && product.detail().getIsCreator() != null && product.detail().getIsCreator().booleanValue() && product.detail().getIsBatchManage() != null && BooleanUtil.isTrue((Object)product.detail().getIsBatchManage()) && product.getVirtualProductAttribute() != null && (VirtualProductAttributeEnum.Service.getValue().equals(product.getVirtualProductAttribute().toString()) || VirtualProductAttributeEnum.Virtual.getValue().equals(product.getVirtualProductAttribute().toString()) || VirtualProductAttributeEnum.PTO.getValue().equals(product.getVirtualProductAttribute().toString()))) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.IS_BATCH_MANAGEMENT_ERROR, new Object[]{product.getCode()});
        }
    }

    static {
        decimalFieldForCommonCheck.put("fMarkPrice", "\u5efa\u8bae\u96f6\u552e\u4ef7");
        decimalFieldForCommonCheck.put("fSalePrice", "\u7ebf\u4e0a\u96f6\u552e\u4ef7");
        decimalFieldForCommonCheck.put("fMarketPrice", "\u5e02\u573a\u4ef7");
        decimalFieldForCommonCheck.put("storageLossRate", "\u4fdd\u7ba1\u635f\u8017\u7387");
        decimalFieldForCommonCheck.put("doubleReplenish", "\u8865\u8d27\u500d\u91cf");
        decimalFieldForCommonCheck.put("wastageRate", "\u635f\u8017\u7387");
        decimalFieldForCommonCheck.put("fSettleAccountsRate", "\u7ed3\u7b97\u8d39\u7387");
        decimalFieldForCommonCheck.put("deposits", "\u9884\u4ed8\u5b9a\u91d1\u91d1\u989d");
        decimalFieldForCommonCheck.put("depositPercentage", "\u9884\u4ed8\u5b9a\u91d1\u767e\u5206\u6bd4");
        decimalFieldForCommonCheck.put("minimumDeposits", "\u6700\u4f4e\u5b9a\u91d1\u91d1\u989d");
        decimalFieldForCommonCheck.put("inStoreExcessLimit", "\u5165\u5e93\u8d85\u91cf\u4e0a\u9650");
        decimalFieldForCommonCheck.put("outStoreExcessLimit", "\u51fa\u5e93\u8d85\u91cf\u4e0a\u9650");
        decimalFieldForCommonCheck.put("inStoreLessLimit", "\u5165\u5e93\u4e0b\u9650\u6bd4\u4f8b");
        decimalFieldForCommonCheck.put("outStoreLessLimit", "\u51fa\u5e93\u4e0b\u9650\u6bd4\u4f8b");
        REPEAT_CHECK_FIELD = new ArrayList<String>();
        REPEAT_CHECK_FIELD.add("name");
        REPEAT_CHECK_FIELD.add("model");
        REPEAT_CHECK_FIELD.add("modelDescription");
        REPEAT_COLUMN_MAP = new HashMap<String, String>();
        REPEAT_COLUMN_MAP.put("name", "name");
        REPEAT_COLUMN_MAP.put("model", "cmodel");
        REPEAT_COLUMN_MAP.put("modelDescription", "cmodelDescription");
    }
}

