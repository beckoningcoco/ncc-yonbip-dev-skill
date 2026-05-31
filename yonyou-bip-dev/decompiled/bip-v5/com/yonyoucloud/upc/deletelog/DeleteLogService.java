/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.param.BaseEntity
 *  com.yonyou.iuap.yms.param.ResultSetProcessor
 *  com.yonyou.iuap.yms.param.SQLParameter
 *  com.yonyou.iuap.yms.processor.ColumnProcessor
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.deletelog.BDRecycleDO
 *  com.yonyoucloud.upc.deletelog.DeleteLogDO
 *  javax.validation.constraints.NotNull
 *  org.imeta.core.model.Entity
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.deletelog;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.param.BaseEntity;
import com.yonyou.iuap.yms.param.ResultSetProcessor;
import com.yonyou.iuap.yms.param.SQLParameter;
import com.yonyou.iuap.yms.processor.ColumnProcessor;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.deletelog.BDRecycleDO;
import com.yonyoucloud.upc.deletelog.DeleteLogDO;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.validation.constraints.NotNull;
import org.imeta.core.model.Entity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Service
public class DeleteLogService {
    private static final Logger log = LoggerFactory.getLogger(DeleteLogService.class);
    @Autowired
    private IYmsJdbcApi ymsJdbcApi;

    public void insertDeleteLogs(String fullName, List<String> ids) throws Exception {
        if (!CollectionUtils.isEmpty(ids)) {
            List<DeleteLogDO> deleteLogs = this.createDeleteLogs(this.getTableName(fullName), ids);
            this.ymsJdbcApi.insert(deleteLogs);
        }
    }

    public void insertDeleteLog(String fullName, String id) throws Exception {
        if (StringUtils.hasLength((String)id)) {
            DeleteLogDO deleteLog = this.createDeleteLog(this.getTableName(fullName), id);
            this.ymsJdbcApi.insert((BaseEntity)deleteLog);
        }
    }

    public List<DeleteLogDO> selectDeleteLog(String fullName, String id) throws Exception {
        StringBuilder sql = new StringBuilder();
        sql.append("select id, table_name, doc_id from bd_delete_log where ytenant_id = ? ");
        SQLParameter parameter = new SQLParameter();
        parameter.addParam(InvocationInfoProxy.getTenantid());
        if (null != fullName) {
            parameter.addParam(this.getTableName(fullName));
            sql.append(" and table_name = ? ");
        }
        if (null != id) {
            parameter.addParam(id);
            sql.append(" and doc_id = ? ");
        }
        return this.ymsJdbcApi.queryForDTOList(sql.toString(), parameter, DeleteLogDO.class);
    }

    public void insertRecycleDatas(String fullName, List<Map> datas) throws Exception {
        if (!CollectionUtils.isEmpty(datas)) {
            List<BDRecycleDO> recycleDOs = this.createBDRecycleDOs(fullName, datas);
            this.ymsJdbcApi.insert(recycleDOs);
        }
    }

    public void insertRecycleData(String fullName, Map data) throws Exception {
        BDRecycleDO recycleDO = this.createBDRecycleDO(fullName, data);
        this.ymsJdbcApi.insert((BaseEntity)recycleDO);
    }

