/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.termendtransact.ICloseAccountService
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.org.closeaccbook.CheckItemVO
 *  nc.vo.pub.BusinessException
 *  nccloud.dto.arap.arappub.CloseAccountVO
 *  nccloud.pubitf.arap.arappub.ICheckCloseAccValueService
 */
package nccloud.pubimpl.arap.arappub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.termendtransact.ICloseAccountService;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.org.closeaccbook.CheckItemVO;
import nc.vo.pub.BusinessException;
import nccloud.dto.arap.arappub.CloseAccountVO;
import nccloud.pubitf.arap.arappub.ICheckCloseAccValueService;

public class CheckCloseAccValueServiceImpl
implements ICheckCloseAccValueService {
    public HashMap<String, Object> getCheckCloseAccValue(String pk_checkitem, String pk_org, String period) throws BusinessException {
        HashMap<String, Object> map = new HashMap<String, Object>();
        BaseDAO baseDao = new BaseDAO();
        Object obj = baseDao.retrieveByPK(CheckItemVO.class, pk_checkitem);
        CheckItemVO checkItemVo = (CheckItemVO)obj;
        String moduleid = checkItemVo.getModuleid();
        boolean isAr = true;
        String reportTitle = null;
        if ("2006".equals(moduleid)) {
            isAr = true;
            reportTitle = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0876");
        } else if ("2008".equals(moduleid)) {
            reportTitle = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0877");
            isAr = false;
        } else {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0878"));
        }
        Vector vResult = ((ICloseAccountService)NCLocator.getInstance().lookup(ICloseAccountService.class)).CheckCloseAccValue(pk_org, period, isAr, checkItemVo.getCode());
        ArrayList<CloseAccountVO> dataList = new ArrayList<CloseAccountVO>();
        if (!vResult.isEmpty()) {
            for (int i = 0; i < vResult.size(); ++i) {
                CloseAccountVO vo = new CloseAccountVO();
                Vector vector = (Vector)vResult.get(i);
                vo.setSerial((String)vector.get(0));
                vo.setNotQualified((String)vector.get(1));
                vo.setResult((String)vector.get(2));
                dataList.add(vo);
            }
        }
        map.put("dataList", dataList);
        map.put("reportTitle", reportTitle);
        return map;
    }
}

