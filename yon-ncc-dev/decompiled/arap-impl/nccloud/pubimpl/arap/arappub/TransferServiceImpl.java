/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.arap.bill.ArapBillPubUtil
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.pf.pub.PfDataCache
 *  nc.itf.arap.pub.IArapBillService
 *  nc.itf.uap.pf.IPFConfig
 *  nc.itf.uap.pf.IPfExchangeService
 *  nc.vo.aol.rent.settle.AggRentOutSettleVO
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.basebill.BaseBillVO
 *  nc.vo.arap.pub.BillEnumCollection$FromSystem
 *  nc.vo.fct.ap.entity.AggCtApVO
 *  nc.vo.fct.ar.entity.AggCtArVO
 *  nc.vo.fct.enumeration.FctBillType
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDateTime
 *  nc.vo.pub.lang.UFDouble
 *  nccloud.commons.lang.ArrayUtils
 *  nccloud.commons.lang.StringUtils
 *  nccloud.dto.arap.arappub.info.PkTsParamsVO
 *  nccloud.dto.arap.arappub.info.TransferData
 *  nccloud.dto.arap.arappub.info.TransferInfo
 *  nccloud.pubitf.arap.arappub.ITransferService
 */
package nccloud.pubimpl.arap.arappub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.bs.pf.pub.PfDataCache;
import nc.itf.arap.pub.IArapBillService;
import nc.itf.uap.pf.IPFConfig;
import nc.itf.uap.pf.IPfExchangeService;
import nc.vo.aol.rent.settle.AggRentOutSettleVO;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.fct.ap.entity.AggCtApVO;
import nc.vo.fct.ar.entity.AggCtArVO;
import nc.vo.fct.enumeration.FctBillType;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;
import nccloud.commons.lang.ArrayUtils;
import nccloud.commons.lang.StringUtils;
import nccloud.dto.arap.arappub.info.PkTsParamsVO;
import nccloud.dto.arap.arappub.info.TransferData;
import nccloud.dto.arap.arappub.info.TransferInfo;
import nccloud.pubitf.arap.arappub.ITransferService;

