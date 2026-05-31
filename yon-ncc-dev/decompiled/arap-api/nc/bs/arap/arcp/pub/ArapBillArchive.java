/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.arcp.collect.engine.ArchiveTools
 *  nc.bs.arcp.pub.util.PrintTemplateUtil
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arcp.pub.AbstractArcpDataService
 *  nc.itf.obm.ebank.IObmEbankNccYhhdService
 *  nc.vo.arcp.archive.collect.ArcpBillListParaVO
 *  nc.vo.arcp.archive.collect.ArcpBusiCollectVO
 *  nc.vo.arcp.archive.collect.ArcpBusiQueryVO
 *  nc.vo.arcp.archive.collect.ArcpCheckVO
 *  nc.vo.arcp.archive.collect.ArcpFileServerVO
 *  nc.vo.arcp.archive.collect.Attachements
 *  nc.vo.arcp.archive.unitsetting.ArchiveUnitBillVO
 *  nc.vo.arcp.arcplog.ArcpLogVO
 *  nc.vo.arcp.pub.objectegister.ArcObjectRegisterVO
 *  nc.vo.obm.cjzfdzhd.YhhdVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.pubitf.platform.template.IAppTemplateAssignment
 */
package nc.bs.arap.arcp.pub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import nc.arcp.collect.engine.ArchiveTools;
import nc.bs.arap.arcp.pub.IArapBillArchive;
import nc.bs.arap.arcp.util.ArapArcpPubUtil;
import nc.bs.arap.json.ArapBillJSON;
import nc.bs.arap.print.ArapPDFUtil;
import nc.bs.arcp.pub.util.PrintTemplateUtil;
import nc.bs.framework.common.NCLocator;
import nc.itf.arcp.pub.AbstractArcpDataService;
import nc.itf.obm.ebank.IObmEbankNccYhhdService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.utils.StringUtil;
import nc.vo.arcp.archive.collect.ArcpBillListParaVO;
import nc.vo.arcp.archive.collect.ArcpBusiCollectVO;
import nc.vo.arcp.archive.collect.ArcpBusiQueryVO;
import nc.vo.arcp.archive.collect.ArcpCheckVO;
import nc.vo.arcp.archive.collect.ArcpFileServerVO;
import nc.vo.arcp.archive.collect.Attachements;
import nc.vo.arcp.archive.unitsetting.ArchiveUnitBillVO;
import nc.vo.arcp.arcplog.ArcpLogVO;
import nc.vo.arcp.pub.objectegister.ArcObjectRegisterVO;
import nc.vo.obm.cjzfdzhd.YhhdVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nccloud.commons.lang.ArrayUtils;
import nccloud.pubitf.platform.template.IAppTemplateAssignment;

