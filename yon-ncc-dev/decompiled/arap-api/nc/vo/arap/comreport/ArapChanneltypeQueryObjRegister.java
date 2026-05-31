/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.model.IBean
 *  nc.vo.bd.cust.channeltype.ChannelTypeVO
 *  nc.vo.fipub.report.QueryObjVO
 *  nc.vo.ml.NCLangRes4VoTransl
 */
package nc.vo.arap.comreport;

import nc.md.model.IBean;
import nc.vo.arap.comreport.ArapBaseQueryObjRegister;
import nc.vo.arap.tally.TallyAllVO;
import nc.vo.bd.cust.channeltype.ChannelTypeVO;
import nc.vo.fipub.report.QueryObjVO;
import nc.vo.ml.NCLangRes4VoTransl;

public class ArapChanneltypeQueryObjRegister
extends ArapBaseQueryObjRegister {
    private static final long serialVersionUID = 1L;
    public final String QRYOBJ_PK_SOCHANNELTYPE = "qryobj_pk_sochanneltype";

    public ArapChanneltypeQueryObjRegister() {
        super("6d90c539-bdcd-4eb1-a4f0-855f328fecb1");
    }

    @Override
    protected void setQueryObjVO(IBean bean, QueryObjVO queryObjVO) {
        queryObjVO.setQry_objtablename(TallyAllVO.getDefaultTableName());
        queryObjVO.setQry_objfieldname("so_transtype");
        queryObjVO.setDsp_objtablename(queryObjVO.getQry_objtablename());
        queryObjVO.setDsp_objfieldname(queryObjVO.getQry_objfieldname());
        queryObjVO.setDsp_objname(NCLangRes4VoTransl.getNCLangRes().getStrByID("arap", "1arap0186"));
        queryObjVO.setBd_refname("\u6e20\u9053\u7c7b\u578b");
        queryObjVO.setBd_tablename(ChannelTypeVO.getDefaultTableName());
        queryObjVO.setBd_pkfield("pk_type");
        queryObjVO.setBd_codefield("code");
        queryObjVO.setBd_namefield("name");
        queryObjVO.setResid("qryobj_pk_sochanneltype");
        queryObjVO.setBillfieldname("so_transtype");
        queryObjVO.setBalfieldname(null);
        queryObjVO.setTallyfieldname(TallyAllVO.getDefaultTableName() + "." + "so_transtype");
    }
}

