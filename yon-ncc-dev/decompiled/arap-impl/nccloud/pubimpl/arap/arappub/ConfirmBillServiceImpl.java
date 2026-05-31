/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.logging.Logger
 *  nc.itf.arap.billconfer.IBillConferService
 *  nc.itf.arap.pub.IArapBillService
 *  nc.itf.uap.IUAPQueryBS
 *  nc.message.vo.MessageVO
 *  nc.message.vo.NCMessage
 *  nc.pubitf.arap.bill.IArapBillPubService
 *  nc.pubitf.fbm.api.ecds.pub.IFbmPubQueryService
 *  nc.pubitf.org.IOrgUnitPubService
 *  nc.util.fi.pub.SqlUtils
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.bill.util.BillEventHandlerUtil
 *  nc.vo.arap.billconfer.BcMapVO
 *  nc.vo.arap.cache.FiPubDataCache
 *  nc.vo.arap.djlx.DjLXVO
 *  nc.vo.arap.pub.ArapConstant
 *  nc.vo.arap.pub.BillEnumCollection$ApproveStatus
 *  nc.vo.arap.utils.ArrayUtil
 *  nc.vo.fipub.annotation.Business
 *  nc.vo.fipub.billcode.FinanceBillCodeUtils
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.org.util.OrgPubUtil
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.ISuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.vorg.DeptVersionVO
 *  nccloud.bs.pub.pf.PfMessageUtil
 *  nccloud.commons.lang.StringUtils
 *  nccloud.dto.arap.arappub.info.CommonInfo
 *  nccloud.impl.platform.common.util.CollectionUtils
 *  nccloud.message.util.MessageCenter
 *  nccloud.message.vo.NCCMessage
 *  nccloud.pubitf.arap.arappub.IArapBillPubUtilService
 *  nccloud.pubitf.arap.arappub.IBillRequiresNewDeleteService
 *  nccloud.pubitf.arap.arappub.IConfirmBillService
 *  nccloud.pubitf.arap.verificationsheet.IBillVerifyQueryService
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.pubimpl.arap.arappub;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.arap.billconfer.IBillConferService;
import nc.itf.arap.pub.IArapBillService;
import nc.itf.uap.IUAPQueryBS;
import nc.message.vo.MessageVO;
import nc.message.vo.NCMessage;
import nc.pubitf.arap.bill.IArapBillPubService;
import nc.pubitf.fbm.api.ecds.pub.IFbmPubQueryService;
import nc.pubitf.org.IOrgUnitPubService;
import nc.util.fi.pub.SqlUtils;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.bill.util.BillEventHandlerUtil;
import nc.vo.arap.billconfer.BcMapVO;
import nc.vo.arap.cache.FiPubDataCache;
import nc.vo.arap.djlx.DjLXVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.utils.ArrayUtil;
import nc.vo.fipub.annotation.Business;
import nc.vo.fipub.billcode.FinanceBillCodeUtils;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.org.util.OrgPubUtil;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.ISuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.vorg.DeptVersionVO;
import nccloud.bs.pub.pf.PfMessageUtil;
import nccloud.commons.lang.StringUtils;
import nccloud.dto.arap.arappub.info.CommonInfo;
import nccloud.impl.platform.common.util.CollectionUtils;
import nccloud.message.util.MessageCenter;
import nccloud.message.vo.NCCMessage;
import nccloud.pubitf.arap.arappub.IArapBillPubUtilService;
import nccloud.pubitf.arap.arappub.IBillRequiresNewDeleteService;
import nccloud.pubitf.arap.arappub.IConfirmBillService;
import nccloud.pubitf.arap.verificationsheet.IBillVerifyQueryService;
import org.apache.commons.lang3.ArrayUtils;

