/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.dao.pub.CoreDocBaseDao
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.iuap.upc.dto.derivatives.ProductLineDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO
 *  com.yonyoucloud.iuap.upc.vo.MultilingualVO
 *  com.yonyoucloud.upc.pc.productline.ProductLine
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.dao.pub.CoreDocBaseDao;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.dto.derivatives.ProductLineDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import com.yonyoucloud.upc.pc.productline.ProductLine;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductLineApiServiceImpl {
    private static final Logger log = LoggerFactory.getLogger(ProductLineApiServiceImpl.class);
    @Autowired
    private ApiImportCommandService apiImportSingleService;

    public CoreDocJsonResult<ProductLineDTO> add(ProductLineDTO productLineDTO) throws Exception {
        if (null != productLineDTO) {
            try {
                if (productLineDTO.getCode() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801120);
                }
                if (CoreDocBaseDao.queryIdByCode((String)productLineDTO.getCode(), (String)"pc.productline.ProductLine") != null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801121);
                }
                ProductLine productLine = new ProductLine();
                productLine.put("_fromApi", (Object)true);
                productLine.put("_status", (Object)EntityStatus.Insert);
                Map map = (Map)JSON.parseObject((String)JSON.toJSONString((Object)productLineDTO), HashMap.class);
                productLine.putAll(map);
                if (productLineDTO.getName() != null) {
                    productLine.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)productLineDTO.getName()));
                }
                if (productLineDTO.getRemark() != null) {
                    productLine.set("remark", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)productLineDTO.getRemark()));
                }
                if (productLineDTO.getStopStatus() != null && !productLineDTO.getStopStatus().booleanValue()) {
                    productLine.put("stopstatus", (Object)0);
                } else if (productLineDTO.getStopStatus() != null && productLineDTO.getStopStatus().booleanValue()) {
                    productLine.put("stopstatus", (Object)1);
                } else if (productLineDTO.getStopStatus() == null) {
                    productLine.put("stopstatus", (Object)0);
                }
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("pc_productline");
                billDataDto.setAction("save");
                billDataDto.setData((Object)productLine);
                billDataDto.setFromApi(true);
                billDataDto.setConvertType(Integer.valueOf(3));
                Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
                ProductLineDTO productLineDTO1 = new ProductLineDTO();
                productLineDTO1.setId((Long)((Map)result).get("id"));
                return CoreDocJsonResult.success((Object)productLineDTO1);
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u4ea7\u54c1\u7ebf\u65b0\u589e\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<ProductLineDTO> update(ProductLineDTO productLineDTO) throws Exception {
        if (null != productLineDTO) {
            try {
                Map characterId;
                if (productLineDTO.getCode() != null && productLineDTO.getId() == null) {
                    Long id = CoreDocBaseDao.queryIdByCode((String)productLineDTO.getCode(), (String)"pc.productline.ProductLine");
                    if (id == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800879);
                    }
                    productLineDTO.setId(id);
                } else {
                    QuerySchema querySchema;
                    List queryId;
                    if (productLineDTO.getCode() == null && productLineDTO.getId() == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800880);
                    }
                    if (productLineDTO.getId() != null && (queryId = MetaDaoHelper.query((String)"pc.productline.ProductLine", (QuerySchema)(querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productLineDTO.getId())}))))) != null && queryId.size() != 1) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800881);
                    }
                }
                ProductLine productLine = new ProductLine();
                productLine.put("_fromApi", (Object)true);
                productLine.put("_status", (Object)EntityStatus.Update);
                Map map = (Map)JSON.parseObject((String)JSON.toJSONString((Object)productLineDTO), HashMap.class);
                productLine.putAll(map);
                if (productLineDTO.getName() != null) {
                    productLine.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)productLineDTO.getName()));
                }
                if (productLineDTO.getRemark() != null) {
                    productLine.set("remark", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)productLineDTO.getRemark()));
                }
                if (productLineDTO.getStopStatus() != null && !productLineDTO.getStopStatus().booleanValue()) {
                    productLine.put("stopstatus", (Object)0);
                } else if (productLineDTO.getStopStatus() != null && productLineDTO.getStopStatus().booleanValue()) {
                    productLine.put("stopstatus", (Object)1);
                }
                QuerySchema schema = QuerySchema.create().addSelect("productLineCharacterDef").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(productLine.getId())}));
                Map query = MetaDaoHelper.queryOne((String)"pc.productline.ProductLine", (QuerySchema)schema);
                if (query != null && query.get("productLineCharacterDef") != null && productLine.get("productLineCharacterDef") != null && (characterId = (Map)query.get("productLineCharacterDef")).get("id") != null) {
                    Map character = (Map)productLine.get("productLineCharacterDef");
                    character.put("id", characterId.get("id").toString());
                    productLine.put("productLineCharacterDef", (Object)character);
                }
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setBillnum("pc_productline");
                billDataDto.setAction("save");
                billDataDto.setData((Object)productLine);
                billDataDto.setFromApi(true);
                billDataDto.setConvertType(Integer.valueOf(3));
                Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
                ProductLineDTO productLineDTO1 = new ProductLineDTO();
                productLineDTO1.setId((Long)((Map)result).get("id"));
                return CoreDocJsonResult.success((Object)productLineDTO1);
            }
            catch (BusinessException businessException) {
                return CoreDocJsonResult.error((BusinessException)businessException);
            }
            catch (Exception e) {
                log.error("\u4ea7\u54c1\u7ebf\u66f4\u65b0\u9519\u8bef:" + e.getMessage(), (Throwable)e);
                return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
            }
        }
        return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
    }

    public CoreDocJsonResult<ProductLineDTO> addIdempotent(OpenAPIDTO<ProductLineDTO> dto) {
        if (dto == null || dto.getData() == null) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        try {
            ProductLineDTO productLineDTO = (ProductLineDTO)dto.getData();
            CoreDocJsonResult<ProductLineDTO> saveResult = this.add(productLineDTO);
            return saveResult;
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u4ea7\u54c1\u7ebf\u65b0\u589e-\u5e42\u7b49\u9519\u8bef:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }
}

