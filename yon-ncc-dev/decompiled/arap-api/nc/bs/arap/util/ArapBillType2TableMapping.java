/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.ISuperVO
 *  nc.vo.pub.billtype.BilltypeVO
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 */
package nc.bs.arap.util;

import java.util.HashMap;
import java.util.Map;
import nc.bs.logging.Logger;
import nc.vo.arap.cache.FiPubDataCache;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.BusinessException;
import nc.vo.pub.ISuperVO;
import nc.vo.pub.billtype.BilltypeVO;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;

public class ArapBillType2TableMapping {
    private static Map<String, String> type2Parent = new HashMap<String, String>();
    private static Map<String, String> type2Child = new HashMap<String, String>();
    private static Map<String, String> type2ParPK = new HashMap<String, String>();
    private static Map<String, String> typeChldPk = new HashMap<String, String>();
    private static Map<String, String> chld_pk = new HashMap<String, String>();
    private static Map<String, String> type2Str = new HashMap<String, String>();
    private static Map<String, String> type2ChildVO = new HashMap<String, String>();
    private static Map<String, String> type2ParentVO = new HashMap<String, String>();
    private static Map<String, String> type2trade = new HashMap<String, String>();
    private static Map<String, String> type2QueryService = new HashMap<String, String>();
    private static Map<String, String> type2Service = new HashMap<String, String>();
    private static Map<String, String> type2pk_item = new HashMap<String, String>();
    private static Map<String, String> type2pk_bill = new HashMap<String, String>();
    private static Map<String, Class> type2Map = new HashMap<String, Class>();

    public static Class<IBill> getVOClassByBilltype(String billType) {
        Class class1 = type2Map.get(billType);
        if (class1 == null) {
            BilltypeVO vo = FiPubDataCache.getBillType(billType);
            String parentbilltype = vo.getParentbilltype();
            class1 = type2Map.get(parentbilltype);
        }
        return class1;
    }

    public static Class<ISuperVO> getItemVOByBilltype(String billType) throws BusinessException {
        String clasString = type2ChildVO.get(billType);
        if (null == clasString || "".equals("clasString")) {
            ExceptionHandler.createAndThrowException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0568"));
        }
        try {
            return Class.forName(clasString);
        }
        catch (ClassNotFoundException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            return null;
        }
    }