public class ArapBillArchive
extends AbstractArcpDataService
implements IArapBillArchive {
    public ArcpBusiCollectVO[] getUnitBillListData(ArcpBillListParaVO para, ArcObjectRegisterVO[] arcObjectRegisterVO, ArchiveUnitBillVO[] archiveUnitBillVO) throws BusinessException {
        return this.getUnitBillListData(para, arcObjectRegisterVO[0], archiveUnitBillVO, null);
    }

    public ArcpLogVO[] getDesBillTypeData(ArcpLogVO[] arcplogs, ArcpBusiQueryVO[] arcpbusiquery) throws BusinessException {
        return this.getDesBillTypeData(arcplogs, arcpbusiquery, null);
    }

    @Override
    public ArcpBusiCollectVO[] getUnitBillListData(ArcpBillListParaVO para, ArcObjectRegisterVO arcObjectRegisterVO, ArchiveUnitBillVO[] archiveUnitBillVO, String billType) throws BusinessException {
        HashMap<String, ArchiveUnitBillVO> ruleMap = new HashMap<String, ArchiveUnitBillVO>();
        for (ArchiveUnitBillVO vo : archiveUnitBillVO) {
            ruleMap.put(vo.getPk_tradetype() == null ? billType : vo.getPk_tradetype(), vo);
        }
        BaseAggVO[] aggvos = ArapArcpPubUtil.queryBillByBillTypeAndPks(billType, para.getDocPkList());
        ArrayList<ArcpBusiCollectVO> result = new ArrayList<ArcpBusiCollectVO>();
        for (BaseAggVO aggvo : aggvos) {
            if (aggvo == null) continue;
            ArchiveUnitBillVO rulevo = ruleMap.get(aggvo.getParentVO().getAttributeValue("pk_tradetypeid")) == null ? (ArchiveUnitBillVO)ruleMap.get(billType) : (ArchiveUnitBillVO)ruleMap.get(aggvo.getParentVO().getAttributeValue("pk_tradetypeid"));
            ArcpBusiCollectVO vo = new ArcpBusiCollectVO();
            vo.setJobid(para.getTaskId());
            vo.setPrefix(para.getBilltype());
            vo.setArchives(para.getOrgInfo() == null ? null : para.getOrgInfo().getPk());
            vo.setUuid(aggvo.getParentVO().getPrimaryKey());
            vo.setPk_objectregister(arcObjectRegisterVO.getPk_objectregister());
            vo.setBusits(((BaseBillVO)aggvo.getParentVO()).getTs());
            vo.setDelflag(UFBoolean.valueOf((boolean)false));
            vo.setCallbackUrl(para.getCallbackUrl());
            vo.setSetting_pk(rulevo.getPk_unitsetting_bill());
            result.add(vo);
        }
        return result.toArray(new ArcpBusiCollectVO[0]);
    }

    @Override
    public ArcpLogVO[] getDesBillTypeData(ArcpLogVO[] arcplogs, ArcpBusiQueryVO[] arcpbusiquery, String billType) throws BusinessException {
        HashSet<String> mapks = new HashSet<String>();
        HashMap<String, ArcpLogVO> result = new HashMap<String, ArcpLogVO>();
        for (ArcpLogVO arcplog : arcplogs) {
            mapks.add(arcplog.getUuid());
            result.put(arcplog.getUuid(), arcplog);
        }
        BaseAggVO[] aggvos = ArapArcpPubUtil.queryBillByBillTypeAndPks(billType, mapks.toArray(new String[0]));
        HashMap<String, ArchiveUnitBillVO> ruleMap = new HashMap<String, ArchiveUnitBillVO>();
        for (ArcpBusiQueryVO query : arcpbusiquery) {
            ruleMap.put(query.getArchiveUnitBillVO().getPk_tradetype() == null ? billType : query.getArchiveUnitBillVO().getPk_tradetype(), query.getArchiveUnitBillVO());
        }
        Map<String, String> printMap = ArapArcpPubUtil.getPrintTempletName(arcpbusiquery, billType);
        for (BaseAggVO aggvo : aggvos) {
            Attachements[] allments;
            if (aggvo == null) continue;
            ArcpLogVO arcplog = (ArcpLogVO)result.get(aggvo.getParentVO().getPrimaryKey());
            ArcpLogVO logvo = (ArcpLogVO)result.get(aggvo.getParentVO().getPrimaryKey());
            Map<String, String> pathMap = ArapPDFUtil.printArapBillToPDF(aggvo, ruleMap.get(aggvo.getParentVO().getAttributeValue("pk_tradetypeid")) == null ? (ArchiveUnitBillVO)ruleMap.get(billType) : (ArchiveUnitBillVO)ruleMap.get(aggvo.getParentVO().getAttributeValue("pk_tradetypeid")), logvo);
            Object[] attchments = this.getAttachment(logvo, "bill");
            Object[] imageAttchments = this.getImageAttachment(logvo, (String)aggvo.getParentVO().getAttributeValue("pk_tradetype"), "bill");
            if ("F2".equals(billType) || "F3".equals(billType)) {
                String[] queryEbankEleReceipt = this.queryAllEbankEleReceipt(aggvo);
                if (queryEbankEleReceipt.length > 0) {
                    Attachements[] receiptAttchments = this.getReceiptAttachment(queryEbankEleReceipt, arcplog.getJobid(), "receipt", (ArcpFileServerVO)arcplog.getFileServer());
                    allments = (Attachements[])ArrayUtils.addAll((Object[])attchments, (Object[])imageAttchments);
                    ArrayList<Attachements> arrayList = new ArrayList<Attachements>();
                    for (Attachements att : allments) {
                        arrayList.add(att);
                    }
                    for (Attachements att : receiptAttchments) {
                        arrayList.add(att);
                    }
                    allments = arrayList.toArray(new Attachements[0]);
                } else {
                    allments = (Attachements[])ArrayUtils.addAll((Object[])attchments, (Object[])imageAttchments);
                }
            } else {
                allments = (Attachements[])ArrayUtils.addAll((Object[])attchments, (Object[])imageAttchments);
            }
            ((ArcpLogVO)result.get(aggvo.getParentVO().getPrimaryKey())).setFormatVO(ArapBillJSON.getArapBillFormatVO(aggvo, printMap.get(aggvo.getParentVO().getAttributeValue("pk_tradetypeid")) == null ? printMap.get(billType) : printMap.get(aggvo.getParentVO().getAttributeValue("pk_tradetypeid")), pathMap, allments, logvo));
        }
        return arcplogs;
    }

    private String[] queryAllEbankEleReceipt(BaseAggVO aggvo) throws BusinessException {
        ArrayList<String> tfblists = new ArrayList<String>();
        BaseItemVO[] items = null;
        for (BaseItemVO item : items = (BaseItemVO[])aggvo.getChildrenVO()) {
            if (item.getAttributeValue("transerial") == null) continue;
            tfblists.add(item.getAttributeValue("transerial").toString());
        }
        if (tfblists.size() > 0) {
            String[] transerials = tfblists.toArray(new String[0]);
            IObmEbankNccYhhdService obmEbankNccYhhdService = (IObmEbankNccYhhdService)NCLocator.getInstance().lookup(IObmEbankNccYhhdService.class);
            YhhdVO[] yhhdvos = null;
            yhhdvos = obmEbankNccYhhdService.queryEbankYhhdByBankSeqNos(transerials);
            String[] pkyhhds = new String[yhhdvos.length];
            for (int i = 0; i < yhhdvos.length; ++i) {
                pkyhhds[i] = yhhdvos[i].getPk_yhhd();
            }
            return pkyhhds;
        }
        return new String[0];
    }

    public Map<String, ArcpCheckVO> getUpperBillCheckData(String[] ids, int upperlevels, String pk_billtypecode) throws BusinessException {
        BaseAggVO[] aggvos = ArapArcpPubUtil.queryBillByBillTypeAndPks(pk_billtypecode, ids);
        HashMap<String, ArcpCheckVO> billmap = new HashMap<String, ArcpCheckVO>();
        if (StringUtil.isEmptyArry(aggvos)) {
            return null;
        }
        for (BaseAggVO aggvo : aggvos) {
            if (aggvo == null) continue;
            Object[] itemvo = (BaseItemVO[])aggvo.getChildrenVO();
            ArcpCheckVO checkvo = new ArcpCheckVO();
            checkvo.setPk(aggvo.getPrimaryKey());
            String ts = aggvo.getParentVO().getAttributeValue("ts") == null ? "" : aggvo.getParentVO().getAttributeValue("ts").toString();
            checkvo.setTs(ts);
            checkvo.setType((String)aggvo.getParentVO().getAttributeValue("pk_tradetype"));
            boolean isSupportArcp = ArchiveTools.isSupportArchive((String)itemvo[0].getTop_billtype(), (String)itemvo[0].getPk_group());
            if (!ArrayUtils.isEmpty((Object[])itemvo) && upperlevels > 0 && isSupportArcp) {
                String topPK = ((BaseItemVO)itemvo[0]).getTop_itemid();
                Map subUpperDocMap = ArchiveTools.getUpperBillCheckData((String)((BaseItemVO)itemvo[0]).getTop_tradetype(), (String[])new String[]{topPK}, (int)(upperlevels - 1), (String)((BaseItemVO)itemvo[0]).getPk_group());
                ArcpCheckVO arcpCheckVO = (ArcpCheckVO)subUpperDocMap.get(topPK);
                if (arcpCheckVO != null) {
                    checkvo.setUpperDocs(new ArcpCheckVO[]{arcpCheckVO});
                }
            }
            billmap.put(aggvo.getParentVO().getPrimaryKey(), checkvo);
        }
        ArrayList<String> upIds = new ArrayList<String>();
        String upBillTypeCode = null;
        for (String key : billmap.keySet()) {
            if (((ArcpCheckVO)billmap.get(key)).getUpperDocs() == null) continue;
            upIds.add(((ArcpCheckVO)billmap.get(key)).getUpperDocs()[0].getPk());
            upBillTypeCode = ((ArcpCheckVO)billmap.get(key)).getUpperDocs()[0].getType();
        }
        if (upIds.size() > 0) {
            billmap.putAll(ArchiveTools.getUpperBillCheckData(upBillTypeCode, (String[])upIds.toArray(new String[0]), (int)(upperlevels - 1), (String)((String)aggvos[0].getParentVO().getAttributeValue("pk_group"))));
        }
        return billmap;
    }

    public String[] getPrintTemplates(String pk_group, String pk_org, String userid, String billTypeOrTransTypeCode) throws BusinessException {
        return PrintTemplateUtil.queryBillPrintTemplates((String)pk_group, (String)pk_org, (String)userid, (String)billTypeOrTransTypeCode);
    }

    public String[] getPrintTemplatesNCC(String pk_group, String pk_org, String userid, String billTypeOrTransTypeCode, String funcode) throws BusinessException {
        try {
            return ((IAppTemplateAssignment)NCLocator.getInstance().lookup(IAppTemplateAssignment.class)).listUserPriorPrintTemplateIds(userid, pk_group, pk_org, null, funcode).toArray(new String[0]);
        }
        catch (Exception e) {
            throw new BusinessException(e.getMessage());
        }
    }
}

