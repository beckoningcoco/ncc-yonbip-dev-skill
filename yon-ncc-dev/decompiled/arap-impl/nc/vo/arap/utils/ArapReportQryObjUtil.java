/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.fipub.report.QryObj
 *  nc.vo.fipub.report.QueryObjVO
 *  nc.vo.fipub.report.ReportInitializeItemVO
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.vo.arap.utils;

import java.util.ArrayList;
import java.util.List;
import nc.vo.fipub.report.QryObj;
import nc.vo.fipub.report.QueryObjVO;
import nc.vo.fipub.report.ReportInitializeItemVO;
import nccloud.commons.lang.ArrayUtils;

public class ArapReportQryObjUtil {
    public static QryObj convertQueryObjVO2QryObj(QueryObjVO queryObjVO) {
        QryObj qryObj = new QryObj();
        qryObj.setOwnModule(queryObjVO.getOwnmodule());
        qryObj.setDspName(queryObjVO.getDsp_objname());
        qryObj.setOriginTbl(queryObjVO.getQry_objtablename());
        qryObj.setOriginFld(queryObjVO.getQry_objfieldname());
        qryObj.setPk_bdinfo(queryObjVO.getBd_mdid());
        qryObj.setBd_name(queryObjVO.getBd_refname());
        qryObj.setBd_table(queryObjVO.getBd_tablename());
        qryObj.setBd_pkField(queryObjVO.getBd_pkfield());
        qryObj.setBd_codeField(queryObjVO.getBd_codefield());
        qryObj.setBd_nameField(queryObjVO.getBd_namefield());
        qryObj.setBillFieldName(queryObjVO.getBillfieldname());
        qryObj.setBalFieldName(queryObjVO.getBalfieldname());
        qryObj.setTallyFieldName(queryObjVO.getTallyfieldname());
        return qryObj;
    }

    public static ReportInitializeItemVO convertQueryObjVO2ReportInitializeItemVO(QueryObjVO queryObjVO, int dsp_order) {
        ReportInitializeItemVO repInitBody = new ReportInitializeItemVO();
        repInitBody.setBd_mdid(queryObjVO.getBd_mdid());
        repInitBody.setBd_refname(queryObjVO.getBd_refname());
        repInitBody.setBd_tablename(queryObjVO.getBd_tablename());
        repInitBody.setBd_pkfield(queryObjVO.getBd_pkfield());
        repInitBody.setBd_codefield(queryObjVO.getBd_codefield());
        repInitBody.setBd_namefield(queryObjVO.getBd_namefield());
        repInitBody.setResid(queryObjVO.getResid());
        repInitBody.setQry_objtablename(queryObjVO.getQry_objtablename());
        repInitBody.setQry_objfieldname(queryObjVO.getQry_objfieldname());
        repInitBody.setQry_objdatatype(queryObjVO.getQry_objdatatype());
        repInitBody.setDsp_objname(queryObjVO.getDsp_objname());
        repInitBody.setDsp_order(Integer.valueOf(dsp_order));
        repInitBody.setBillfieldname(queryObjVO.getBillfieldname());
        repInitBody.setBalfieldname(queryObjVO.getBalfieldname());
        repInitBody.setTallyfieldname(queryObjVO.getTallyfieldname());
        return repInitBody;
    }

    public static List<QryObj> convertReportInitializeItemVO2QryObj(ReportInitializeItemVO[] itemVOs) {
        ArrayList<QryObj> retList = new ArrayList<QryObj>();
        if (ArrayUtils.isEmpty((Object[])itemVOs)) {
            return retList;
        }
        QryObj qryObj = null;
        for (ReportInitializeItemVO vo : itemVOs) {
            qryObj = new QryObj();
            qryObj.setOwnModule("arap");
            qryObj.setDspName(vo.getDsp_objname());
            qryObj.setOriginTbl(vo.getQry_objtablename());
            qryObj.setOriginFld(vo.getQry_objfieldname());
            qryObj.setPk_bdinfo(vo.getBd_mdid());
            qryObj.setBd_name(vo.getBd_refname());
            qryObj.setBd_table(vo.getBd_tablename());
            qryObj.setBd_pkField(vo.getBd_pkfield());
            qryObj.setBd_codeField(vo.getBd_codefield());
            qryObj.setBd_nameField(vo.getBd_namefield());
            qryObj.setBillFieldName(vo.getBillfieldname());
            qryObj.setBalFieldName(vo.getBalfieldname());
            qryObj.setTallyFieldName(vo.getTallyfieldname());
            retList.add(qryObj);
        }
        return retList;
    }
}

