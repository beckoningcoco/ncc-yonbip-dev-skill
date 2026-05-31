/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.framework.exception.ComponentException
 *  nc.bs.logging.Log
 *  nc.bs.logging.Logger
 *  nc.itf.uap.pf.IPFMetaModel
 *  nc.jdbc.framework.processor.ColumnListProcessor
 *  nc.jdbc.framework.processor.ResultSetProcessor
 *  nc.vo.arap.billconfer.BillconferVO
 *  nc.vo.arap.global.ArapCommonTool
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.billtype.BilltypeVO
 */
package nc.bs.arap.billconfer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.bs.framework.exception.ComponentException;
import nc.bs.logging.Log;
import nc.bs.logging.Logger;
import nc.itf.uap.pf.IPFMetaModel;
import nc.jdbc.framework.processor.ColumnListProcessor;
import nc.jdbc.framework.processor.ResultSetProcessor;
import nc.vo.arap.billconfer.BillconferVO;
import nc.vo.arap.global.ArapCommonTool;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nc.vo.pub.billtype.BilltypeVO;

public class BillconferBO {
    public void delete(BillconferVO vo) throws BusinessException {
        try {
            BaseDAO dao = new BaseDAO();
            BillconferVO newvo = vo;
            newvo.setDr(ArapConstant.INT_ONE);
            dao.updateVO((SuperVO)newvo);
        }
        catch (Exception e) {
            Log.getInstance(this.getClass()).error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessException("BillconferBO::delete(BillconferPK) Exception!", (Throwable)e);
        }
    }

    public BillconferVO findByPrimaryKey(String key) throws BusinessException {
        BillconferVO billconfer = null;
        try {
            BaseDAO dao = new BaseDAO();
            Collection cl = dao.retrieveByClause(BillconferVO.class, "where dr=0 and pk_bconfer='" + key + "'");
            Object o = BillconferBO.changeCollection2Array(cl, BillconferVO.class);
            if (o != null) {
                billconfer = ((BillconferVO[])o)[0];
            }
        }
        catch (Exception e) {
            Log.getInstance(this.getClass()).error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessException("BillconferBean::findByPrimaryKey(BillconferPK) Exception!", (Throwable)e);
        }
        return billconfer;
    }

    public static Object changeCollection2Array(Collection cl, Class sClass) {
        if (cl.isEmpty()) {
            return null;
        }
        Object[] o = (Object[])Array.newInstance(sClass, cl.size());
        o = cl.toArray(o);
        return o;
    }

    public String insert(BillconferVO billconfer) throws BusinessException {
        try {
            String id = this.insertArray(new BillconferVO[]{billconfer})[0];
            this.validateConferSetting();
            return id;
        }
        catch (Exception e) {
            Log.getInstance(this.getClass()).error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessException(e.getMessage(), (Throwable)e);
        }
    }

    public void validateConferSetting() throws BusinessException {
        List result = (List)new BaseDAO().executeQuery("select busitype from arap_billconfer where dr=0 group by busitype,sourcebill,sourceorg,targetorg having count(*)>1", (ResultSetProcessor)new ColumnListProcessor());
        if (result != null && result.size() > 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0523_0", "02006arappub0523-0063"));
        }
    }

    public String[] insertArray(BillconferVO[] billconfers) throws BusinessException {
        try {
            BaseDAO dao = new BaseDAO();
            return dao.insertVOArray((SuperVO[])billconfers);
        }
        catch (Exception e) {
            Log.getInstance(this.getClass()).error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessException(e.getMessage(), (Throwable)e);
        }
    }

    public BillconferVO[] queryAll(String pk_group) throws BusinessException {
        if (pk_group == null) {
            pk_group = "0001";
        }
        BillconferVO[] billconfers = null;
        try {
            BaseDAO dao = new BaseDAO();
            Collection cl = dao.retrieveByClause(BillconferVO.class, "pk_group = '" + pk_group + "' and dr=0 order by ts desc");
            try {
                billconfers = (BillconferVO[])ArapCommonTool.changeCollection2Array((Collection)cl, BillconferVO.class);
            }
            catch (Exception e) {
                Logger.error((Object)"erro", (Throwable)e);
                throw e;
            }
        }
        catch (Exception e) {
            Log.getInstance(this.getClass()).error((Object)e.getMessage());
            throw new BusinessException("BillconferBean::queryAll(String pk_group) Exception!", (Throwable)e);
        }
        this.spulyvoinfos(billconfers);
        return billconfers;
    }

    private void spulyvoinfos(BillconferVO[] billconfers) throws BusinessException {
        if (billconfers == null || billconfers.length <= 0) {
            return;
        }
        Hashtable<String, BilltypeVO> djlxhash = new Hashtable<String, BilltypeVO>();
        ArrayList<String> fiorgList = new ArrayList<String>();
        for (BillconferVO billconferVO : billconfers) {
            if (!fiorgList.contains(billconferVO.getSourceorg())) {
                fiorgList.add(billconferVO.getSourceorg());
            }
            if (fiorgList.contains(billconferVO.getTargetorg())) continue;
            fiorgList.add(billconferVO.getTargetorg());
        }
        try {
            IPFMetaModel iPFMetaModel = (IPFMetaModel)NCLocator.getInstance().lookup(IPFMetaModel.class.getName());
            String wheresql = " systemcode='AR' or systemcode='AP'";
            BilltypeVO[] BilltypeVOs = iPFMetaModel.queryBillTypeByWhere(wheresql);
            if (BilltypeVOs != null) {
                for (int i = 0; i < BilltypeVOs.length; ++i) {
                    djlxhash.put(BilltypeVOs[i].getPk_group() + "_" + BilltypeVOs[i].getPk_billtypecode(), BilltypeVOs[i]);
                }
            }
        }
        catch (ComponentException e) {
            Log.getInstance(this.getClass()).warn((Object)e);
        }
        catch (BusinessException e) {
            Log.getInstance(this.getClass()).error((Object)e);
            throw e;
        }
        String sourcebilltype = null;
        String targetbilltype = null;
        for (int i = 0; i < billconfers.length; ++i) {
            sourcebilltype = billconfers[i].getSourcebill();
            targetbilltype = billconfers[i].getTargetbill();
            String pk_group = billconfers[i].getPk_group();
            try {
                billconfers[i].setSourcebillname(((BilltypeVO)djlxhash.get(pk_group + "_" + sourcebilltype)).getBilltypenameOfCurrLang());
            }
            catch (Exception e) {
                Log.getInstance(this.getClass()).debug((Object)e);
            }
            try {
                billconfers[i].setTargetbillname(((BilltypeVO)djlxhash.get(pk_group + "_" + targetbilltype)).getBilltypenameOfCurrLang());
                continue;
            }
            catch (Exception e) {
                Log.getInstance(this.getClass()).debug((Object)e);
            }
        }
    }

    public void update(BillconferVO billconfer) throws BusinessException {
        try {
            BaseDAO dao = new BaseDAO();
            dao.updateVO((SuperVO)billconfer);
            this.validateConferSetting();
        }
        catch (Exception e) {
            Log.getInstance(this.getClass()).error((Object)e.getMessage());
            throw new BusinessException(e.getMessage(), (Throwable)e);
        }
    }
}

