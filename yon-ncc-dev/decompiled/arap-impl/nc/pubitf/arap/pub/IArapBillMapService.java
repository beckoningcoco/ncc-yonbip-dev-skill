/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.DAOException
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.pub;

import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import nc.bs.dao.DAOException;
import nc.vo.arap.agiotage.ArapBusiDataVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pfflow.ArapBillMapVO;
import nc.vo.pub.BusinessException;

public interface IArapBillMapService {
    public Collection<ArapBillMapVO> qeryBillMapByItemID(String[] var1, Boolean var2) throws BusinessException;

    public Collection<ArapBillMapVO> queryLinkedBillsByBillId(String var1, String var2) throws BusinessException;

    public Boolean deRelateBillsByBillMap(BaseBillVO var1, BaseItemVO[] var2) throws BusinessException;

    public void insertBillMap(List<ArapBillMapVO> var1) throws BusinessException;

    public void updateBillItemOccupationmny(List<BaseItemVO> var1) throws BusinessException;

    public Collection<ArapBusiDataVO> queryBusidataVOs(String[] var1) throws SQLException, DAOException;

    public void updBusiDataVOs(ArapBusiDataVO[] var1) throws BusinessException;

    public void delArapBillMapVOList(List<ArapBillMapVO> var1) throws BusinessException;
}

