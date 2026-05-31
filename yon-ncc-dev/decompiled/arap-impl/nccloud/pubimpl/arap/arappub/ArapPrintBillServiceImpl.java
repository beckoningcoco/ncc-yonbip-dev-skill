/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.bill.IArapBillBaseService
 *  nc.itf.arap.bill.IArapBillQueryBaseService
 *  nc.pubitf.arap.bill.IArapBillPubService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.pub.ArapBillTypeInfo
 *  nc.vo.arap.pub.BillEnumCollection$InureSign
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nccloud.pubitf.arap.arappub.IPrintBillService
 */
package nccloud.pubimpl.arap.arappub;

import java.util.ArrayList;
import java.util.List;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.bill.IArapBillBaseService;
import nc.itf.arap.bill.IArapBillQueryBaseService;
import nc.pubitf.arap.bill.IArapBillPubService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.ArapBillTypeInfo;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nccloud.pubitf.arap.arappub.IPrintBillService;

public class ArapPrintBillServiceImpl
implements IPrintBillService {
    public boolean checkOfficialPirnt(BaseAggVO[] datas) throws BusinessException {
        int status = 0;
        for (BaseAggVO data : datas) {
            status = this.checkOfficalPrinted(data);
            if (0 == status) continue;
            if (1 == status) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0101"));
            }
            if (2 != status) continue;
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0102"));
        }
        UFDate offPrtDate = new UFDate(InvocationInfoProxy.getInstance().getBizDateTime());
        for (BaseAggVO vo : datas) {
            ((IArapBillBaseService)NCLocator.getInstance().lookup(ArapBillTypeInfo.getInstance((Object)vo).getBillService())).updatePrintFlag(new String[]{vo.getPrimaryKey()}, offPrtDate);
        }
        return true;
    }

    public boolean checkCancelPirnt(BaseAggVO[] datas) throws BusinessException {
        ArrayList<String> primartKey = new ArrayList<String>();
        if (datas == null || datas.length == 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0703"));
        }
        for (BaseAggVO data : datas) {
            primartKey.add(data.getPrimaryKey());
        }
        List nopeOfficialPrint = ((IArapBillPubService)NCLocator.getInstance().lookup(IArapBillPubService.class)).checkCancelPrintOfficialPrintStatus(datas[0], primartKey.toArray(new String[datas.length]));
        if (nopeOfficialPrint != null && nopeOfficialPrint.size() != 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0070"));
        }
        for (BaseAggVO data : datas) {
            String ts = this.cancelOfficalPrinted(data);
            BaseAggVO agg = data;
            if (ts == null) continue;
            agg.getHeadVO().setTs(new UFDateTime(ts));
        }
        return true;
    }

    private int checkOfficalPrinted(Object vo) throws BusinessException {
        String offPrtUser = null;
        BaseAggVO[] vos = ((IArapBillQueryBaseService)NCLocator.getInstance().lookup(ArapBillTypeInfo.getInstance((Object)((BaseAggVO)vo)).getBillQueryService())).findBillByPrimaryKey(new String[]{((BaseAggVO)vo).getPrimaryKey()});
        offPrtUser = vos[0].getHeadVO().getOfficialprintuser();
        if (offPrtUser != null && offPrtUser.trim().length() > 0) {
            return 1;
        }
        int status = (Integer)(vos[0].getParent().getAttributeValue("effectstatus") == null ? Integer.valueOf(0) : vos[0].getParent().getAttributeValue("effectstatus"));
        if (status != BillEnumCollection.InureSign.OKINURE.VALUE) {
            return 2;
        }
        return 0;
    }

    private String cancelOfficalPrinted(Object vo) throws BusinessException {
        BaseItemVO[] bodyVOs;
        BaseAggVO tempVo = (BaseAggVO)vo;
        tempVo.getParent().setAttributeValue("officialprintuser", null);
        tempVo.getParent().setAttributeValue("officialprintdate", null);
        tempVo.getParent().setStatus(1);
        for (BaseItemVO body : bodyVOs = (BaseItemVO[])tempVo.getChildrenVO()) {
            body.setStatus(0);
        }
        String ts = null;
        ts = ((IArapBillBaseService)NCLocator.getInstance().lookup(ArapBillTypeInfo.getInstance((Object)((BaseAggVO)vo)).getBillService())).cleanPrintFlag(new String[]{((BaseAggVO)vo).getPrimaryKey()});
        return ts;
    }
}