    public List<BDRecycleDO> selectRecycleDatas(String fullName, String docId, List<String> docIds, Date startTs, Date endTs, @NotNull Long pageIndex, @NotNull Long pageSize) {
        if (!StringUtils.hasText((String)fullName)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_FULLNAME_NOT_NULL);
        }
        StringBuilder sql = new StringBuilder();
        sql.append("select id, doc_uri, doc_id, doc_data from bd_delete_recycle where ytenant_id = ? ");
        SQLParameter parameter = new SQLParameter();
        parameter.addParam(InvocationInfoProxy.getTenantid());
        if (null != fullName) {
            parameter.addParam(fullName);
            sql.append(" and doc_uri = ? ");
        }
        if (null != docId) {
            parameter.addParam(docId);
            sql.append(" and doc_id = ? ");
        }
        if (null != startTs) {
            parameter.addParam((Object)startTs);
            sql.append(" and pubts > ? ");
        }
        if (null != endTs) {
            parameter.addParam((Object)endTs);
            sql.append(" and pubts < ? ");
        }
        if (docIds != null && docIds.size() > 0) {
            sql.append(" and doc_id in (");
            for (String id : docIds) {
                sql.append("'").append(id).append("'").append(",");
            }
            sql.deleteCharAt(sql.length() - 1);
            sql.append(")");
        }
        if (pageIndex >= 1L) {
            pageIndex = pageIndex - 1L;
        }
        sql.append(" limit ").append(pageIndex * pageSize).append(", ").append(pageSize);
        return this.ymsJdbcApi.queryForDTOList(sql.toString(), parameter, BDRecycleDO.class);
    }

    public Long selectRecycleDatasCount(String fullName, String docId, List<String> docIds, Date startTs, Date endTs) {
        StringBuilder sql = new StringBuilder();
        sql.append("select count(1) as totalCount from bd_delete_recycle where ytenant_id = ? ");
        SQLParameter parameter = new SQLParameter();
        parameter.addParam(InvocationInfoProxy.getTenantid());
        if (null != fullName) {
            parameter.addParam(fullName);
            sql.append(" and doc_uri = ? ");
        }
        if (null != docId) {
            parameter.addParam(docId);
            sql.append(" and doc_id = ? ");
        }
        if (null != startTs) {
            parameter.addParam((Object)startTs);
            sql.append(" and pubts > ? ");
        }
        if (null != endTs) {
            parameter.addParam((Object)endTs);
            sql.append(" and pubts < ? ");
        }
        if (docIds != null && docIds.size() > 0) {
            sql.append(" and doc_id in (");
            for (String id : docIds) {
                sql.append("'").append(id).append("'").append(",");
            }
            sql.deleteCharAt(sql.length() - 1);
            sql.append(")");
        }
        return (long)((Long)this.ymsJdbcApi.queryForObject(sql.toString(), parameter, (ResultSetProcessor)new ColumnProcessor()));
    }

    public void deleteByDateBefore(Date date) {
        SQLParameter parameter = new SQLParameter();
        parameter.addParam((Object)date);
        this.ymsJdbcApi.update("delete from bd_delete_log where pubts < ?", parameter);
        this.ymsJdbcApi.update("delete from bd_delete_recycle where pubts < ?", parameter);
    }

    private List<DeleteLogDO> createDeleteLogs(String tableName, List<String> ids) {
        ArrayList deleteLogDOS = new ArrayList();
        if (!CollectionUtils.isEmpty(ids)) {
            ids.forEach(id -> deleteLogDOS.add(this.createDeleteLog(tableName, (String)id)));
        }
        return new ArrayList<DeleteLogDO>();
    }

    private DeleteLogDO createDeleteLog(String tableName, String id) {
        DeleteLogDO deleteLogDO = new DeleteLogDO();
        deleteLogDO.setTableName(tableName);
        deleteLogDO.setDocID(id);
        deleteLogDO.setYtenantId(InvocationInfoProxy.getTenantid());
        deleteLogDO.setOperator(InvocationInfoProxy.getUserid());
        deleteLogDO.setPubts(new Date());
        return deleteLogDO;
    }

    private List<BDRecycleDO> createBDRecycleDOs(String fullName, List<Map> datas) throws Exception {
        ArrayList<BDRecycleDO> recycleDOs = new ArrayList<BDRecycleDO>();
        for (Map data : datas) {
            recycleDOs.add(this.createBDRecycleDO(fullName, data));
        }
        return recycleDOs;
    }

    private BDRecycleDO createBDRecycleDO(String fullName, Map data) throws Exception {
        BDRecycleDO recycleDO = new BDRecycleDO();
        recycleDO.setDocUri(fullName);
        if (null != data.get("id")) {
            recycleDO.setDocID(data.get("id").toString());
        }
        recycleDO.setDocData(UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)data).getBytes());
        recycleDO.setYtenantId(InvocationInfoProxy.getTenantid());
        recycleDO.setOperator(InvocationInfoProxy.getUserid());
        return recycleDO;
    }

    private String getTableName(String fullName) throws Exception {
        Entity entity = MetaDaoHelper.getEntity((String)fullName);
        return entity.getMainTableName();
    }
}

