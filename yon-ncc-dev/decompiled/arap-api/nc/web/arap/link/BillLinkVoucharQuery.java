/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.debttransfer.IDebtTransferPrivate
 *  nc.itf.arap.prv.IArapVerifyLogPrivate
 *  nc.pubitf.fip.external.IPreviewVoucherService
 *  nc.vo.arap.debttransfer.DebtTransferMainVO
 *  nc.vo.fip.service.FipMessageVO
 *  nc.vo.fip.service.FipRelationInfoVO
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 *  org.apache.commons.collections4.CollectionUtils
 *  org.apache.commons.lang3.ArrayUtils
 */
package nc.web.arap.link;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.debttransfer.IDebtTransferPrivate;
import nc.itf.arap.prv.IArapVerifyLogPrivate;
import nc.itf.arap.pub.IArapBillService;
import nc.pubitf.arap.bill.IArapBillPubService;
import nc.pubitf.fip.external.IPreviewVoucherService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.debttransfer.DebtTransferMainVO;
import nc.vo.fip.service.FipMessageVO;
import nc.vo.fip.service.FipRelationInfoVO;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;

public class BillLinkVoucharQuery
implements IPreviewVoucherService {
    private static List<String> debtTrabnsfer = Arrays.asList("DA", "DAK", "DB", "DBK");
    private static List<String> verify = Arrays.asList("D9", "D9AP");

    public Map<String, Object> queryBillByconditions(Map<String, Object> map) throws BusinessException {
        List messageVos = (List)map.get("messagevo");
        String pk_bill = (String)((Map)messageVos.get(0)).get("relationid");
        String billType = (String)((Map)messageVos.get(0)).get("pk_billtype");
        String pk_system = (String)((Map)messageVos.get(0)).get("pk_system");
        ArrayList<FipMessageVO[]> messagevos = new ArrayList<FipMessageVO[]>();
        if (debtTrabnsfer.contains(billType)) {
            return this.getDebtRetMap(messageVos);
        }
        if (verify.contains(billType)) {
            return this.getVerifyRetMap(messageVos);
        }
        BaseAggVO[] aggVo = ((IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class)).queryArapBillByPKs(new String[]{pk_bill}, billType);
        if (aggVo == null || aggVo.length == 0) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1016"));
        }
        BaseAggVO[] newaggVo = this.restVObyTerm(aggVo);
        BaseBillVO headVO = newaggVo[0].getHeadVO();
        if (pk_system == null) {
            pk_system = this.getSystem(headVO);
        }
        FipRelationInfoVO srcinfovo = new FipRelationInfoVO();
        srcinfovo.setPk_group(headVO.getPk_group());
        srcinfovo.setPk_org(headVO.getPk_org());
        srcinfovo.setRelationID(pk_bill);
        srcinfovo.setPk_system(pk_system);
        srcinfovo.setPk_billtype(billType);
        srcinfovo.setBusidate(new UFDate());
        srcinfovo.setDefdoc1(headVO.getPk_busitype());
        FipMessageVO fipvo = new FipMessageVO();
        fipvo.setBillVO((Object)newaggVo[0]);
        fipvo.setMessageinfo(srcinfovo);
        messagevos.add(new FipMessageVO[]{fipvo});
        ArrayList<String> desbillTypes = new ArrayList<String>();
        desbillTypes.add("C0");
        HashMap<String, Object> result = new HashMap<String, Object>();
        result.put("messagevo", messagevos.toArray((T[])new FipMessageVO[0][0]));
        result.put("desbilltype", desbillTypes);
        return result;
    }

    private BaseAggVO[] restVObyTerm(BaseAggVO[] aggvos) throws BusinessException {
        String billtype = (String)aggvos[0].getParentVO().getAttributeValue("pk_billtype");
        if ("F0".equals(billtype) || "F1".equals(billtype)) {
            List<AggregatedValueObject> list = ((IArapBillPubService)NCLocator.getInstance().lookup(IArapBillPubService.class)).getChildConstrByTerm((AggregatedValueObject[])aggvos);
            if (CollectionUtils.isEmpty(list)) {
                return aggvos;
            }
            return list.toArray(new BaseAggVO[0]);
        }
        return aggvos;
    }

    private String getSystem(BaseBillVO vo) throws BusinessException {
        if (vo == null) {
            return null;
        }
        String[] arArray = new String[]{"ys", "sk", "zs"};
        String[] apArray = new String[]{"yf", "fk", "zf"};
        String billclass = vo.getBillclass();
        if (Arrays.asList(arArray).contains(billclass)) {
            return "AR";
        }
        if (Arrays.asList(apArray).contains(billclass)) {
            return "AP";
        }
        return null;
    }

    private Map<String, Object> getDebtRetMap(List<Map<String, Object>> messageVos) throws BusinessException {
        ArrayList<String> pk_bills = new ArrayList<String>();
        HashMap<String, Object> result = new HashMap<String, Object>();
        String pk_system = (String)messageVos.get(0).get("pk_system");
        String billType = (String)messageVos.get(0).get("pk_billtype");
        HashMap<String, String> busitypeMap = new HashMap<String, String>();
        ArrayList<FipMessageVO[]> messagevos = new ArrayList<FipMessageVO[]>();
        ArrayList<String> desbillTypes = new ArrayList<String>();
        for (Map<String, Object> map : messageVos) {
            pk_bills.add((String)map.get("relationid"));
            busitypeMap.put((String)map.get("relationid"), (String)map.get("defdoc1"));
        }
        Object[] qryVOs = ((IDebtTransferPrivate)NCLocator.getInstance().lookup(IDebtTransferPrivate.class)).queryAggDebtTransferVOByKeys(pk_bills.toArray(new String[0]));
        if (ArrayUtils.isEmpty((Object[])qryVOs)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1016"));
        }
        for (Object vo : qryVOs) {
            DebtTransferMainVO headVO = (DebtTransferMainVO)vo.getParentVO();
            FipRelationInfoVO srcinfovo = new FipRelationInfoVO();
            srcinfovo.setPk_group(headVO.getPk_group());
            srcinfovo.setPk_org(headVO.getPk_org());
            srcinfovo.setRelationID(headVO.getPk_transfer_h());
            srcinfovo.setPk_system(pk_system);
            srcinfovo.setPk_billtype(billType);
            srcinfovo.setBusidate(new UFDate());
            srcinfovo.setDefdoc1((String)busitypeMap.get(headVO.getPk_transfer_h()));
            FipMessageVO fipvo = new FipMessageVO();
            fipvo.setBillVO(vo);
            fipvo.setMessageinfo(srcinfovo);
            messagevos.add(new FipMessageVO[]{fipvo});
            if (desbillTypes.contains("C0")) continue;
            desbillTypes.add("C0");
        }
        result.put("messagevo", messagevos.toArray((T[])new FipMessageVO[0][0]));
        result.put("desbilltype", desbillTypes);
        return result;
    }

    private Map<String, Object> getVerifyRetMap(List<Map<String, Object>> messageVos) throws BusinessException {
        ArrayList<String> pk_bills = new ArrayList<String>();
        HashMap<String, Object> result = new HashMap<String, Object>();
        String pk_system = (String)messageVos.get(0).get("pk_system");
        String billType = (String)messageVos.get(0).get("pk_billtype");
        ArrayList<FipMessageVO[]> messagevos = new ArrayList<FipMessageVO[]>();
        ArrayList<String> desbillTypes = new ArrayList<String>();
        HashMap<String, String> parmMap = new HashMap<String, String>();
        for (Map<String, Object> map : messageVos) {
            String pk = (String)map.get("relationid");
            if (pk != null && pk.contains("-")) {
                pk_bills.add(pk.split("-")[0]);
                parmMap.put(pk.split("-")[0], pk);
                continue;
            }
            pk_bills.add(pk);
        }
        Object[] qryVOs = ((IArapVerifyLogPrivate)NCLocator.getInstance().lookup(IArapVerifyLogPrivate.class)).getVerifyMainVOS(pk_bills);
        if (ArrayUtils.isEmpty((Object[])qryVOs)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-1016"));
        }
        for (Object headVO : qryVOs) {
            FipRelationInfoVO srcinfovo = new FipRelationInfoVO();
            srcinfovo.setPk_group(headVO.getPk_group());
            srcinfovo.setPk_org(headVO.getPk_org());
            srcinfovo.setRelationID((String)parmMap.get(headVO.getPk_verify()));
            srcinfovo.setPk_system(pk_system);
            srcinfovo.setPk_billtype(billType);
            srcinfovo.setBusidate(new UFDate());
            srcinfovo.setDefdoc1(null);
            FipMessageVO fipvo = new FipMessageVO();
            fipvo.setBillVO(headVO);
            fipvo.setMessageinfo(srcinfovo);
            messagevos.add(new FipMessageVO[]{fipvo});
            if (desbillTypes.contains("C0")) continue;
            desbillTypes.add("C0");
        }
        result.put("messagevo", messagevos.toArray((T[])new FipMessageVO[0][0]));
        result.put("desbilltype", desbillTypes);
        return result;
    }
}

