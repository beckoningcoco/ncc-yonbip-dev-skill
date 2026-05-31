/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arcp.archive.collect.ArcpBillListParaVO
 *  nc.vo.arcp.archive.collect.ArcpBusiCollectVO
 *  nc.vo.arcp.archive.collect.ArcpBusiQueryVO
 *  nc.vo.arcp.archive.unitsetting.ArchiveUnitBillVO
 *  nc.vo.arcp.arcplog.ArcpLogVO
 *  nc.vo.arcp.pub.objectegister.ArcObjectRegisterVO
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.arcp.pub;

import nc.vo.arcp.archive.collect.ArcpBillListParaVO;
import nc.vo.arcp.archive.collect.ArcpBusiCollectVO;
import nc.vo.arcp.archive.collect.ArcpBusiQueryVO;
import nc.vo.arcp.archive.unitsetting.ArchiveUnitBillVO;
import nc.vo.arcp.arcplog.ArcpLogVO;
import nc.vo.arcp.pub.objectegister.ArcObjectRegisterVO;
import nc.vo.pub.BusinessException;

public interface IArapBillArchive {
    public ArcpBusiCollectVO[] getUnitBillListData(ArcpBillListParaVO var1, ArcObjectRegisterVO var2, ArchiveUnitBillVO[] var3, String var4) throws BusinessException;

    public ArcpLogVO[] getDesBillTypeData(ArcpLogVO[] var1, ArcpBusiQueryVO[] var2, String var3) throws BusinessException;
}

