/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.arcp.collect.engine.ArchiveTools
 *  nc.md.data.access.NCObject
 *  nc.vo.arcp.archive.collect.Attachements
 *  nc.vo.arcp.archive.collect.BusinessMetaData
 *  nc.vo.arcp.archive.collect.DescData
 *  nc.vo.arcp.archive.collect.FormatVO
 *  nc.vo.arcp.archive.collect.SysInfo
 *  nc.vo.arcp.archive.collect.UpperDocs
 *  nc.vo.arcp.arcplog.ArcpLogVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 */
package nc.bs.arap.json;

import java.util.ArrayList;
import java.util.Map;
import nc.arcp.collect.engine.ArchiveTools;
import nc.md.data.access.NCObject;
import nc.vo.arap.arcp.ArapGatherBillVO;
import nc.vo.arap.arcp.ArapPayBillVO;
import nc.vo.arap.arcp.ArapPayableBillVO;
import nc.vo.arap.arcp.ArapRecBillVO;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.utils.StringUtil;
import nc.vo.arcp.archive.collect.Attachements;
import nc.vo.arcp.archive.collect.BusinessMetaData;
import nc.vo.arcp.archive.collect.DescData;
import nc.vo.arcp.archive.collect.FormatVO;
import nc.vo.arcp.archive.collect.SysInfo;
import nc.vo.arcp.archive.collect.UpperDocs;
import nc.vo.arcp.arcplog.ArcpLogVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;

public class ArapBillJSON {
    public static FormatVO getArapBillFormatVO(BaseAggVO aggvo, String printTempLateName, Map<String, String> pathMap, Attachements[] allments, ArcpLogVO logvo) throws BusinessException {
        FormatVO fjvo = new FormatVO();
        DescData dvo = new DescData();
        BaseBillVO headvo = (BaseBillVO)aggvo.getParentVO();
        NCObject hncobj = NCObject.newInstance((Object)headvo);
        dvo.setPk(aggvo.getParentVO().getPrimaryKey());
        dvo.setParentDocType((String)aggvo.getParentVO().getAttributeValue("pk_billtype"));
        dvo.setDocType(logvo.getPrefix());
        dvo.setOrgCode((String)hncobj.getAttributeValue("pk_org.code"));
        dvo.setKeywords(hncobj.getAttributeValue("pk_tradetypeid.billtypename") == null ? "" : hncobj.getAttributeValue("pk_tradetypeid.billtypename").toString());
        dvo.setFileUrl(pathMap.get("filepath"));
        dvo.setChecksum(pathMap.get("checksum"));
        dvo.setSrcFileName(pathMap.get("srcFileName"));
        dvo.setTemplateName(printTempLateName);
        if (!StringUtil.isEmptyArry(aggvo.getChildrenVO())) {
            ArrayList<UpperDocs> uds = new ArrayList<UpperDocs>();
            for (CircularlyAccessibleValueObject temp : aggvo.getChildrenVO()) {
                UpperDocs uppdoc = new UpperDocs();
                BaseItemVO itemvo = (BaseItemVO)temp;
                if (itemvo.getTop_billid() == null || itemvo.getTop_billtype() == null || logvo.getShowUpper() != 1) continue;
                boolean isSupportArcp = ArchiveTools.isSupportArchive((String)itemvo.getTop_billtype(), (String)((String)aggvo.getParentVO().getAttributeValue("pk_group")));
                boolean isisCoorBill = ArapBillJSON.isCoorBill(headvo);
                if (!isSupportArcp || isisCoorBill) continue;
                uppdoc.setPk(itemvo.getTop_billid());
                uppdoc.setType(itemvo.getTop_tradetype() != null && !"".equals(itemvo.getTop_tradetype()) ? itemvo.getTop_tradetype() : itemvo.getTop_billtype());
                uppdoc.setSysCode("NC Cloud 2021.11");
                uds.add(uppdoc);
            }
            dvo.setUpperDocs(uds.toArray(new UpperDocs[0]));
        }
        BusinessMetaData billvo = null;
        billvo = "F0".equals(headvo.getPk_billtype()) ? ArapBillJSON.getRecBillFormatVO(aggvo) : ("F1".equals(headvo.getPk_billtype()) ? ArapBillJSON.getPayableBillFormatVO(aggvo) : ("F2".equals(headvo.getPk_billtype()) ? ArapBillJSON.getGatherBillFormatVO(aggvo) : ArapBillJSON.getPayBillFormatVO(aggvo)));
        dvo.setSysInfo(ArapBillJSON.getSysInfo());
        dvo.setAttachements(allments);
        fjvo.setDescData(dvo);
        fjvo.setBusinessMetaData(new BusinessMetaData[]{billvo});
        return fjvo;
    }

