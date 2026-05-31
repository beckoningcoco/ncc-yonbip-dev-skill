/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg
 *  com.yonyou.iuap.apdoc.coredoc.vo.tag.TagClassVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.tag.TagVO
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyoucloud.upc.pc.tag.Tag
 *  com.yonyoucloud.upc.pc.tag.TagClass
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
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg;
import com.yonyou.iuap.apdoc.coredoc.vo.tag.TagClassVO;
import com.yonyou.iuap.apdoc.coredoc.vo.tag.TagVO;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyoucloud.upc.pc.tag.Tag;
import com.yonyoucloud.upc.pc.tag.TagClass;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
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
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

@Service
public class TagService {
    private static final Logger log = LoggerFactory.getLogger(TagService.class);
    @Autowired
    private ApiImportCommandService apiImportSingleService;

    public CoreDocJsonResult<TagVO> queryTag(BatchApiQueryParamWithOrg batchApiQueryParamWithOrg) throws Exception {
        CoreDocJsonResult coreDocJsonResult;
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (!CollectionUtils.isEmpty((Collection)batchApiQueryParamWithOrg.getIds())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in((Collection)batchApiQueryParamWithOrg.getIds()));
        } else if (StringUtils.hasLength((String)batchApiQueryParamWithOrg.getId())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)Long.parseLong(batchApiQueryParamWithOrg.getId())));
        }
        if (StringUtils.hasLength((String)batchApiQueryParamWithOrg.getName())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)batchApiQueryParamWithOrg.getName()));
        }
        if (batchApiQueryParamWithOrg.getStartTs() != null || batchApiQueryParamWithOrg.getEndTs() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").between((Object)batchApiQueryParamWithOrg.getStartTs(), (Object)batchApiQueryParamWithOrg.getEndTs()));
        }
        int recordCount = 0;
        QuerySchema countSchema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)queryConditionGroup);
        Map result = MetaDaoHelper.queryOne((String)"pc.tag.Tag", (QuerySchema)countSchema);
        if (result != null && result.get("count") != null) {
            recordCount = Integer.parseInt(result.get("count").toString());
        }
        if (recordCount > 0) {
            if (batchApiQueryParamWithOrg.getPageSize() > (long)UpcAPiTool.PAGE_MAX_SIZE.intValue()) {
                batchApiQueryParamWithOrg.setPageSize((long)UpcAPiTool.PAGE_MAX_SIZE.intValue());
            }
            QuerySchema schema = QuerySchema.create().addSelect("id,name,tagClass,tagClass.code as tagClass___code,stopstatus,dEndTime,isFastSale,isFront,isManage,scope,style,tagAbbr,tag_bgcolor,tag_fgcolor,tag_position").addCondition((ConditionExpression)queryConditionGroup).addPager(Long.valueOf(batchApiQueryParamWithOrg.getPageIndex()).intValue(), Long.valueOf(batchApiQueryParamWithOrg.getPageSize()).intValue());
            List tagList = MetaDaoHelper.queryObject((String)"pc.tag.Tag", (boolean)true, (QuerySchema)schema, null);
            ArrayList<TagVO> tagVOList = new ArrayList<TagVO>();
            for (Tag tag : tagList) {
                TagVO tagVO = (TagVO)JSON.parseObject((String)JSON.toJSONString((Object)tag), TagVO.class);
                if (tag.get("name") != null) {
                    tagVO.setName(new MultiLangText((Map)tag.get("name")));
                }
                if (tag.get("tagAbbr") != null) {
                    tagVO.setTagAbbr(new MultiLangText((Map)tag.get("tagAbbr")));
                }
                if (tag.get("dEndTime") != null) {
                    String time = new SimpleDateFormat("yyyy-MM-dd").format((Date)tag.get("dEndTime"));
                    tagVO.setdEndTime(time);
                }
                tagVOList.add(tagVO);
            }
            coreDocJsonResult = CoreDocJsonResult.success(tagVOList);
        } else {
            coreDocJsonResult = CoreDocJsonResult.success(null);
        }
        coreDocJsonResult.setTotalCount(Integer.valueOf(recordCount));
        return coreDocJsonResult;
    }

    public CoreDocJsonResult<TagClassVO> queryTagClass(BatchApiQueryParamWithOrg batchApiQueryParamWithOrg) throws Exception {
        CoreDocJsonResult coreDocJsonResult;
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (!CollectionUtils.isEmpty((Collection)batchApiQueryParamWithOrg.getIds())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in((Collection)batchApiQueryParamWithOrg.getIds()));
        } else if (StringUtils.hasLength((String)batchApiQueryParamWithOrg.getId())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)Long.parseLong(batchApiQueryParamWithOrg.getId())));
        }
        if (StringUtils.hasLength((String)batchApiQueryParamWithOrg.getCode())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)batchApiQueryParamWithOrg.getCode()));
        }
        if (batchApiQueryParamWithOrg.getStartTs() != null || batchApiQueryParamWithOrg.getEndTs() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").between((Object)batchApiQueryParamWithOrg.getStartTs(), (Object)batchApiQueryParamWithOrg.getEndTs()));
        }
        int recordCount = 0;
        QuerySchema countSchema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)queryConditionGroup);
        Map result = MetaDaoHelper.queryOne((String)"pc.tag.TagClass", (QuerySchema)countSchema);
        if (result != null && result.get("count") != null) {
            recordCount = Integer.parseInt(result.get("count").toString());
        }
        if (recordCount > 0) {
            if (batchApiQueryParamWithOrg.getPageSize() > (long)UpcAPiTool.PAGE_MAX_SIZE.intValue()) {
                batchApiQueryParamWithOrg.setPageSize((long)UpcAPiTool.PAGE_MAX_SIZE.intValue());
            }
            QuerySchema schema = QuerySchema.create().addSelect("id,name,code,tagclassAbbr,tagclassScope,stopstatus").addCondition((ConditionExpression)queryConditionGroup).addPager(Long.valueOf(batchApiQueryParamWithOrg.getPageIndex()).intValue(), Long.valueOf(batchApiQueryParamWithOrg.getPageSize()).intValue());
            List tagClassList = MetaDaoHelper.queryObject((String)"pc.tag.TagClass", (boolean)true, (QuerySchema)schema, null);
            ArrayList<TagClassVO> tagClassVOList = new ArrayList<TagClassVO>();
            for (TagClass tagClass : tagClassList) {
                TagClassVO tagClassVO = (TagClassVO)JSON.parseObject((String)JSON.toJSONString((Object)tagClass), TagClassVO.class);
                if (tagClass.get("name") != null) {
                    tagClassVO.setName(new MultiLangText((Map)tagClass.get("name")));
                }
                if (tagClass.get("tagclassAbbr") != null) {
                    tagClassVO.setTagclassAbbr(new MultiLangText((Map)tagClass.get("tagclassAbbr")));
                }
                tagClassVOList.add(tagClassVO);
            }
            coreDocJsonResult = CoreDocJsonResult.success(tagClassVOList);
        } else {
            coreDocJsonResult = CoreDocJsonResult.success(null);
        }
        coreDocJsonResult.setTotalCount(Integer.valueOf(recordCount));
        return coreDocJsonResult;
    }

    public Long tagSave(String matchRule, TagVO tagVO) throws Exception {
        Long id = 0L;
        Tag tag = this.convertTag(matchRule, tagVO);
        DataTransferUtils.fill((String)"pc_tag", (String)"pc.tag.Tag", (Object)tag, (int)4);
        this.dataPreprocessing(matchRule, tag);
        tag.put("_fromApi", (Object)true);
        BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"pc_tag", (Object)tag, (boolean)true, (int)4);
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        if (result != null) {
            id = (Long)((Tag)result).getId();
        }
        return id;
    }

    public Long tagClassSave(String matchRule, TagClassVO tagClassVO) throws Exception {
        QuerySchema schema;
        QueryConditionGroup condition;
        Long id = 0L;
        TagClass tagClass = this.convertTagClass(matchRule, tagClassVO);
        DataTransferUtils.fill((String)"pc_tagclass", (String)"pc.tag.TagClass", (Object)tagClass, (int)4);
        if (!"id".equals(matchRule)) {
            condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)tagClass.getCode())});
            schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List tagClassList = MetaDaoHelper.queryObject((String)"pc.tag.TagClass", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)tagClassList)) {
                tagClass.setId(((TagClass)tagClassList.get(0)).getId());
                tagClass.setEntityStatus(EntityStatus.Update);
            } else {
                tagClass.setEntityStatus(EntityStatus.Insert);
                if (tagClass.getStopstatus() == null) {
                    tagClass.setStopstatus(Boolean.valueOf(false));
                }
            }
        } else if (tagClass != null && tagClass.getId() != null) {
            condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(tagClass.getId())});
            schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List tagClassList = MetaDaoHelper.queryObject((String)"pc.tag.TagClass", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)tagClassList)) {
                tagClass.setId(((TagClass)tagClassList.get(0)).getId());
                tagClass.setEntityStatus(EntityStatus.Update);
            } else {
                tagClass.setEntityStatus(EntityStatus.Insert);
                if (tagClass.getStopstatus() == null) {
                    tagClass.setStopstatus(Boolean.valueOf(false));
                }
            }
        } else {
            tagClass.setEntityStatus(EntityStatus.Insert);
            if (tagClass.getStopstatus() == null) {
                tagClass.setStopstatus(Boolean.valueOf(false));
            }
        }
        tagClass.put("_fromApi", (Object)true);
        BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"pc_tagclass", (Object)tagClass, (boolean)true, (int)4);
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        if (result != null) {
            id = (Long)((TagClass)result).getId();
        }
        return id;
    }

    public TagClass convertTagClass(String matchRule, TagClassVO tagClassVO) {
        TagClass tagClass = new TagClass();
        if (StringUtils.hasLength((String)tagClassVO.getId())) {
            tagClass.setId((Object)Long.parseLong(tagClassVO.getId()));
        }
        if (!ObjectUtils.isEmpty((Object)tagClassVO.getName())) {
            tagClass.set("name", (Object)tagClassVO.getName().toMap());
        }
        if (StringUtils.hasLength((String)tagClassVO.getCode())) {
            tagClass.setCode(tagClassVO.getCode());
        }
        if (StringUtils.hasLength((String)tagClassVO.getTagclassScope())) {
            tagClass.setTagclassScope(tagClassVO.getTagclassScope());
        }
        if (tagClassVO.getStopstatus() != null) {
            tagClass.setStopstatus(tagClassVO.getStopstatus());
        }
        if (!ObjectUtils.isEmpty((Object)tagClassVO.getTagclassAbbr())) {
            tagClass.set("tagclassAbbr", (Object)tagClassVO.getTagclassAbbr().toMap());
        }
        return tagClass;
    }

    private void dataPreprocessing(String matchRule, Tag tag) throws Exception {
        if (!"id".equals(matchRule)) {
            String locale = InvocationInfoProxy.getLocale();
            String name = null;
            if (locale != null && tag != null && tag.get("name") != null) {
                Map map = (Map)tag.get("name");
                name = (String)map.get(locale);
            }
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq(name)});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List tagList = MetaDaoHelper.queryObject((String)"pc.tag.Tag", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)tagList)) {
                tag.setId(((Tag)tagList.get(0)).getId());
                tag.setEntityStatus(EntityStatus.Update);
            } else {
                tag.setEntityStatus(EntityStatus.Insert);
                if (tag.getStopstatus() == null) {
                    tag.setStopstatus(Boolean.valueOf(false));
                }
            }
        } else if (tag != null && tag.getId() != null && !"".equals(tag.getId())) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(tag.getId())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List tagList = MetaDaoHelper.queryObject((String)"pc.tag.Tag", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)tagList)) {
                tag.setId(((Tag)tagList.get(0)).getId());
                tag.setEntityStatus(EntityStatus.Update);
            } else {
                tag.setEntityStatus(EntityStatus.Insert);
                if (tag.getStopstatus() == null) {
                    tag.setStopstatus(Boolean.valueOf(false));
                }
            }
        } else {
            tag.setEntityStatus(EntityStatus.Insert);
            if (tag.getStopstatus() == null) {
                tag.setStopstatus(Boolean.valueOf(false));
            }
        }
    }

    public Tag convertTag(String matchRule, TagVO tagVO) {
        Tag tag = new Tag();
        if (StringUtils.hasLength((String)tagVO.getId())) {
            tag.setId((Object)Long.parseLong(tagVO.getId()));
        }
        if (!ObjectUtils.isEmpty((Object)tagVO.getName())) {
            tag.set("name", (Object)tagVO.getName().toMap());
        }
        if (tagVO.getTagClass() != null && !"".equals(tagVO.getTagClass())) {
            tag.setTagClass(tagVO.getTagClass());
        } else if (!StringUtils.isEmpty((Object)tagVO.getTagClass___code())) {
            tag.set("tagClass_code", (Object)tagVO.getTagClass___code());
            tag.set("tagClass___code", (Object)tagVO.getTagClass___code());
        }
        if (tagVO.getStopstatus() != null) {
            tag.setStopstatus(tagVO.getStopstatus());
        }
        if (!StringUtils.isEmpty((Object)tagVO.getdEndTime())) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date date = sdf.parse(tagVO.getdEndTime());
                tag.set("dEndTime", (Object)date);
            }
            catch (Exception e) {
                log.error("\u6807\u7b7e\u7ed3\u675f\u65f6\u95f4\u683c\u5f0f yyyy-MM-dd");
            }
        }
        if (tagVO.getFastSale() != null) {
            tag.setIsFastSale(tagVO.getFastSale());
        }
        if (tagVO.getFront() != null) {
            tag.setIsFront(tagVO.getFront());
        }
        if (tagVO.getManage() != null) {
            tag.setIsFront(tagVO.getManage());
        }
        if (StringUtils.hasLength((String)tagVO.getScope())) {
            tag.setScope(tagVO.getScope());
        }
        if (tagVO.getStyle() != null) {
            tag.setStyle(tagVO.getStyle());
        }
        if (!ObjectUtils.isEmpty((Object)tagVO.getTagAbbr())) {
            tag.set("tagAbbr", (Object)tagVO.getTagAbbr().toMap());
        }
        if (StringUtils.hasLength((String)tagVO.getTag_bgcolor())) {
            tag.setTag_bgcolor(tagVO.getTag_bgcolor());
        }
        if (StringUtils.hasLength((String)tagVO.getTag_fgcolor())) {
            tag.setTag_fgcolor(tagVO.getTag_fgcolor());
        }
        if (tagVO.getTag_position() != null) {
            tag.setTag_position(tagVO.getTag_position());
        }
        return tag;
    }

    public String delete(String id) throws Exception {
        QuerySchema schema;
        List tagList;
        if (!StringUtils.hasLength((String)id)) {
            return null;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (StringUtils.hasLength((String)id)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)Long.parseLong(id)));
        }
        if (CollectionUtils.isEmpty((Collection)(tagList = MetaDaoHelper.queryObject((String)"pc.tag.Tag", (QuerySchema)(schema = QuerySchema.create().addSelect("id,name,stopstatus").addCondition((ConditionExpression)queryConditionGroup)), null)))) {
            return null;
        }
        BillDataDto bill = new BillDataDto();
        bill.setData((Object)tagList);
        bill.setBillnum("pc_tag");
        RuleExecuteResult result = BillBiz.delete((BillDataDto)bill);
        if (!CollectionUtils.isEmpty((Collection)result.getMessages())) {
            return result.getMessages().get(0).toString();
        }
        return null;
    }

    public String tagClassDelete(String id) throws Exception {
        QuerySchema schema;
        List tagClassList;
        if (!StringUtils.hasLength((String)id)) {
            return null;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (StringUtils.hasLength((String)id)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)Long.parseLong(id)));
        }
        if (CollectionUtils.isEmpty((Collection)(tagClassList = MetaDaoHelper.queryObject((String)"pc.tag.TagClass", (QuerySchema)(schema = QuerySchema.create().addSelect("id,code,name,stopstatus").addCondition((ConditionExpression)queryConditionGroup)), null)))) {
            return null;
        }
        BillDataDto bill = new BillDataDto();
        bill.setData((Object)tagClassList);
        bill.setBillnum("pc_tagclass");
        RuleExecuteResult result = BillBiz.delete((BillDataDto)bill);
        if (!CollectionUtils.isEmpty((Collection)result.getMessages())) {
            return result.getMessages().get(0).toString();
        }
        return null;
    }
}