public class ConfirmBillServiceImpl
implements IConfirmBillService {
    @Business(business="\u57fa\u7840\u5355\u636e", subBusiness="\u534f\u540c\u786e\u8ba4", description="\u4f20\u9012\u5355\u636e\u4fe1\u606f\uff0c\u8fdb\u884c\u534f\u540c\u786e\u8ba4", type="\u666e\u901a\u4e1a\u52a1")
    public AggregatedValueObject updateConfirmInfo(BaseAggVO bill) throws BusinessException {
        FinanceBillCodeUtils util = ArapBillPubUtil.getBillCodeUtil((AggregatedValueObject[])new AggregatedValueObject[]{bill});
        ArrayList<BaseAggVO> lastVo = new ArrayList<BaseAggVO>();
        if (!util.isPrecode((AggregatedValueObject)bill)) {
            lastVo.add(bill);
        }
        if (lastVo.size() > 0) {
            ArapBillPubUtil.setBillCodes((AggregatedValueObject[])lastVo.toArray(new AggregatedValueObject[lastVo.size()]));
        }
        return bill;
    }

    @Business(business="\u57fa\u7840\u5355\u636e", subBusiness="\u534f\u540c\u786e\u8ba4", description="\u4f20\u9012\u5355\u636e\u4fe1\u606f\uff0c\u53d6\u6d88\u534f\u540c\u786e\u8ba4", type="\u666e\u901a\u4e1a\u52a1")
    public AggregatedValueObject updateCancelConfirmInfo(BaseAggVO bill) throws BusinessException {
        try {
            try {
                ((IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class)).interceptorVaildator((AggregatedValueObject[])new BaseAggVO[]{bill}, ArapConstant.UNCONFIRM);
            }
            catch (BusinessException e) {
                throw new BusinessException(e.getMessage());
            }
            UFBoolean flag = ((IBillVerifyQueryService)NCLocator.getInstance().lookup(IBillVerifyQueryService.class)).isLinkedBill(bill.getPrimaryKey());
            if (flag.booleanValue()) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0134"));
            }
            BaseBillVO head = (BaseBillVO)bill.getParent();
            if (head.getApprovestatus().intValue() != BillEnumCollection.ApproveStatus.NOSTATE.VALUE.intValue()) {
                throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0135"));
            }
            head.setConfirmuser(null);
            head.setBillstatus(Integer.valueOf(9));
            head.setCoordflag(Integer.valueOf(0));
            head.setConfirmuser(null);
            head.setStatus(1);
            bill.setParent((ISuperVO)head);
            for (CircularlyAccessibleValueObject item : bill.getChildrenVO()) {
                item.setStatus(1);
            }
            ArapBillPubUtil.getBillCodeUtil((AggregatedValueObject[])new AggregatedValueObject[]{bill}).returnBillCode(new AggregatedValueObject[]{bill});
            head.setBillno(null);
        }
        catch (Exception e) {
            throw new BusinessException(e.getMessage());
        }
        AggregatedValueObject res = (AggregatedValueObject)ArrayUtil.getFirstInArrays((Object[])((IArapBillPubService)NCLocator.getInstance().lookup(IArapBillPubService.class)).update(new BaseAggVO[]{bill}));
        return res;
    }

    public HashMap<String, Object> delete(BaseAggVO[] aggvos, CommonInfo[] infos) throws BusinessException {
        HashMap<String, UFDateTime> tsMap = new HashMap<String, UFDateTime>();
        HashMap<String, Integer> indexInfo = new HashMap<String, Integer>();
        for (CommonInfo info : infos) {
            tsMap.put(info.getPk_bill(), info.getTs());
            indexInfo.put(info.getPk_bill(), info.getIndex());
        }
        Object[] newAggvos = ConfirmBillServiceImpl.filterSagaErrorBill(aggvos);
        if (ArrayUtils.isEmpty((Object[])newAggvos)) {
            throw new BusinessException(aggvos[0].getSagaErrorMsg());
        }
        Object[] frozenPks = ConfirmBillServiceImpl.filterSagaErrorPk(aggvos);
        if (!ArrayUtils.isEmpty((Object[])frozenPks)) {
            for (Object pk : frozenPks) {
                indexInfo.remove(pk);
            }
        }
        int frozenCount = frozenPks.length;
        for (Object bill : newAggvos) {
            bill.getHeadVO().setTs((UFDateTime)tsMap.get(bill.getParentVO().getPrimaryKey()));
        }
        StringBuilder errorInfo = new StringBuilder();
        ArrayList<String> successPKs = new ArrayList<String>();
        IBillConferService ConferService = (IBillConferService)NCLocator.getInstance().lookup(IBillConferService.class);
        IBillRequiresNewDeleteService deleteService = (IBillRequiresNewDeleteService)NCLocator.getInstance().lookup(IBillRequiresNewDeleteService.class);
        for (int i = 0; i < newAggvos.length; ++i) {
            try {
                deleteService.deleteConfirmVOS_RequiresNew((BaseAggVO)newAggvos[i], ConferService);
                successPKs.add(newAggvos[i].getPrimaryKey());
                continue;
            }
            catch (Exception e) {
                errorInfo.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0899", null, new String[]{newAggvos[i].getHeadVO().getBillno(), e.getMessage()}) + "\n");
            }
        }
        ArrayList successIndexs = new ArrayList();
        for (int i = 0; i < successPKs.size(); ++i) {
            successIndexs.add(indexInfo.get(successPKs.get(i)));
        }
        StringBuilder message = new StringBuilder();
        if (aggvos[0].getSagaErrorMsg() != null || frozenCount != 0) {
            errorInfo.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1085") + aggvos[0].getSagaErrorMsg());
        }
        message.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0900", null, new String[]{String.valueOf(aggvos.length), String.valueOf(successPKs.size()), String.valueOf(aggvos.length - successPKs.size())}) + "\n");
        if (errorInfo.length() > 0) {
            message.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0901") + "\n" + errorInfo);
        }
        HashMap<String, Object> resultMap = new HashMap<String, Object>();
        if (aggvos.length == successPKs.size()) {
            resultMap.put("PopupWindowStyle", "success");
        } else if (successPKs.size() == 0) {
            resultMap.put("PopupWindowStyle", "danger");
        } else {
            resultMap.put("PopupWindowStyle", "danger");
        }
        resultMap.put("message", message);
        resultMap.put("successIndexs", successIndexs);
        resultMap.put("successPKs", successPKs);
        return resultMap;
    }

    private static String[] filterSagaErrorPk(BaseAggVO[] bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return null;
        }
        ArrayList<String> voList = new ArrayList<String>();
        for (BaseAggVO aggVO : bills) {
            Integer saga_status = aggVO.getHeadVO().getSaga_status();
            Integer saga_frozen = aggVO.getHeadVO().getSaga_frozen();
            if (saga_status != 1 && saga_frozen != 1 && (saga_status != null || saga_frozen != null)) continue;
            voList.add(aggVO.getParentVO().getPrimaryKey());
        }
        if (voList.size() == bills.length) {
            return null;
        }
        return voList.toArray(new String[0]);
    }

    private static BaseAggVO[] filterSagaErrorBill(BaseAggVO[] bills) {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return null;
        }
        ArrayList<BaseAggVO> voList = new ArrayList<BaseAggVO>();
        for (BaseAggVO aggVO : bills) {
            Integer saga_status = aggVO.getHeadVO().getSaga_status();
            Integer saga_frozen = aggVO.getHeadVO().getSaga_frozen();
            if (saga_status == 1 || saga_frozen == 1) continue;
            voList.add(aggVO);
        }
        if (voList.size() == bills.length) {
            return bills;
        }
        return voList.toArray(new BaseAggVO[0]);
    }

    public String sendMessage(BaseAggVO[] aggVo, int type) throws BusinessException {
        String pk_group;
        BcMapVO bcMapVO = this.constructBcMapVo(aggVo, type)[0];
        if (bcMapVO == null) {
            return null;
        }
        NCMessage message = new NCMessage();
        MessageVO msgvo = new MessageVO();
        String billType = bcMapVO.getDest_billtype();
        String appcode = null;
        String pageCode = null;
        String string = pk_group = aggVo[0].getHeadVO().getPk_group() == null ? InvocationInfoProxy.getInstance().getGroupId() : aggVo[0].getHeadVO().getPk_group();
        if ("F0".equals(billType)) {
            appcode = "20060RBC";
            pageCode = "20060RBC_CARD";
        } else if ("F1".equals(billType)) {
            appcode = "20080SPLC";
            pageCode = "20080SPLC_CARD";
        } else if ("F2".equals(billType)) {
            appcode = "20060GBC";
            pageCode = "20060GBC_CARD";
        } else if ("F3".equals(billType)) {
            appcode = "20080SPAC";
            pageCode = "20080SPAC_CARD";
        }
        msgvo.setSubject(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0025"));
        msgvo.setSender(InvocationInfoProxy.getInstance().getUserId());
        msgvo.setReceiver(bcMapVO.getReceiver());
        msgvo.setContent(bcMapVO.getMessage());
        msgvo.setMsgsourcetype("notice");
        msgvo.setSendtime(new UFDateTime());
        msgvo.setPk_group(pk_group);
        msgvo.setBillid(bcMapVO.getDest_billid());
        msgvo.setBilltype(bcMapVO.getDest_billtype());
        message.setMessage(msgvo);
        String params = "pagecode=" + pageCode + "&id=" + bcMapVO.getDest_billid() + "&status=browse";
        NCCMessage nccMsg = PfMessageUtil.convertToNCCMsgVo((String)"notice", (String)appcode, (NCMessage)message, (String)params);
        nccMsg.getMessage().setBillid(bcMapVO.getDest_billid());
        nccMsg.getMessage().setBilltype(bcMapVO.getDest_billtype());
        try {
            MessageCenter.sendMessage((NCCMessage[])new NCCMessage[]{nccMsg});
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage());
        }
        bcMapVO.setStatus(2);
        return null;
    }

    private BcMapVO[] constructBcMapVo(BaseAggVO[] aggVo, int type) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])aggVo)) {
            return null;
        }
        ArrayList<BcMapVO> list = new ArrayList<BcMapVO>();
        BaseAggVO[] topvos = this.getTopVos(aggVo[0]);
        String billmaker = (String)topvos[0].getParentVO().getAttributeValue("billmaker");
        String pk_billtype = (String)aggVo[0].getChildrenVO()[0].getAttributeValue("top_billtype");
        String headPK = (String)aggVo[0].getChildrenVO()[0].getAttributeValue("top_billid");
        String orgname = ((IOrgUnitPubService)NCLocator.getInstance().lookup(IOrgUnitPubService.class)).getOrgs(new String[]{aggVo[0].getHeadVO().getPk_org()}, new String[]{"pk_org", "name"})[0].getName();
        String scomment = ((BaseItemVO)aggVo[0].getChildrenVO()[0]).getScomment();
        scomment = scomment == null ? "" : scomment;
        String direct = null;
        direct = 1 == type ? NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0075") : NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0076");
        String money = aggVo[0].getHeadVO().getMoney().setScale(4, 4).toString();
        String message = NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0077") + orgname + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0078") + direct + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0079") + money + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0080") + scomment;
        for (BaseAggVO destVO : aggVo) {
            BcMapVO bcMapVO = new BcMapVO();
            BaseAggVO baseAggVO = destVO;
            bcMapVO.setSrc_billtype(pk_billtype);
            bcMapVO.setSrc_billid(headPK);
            bcMapVO.setDest_billtype(baseAggVO.getItems()[0].getPk_billtype());
            bcMapVO.setDest_billid(baseAggVO.getHeadVO().getPrimaryKey());
            bcMapVO.setReceiver(billmaker);
            bcMapVO.setMessage(message);
            bcMapVO.setDest_org(baseAggVO.getHeadVO().getPk_org());
            list.add(bcMapVO);
        }
        return list.toArray(new BcMapVO[0]);
    }

    private BaseAggVO[] getTopVos(BaseAggVO aggVo) throws BusinessException {
        String topbilltype = (String)aggVo.getChildrenVO()[0].getAttributeValue("top_billtype");
        String topbillid = (String)aggVo.getChildrenVO()[0].getAttributeValue("top_billid");
        BaseAggVO[] srcvos = ((IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class)).queryArapBillByPKs(new String[]{topbillid}, topbilltype);
        return srcvos;
    }

    public void handleBills4Fbm(BaseAggVO aggVo) throws BusinessException {
        String pk_org = (String)aggVo.getParentVO().getAttributeValue("pk_org");
        BaseAggVO[] srcvos = this.getTopVos(aggVo);
        BaseItemVO[] childvo = (BaseItemVO[])srcvos[0].getChildrenVO();
        BaseItemVO[] destchildvo = (BaseItemVO[])aggVo.getChildrenVO();
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        HashMap<String, String> parmMap = new HashMap<String, String>();
        Integer i = 0;
        for (BaseItemVO vo : childvo) {
            Integer n;
            String checktype = (String)vo.getAttributeValue("checktype");
            if (checktype == null) {
                Integer n2 = i;
                n = i = Integer.valueOf(i + 1);
                continue;
            }
            String checkno = (String)vo.getAttributeValue("checkno");
            parmMap.put(checkno, checktype);
            map.put(i, checkno + "-" + checktype);
            n = i;
            Integer n3 = i = Integer.valueOf(i + 1);
        }
        if (parmMap.isEmpty()) {
            return;
        }
        HashMap retMap = ((IFbmPubQueryService)NCLocator.getInstance().lookup(IFbmPubQueryService.class)).getReceiveRegisterPkByPayRegPk(pk_org, parmMap);
        if (retMap.isEmpty()) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0081"));
        }
        ArrayList<String> list = new ArrayList<String>();
        for (Map.Entry enParm : map.entrySet()) {
            String value = (String)enParm.getValue();
            String pkCheckno = (String)retMap.get(value.split("-")[0]);
            String pkChecktype = ((String)enParm.getValue()).split("-")[1];
            if (value != null && pkCheckno != null) {
                destchildvo[(Integer)enParm.getKey()].setChecktype(pkChecktype);
                destchildvo[(Integer)enParm.getKey()].setCheckno(pkCheckno);
                continue;
            }
            list.add(Integer.toString((Integer)enParm.getKey() + 1));
        }
        if (CollectionUtils.isNotEmpty(list)) {
            String message = String.join((CharSequence)",", list);
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0082") + message + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006arappub0316_0", "02006arappub0316-0083"));
        }
    }

    public void handleDeptPsn(BaseAggVO aggVo) throws BusinessException {
        BaseBillVO headvo = aggVo.getHeadVO();
        String pk_group = headvo.getPk_group();
        String tradetype = headvo.getPk_tradetype();
        DjLXVO billType = FiPubDataCache.getBillType((String)tradetype, (String)pk_group);
        if (billType == null || billType.getIschangedeptpsn() == null || !billType.getIschangedeptpsn().booleanValue()) {
            return;
        }
        BaseItemVO[] itemvos = aggVo.getItems();
        BaseItemVO item0 = itemvos == null || itemvos.length == 0 ? null : itemvos[0];
        String creator = headvo.getCreator();
        String pk_org = headvo.getPk_org();
        String[] head2bodyFields = new String[]{"pk_deptid", "pk_deptid_v", "pk_psndoc"};
        String psndocpk = BillEventHandlerUtil.getPsndocByUserid((String)creator, (Object)pk_org);
        UFDate billdate = headvo.getBilldate();
        if (StringUtils.isNotEmpty((CharSequence)psndocpk)) {
            headvo.setPk_psndoc(psndocpk);
            String deptDocid = "";
            String deptvDocid = "";
            String pk_dept = BillEventHandlerUtil.getPsndocPubService().queryDeptByPandocIDAndPkorg(psndocpk, pk_org);
            if (pk_dept != null && pk_dept != null && StringUtils.isNotEmpty((CharSequence)pk_org)) {
                deptvDocid = this.queryPsnDeptVid(pk_org, billdate, pk_dept);
                if (null != deptvDocid) {
                    deptDocid = pk_dept;
                }
            } else {
                Map psniddeptid = BillEventHandlerUtil.getPsndocPubService().queryDeptIDByPsndocIDs(new String[]{psndocpk});
                if (psniddeptid != null && psniddeptid.values() != null && psniddeptid.values().size() > 0 && null != (deptvDocid = this.queryPsnDeptVid(pk_org, billdate, ((List)psniddeptid.get(psndocpk)).toArray(new String[0])))) {
                    deptDocid = pk_dept;
                }
            }
            if (StringUtils.isNotEmpty((CharSequence)deptDocid)) {
                headvo.setPk_deptid(deptDocid);
            }
            if (StringUtils.isNotEmpty((CharSequence)deptvDocid)) {
                headvo.setPk_deptid_v(deptvDocid);
            }
        }
        if (item0 != null) {
            for (BaseItemVO itemvo : itemvos) {
                for (String field : head2bodyFields) {
                    itemvo.setAttributeValue(field, headvo.getAttributeValue(field));
                }
            }
        }
    }

    private String queryPsnDeptVid(String pk_org, UFDate date, String ... pk_depts) throws BusinessException {
        if (pk_depts == null || pk_depts.length == 0) {
            return null;
        }
        String where = "pk_org = '" + pk_org + "' and " + OrgPubUtil.getVersionFilterSubSql((UFDate)date, (String)DeptVersionVO.getDefaultTableName(), (String)"pk_dept", (boolean)true, (boolean)false) + " and " + SqlUtils.getInStr((String)"pk_dept", (String[])pk_depts);
        Collection retVOs = ((IUAPQueryBS)NCLocator.getInstance().lookup(IUAPQueryBS.class)).retrieveByClause(DeptVersionVO.class, where);
        return retVOs == null || retVOs.isEmpty() ? null : ((DeptVersionVO)retVOs.iterator().next()).getPk_vid();
    }
}

