/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.billconfer.IBConferMapQryService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.billconfer.BcMapVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.platform.workbench.AppPageVO
 *  nc.vo.pub.BusinessException
 *  nccloud.dto.arap.arappub.info.CommonInfo
 *  nccloud.pubitf.arap.arappub.IArapCommonUtilService
 *  nccloud.pubitf.arap.arappub.ILinkBillConferQueryService
 *  nccloud.putitf.riart.billtype.IDefaultQueryRelatedAppInfoService
 */
package nccloud.pubimpl.arap.arappub;

import java.util.HashMap;
import java.util.Map;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.billconfer.IBConferMapQryService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.billconfer.BcMapVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.platform.workbench.AppPageVO;
import nc.vo.pub.BusinessException;
import nccloud.dto.arap.arappub.info.CommonInfo;
import nccloud.pubitf.arap.arappub.IArapCommonUtilService;
import nccloud.pubitf.arap.arappub.ILinkBillConferQueryService;
import nccloud.putitf.riart.billtype.IDefaultQueryRelatedAppInfoService;

public class LinkBillConferQueryServiceImpl
implements ILinkBillConferQueryService {
    public Map<String, Object> getLinkMessage(CommonInfo info) throws BusinessException {
        BcMapVO[] bcMapVos = null;
        BaseAggVO[] selectedDatas = ((IArapCommonUtilService)NCLocator.getInstance().lookup(IArapCommonUtilService.class)).queryBillHead(new String[]{info.getPk_bill()}, info.getBillType());
        if (selectedDatas != null && selectedDatas.length != 0 && selectedDatas[0] != null) {
            bcMapVos = ((IBConferMapQryService)NCLocator.getInstance().lookup(IBConferMapQryService.class)).queryBCMapByIDAndBType(selectedDatas[0].getHeadVO().getPrimaryKey(), selectedDatas[0].getHeadVO().getPk_billtype());
        }
        if (bcMapVos == null || bcMapVos.length == 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0661"));
        }
        if (bcMapVos.length > 1) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0788"));
        }
        String dest_billid = bcMapVos[0].getDest_billid();
        String dest_billtype = bcMapVos[0].getDest_billtype();
        BaseAggVO[] dest_billAggvo = ((IArapCommonUtilService)NCLocator.getInstance().lookup(IArapCommonUtilService.class)).queryBillHead(new String[]{dest_billid}, dest_billtype);
        if (dest_billAggvo == null || dest_billAggvo.length == 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0661"));
        }
        IDefaultQueryRelatedAppInfoService service = (IDefaultQueryRelatedAppInfoService)NCLocator.getInstance().lookup(IDefaultQueryRelatedAppInfoService.class);
        Map appMap = service.queryLinkAppInfo(dest_billtype, dest_billid);
        AppPageVO appPageVO = (AppPageVO)appMap.get("appPageVO");
        if (appPageVO == null || appPageVO.equals("")) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0789"));
        }
        Object appcode = appMap.get("appcode");
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("url", appPageVO.getPageurl());
        HashMap<String, String> condition = new HashMap<String, String>();
        condition.put("pagecode", appPageVO.getPagecode());
        condition.put("appcode", String.valueOf(appcode));
        condition.put("id", dest_billid);
        condition.put("scene", "linksce");
        condition.put("status", "browse");
        map.put("condition", condition);
        return map;
    }
}

