/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.pubitf.obm.IObmLogManageService
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nccloud.commons.lang.ArrayUtils
 */
package nc.bs.arap.util;

import java.util.ArrayList;
import java.util.Arrays;
import nc.bs.framework.common.NCLocator;
import nc.pubitf.obm.IObmLogManageService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.commons.lang.ArrayUtils;

public final class BillBankUtils {
    public static void fillSettleBankrelated_code(AggregatedValueObject[] bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        BaseAggVO billVO = (BaseAggVO)bills[0];
        String billclass = billVO.getHeadVO().getBillclass();
        if (!Arrays.asList("fk", "sk").contains(billclass)) {
            return;
        }
        if (ARAPModuleEnableUtil.isObmEnabled(billVO.getHeadVO().getPk_group())) {
            IObmLogManageService obmservice = (IObmLogManageService)NCLocator.getInstance().lookup(IObmLogManageService.class);
            for (AggregatedValueObject bill : bills) {
                billVO = (BaseAggVO)bill;
                ArrayList<BaseItemVO> bodyList = new ArrayList<BaseItemVO>();
                for (BaseItemVO item : billVO.getItems()) {
                    if (item.getBankrelated_code() != null) continue;
                    bodyList.add(item);
                }
                String[] obmLogReconciliationCodes = obmservice.creatObmLogReconciliationCodes(bodyList.size());
                for (int i = 0; i < bodyList.size(); ++i) {
                    ((BaseItemVO)bodyList.get(i)).setBankrelated_code(obmLogReconciliationCodes[i]);
                }
            }
        }
    }
}

