/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.pub.IArapBillService
 *  nc.md.persist.framework.IMDPersistenceQueryService
 *  nc.pubitf.resa.factor.IFactorPubService
 *  nc.pubitf.uapbd.IAccountPubService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.arap.pub.VOUtils
 *  nc.vo.arap.utils.ARAPModuleEnableUtil
 *  nc.vo.bd.account.AccountVO
 *  nc.vo.fbm.register.AggRegisterVO
 *  nc.vo.fbm.register.RegisterVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.ExtendedAggregatedValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDate
 *  nc.vo.pubapp.pattern.exception.ExceptionUtils
 *  nc.vo.resa.factor.FactorVO
 *  nc.web.arap.util.VerifyVOScaleUtil
 *  nccloud.bs.excel.process.AbstractExcelOutputProcessor
 *  nccloud.commons.lang.StringUtils
 *  nccloud.itf.trade.excelimport.ExportDataInfo
 *  nccloud.nc.ui.trade.excelimport.vo.ExcelExportCVO
 *  nccloud.ui.trade.excelimport.InputItem
 *  nccloud.vo.excel.scheme.BillDefination
 */
package nccloud.pubimpl.arap.arappub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.pub.IArapBillService;
import nc.md.persist.framework.IMDPersistenceQueryService;
import nc.pubitf.resa.factor.IFactorPubService;
import nc.pubitf.uapbd.IAccountPubService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.VOUtils;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.bd.account.AccountVO;
import nc.vo.fbm.register.AggRegisterVO;
import nc.vo.fbm.register.RegisterVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.ExtendedAggregatedValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDate;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;
import nc.vo.resa.factor.FactorVO;
import nc.web.arap.util.VerifyVOScaleUtil;
import nccloud.bs.excel.process.AbstractExcelOutputProcessor;
import nccloud.commons.lang.StringUtils;
import nccloud.itf.trade.excelimport.ExportDataInfo;
import nccloud.nc.ui.trade.excelimport.vo.ExcelExportCVO;
import nccloud.ui.trade.excelimport.InputItem;
import nccloud.vo.excel.scheme.BillDefination;

