/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.fipub.report.IQueryObjRegister
 *  nc.md.MDBaseQueryFacade
 *  nc.md.model.IBean
 *  nc.md.model.MetaDataException
 *  nc.vo.fipub.report.QueryObjVO
 *  nccloud.commons.lang.StringUtils
 */
package nc.vo.arap.comreport;

import java.io.Serializable;
import nc.itf.fipub.report.IQueryObjRegister;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.md.model.MetaDataException;
import nc.vo.fipub.report.QueryObjVO;
import nccloud.commons.lang.StringUtils;

public abstract class ArapBaseQueryObjRegister
implements Serializable,
IQueryObjRegister {
    private static final long serialVersionUID = 1L;
    private String m_beanID = null;

    public ArapBaseQueryObjRegister(String beanID) {
        this.m_beanID = beanID;
    }

    public QueryObjVO register(String ownModule, String beanID, Integer propIndex, int pos) throws MetaDataException {
        if (StringUtils.isEmpty((CharSequence)this.m_beanID)) {
            return null;
        }
        IBean bean = MDBaseQueryFacade.getInstance().getBeanByID(this.m_beanID);
        if (bean == null) {
            return null;
        }
        QueryObjVO queryObjVO = new QueryObjVO();
        queryObjVO.setOwnmodule(ownModule);
        queryObjVO.setReporttype(null);
        queryObjVO.setCreator(null);
        queryObjVO.setDr(Integer.valueOf(0));
        queryObjVO.setBd_mdid(bean.getID());
        queryObjVO.setBd_refname(bean.getRefModelName());
        this.setQueryObjVO(bean, queryObjVO);
        return queryObjVO;
    }

    protected abstract void setQueryObjVO(IBean var1, QueryObjVO var2);
}

