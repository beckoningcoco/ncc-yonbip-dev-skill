/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.ui.arap.ref.CreditRefInfoStdRefConstant
 *  nc.vo.pub.para.SysInitVO
 *  nccloud.pubitf.uapbd.param.sysparam.MappingCond
 *  nccloud.pubitf.uapbd.param.sysparam.ParamNameMapping
 */
package nc.bs.arap.refer;

import nc.ui.arap.ref.CreditRefInfoStdRefConstant;
import nc.vo.pub.para.SysInitVO;
import nccloud.pubitf.uapbd.param.sysparam.MappingCond;
import nccloud.pubitf.uapbd.param.sysparam.ParamNameMapping;

public class CreditRefInfoStdRefMapping
implements ParamNameMapping {
    public String mappingName(MappingCond mappingCond) {
        SysInitVO initVO = mappingCond.getSysInitVO();
        if (initVO != null && initVO.getValue() != null) {
            String value = initVO.getValue();
            int index = 0;
            for (int i = 0; i < CreditRefInfoStdRefConstant.NAMES.length; ++i) {
                if (!CreditRefInfoStdRefConstant.NAMES[i].equals(value)) continue;
                index = i;
                break;
            }
            return CreditRefInfoStdRefConstant.FIELDS[index];
        }
        return null;
    }
}