public class ArapOutputExcelProcessor<E>
extends AbstractExcelOutputProcessor {
    public ExportDataInfo getValue(Object[] vos, List<InputItem> exportItems, BillDefination billdefination) throws BusinessException {
        BaseAggVO billvo;
        VOUtils VOUtils2;
        BaseAggVO billVo;
        boolean isFbmEnable;
        BaseItemVO[] childrenVO;
        HashMap date2subjcode = new HashMap();
        HashMap date2checkelement = new HashMap();
        HashSet<String> checknoSet = new HashSet<String>();
        ArrayList headSpecialFields = new ArrayList();
        String[][] checknoArr = new String[vos.length][];
        String[][] subjcodeArr = new String[vos.length][];
        String[][] checkelementArr = new String[vos.length][];
        for (int i = 0; i < vos.length; ++i) {
            BaseAggVO billvo2 = (BaseAggVO)vos[i];
            String pk_subjcode = (String)billvo2.getParentVO().getAttributeValue("subjcode");
            String date = ((UFDate)billvo2.getParentVO().getAttributeValue("billdate")).toString();
            String checkelement = (String)billvo2.getParentVO().getAttributeValue("checkelement");
            HashMap map = new HashMap();
            headSpecialFields.add(map);
            if (StringUtils.isNotEmpty((CharSequence)pk_subjcode)) {
                if (!date2subjcode.containsKey(date)) {
                    date2subjcode.put(date, new HashSet());
                }
                ((Set)date2subjcode.get(date)).add(pk_subjcode);
            }
            if (StringUtils.isNotEmpty((CharSequence)checkelement)) {
                if (!date2checkelement.containsKey(date)) {
                    date2checkelement.put(date, new HashSet());
                }
                ((Set)date2checkelement.get(date)).add(checkelement);
            }
            childrenVO = (BaseItemVO[])billvo2.getChildrenVO();
            for (int j = 0; j < childrenVO.length; ++j) {
                BaseItemVO itemVO = childrenVO[j];
                if (StringUtils.isNotEmpty((CharSequence)itemVO.getCheckno())) {
                    checknoSet.add(itemVO.getCheckno());
                }
                if (StringUtils.isNotEmpty((CharSequence)itemVO.getSubjcode())) {
                    if (!date2subjcode.containsKey(date)) {
                        date2subjcode.put(date, new HashSet());
                    }
                    ((Set)date2subjcode.get(date)).add(itemVO.getSubjcode());
                }
                if (!StringUtils.isNotEmpty((CharSequence)itemVO.getCheckelement())) continue;
                if (!date2checkelement.containsKey(date)) {
                    date2checkelement.put(date, new HashSet());
                }
                ((Set)date2checkelement.get(date)).add(itemVO.getCheckelement());
            }
        }
        if (checknoSet.size() > 0 && (isFbmEnable = ARAPModuleEnableUtil.isFbmEnabled((String)((String)(billVo = (BaseAggVO)vos[0]).getParentVO().getAttributeValue("pk_group"))))) {
            int i;
            IMDPersistenceQueryService service = (IMDPersistenceQueryService)NCLocator.getInstance().lookup(IMDPersistenceQueryService.class);
            Object[] registerVOs = service.queryBillOfVOByPKsWithOrder(AggRegisterVO.class, checknoSet.toArray(new String[0]), false);
            HashMap<String, String> map = new HashMap<String, String>();
            for (i = 0; i < registerVOs.length; ++i) {
                RegisterVO parentVO;
                AggRegisterVO registerVO = (AggRegisterVO)registerVOs[i];
                if (registerVO == null || registerVO.getparentVO() == null || !StringUtils.isNotEmpty((CharSequence)(parentVO = registerVO.getparentVO()).getFbmbillno())) continue;
                map.put(parentVO.getPrimaryKey(), parentVO.getFbmbillno());
            }
            for (i = 0; i < vos.length; ++i) {
                BaseAggVO billvo3 = (BaseAggVO)vos[i];
                BaseItemVO[] childrenVO2 = (BaseItemVO[])billvo3.getChildrenVO();
                String[] checknos = new String[childrenVO2.length];
                for (int j = 0; j < childrenVO2.length; ++j) {
                    BaseItemVO itemVO = childrenVO2[j];
                    if (map.containsKey(itemVO.getCheckno())) {
                        itemVO.setCheckno((String)map.get(itemVO.getCheckno()));
                    }
                    checknos[j] = itemVO.getCheckno();
                }
                checknoArr[i] = checknos;
            }
        }
        if (date2subjcode.size() > 0) {
            HashMap<String, String> pk2name = new HashMap<String, String>();
            IAccountPubService service = (IAccountPubService)NCLocator.getInstance().lookup(IAccountPubService.class);
            VOUtils2 = new VOUtils();
            for (Map.Entry entry : date2subjcode.entrySet()) {
                Set value = (Set)entry.getValue();
                AccountVO[] accountVOs = service.queryAccountVOsByPks(value.toArray(new String[0]), (String)entry.getKey());
                if (accountVOs == null || accountVOs.length <= 0) continue;
                for (AccountVO accountVO : accountVOs) {
                    pk2name.put(accountVO.getPk_accasoa(), accountVO.getCode() + "\\" + VOUtils2.getMultiName((SuperVO)accountVO, "name"));
                }
            }
            for (int i = 0; i < vos.length; ++i) {
                billvo = (BaseAggVO)vos[i];
                String pk_subjcode = (String)billvo.getParentVO().getAttributeValue("subjcode");
                if (StringUtils.isNotEmpty((CharSequence)pk_subjcode) && pk2name.containsKey(pk_subjcode)) {
                    billvo.getParentVO().setAttributeValue("subjcode", pk2name.get(pk_subjcode));
                    ((Map)headSpecialFields.get(i)).put("subjcode", pk2name.get(pk_subjcode));
                }
                childrenVO = (BaseItemVO[])billvo.getChildrenVO();
                String[] subjcodes = new String[childrenVO.length];
                for (int j = 0; j < childrenVO.length; ++j) {
                    BaseItemVO itemVO = childrenVO[j];
                    if (!StringUtils.isNotEmpty((CharSequence)itemVO.getSubjcode()) || !pk2name.containsKey(itemVO.getSubjcode())) continue;
                    itemVO.setAttributeValue("subjcode", pk2name.get(itemVO.getSubjcode()));
                    subjcodes[j] = itemVO.getAttributeValue("subjcode").toString();
                }
                subjcodeArr[i] = subjcodes;
            }
        }
        if (date2checkelement.size() > 0) {
            HashMap<String, String> pk2name = new HashMap<String, String>();
            IFactorPubService service = (IFactorPubService)NCLocator.getInstance().lookup(IFactorPubService.class);
            VOUtils2 = new VOUtils();
            for (Map.Entry entry : date2checkelement.entrySet()) {
                Set value = (Set)entry.getValue();
                Map checkelementMap = service.batchQueryFactorVOByAsoaPKs(value.toArray(new String[0]), (String)entry.getKey());
                if (checkelementMap == null) continue;
                for (String key : checkelementMap.keySet()) {
                    FactorVO factorVO = (FactorVO)checkelementMap.get(key);
                    pk2name.put(key, factorVO.getFactorcode() + "\\" + VOUtils2.getMultiName((SuperVO)factorVO, "factorname"));
                }
            }
            for (int i = 0; i < vos.length; ++i) {
                billvo = (BaseAggVO)vos[i];
                String checkelement = (String)billvo.getParentVO().getAttributeValue("checkelement");
                if (StringUtils.isNotEmpty((CharSequence)checkelement) && pk2name.containsKey(checkelement)) {
                    billvo.getParentVO().setAttributeValue("checkelement", pk2name.get(checkelement));
                    ((Map)headSpecialFields.get(i)).put("checkelement", pk2name.get(checkelement));
                }
                childrenVO = (BaseItemVO[])billvo.getChildrenVO();
                String[] checkelements = new String[childrenVO.length];
                for (int j = 0; j < childrenVO.length; ++j) {
                    BaseItemVO itemVO = childrenVO[j];
                    if (!StringUtils.isNotEmpty((CharSequence)itemVO.getCheckelement()) || !pk2name.containsKey(itemVO.getCheckelement())) continue;
                    itemVO.setAttributeValue("checkelement", pk2name.get(itemVO.getCheckelement()));
                    checkelements[j] = itemVO.getAttributeValue("checkelement").toString();
                }
                checkelementArr[i] = checkelements;
            }
        }
        ExtendedAggregatedValueObject[] aggvos = this.getConvertorForTemp().convertDataFromEditorData(billdefination, vos, exportItems);
        for (int i = 0; i < aggvos.length; ++i) {
            Map headSpecialField = (Map)headSpecialFields.get(i);
            String[] checknos = checknoArr[i];
            String[] subjcodes = subjcodeArr[i];
            String[] checkelements = checkelementArr[i];
            ExcelExportCVO parentVO = (ExcelExportCVO)aggvos[i].getParentVO();
            ExcelExportCVO[] tableVOs = (ExcelExportCVO[])aggvos[i].getTableVO("bodys");
            parentVO.setAttributeValue("subjcode", headSpecialField.get("subjcode"));
            parentVO.setAttributeValue("checkelement", headSpecialField.get("checkelement"));
            for (int j = 0; j < tableVOs.length; ++j) {
                if (checknos != null) {
                    tableVOs[j].setAttributeValue("checkno", (Object)checknos[j]);
                }
                if (subjcodes != null) {
                    tableVOs[j].setAttributeValue("subjcode", (Object)subjcodes[j]);
                }
                if (checkelements != null) {
                    tableVOs[j].setAttributeValue("checkelement", (Object)checkelements[j]);
                }
                if (tableVOs[j].getAttributeValue("scomment") != null && !"".equals(tableVOs[j].getAttributeValue("scomment"))) continue;
                tableVOs[j].setAttributeValue("scomment", ((BaseAggVO)vos[i]).getChildrenVO()[j].getAttributeValue("scomment"));
            }
        }
        return new ExportDataInfo(aggvos);
    }

    public Object[] getObjectValueByPks(String[] pks) throws BusinessException {
        IArapBillService service = (IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class);
        BaseAggVO[] datas = null;
        try {
            String[] childField = new String[]{"rowno"};
            for (BaseAggVO baseAggVO : datas = service.queryArapBillByPKs(pks, this.getBilltype(), null, childField)) {
                ArapBillPubUtil.refreshChildVO2HeadVO((AggregatedValueObject[])new AggregatedValueObject[]{baseAggVO});
            }
            Object[] bills = new VerifyVOScaleUtil().verifyVOScale(datas);
            return bills;
        }
        catch (BusinessException e) {
            ExceptionUtils.wrappBusinessException((String)e.getMessage());
            return datas;
        }
    }

    public String getBilltype() {
        return "";
    }
}