    public static boolean isCoorBill(BaseBillVO headVO) {
        return headVO.getSrc_syscode().intValue() == BillEnumCollection.FromSystem.XTDJ.VALUE.intValue();
    }

    public static ArapRecBillVO getRecBillFormatVO(BaseAggVO aggvo) {
        ArapRecBillVO billvo = new ArapRecBillVO();
        BaseBillVO headvo = (BaseBillVO)aggvo.getParentVO();
        NCObject hncobj = NCObject.newInstance((Object)headvo);
        billvo.setArcp050101(headvo.getBillperiod());
        billvo.setArcp010802(headvo.getPk_billtype());
        billvo.setArcp010803(ArapBillJSON.getAttributeValue(hncobj, "pk_tradetypeid.billtypename"));
        billvo.setArcp010804(headvo.getPk_tradetype());
        billvo.setArcp010805(ArapBillJSON.getAttributeValue(hncobj, "pk_tradetypeid.billtypename"));
        billvo.setArcp010806(headvo.getBillno());
        billvo.setArcp010807(headvo.getEffectdate() == null ? "" : headvo.getEffectdate().toString());
        billvo.setArcp050502(ArapBillJSON.getAttributeValue(hncobj, "customer.code"));
        billvo.setArcp050503(ArapBillJSON.getAttributeValue(hncobj, "customer.name"));
        billvo.setArcp050701(ArapBillJSON.getAttributeValue(hncobj, "pk_currtype.code"));
        billvo.setArcp010523(aggvo.getChildrenVO()[0].getAttributeValue("rate") == null ? "1.00" : aggvo.getChildrenVO()[0].getAttributeValue("rate").toString());
        billvo.setArcp010808(headvo.getMoney() == null ? "0" : headvo.getMoney().toString());
        billvo.setArcp010809(headvo.getLocal_money() == null ? "0" : headvo.getLocal_money().toString());
        billvo.setArcp010810(headvo.getScomment());
        billvo.setArcp010812(ArapBillJSON.getAttributeValue(hncobj, "creator.user_code"));
        billvo.setArcp010813(ArapBillJSON.getAttributeValue(hncobj, "creator.user_name"));
        billvo.setArcp010814(headvo.getCreationtime() == null ? "" : headvo.getCreationtime().toStdString());
        return billvo;
    }

