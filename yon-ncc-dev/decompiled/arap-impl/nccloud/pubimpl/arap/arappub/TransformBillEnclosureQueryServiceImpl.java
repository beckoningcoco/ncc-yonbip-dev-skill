/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.dao.DAOException
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.pub.IArapBillService
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.web.arap.util.EnclosureQueryUtil
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.pubitf.arap.arappub.ITransformBillEnclosureQueryService
 *  nccloud.pubitf.platform.attachment.WebFileParaVO
 */
package nccloud.pubimpl.arap.arappub;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.dao.BaseDAO;
import nc.bs.dao.DAOException;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.pub.IArapBillService;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.web.arap.util.EnclosureQueryUtil;
import nccloud.commons.lang.ArrayUtils;
import nccloud.pubitf.arap.arappub.ITransformBillEnclosureQueryService;
import nccloud.pubitf.platform.attachment.WebFileParaVO;

public class TransformBillEnclosureQueryServiceImpl
implements ITransformBillEnclosureQueryService {
    public WebFileParaVO[] enclosureQuery(WebFileParaVO para, Map<String, String> map) throws BusinessException {
        HashMap keyMap = new HashMap();
        Map billTypeMap = this.getBillTypeMap(map.values());
        ArrayList<String> keyList = null;
        String pk_billType = null;
        for (String key : map.keySet()) {
            pk_billType = map.get(key);
            if (keyMap.keySet().contains(pk_billType)) {
                ((List)keyMap.get(pk_billType)).add(key);
                continue;
            }
            keyList = new ArrayList<String>();
            keyList.add(key);
            keyMap.put(pk_billType, keyList);
        }
        ArrayList<BaseAggVO> aggVOList = new ArrayList<BaseAggVO>();
        BaseAggVO[] aggVos = null;
        for (String billType : keyMap.keySet()) {
            if (billTypeMap.get(billType) != null) {
                billType = (String)billTypeMap.get(billType);
            }
            aggVos = ((IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class)).queryArapBillByPKs(((List)keyMap.get(billType)).toArray(new String[0]), billType);
            aggVOList.addAll(new ArrayList<BaseAggVO>(Arrays.asList(aggVos)));
        }
        if (aggVOList.isEmpty()) {
            return null;
        }
        WebFileParaVO[] returnvo = null;
        String fullPath = para.getFullPath();
        ArrayList<String> tfblists = new ArrayList<String>();
        BaseItemVO[] items = null;
        for (BaseAggVO aggvo : aggVOList) {
            for (BaseItemVO item : items = (BaseItemVO[])aggvo.getChildrenVO()) {
                if (item.getAttributeValue("transerial") == null) continue;
                tfblists.add(item.getAttributeValue("transerial").toString());
            }
        }
        if (fullPath.contains("/")) {
            String folderName = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0951");
            if (fullPath.contains("/" + folderName)) {
                if (tfblists.size() == 0) {
                    return new WebFileParaVO[0];
                }
                String[] transerials = tfblists.toArray(new String[0]);
                List webFileParaVOs = EnclosureQueryUtil.yhhdEnclosureQuery((String[])transerials);
                returnvo = webFileParaVOs.toArray(new WebFileParaVO[0]);
            } else {
                returnvo = EnclosureQueryUtil.billEnclosureQuery((String)fullPath, (String)para.getBillId());
            }
        } else {
            Object[] webFileParaVO = EnclosureQueryUtil.billEnclosureQuery((String)fullPath, (String)para.getBillId());
            WebFileParaVO[] webFileParaVO2 = null;
            if (tfblists.size() > 0) {
                String[] transerials = tfblists.toArray(new String[0]);
                List webFileParaVOs = EnclosureQueryUtil.yhhdEnclosureQuery((String[])transerials);
                webFileParaVO2 = webFileParaVOs.toArray(new WebFileParaVO[0]);
            }
            returnvo = (WebFileParaVO[])ArrayUtils.addAll((Object[])webFileParaVO, webFileParaVO2);
        }
        return returnvo;
    }

    private Map getBillTypeMap(Collection<String> collection) {
        BaseDAO dao = new BaseDAO();
        final HashMap billTypeMap = new HashMap();
        StringBuilder sql = new StringBuilder("select pk_billtypecode,parentbilltype from bd_billtype where  pk_billtypecode in ('");
        for (String billtype : collection) {
            sql.append(billtype + "',");
        }
        String querysql = sql.toString().substring(0, sql.length() - 1);
        try {
            dao.executeQuery(querysql + ")", new ResultSetProcessor(){
                private static final long serialVersionUID = 1L;

                public Object handleResultSet(ResultSet rs) throws SQLException {
                    while (rs.next()) {
                        billTypeMap.put(rs.getString("pk_billtypecode"), rs.getString("parentbilltype"));
                    }
                    return rs;
                }
            });
        }
        catch (DAOException e) {
            ExceptionHandler.consume((Throwable)e);
        }
        return billTypeMap;
    }
}