public class TransferServiceImpl
implements ITransferService {
    public AggregatedValueObject[] execTransfer(TransferInfo info) throws BusinessException {
        TransferData[] datas = info.getData();
        if (datas == null || datas.length == 0) {
            return null;
        }
        HashMap<String, UFDateTime> idTsMap = new HashMap<String, UFDateTime>();
        ArrayList<String> billIdList = new ArrayList<String>();
        HashSet<String> bodyPks = new HashSet<String>();
        for (TransferData data : datas) {
            PkTsParamsVO head = data.getHead();
            PkTsParamsVO[] bodys = data.getBodys();
            if (head == null || bodys == null) continue;
            idTsMap.put(head.getPk(), head.getTs());
            billIdList.add(head.getPk());
            for (PkTsParamsVO body : bodys) {
                idTsMap.put(body.getPk(), body.getTs());
                bodyPks.add(body.getPk());
            }
        }
        List<AggregatedValueObject> volist = new ArrayList<AggregatedValueObject>();
        String[] billtype = new String[]{"F0", "F1", "F2", "F3"};
        String[] fctBillType = new String[]{FctBillType.PAY.getCode(), FctBillType.GATHER.getCode()};
        if (Arrays.asList(billtype).contains(info.getSrcBilltype())) {
            String[] childField = new String[]{"rowno"};
            BaseAggVO[] vos = ((IArapBillService)NCLocator.getInstance().lookup(IArapBillService.class)).queryArapBillByPKs(billIdList.toArray(new String[0]), info.getSrcBilltype(), null, childField);
            volist = this.getVOList((AggregatedValueObject[])vos, idTsMap, info, bodyPks);
        } else {
            for (String billId : billIdList) {
                UFBoolean blatest;
                AggregatedValueObject vo = ((IPFConfig)NCLocator.getInstance().lookup(IPFConfig.class)).queryBillDataVO(info.getSrcBilltype(), billId);
                if (vo == null || Arrays.asList(fctBillType).contains(info.getSrcBilltype()) && !(blatest = (UFBoolean)vo.getParentVO().getAttributeValue("blatest")).booleanValue()) continue;
                volist.addAll(this.getVOList(new AggregatedValueObject[]{vo}, idTsMap, info, bodyPks));
            }
        }
        AggregatedValueObject[] vos = null;
        if (volist.size() != 0) {
            AggregatedValueObject[] sourceVOs = volist.toArray(new AggregatedValueObject[volist.size()]);
            IPfExchangeService service = (IPfExchangeService)NCLocator.getInstance().lookup(IPfExchangeService.class);
            vos = service.runChangeDataAry(info.getSrcBilltype(), info.getDestTradetype(), sourceVOs, null);
            this.dealBills(vos, info);
            ArapBillPubUtil.refreshChildVO2HeadVO((AggregatedValueObject[])vos);
        }
        return vos;
    }

    private List<AggregatedValueObject> getVOList(AggregatedValueObject[] vos, Map<String, UFDateTime> idTsMap, TransferInfo info, Set<String> bodyPks) throws BusinessException {
        ArrayList<AggregatedValueObject> volist = new ArrayList<AggregatedValueObject>();
        for (AggregatedValueObject vo : vos) {
            if (vo == null) continue;
            CircularlyAccessibleValueObject head = vo.getParentVO();
            head.setAttributeValue("ts", (Object)idTsMap.get(head.getPrimaryKey()));
            Object[] items = vo.getChildrenVO();
            items = Objects.equals(info.getSrcBilltype(), "FCT1") ? ((AggCtApVO)vo).getAllChildrenVos() : (Objects.equals(info.getSrcBilltype(), "FCT2") ? ((AggCtArVO)vo).getAllChildrenVos() : (Objects.equals(info.getSrcBilltype(), "4BL9") ? ((AggRentOutSettleVO)vo).getAllChildrenVO() : vo.getChildrenVO()));
            for (int i = 0; i < items.length; ++i) {
                if (!bodyPks.contains(items[i].getPrimaryKey())) {
                    items = (CircularlyAccessibleValueObject[])ArrayUtils.remove((Object[])items, (int)i);
                    --i;
                    continue;
                }
                items[i].setAttributeValue("ts", (Object)idTsMap.get(items[i].getPrimaryKey()));
            }
            if (items.length == 0) continue;
            if (Objects.equals(info.getSrcBilltype(), "FCT1")) {
                ((AggCtApVO)vo).setAllChildrenVos((SuperVO[])items);
            } else if (Objects.equals(info.getSrcBilltype(), "FCT2")) {
                ((AggCtArVO)vo).setAllChildrenVos((SuperVO[])items);
            } else if (Objects.equals(info.getSrcBilltype(), "4BL9")) {
                ((AggRentOutSettleVO)vo).setAllChildrenVos((SuperVO[])items);
            } else {
                vo.setChildrenVO((CircularlyAccessibleValueObject[])items);
            }
            volist.add(vo);
        }
        return volist;
    }

    private void dealBills(AggregatedValueObject[] vos, TransferInfo info) throws BusinessException {
        String tradetype = info.getDestTradetype();
        String pkBilltypeid = PfDataCache.getBillType((String)tradetype).getPk_billtypeid();
        for (int i = 0; i < vos.length; ++i) {
            String top_billtype;
            AggregatedValueObject vo = vos[i];
            CircularlyAccessibleValueObject[] items = vo.getChildrenVO();
            CircularlyAccessibleValueObject head = vo.getParentVO();
            BaseBillVO header = (BaseBillVO)head;
            String pk_busitype = header.getPk_busitype();
            if (StringUtils.isEmpty((CharSequence)pk_busitype)) {
                IPFConfig ipf = (IPFConfig)NCLocator.getInstance().lookup(IPFConfig.class);
                pk_busitype = ipf.retBusitypeCanStart(header.getPk_billtype(), header.getPk_tradetype(), header.getPk_org(), header.getCreator());
                head.setAttributeValue("pk_busitype", (Object)pk_busitype);
            }
            head.setAttributeValue("pk_tradetype", (Object)tradetype);
            head.setAttributeValue("pk_tradetypeid", (Object)pkBilltypeid);
            head.setAttributeValue("billno", null);
            head.setAttributeValue("isflowbill", (Object)UFBoolean.TRUE);
            head.setAttributeValue("billmaker", (Object)InvocationInfoProxy.getInstance().getUserId());
            head.setAttributeValue("objtype", items.length > 0 ? items[0].getAttributeValue("objtype") : null);
            for (int j = 0; j < items.length; ++j) {
                CircularlyAccessibleValueObject item = items[j];
                item.setAttributeValue("pk_tradetype", (Object)tradetype);
                item.setAttributeValue("pk_tradetypeid", (Object)pkBilltypeid);
                item.setAttributeValue("billno", null);
                item.setAttributeValue("occupationmny", (Object)UFDouble.ZERO_DBL);
                item.setAttributeValue("status", (Object)0);
            }
            String string = top_billtype = items.length == 0 ? null : (String)items[0].getAttributeValue("top_billtype");
            if (StringUtils.isNotEmpty(top_billtype) && ArapBillPubUtil.isArapBilltype((String)top_billtype)) {
                head.setAttributeValue("src_syscode", (Object)(ArapBillPubUtil.isARSysBilltype((String)top_billtype) ? BillEnumCollection.FromSystem.AR.VALUE : BillEnumCollection.FromSystem.AP.VALUE));
                head.setAttributeValue("customer", items[0].getAttributeValue("customer"));
                head.setAttributeValue("customer_v", items[0].getAttributeValue("customer_v"));
                head.setAttributeValue("supplier", items[0].getAttributeValue("supplier"));
                head.setAttributeValue("supplier_v", items[0].getAttributeValue("supplier_v"));
                head.setAttributeValue("pk_deptid", items[0].getAttributeValue("pk_deptid"));
                head.setAttributeValue("pk_deptid_v", items[0].getAttributeValue("pk_deptid_v"));
            }
            head.setPrimaryKey(null);
            ArapBillPubUtil.processMoneyOnlySum((AggregatedValueObject)vo);
        }
    }
}