    public static ArapPayableBillVO getPayableBillFormatVO(BaseAggVO aggvo) {
        ArapPayableBillVO billvo = new ArapPayableBillVO();
        BaseBillVO headvo = (BaseBillVO)aggvo.getParentVO();
        NCObject hncobj = NCObject.newInstance((Object)headvo);
        billvo.setArcp010901(headvo.getApprovedate() == null ? "" : headvo.getApprovedate().toStdString());
        billvo.setArcp010902(headvo.getApprovedated() == null ? "" : headvo.getApprovedated().toString());
        billvo.setArcp010903(ArapBillJSON.getAttributeValue(hncobj, "approver.user_name"));
        billvo.setArcp010904(headvo.getApprovestatus() == null ? "" : headvo.getApprovestatus().toString());
        billvo.setArcp010905(headvo.getBillclass());
        billvo.setArcp010906(headvo.getBilldate() == null ? "" : headvo.getBilldate().toString());
        billvo.setArcp010907(ArapBillJSON.getAttributeValue(hncobj, "billmaker.user_name"));
        billvo.setArcp010908(headvo.getBillno());
        billvo.setArcp010909(headvo.getBillperiod());
        billvo.setArcp010910(headvo.getBillyear());
        billvo.setArcp010911(headvo.getCreationtime() == null ? "" : headvo.getCreationtime().toStdString());
        billvo.setArcp010912(ArapBillJSON.getAttributeValue(hncobj, "creator.user_name"));
        billvo.setArcp010913(headvo.getGrouplocal() == null ? "0" : headvo.getGrouplocal().toString());
        billvo.setArcp010914(headvo.getGrouprate() == null ? "1.00" : headvo.getGrouprate().toString());
        billvo.setArcp010915(headvo.getIsreded() == null ? "N" : headvo.getIsreded().toString());
        billvo.setArcp010916(ArapBillJSON.getAttributeValue(hncobj, "lastapproveid.user_name"));
        billvo.setArcp010917(headvo.getLocal_money() == null ? "0" : headvo.getLocal_money().toString());
        billvo.setArcp010918(headvo.getModifiedtime() == null ? "" : headvo.getModifiedtime().toStdString());
        billvo.setArcp010919(ArapBillJSON.getAttributeValue(hncobj, "modifier.user_name"));
        billvo.setArcp010920(headvo.getMoney() == null ? "0" : headvo.getMoney().toString());
        billvo.setArcp010921(ArapBillJSON.getAttributeValue(hncobj, "pk_currtype.code"));
        billvo.setArcp010922((String)aggvo.getChildrenVO()[0].getAttributeValue("pk_deptid"));
        billvo.setArcp010923("");
        billvo.setArcp010924(headvo.getPk_group());
        billvo.setArcp010925((String)aggvo.getChildrenVO()[0].getAttributeValue("pk_subjcode"));
        billvo.setArcp010926(aggvo.getChildrenVO()[0].getAttributeValue("rate") == null ? "1.00" : aggvo.getChildrenVO()[0].getAttributeValue("rate").toString());
        billvo.setArcp010927(ArapBillJSON.getAttributeValue(hncobj, "recaccount.accname"));
        billvo.setArcp010928(headvo.getScomment());
        return billvo;
    }

    public static ArapGatherBillVO getGatherBillFormatVO(BaseAggVO aggvo) {
        ArapGatherBillVO billvo = new ArapGatherBillVO();
        BaseBillVO headvo = (BaseBillVO)aggvo.getParentVO();
        NCObject hncobj = NCObject.newInstance((Object)headvo);
        billvo.setArcp021601(headvo.getBillno());
        billvo.setArcp021602(aggvo.getChildrenVO()[0].getAttributeValue("busidate") == null ? "" : aggvo.getChildrenVO()[0].getAttributeValue("busidate").toString());
        billvo.setArcp021603(ArapBillJSON.getAttributeValue(hncobj, "pk_org.name"));
        if (BillEnumCollection.ObjType.CUSTOMER.VALUE.equals(aggvo.getChildrenVO()[0].getAttributeValue("objtype"))) {
            billvo.setArcp021604(ArapBillJSON.getAttributeValue(hncobj, "customer.name"));
        } else {
            billvo.setArcp021604("");
        }
        billvo.setArcp021607(ArapBillJSON.getAttributeValue(hncobj, "payaccount.accname"));
        billvo.setArcp021608(ArapBillJSON.getAttributeValue(hncobj, "payaccount.accnum"));
        billvo.setArcp021605(ArapBillJSON.getAttributeValue(hncobj, "recaccount.accname"));
        billvo.setArcp021606(ArapBillJSON.getAttributeValue(hncobj, "recaccount.accname"));
        billvo.setArcp021609(ArapBillJSON.getAttributeValue(hncobj, "billmaker.user_name"));
        billvo.setArcp021610(headvo.getCreationtime().toStdString() == null ? "" : headvo.getCreationtime().toStdString());
        billvo.setArcp021611(ArapBillJSON.getAttributeValue(hncobj, "approver.user_name"));
        billvo.setArcp021612(headvo.getApprovedate() == null ? "" : headvo.getApprovedate().toStdString());
        billvo.setArcp021613(ArapBillJSON.getAttributeValue(hncobj, "creator.user_code"));
        billvo.setArcp021614(ArapBillJSON.getAttributeValue(hncobj, "creator.user_name"));
        billvo.setArcp021615(headvo.getCreationtime().toStdString() == null ? "" : headvo.getCreationtime().toStdString());
        billvo.setArcp021617(headvo.getScomment());
        billvo.setArcp050701(ArapBillJSON.getAttributeValue(hncobj, "pk_currtype.code"));
        billvo.setArcp050801(ArapBillJSON.getAttributeValue(hncobj, "pk_balatype.name"));
        billvo.setArcp010523(aggvo.getChildrenVO()[0].getAttributeValue("rate") == null ? "1.00" : aggvo.getChildrenVO()[0].getAttributeValue("rate").toString());
        billvo.setArcp021618(headvo.getMoney() == null ? "0" : headvo.getMoney().toString());
        billvo.setArcp021619(headvo.getLocal_money() == null ? "0" : headvo.getLocal_money().toString());
        return billvo;
    }

