/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.fipub.report.IQueryObjRegister
 *  nc.md.MDBaseQueryFacade
 *  nc.md.model.IBean
 *  nc.md.model.MetaDataException
 *  nc.vo.bd.defdoc.DefdocVO
 *  nc.vo.fipub.report.QueryObjVO
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.vo.arap.comreport;

import java.io.Serializable;
import nc.itf.fipub.report.IQueryObjRegister;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.md.model.MetaDataException;
import nc.vo.arap.tally.BalanceVO;
import nc.vo.arap.tally.TallyAllVO;
import nc.vo.arap.tally.TallyVO;
import nc.vo.bd.defdoc.DefdocVO;
import nc.vo.fipub.report.QueryObjVO;
import nc.vo.ml.NCLangRes4VoTransl;

public class ArapReportQueryObjRegister
implements Serializable,
IQueryObjRegister {
    private static final long serialVersionUID = 1L;

    public QueryObjVO register(String ownModule, String beanID, Integer propIndex, int pos) throws MetaDataException {
        IBean bean = MDBaseQueryFacade.getInstance().getBeanByID(beanID);
        if (bean == null) {
            return null;
        }
        QueryObjVO queryObjVO = new QueryObjVO();
        queryObjVO.setOwnmodule(ownModule);
        queryObjVO.setReporttype(null);
        queryObjVO.setQry_objtablename(BalanceVO.getDefaultTableName());
        queryObjVO.setQry_objfieldname("def" + propIndex);
        queryObjVO.setDsp_objtablename(queryObjVO.getQry_objtablename());
        queryObjVO.setDsp_objfieldname(queryObjVO.getQry_objfieldname());
        queryObjVO.setDsp_objname(bean.getRefModelName());
        queryObjVO.setBd_mdid(bean.getID());
        queryObjVO.setBd_refname(bean.getRefModelName());
        queryObjVO.setBd_tablename(new DefdocVO().getTableName());
        queryObjVO.setBd_pkfield("pk_defdoc");
        queryObjVO.setBd_codefield("code");
        queryObjVO.setBd_namefield("name");
        queryObjVO.setCreator(null);
        queryObjVO.setDr(Integer.valueOf(0));
        queryObjVO.setBillfieldname("def" + propIndex);
        queryObjVO.setBalfieldname(null);
        String tallyfieldname = null;
        String description = null;
        if (0 == pos) {
            tallyfieldname = TallyAllVO.getDefaultTableName() + ".h_def" + propIndex;
            description = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0320");
        } else if (1 == pos) {
            tallyfieldname = TallyVO.getDefaultTableName() + ".def" + propIndex;
            description = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0321");
        } else {
            throw new MetaDataException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61008_0", "02006v61008-0322"));
        }
        queryObjVO.setTallyfieldname(tallyfieldname);
        queryObjVO.setDescription(description);
        return queryObjVO;
    }
}