    public static Class<ISuperVO> getParentVOByBilltype(String billType) throws BusinessException {
        String clasString = type2ParentVO.get(billType);
        if (null == clasString || "".equals("clasString")) {
            ExceptionHandler.createAndThrowException((String)NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0568"));
        }
        try {
            return Class.forName(clasString);
        }
        catch (ClassNotFoundException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            return null;
        }
    }

    public static String getPubQueryServiceByBilltype(String billType) {
        return type2QueryService.get(billType);
    }

    public static String getPubServiceByBilltype(String billType) {
        return type2Service.get(billType);
    }

    public static String getParentTable(String billType) {
        return type2Parent.get(billType);
    }

    public static String getChildrenTable(String billType) {
        return type2Child.get(billType);
    }

    public static String getParentTablePK(String billType) {
        return type2ParPK.get(billType);
    }

    public static String getChildrenTablePK(String billType) {
        return typeChldPk.get(billType);
    }

    public static String getChildren_ParentPK(String billType) {
        return chld_pk.get(billType);
    }

    public static String getPK_Tradetype(String billType) {
        return type2trade.get(billType);
    }

    public static String getPK_item(String billType) {
        return type2pk_item.get(billType);
    }

    public static String getPK_bill(String billType) {
        return type2pk_bill.get(billType);
    }

    static {
        type2trade.put("F0", "D0");
        type2trade.put("F1", "D1");
        type2trade.put("F2", "D2");
        type2trade.put("F3", "D3");
        type2trade.put("23F0", "23D0");
        type2trade.put("23F1", "23D1");
        type2trade.put("23F2", "23D2");
        type2trade.put("23F3", "23D3");
        type2trade.put("23E0", "23C0");
        type2trade.put("23E1", "23C1");
        type2Parent.put("F0", "ar_recbill");
        type2Parent.put("F1", "ap_payablebill");
        type2Parent.put("F2", "ar_gatherbill");
        type2Parent.put("F3", "ap_paybill");
        type2Parent.put("23F0", "ar_suprecbill");
        type2Parent.put("23F1", "ap_cuspayablebill");
        type2Parent.put("23F2", "ar_supgatherbill");
        type2Parent.put("23F3", "ap_cuspaybill");
        type2Parent.put("23E0", "ar_estirecbill");
        type2Parent.put("23E1", "ap_estipayablebill");
        type2Parent.put("D0", "ar_recbill");
        type2Parent.put("D1", "ap_payablebill");
        type2Parent.put("D2", "ar_gatherbill");
        type2Parent.put("D3", "ap_paybill");
        type2Parent.put("23D0", "ar_suprecbill");
        type2Parent.put("23D1", "ap_cuspayablebill");
        type2Parent.put("23D2", "ar_supgatherbill");
        type2Parent.put("23D3", "ap_cuspaybill");
        type2Parent.put("23C0", "ar_estirecbill");
        type2Parent.put("23C1", "ap_estipayablebill");
        type2Child.put("F0", "ar_recitem");
        type2Child.put("F1", "ap_payableitem");
        type2Child.put("F2", "ar_gatheritem");
        type2Child.put("F3", "ap_payitem");
        type2Child.put("23F0", "ar_suprecitem");
        type2Child.put("23F1", "ap_cuspayableitem");
        type2Child.put("23F2", "ar_supgatheritem");
        type2Child.put("23F3", "ap_cuspayitem");
        type2Child.put("23E0", "ar_estirecitem");
        type2Child.put("23E1", "ap_estipayableitem");
        type2Child.put("D0", "ar_recitem");
        type2Child.put("D1", "ap_payableitem");
        type2Child.put("D2", "ar_gatheritem");
        type2Child.put("D3", "ap_payitem");
        type2Child.put("23D0", "ar_suprecitem");
        type2Child.put("23D1", "ap_cuspayableitem");
        type2Child.put("23D2", "ar_supgatheritem");
        type2Child.put("23D3", "ap_cuspayitem");
        type2Child.put("23C0", "ar_estirecitem");
        type2Child.put("23C1", "ap_estipayableitem");
        type2ParPK.put("F0", "ar_recbill.pk_recbill");
        type2ParPK.put("F1", "ap_payablebill.pk_payablebill");
        type2ParPK.put("F2", "ar_gatherbill.pk_gatherbill");
        type2ParPK.put("F3", "ap_paybill.pk_paybill");
        type2ParPK.put("23F0", "ar_suprecbill.pk_suprecbill");
        type2ParPK.put("23F1", "ap_cuspayablebill.pk_cuspayablebill");
        type2ParPK.put("23F2", "ar_supgatherbill.pk_supgatherbill");
        type2ParPK.put("23F3", "ap_cuspaybill.pk_cuspaybill");
        type2ParPK.put("23E0", "ar_estirecbill.pk_estirecbill");
        type2ParPK.put("23E1", "ap_estipayablebill.pk_estipayablebill");
        type2ParPK.put("D0", "ar_recbill.pk_recbill");
        type2ParPK.put("D1", "ap_payablebill.pk_payablebill");
        type2ParPK.put("D2", "ar_gatherbill.pk_gatherbill");
        type2ParPK.put("D3", "ap_paybill.pk_paybill");
        type2ParPK.put("23D0", "ar_suprecbill.pk_suprecbill");
        type2ParPK.put("23D1", "ap_cuspayablebill.pk_cuspayablebill");
        type2ParPK.put("23D2", "ar_supgatherbill.pk_supgatherbill");
        type2ParPK.put("23D3", "ap_cuspaybill.pk_cuspaybill");
        type2ParPK.put("23C0", "ar_estirecbill.pk_estirecbill");
        type2ParPK.put("23C1", "ap_estipayablebill.pk_estipayablebill");
        typeChldPk.put("F0", "ar_recitem.pk_recitem");
        typeChldPk.put("F1", "ap_payableitem.pk_payableitem");
        typeChldPk.put("F2", "ar_gatheritem.pk_gatheritem");
        typeChldPk.put("F3", "ap_payitem.pk_payitem");
        typeChldPk.put("23F0", "ar_suprecitem.pk_suprecitem");
        typeChldPk.put("23F1", "ap_cuspayableitem.pk_cuspayableitem");
        typeChldPk.put("23F2", "ar_supgatheritem.pk_supgatheritem");
        typeChldPk.put("23F3", "ap_cuspayitem.pk_cuspayitem");
        typeChldPk.put("23E0", "ar_estirecitem.pk_estirecitem");
        typeChldPk.put("23E1", "ap_estipayableitem.pk_estipayableitem");
        typeChldPk.put("D0", "ar_recbill.pk_recitem");
        typeChldPk.put("D1", "ap_payablebill.pk_payableitem");
        typeChldPk.put("D2", "ar_gatherbill.pk_gatheritem");
        typeChldPk.put("D3", "ap_paybill.pk_payitem");
        typeChldPk.put("23D0", "ar_suprecbill.pk_suprecitem");
        typeChldPk.put("23D1", "ap_cuspayablebill.pk_cuspayableitem");
        typeChldPk.put("23D2", "ar_supgatherbill.pk_supgatheritem");
        typeChldPk.put("23D3", "ap_cuspaybill.pk_cuspayitem");
        typeChldPk.put("23C0", "ar_estirecbill.pk_estireceivableitem");
        typeChldPk.put("23C1", "ap_estipayablebill.pk_estipayableitem");
        chld_pk.put("F0", "ar_recitem.pk_recbill");
        chld_pk.put("F1", "ap_payableitem.pk_payablebill");
        chld_pk.put("F2", "ar_gatheritem.pk_gatherbill");
        chld_pk.put("F3", "ap_payitem.pk_paybill");
        chld_pk.put("23F0", "ar_suprecitem.pk_suprecbill");
        chld_pk.put("23F1", "ap_cuspayableitem.pk_cuspayablebill");
        chld_pk.put("23F2", "ar_supgatheritem.pk_supgatherbill");
        chld_pk.put("23F3", "ap_cuspayitem.pk_cuspaybill");
        chld_pk.put("23E0", "ar_estirecbill.pk_estirecbill");
        chld_pk.put("23E1", "ap_estipayablebill.pk_estipayablebill");
        chld_pk.put("D0", "ar_recbill.pk_recbill");
        chld_pk.put("D1", "ap_payablebill.pk_payablebill");
        chld_pk.put("D2", "ar_gatherbill.pk_gatherbill");
        chld_pk.put("D3", "ap_paybill.pk_paybill");
        chld_pk.put("23D0", "ar_suprecbill.pk_suprecbill");
        chld_pk.put("23D1", "ap_cuspayablebill.pk_cuspayablebill");
        chld_pk.put("23D2", "ar_supgatherbill.pk_supgatherbill");
        chld_pk.put("23D3", "ap_cuspaybill.pk_cuspaybill");
        chld_pk.put("23C0", "ar_estirecbill.pk_estirecbill");
        chld_pk.put("23C1", "ap_estipayablebill.pk_estipayablebill");
        type2Str.put("F0", "nc.vo.arap.receivable.AggReceivableBillVO");
        type2Str.put("F1", "nc.vo.arap.payable.AggPayableBillVO");
        type2Str.put("F2", "nc.vo.arap.gathering.AggGatheringBillVO");
        type2Str.put("F3", "nc.vo.arap.pay.AggPayBillVO");
        type2Str.put("23F0", "nc.vo.arap.supreceivable.AggSupReceivableBillVO");
        type2Str.put("23F1", "nc.vo.arap.cuspayable.AggCusPayableBillVO");
        type2Str.put("23F2", "nc.vo.arap.supgathering.AggSupGatheringBillVO");
        type2Str.put("23F3", "nc.vo.arap.cuspay.AggCusPaybillVO");
        type2Str.put("23E0", "nc.vo.arap.estireceivable.AggEstiReceivableBillVO");
        type2Str.put("23E1", "nc.vo.arap.estipayable.AggEstiPayableBillVO");
        type2Str.put("D0", "nc.vo.arap.receivable.AggReceivableBillVO");
        type2Str.put("D1", "nc.vo.arap.payable.AggPayableBillVO");
        type2Str.put("D2", "nc.vo.arap.gathering.AggGatheringBillVO");
        type2Str.put("D3", "nc.vo.arap.pay.AggPayBillVO");
        type2Str.put("23D0", "nc.vo.arap.supreceivable.AggSupReceivableBillVO");
        type2Str.put("23D1", "nc.vo.arap.cuspayable.AggCusPayableBillVO");
        type2Str.put("23D2", "nc.vo.arap.supgathering.AggSupGatheringBillVO");
        type2Str.put("23D3", "nc.vo.arap.cuspay.AggCusPaybillVO");
        type2Str.put("23C0", "nc.vo.arap.estireceivable.AggEstiReceivableBillVO");
        type2Str.put("23C1", "nc.vo.arap.estipayable.AggEstiPayableBillVO");
        for (Map.Entry<String, String> entry : type2Str.entrySet()) {
            try {
                type2Map.put(entry.getKey(), Class.forName(entry.getValue()));
            }
            catch (ClassNotFoundException e) {
                ExceptionHandler.consume((Throwable)e);
            }
        }
        type2ChildVO.put("F0", "nc.vo.arap.receivable.ReceivableBillItemVO");
        type2ChildVO.put("F1", "nc.vo.arap.payable.PayableBillItemVO");
        type2ChildVO.put("F2", "nc.vo.arap.gathering.GatheringBillItemVO");
        type2ChildVO.put("F3", "nc.vo.arap.pay.PayBillItemVO");
        type2ChildVO.put("23F0", "nc.vo.arap.supreceivable.SupReceivableBillItemVO");
        type2ChildVO.put("23F1", "nc.vo.arap.cuspayable.CusPayableBillItemVO");
        type2ChildVO.put("23F2", "nc.vo.arap.supgathering.SupGatheringBillItemVO");
        type2ChildVO.put("23F3", "nc.vo.arap.cuspay.CusPayBillItemVO");
        type2ChildVO.put("23E0", "nc.vo.arap.estireceivable.EstiReceivableBillItemVO");
        type2ChildVO.put("23E1", "nc.vo.arap.estipayable.EstiPayableBillItemVO");
        type2ParentVO.put("F0", "nc.vo.arap.receivable.ReceivableBillVO");
        type2ParentVO.put("F1", "nc.vo.arap.payable.PayableBillVO");
        type2ParentVO.put("F2", "nc.vo.arap.gathering.GatheringBillVO");
        type2ParentVO.put("F3", "nc.vo.arap.pay.PayBillVO");
        type2ParentVO.put("23F0", "nc.vo.arap.supreceivable.SupReceivableBillVO");
        type2ParentVO.put("23F1", "nc.vo.arap.cuspayable.CusPayableBillVO");
        type2ParentVO.put("23F2", "nc.vo.arap.supgathering.SupGatheringBillVO");
        type2ParentVO.put("23F3", "nc.vo.arap.cuspay.CusPaybillVO");
        type2ParentVO.put("23E0", "nc.vo.arap.estireceivable.EstiReceivableBillVO");
        type2ParentVO.put("23E1", "nc.vo.arap.estipayable.EstiPayableBillVO");
        type2QueryService.put("F0", "nc.pubitf.arap.receivable.IArapReceivableBillPubQueryService");
        type2QueryService.put("F1", "nc.pubitf.arap.payable.IArapPayableBillPubQueryService");
        type2QueryService.put("F2", "nc.pubitf.arap.gathering.IArapGatheringBillPubQueryService");
        type2QueryService.put("F3", "nc.pubitf.arap.pay.IArapPayBillPubQueryService");
        type2QueryService.put("23F0", "nc.pubitf.arap.supreceivable.IArapSupReceivableBillPubQueryService");
        type2QueryService.put("23F1", "nc.pubitf.arap.cuspayable.IArapCusPayableBillPubQueryService");
        type2QueryService.put("23F2", "nc.pubitf.arap.supgathering.IArapSupGatheringBillQueryService");
        type2QueryService.put("23F3", "nc.pubitf.arap.cuspay.IArapCusPayBillPubQueryService");
        type2QueryService.put("23E0", "nc.pubitf.arap.receivable.IArapEstiReceivableBillPubQueryService");
        type2QueryService.put("23E1", "nc.pubitf.arap.estipayable.IArapEstiPayableBillPubQueryService");
        type2Service.put("F0", "nc.pubitf.arap.receivable.IArapReceivableBillPubService");
        type2Service.put("F1", "nc.pubitf.arap.payable.IArapPayableBillPubService");
        type2Service.put("F2", "nc.pubitf.arap.gathering.IArapGatheringBillPubService");
        type2Service.put("F3", "nc.pubitf.arap.pay.IArapPayBillPubService");
        type2Service.put("23F0", "nc.pubitf.arap.supreceivable.IArapSupReceivableBillPubService");
        type2Service.put("23F1", "nc.pubitf.arap.cuspayable.IArapCusPayableBillService");
        type2Service.put("23F2", "nc.pubitf.arap.supgathering.IArapSupGatheringBillService");
        type2Service.put("23F3", "nc.pubitf.arap.cuspay.IArapCusPayBillPubService");
        type2Service.put("23E0", "nc.pubitf.arap.estipayable.IArapEstiPayableBillPubQueryService");
        type2Service.put("23E1", "nc.pubitf.arap.estipayable.IArapEstiPayablePubBillService");
        type2pk_bill.put("F0", "pk_recbill");
        type2pk_bill.put("F2", "pk_gatherbill");
        type2pk_bill.put("F1", "pk_payablebill");
        type2pk_bill.put("F3", "pk_paybill");
        type2pk_bill.put("23E0", "pk_estirecbill");
        type2pk_bill.put("23E1", "pk_estipayablebill");
        type2pk_item.put("F0", "pk_recitem");
        type2pk_item.put("F2", "pk_gatheritem");
        type2pk_item.put("F1", "pk_payableitem");
        type2pk_item.put("F3", "pk_payitem");
        type2pk_item.put("23E0", "pk_estirecitem");
        type2pk_item.put("23E1", "pk_estipayableitem");
    }
}