    public static ArapPayBillVO getPayBillFormatVO(BaseAggVO aggvo) {
        ArapPayBillVO billvo = new ArapPayBillVO();
        BaseBillVO headvo = (BaseBillVO)aggvo.getParentVO();
        NCObject hncobj = NCObject.newInstance((Object)headvo);
        billvo.setArcp021501(headvo.getBillno());
        billvo.setArcp021502(aggvo.getChildrenVO()[0].getAttributeValue("busidate") == null ? "" : aggvo.getChildrenVO()[0].getAttributeValue("busidate").toString());
        billvo.setArcp021503(ArapBillJSON.getAttributeValue(hncobj, "pk_org.name"));
        if (BillEnumCollection.ObjType.SUPPLIER.VALUE.equals(aggvo.getChildrenVO()[0].getAttributeValue("objtype"))) {
            billvo.setArcp021504(ArapBillJSON.getAttributeValue(hncobj, "supplier.name"));
        } else {
            billvo.setArcp021504("");
        }
        billvo.setArcp021505(ArapBillJSON.getAttributeValue(hncobj, "payaccount.accname"));
        billvo.setArcp021506(ArapBillJSON.getAttributeValue(hncobj, "payaccount.accnum"));
        billvo.setArcp021507(ArapBillJSON.getAttributeValue(hncobj, "recaccount.accname"));
        billvo.setArcp021508(ArapBillJSON.getAttributeValue(hncobj, "recaccount.accname"));
        billvo.setArcp021509(ArapBillJSON.getAttributeValue(hncobj, "billmaker.user_name"));
        billvo.setArcp021510(headvo.getCreationtime().toStdString() == null ? "" : headvo.getCreationtime().toStdString());
        billvo.setArcp021511(ArapBillJSON.getAttributeValue(hncobj, "approver.user_name"));
        billvo.setArcp021512(headvo.getApprovedate() == null ? "" : headvo.getApprovedate().toStdString());
        billvo.setArcp021513(ArapBillJSON.getAttributeValue(hncobj, "creator.user_code"));
        billvo.setArcp021514(ArapBillJSON.getAttributeValue(hncobj, "creator.user_name"));
        billvo.setArcp021515(headvo.getCreationtime().toStdString() == null ? "" : headvo.getCreationtime().toStdString());
        billvo.setArcp021517(headvo.getScomment());
        billvo.setArcp050701(ArapBillJSON.getAttributeValue(hncobj, "pk_currtype.code"));
        billvo.setArcp050801(ArapBillJSON.getAttributeValue(hncobj, "pk_balatype.name"));
        billvo.setArcp010523(aggvo.getChildrenVO()[0].getAttributeValue("rate") == null ? "1.00" : aggvo.getChildrenVO()[0].getAttributeValue("rate").toString());
        billvo.setArcp021518(headvo.getMoney() == null ? "0" : headvo.getMoney().toString());
        billvo.setArcp021519(headvo.getLocal_money() == null ? "0" : headvo.getLocal_money().toString());
        return billvo;
    }

    private static String getAttributeValue(NCObject ncobj, String path) {
        return ncobj.getAttributeValue(path) == null ? "" : ncobj.getAttributeValue(path).toString();
    }

    public static SysInfo getSysInfo() {
        SysInfo sysInfo = new SysInfo();
        sysInfo.setSysVersion("65");
        sysInfo.setSysName("NC");
        sysInfo.setDeveloperName("yonyou");
        return sysInfo;
    }
}

