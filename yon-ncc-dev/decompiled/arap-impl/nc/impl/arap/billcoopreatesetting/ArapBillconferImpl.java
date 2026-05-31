/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.bill.IArapBillBaseService
 *  nc.itf.arap.billconfer.IBillConferService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.billconfer.BillconferVO
 *  nc.vo.arap.pub.ArapBillTypeInfo
 *  nc.vo.pub.BusinessException
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.impl.arap.billcoopreatesetting;

import java.util.Vector;
import nc.bs.arap.billconfer.BillconferBO;
import nc.bs.arap.billconfer.BillconferDAO;
import nc.bs.arap.busireg.BConferUtils;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.bill.IArapBillBaseService;
import nc.itf.arap.billconfer.IBillConferService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.billconfer.BillconferVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.pub.BusinessException;
import nccloud.commons.lang.ArrayUtils;

public class ArapBillconferImpl
implements IBillConferService {
    public void deleteConfer(BillconferVO vo) throws BusinessException {
        new BillconferBO().delete(vo);
    }

    public BillconferVO findConferByPK(String pk_confer) throws BusinessException {
        return new BillconferBO().findByPrimaryKey(pk_confer);
    }

    public String insertConfer(BillconferVO voConfer) throws BusinessException {
        return new BillconferBO().insert(voConfer);
    }

    public String[] insertArrayConfer(BillconferVO[] voconfers) throws BusinessException {
        return new BillconferBO().insertArray(voconfers);
    }

    public BillconferVO[] queryConferByCorpPk(String pk_corp) throws BusinessException {
        return new BillconferBO().queryAll(pk_corp);
    }

    public void updateConfer(BillconferVO voconfer) throws BusinessException {
        new BillconferBO().update(voconfer);
    }

    public BillconferVO[] queryConfigInfo(String pk_corp, Vector vAccountIds) throws BusinessException {
        return new BillconferDAO().queryConfigInfo(pk_corp, vAccountIds);
    }

    public void deleteVOS(BaseAggVO[] bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        ((IArapBillBaseService)NCLocator.getInstance().lookup(ArapBillTypeInfo.getInstance((Object)bills[0]).getBillService())).delete(bills);
    }

    public void clearBillConferNum(BaseAggVO[] bills) throws BusinessException {
        new BConferUtils().clearBillConferNum(bills);
    }
}

