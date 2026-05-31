package nc.hk.bs.arap.listener;

import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.bs.framework.common.NCLocator;
import nc.bs.logging.Logger;
import nc.itf.arap.payable.IArapPayableBillQueryService;
import nc.itf.arap.receivable.IArapReceivableBillQueryService;
import nc.itf.arap.receivable.IArapReceivableBillService;
import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.arap.payable.PayableBillVO;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.arap.receivable.ReceivableBillVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.exception.ExceptionUtils;

/**
 * 应付单新增后，将应付单单据号回写到关联的应收单def1字段
 * <p>
 * 业务逻辑：
 * 1. 应付单新增后触发 (sourceid=F1, eventtypecode=1002)
 * 2. 如果应付单def1有值（应收单单据号），查询对应应收单
 * 3. 将应收单的def1更新为应付单的单据号
 *
 * @author hk
 */
public class PayableBillWritebackReceivableListener implements IBusinessListener {

    @Override
    public void doAction(IBusinessEvent event) throws BusinessException {
        try {
            // 1. 校验事件类型
            if (!(event instanceof BusinessEvent)) {
                return;
            }
            BusinessEvent busEvent = (BusinessEvent) event;

            // 2. 获取应付单聚合VO
            Object obj = busEvent.getObject();
            if (obj == null) {
                return;
            }

            AggPayableBillVO payableAggVO;
            if (obj instanceof AggPayableBillVO) {
                payableAggVO = (AggPayableBillVO) obj;
            } else if (obj.getClass().isArray()) {
                // 批量场景取第一条
                Object[] arr = (Object[]) obj;
                if (arr.length == 0 || !(arr[0] instanceof AggPayableBillVO)) {
                    return;
                }
                payableAggVO = (AggPayableBillVO) arr[0];
            } else {
                return;
            }

            // 3. 获取应付单表头VO
            PayableBillVO payableHead = payableAggVO.getParentVO();
            if (payableHead == null) {
                return;
            }

            // 4. 检查def1是否有值（应收单单据号）
            String receivableBillno = payableHead.getDef1();
            if (receivableBillno == null || receivableBillno.trim().isEmpty()) {
                Logger.info("应付单[" + payableHead.getBillno() + "] def1为空，跳过回写");
                return;
            }
            receivableBillno = receivableBillno.trim();

            // 5. 应付单单据号
            String payableBillno = payableHead.getBillno();
            if (payableBillno == null || payableBillno.trim().isEmpty()) {
                Logger.warn("应付单[" + payableHead.getPk_payablebill() + "] 单据号为空，跳过回写");
                return;
            }
            payableBillno = payableBillno.trim();

            Logger.info("开始回写：应付单[" + payableBillno + "] → 应收单[" + receivableBillno + "]");

            // 6. 查询应收单
            IArapReceivableBillQueryService recQrySvc =
                    NCLocator.getInstance().lookup(IArapReceivableBillQueryService.class);

            String whereSql = "billno = '" + receivableBillno + "' and dr = 0";
            AggReceivableBillVO[] recVOs = recQrySvc.queryVOsByWhere(whereSql);

            if (recVOs == null || recVOs.length == 0) {
                Logger.warn("未找到应收单，单据号: " + receivableBillno);
                return;
            }

            // 7. 更新应收单def1
            AggReceivableBillVO recAggVO = recVOs[0];
            ReceivableBillVO recHead = recAggVO.getParentVO();
            if (recHead == null) {
                Logger.warn("应收单[" + receivableBillno + "]表头VO为空");
                return;
            }

            recHead.setDef1(payableBillno);
            recHead.setAttributeValue("def1", payableBillno);

            // 8. 保存应收单
            IArapReceivableBillService<AggReceivableBillVO> recSvc =
                    NCLocator.getInstance().lookup(IArapReceivableBillService.class);
            recSvc.update(recAggVO);

            Logger.info("回写成功：应收单[" + receivableBillno + "] def1 = " + payableBillno);

        } catch (Exception e) {
            ExceptionUtils.wrappException(e);
        }
    }
}
