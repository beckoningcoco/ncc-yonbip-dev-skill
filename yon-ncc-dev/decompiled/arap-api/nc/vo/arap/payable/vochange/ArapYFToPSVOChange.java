/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.vo.arap.utils.ArrayUtil
 *  nc.vo.pf.change.ChangeVOAdjustContext
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.vo.arap.payable.vochange;

import java.util.ArrayList;
import java.util.Arrays;
import nc.bs.framework.common.NCLocator;
import nc.pubitf.arap.payable.IArapPayableBillPubServiceForPS;
import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.arap.payable.vochange.ArapF1VOChange;
import nc.vo.arap.utils.ArrayUtil;
import nc.vo.pf.change.ChangeVOAdjustContext;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public class ArapYFToPSVOChange
extends ArapF1VOChange {
    public AggregatedValueObject[] batchAdjustBeforeChange(AggregatedValueObject[] srcVOs, ChangeVOAdjustContext adjustContext) throws BusinessException {
        if ("F1".equals(srcVOs[0].getParentVO().getAttributeValue("pk_billtype"))) {
            AggPayableBillVO[] srctemp = (AggPayableBillVO[])ArrayUtil.convertSupers2Subs((Object[])srcVOs, AggPayableBillVO.class);
            ArrayList<AggPayableBillVO> temp = new ArrayList<AggPayableBillVO>();
            for (int i = 0; i < srctemp.length; ++i) {
                temp.addAll(Arrays.asList(((IArapPayableBillPubServiceForPS)NCLocator.getInstance().lookup(IArapPayableBillPubServiceForPS.class)).splitBillsByPayterms(srctemp[i])));
            }
            srcVOs = temp.toArray(new AggregatedValueObject[0]);
        }
        return super.batchAdjustBeforeChange(srcVOs, adjustContext);
    }
}

