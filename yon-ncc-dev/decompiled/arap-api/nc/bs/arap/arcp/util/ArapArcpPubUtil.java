/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.gathering.IArapGatheringBillQueryService
 *  nc.itf.arap.pay.IArapPayBillQueryService
 *  nc.itf.arap.payable.IArapPayableBillQueryService
 *  nc.itf.arap.receivable.IArapReceivableBillQueryService
 *  nc.itf.fip.relation.IFipRelation
 *  nc.itf.gl.voucher.IVoucher
 *  nc.itf.uap.print.IPrintTemplateQry
 *  nc.ui.pub.print.IDataSource
 *  nc.util.fi.pub.SqlUtils
 *  nc.vo.arcp.archive.collect.ArcpBusiQueryVO
 *  nc.vo.fip.relation.FipRelationVO
 *  nc.vo.gl.pubvoucher.VoucherVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.print.PrintTempletmanageHeaderVO
 */
package nc.bs.arap.arcp.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.gathering.IArapGatheringBillQueryService;
import nc.itf.arap.pay.IArapPayBillQueryService;
import nc.itf.arap.payable.IArapPayableBillQueryService;
import nc.itf.arap.receivable.IArapReceivableBillQueryService;
import nc.itf.fip.relation.IFipRelation;
import nc.itf.gl.voucher.IVoucher;
import nc.itf.uap.print.IPrintTemplateQry;
import nc.ui.pub.print.IDataSource;
import nc.util.fi.pub.SqlUtils;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.pf.PrintDataSourceForMailAudit;
import nc.vo.arcp.archive.collect.ArcpBusiQueryVO;
import nc.vo.fip.relation.FipRelationVO;
import nc.vo.gl.pubvoucher.VoucherVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.print.PrintTempletmanageHeaderVO;

public class ArapArcpPubUtil {
    public static BaseAggVO[] queryBillByBillTypeAndPks(String pk_billtype, String[] pkList) throws BusinessException {
        Object[] aggvo = null;
        if ("F0".equals(pk_billtype)) {
            aggvo = ((IArapReceivableBillQueryService)NCLocator.getInstance().lookup(IArapReceivableBillQueryService.class)).findBillByPrimaryKey(pkList);
        }
        if ("F1".equals(pk_billtype)) {
            aggvo = ((IArapPayableBillQueryService)NCLocator.getInstance().lookup(IArapPayableBillQueryService.class)).findBillByPrimaryKey(pkList);
        }
        if ("F2".equals(pk_billtype)) {
            aggvo = ((IArapGatheringBillQueryService)NCLocator.getInstance().lookup(IArapGatheringBillQueryService.class)).findBillByPrimaryKey(pkList);
        }
        if ("F3".equals(pk_billtype)) {
            aggvo = ((IArapPayBillQueryService)NCLocator.getInstance().lookup(IArapPayBillQueryService.class)).findBillByPrimaryKey(pkList);
        }
        return aggvo;
    }

    public static Map<String, VoucherVO> getVoucherMap(Set<String> pks) throws BusinessException {
        HashMap<String, VoucherVO> voucherMap = new HashMap<String, VoucherVO>();
        ArrayList<String> pkList = new ArrayList<String>(pks);
        String where = SqlUtils.getInStr((String)"substring(src_relationID,0,20)", pkList);
        FipRelationVO[] fips = ((IFipRelation)NCLocator.getInstance().lookup(IFipRelation.class)).queryByWhere(where);
        if (fips != null && fips.length > 0) {
            HashMap<String, String> dessrcMap = new HashMap<String, String>();
            String[] desids = new String[fips.length];
            for (int i = 0; i < fips.length; ++i) {
                dessrcMap.put(fips[i].getDes_relationid(), fips[i].getSrc_relationid().substring(0, 20));
                desids[i] = fips[i].getDes_relationid();
            }
            VoucherVO[] vos = ((IVoucher)NCLocator.getInstance().lookup(IVoucher.class)).queryByPks(desids);
            if (vos != null && vos.length > 0) {
                for (VoucherVO vo : vos) {
                    voucherMap.put((String)dessrcMap.get(vo.getPk_voucher()), vo);
                }
            }
        }
        return voucherMap;
    }

    public static Map<String, String> getPrintTempletName(ArcpBusiQueryVO[] arcpbusiquery, String billtype) throws BusinessException {
        PrintTempletmanageHeaderVO[] printvos;
        HashMap<String, String> printMap = new HashMap<String, String>();
        HashSet<String> printIds = new HashSet<String>();
        for (ArcpBusiQueryVO query : arcpbusiquery) {
            printIds.add(query.getArchiveUnitBillVO().getPk_printtemplate());
        }
        for (PrintTempletmanageHeaderVO printTempletmanageHeaderVO : printvos = ((IPrintTemplateQry)NCLocator.getInstance().lookup(IPrintTemplateQry.class)).queryHeaderVOByIDs(printIds.toArray(new String[0]))) {
            printMap.put(printTempletmanageHeaderVO.getCtemplateid(), printTempletmanageHeaderVO.getVtemplatename());
        }
        for (PrintTempletmanageHeaderVO printTempletmanageHeaderVO : arcpbusiquery) {
            printMap.put(printTempletmanageHeaderVO.getArchiveUnitBillVO().getPk_tradetype() == null ? billtype : printTempletmanageHeaderVO.getArchiveUnitBillVO().getPk_tradetype(), (String)printMap.get(printTempletmanageHeaderVO.getArchiveUnitBillVO().getPk_printtemplate()));
        }
        return printMap;
    }

    public static IDataSource getPrintDs(String billId, String billtype, String checkman) throws BusinessException {
        return new PrintDataSourceForMailAudit(billtype, billId);
    }
}

