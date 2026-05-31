/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 *  nc.vo.tb.obj.NtbParamVO
 */
package nc.itf.arap.ntb;

import java.util.List;
import nc.vo.arap.tally.DetailLinkQueryVO;
import nc.vo.pub.BusinessException;
import nc.vo.tb.obj.NtbParamVO;

public interface ITbbLinkBO {
    public List<DetailLinkQueryVO> getLinkDatas(NtbParamVO var1) throws BusinessException;
}

