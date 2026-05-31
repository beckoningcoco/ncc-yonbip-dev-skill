/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arcp.archive.collect.ArcpBillListParaVO
 *  nc.vo.arcp.archive.collect.ArcpBusiCollectVO
 *  nc.vo.arcp.archive.collect.ArcpBusiQueryVO
 *  nc.vo.arcp.archive.collect.ArcpCheckVO
 *  nc.vo.arcp.archive.unitsetting.ArchiveUnitBillVO
 *  nc.vo.arcp.arcplog.ArcpLogVO
 *  nc.vo.arcp.pub.objectegister.ArcObjectRegisterVO
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.arcp.pub;

import java.util.Map;
import nc.bs.arap.arcp.pub.ArapBillArchive;
import nc.vo.arcp.archive.collect.ArcpBillListParaVO;
import nc.vo.arcp.archive.collect.ArcpBusiCollectVO;
import nc.vo.arcp.archive.collect.ArcpBusiQueryVO;
import nc.vo.arcp.archive.collect.ArcpCheckVO;
import nc.vo.arcp.archive.unitsetting.ArchiveUnitBillVO;
import nc.vo.arcp.arcplog.ArcpLogVO;
import nc.vo.arcp.pub.objectegister.ArcObjectRegisterVO;
import nc.vo.pub.BusinessException;

public class ArapF2BillArchive
extends ArapBillArchive {
    @Override
    public ArcpBusiCollectVO[] getUnitBillListData(ArcpBillListParaVO para, ArcObjectRegisterVO[] arcObjectRegisterVO, ArchiveUnitBillVO[] archiveUnitBillVO) throws BusinessException {
        return this.getUnitBillListData(para, arcObjectRegisterVO[0], archiveUnitBillVO, "F2");
    }

    @Override
    public ArcpLogVO[] getDesBillTypeData(ArcpLogVO[] arcplogs, ArcpBusiQueryVO[] arcpbusiquery) throws BusinessException {
        return this.getDesBillTypeData(arcplogs, arcpbusiquery, "F2");
    }

    public Map<String, ArcpCheckVO> getUpperBillCheckData(String pk_billtypecode, String[] ids, int upperlevels) throws BusinessException {
        return this.getUpperBillCheckData(ids, upperlevels, "F2");
    }

    public String[] getPrintTemplates(String billTypeOrTransTypeCode, String funcode, String pk_group, String pk_org, String userid) throws BusinessException {
        return this.getPrintTemplatesNCC(pk_group, pk_org, userid, "F2", funcode);
    }
}

