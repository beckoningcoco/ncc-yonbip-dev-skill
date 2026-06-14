---
tags: [BIP, 元数据, 数据字典, znbzbx.travelexpensebill.TravelExpenseBillVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 差旅费报销单主表 (`znbzbx.travelexpensebill.TravelExpenseBillVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_expensebill` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`190d3398-5186-4788-bbf9-fad9bee743c3`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 差旅费报销单主表 |
| 物理表 | `znbz_expensebill` |
| domain/服务域 | `znbzbx` |
| schema | `znbz` |
| 所属应用 | `RBSM` |
| 直连字段 | 222 个 |
| 子表 | 11 个 |
| 关联引用 | 52 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `expsubsidydetails` | `znbzbx.travelexpensebill.TravelExpSubsidyDetailVO` | composition |
| `expapportions` | `znbzbx.travelexpensebill.TravelExpApportionVO` | composition |
| `expsettleinfos` | `znbzbx.travelexpensebill.TravelExpSettleInfoVO` | composition |
| `expenseBillibpmcurrentauditor` | `znbzbx.travelexpensebill.TravelExpenseBillIBpmCurrentAuditor` | composition |
| `expensebillbs` | `znbzbx.travelexpensebill.TravelExpenseBillBVO` | composition |
| `expensebilluserdefs` | `znbzbx.travelexpensebill.TravelExpenseBillUserdefVO` | composition |
| `expensebillmileages` | `znbzbx.travelexpensebill.TravelExpenseBillMileageVO` | composition |
| `withholdingcavs` | `znbzbx.travelexpensebill.TravelWithholdingCavVO` | composition |
| `expinvoicedetails` | `znbzbx.travelexpensebill.TravelExpInvoiceDetailVO` | composition |
| `expenseBillibpmstep` | `znbzbx.travelexpensebill.TravelExpenseBillIBpmStep` | composition |
| `loancavs` | `znbzbx.travelexpensebill.TravelLoanCavVO` | composition |

## 关联引用 (52个)

| 字段名 | 引用类型 |
|--------|---------|
| `expensebillDcs` | `` |
| `chandleorg` | `ucf-org-center.org_pure_tree_ref` |
| `vhandledeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `contractLedgerId` | `` |
| `` | `` |
| `wbs` | `` |
| `pk_endaddr` | `ucfbasedoc.bd_baseregiontreeref` |
| `pk_project` | `ucfbasedoc.bd_projectcardref` |
| `pk_cusdoc` | `yssupplier.aa_vendor` |
| `chandlecostcenter` | `finbd.bd_costcenterref` |
| `pk_begaddr` | `ucfbasedoc.bd_baseregiontreeref` |
| `profitcenter` | `` |
| `pk_beginperiod` | `` |
| `voriginbillid` | `` |
| `pk_apct` | `apct.apct_apctref` |
| `pk_dutypost` | `ucf-staff-center.bd_position_timeline_ref` |
| `tenant_id` | `` |
| `pk_dutyjob` | `ucf-staff-center.bd_duty` |
| `pk_busimemo` | `finbd.bd_expenseitemref` |
| `cfinacecostcenter` | `finbd.bd_costcenterref` |
| `caccountorg` | `ucf-org-center.bd_financeorgtreeref` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `pk_endperiod` | `` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |
| `submitter` | `` |
| `activity` | `` |
| `pk_busimemotype` | `finbd.bd_expenseitemtyperef` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `withdrawpp` | `` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `pk_dutyrank` | `ucf-staff-center.bd_rankref` |
| `pk_customer` | `productcenter.aa_merchantref` |
| `ytenant_id` | `` |
| `vfinacedeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `pk_expapportionruleid_11` | `` |
| `corexchratetype` | `` |
| `bustype` | `bd_billtyperef` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `pk_expapportionruleid_settlement_11` | `` |

## 字段列表（按类型分组）

> 共 222 个直连字段

### 文本字段 (47个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `code` | `code` | 编码 |
| `itplid` | `itplid` | `itplid` | 模板id |
| `voriginbillcode` | `voriginbillcode` | `voriginbillcode` | 原单据表头编码 |
| `bizFlow` | `bizFlow` | `bizFlow` | 业务流id |
| `expapportionrulecode` | `expapportionrulecode` | `expapportionrulecode` | 分摊规则code |
| `eventvoucherno` | `eventvoucherno` | `eventvoucherno` | 事项分录编码 |
| `confirmstaffid` | `confirmstaffid` | `confirmstaffid` | 稽核确认人 |
| `glvoucherno` | `glvoucherno` | `glvoucherno` | 总账凭证号 |
| `issettlecurrencydefaultvalue` | `issettlecurrencydefaultvalue` | `issettlecurrencydefaultvalue` | 期望收款币种默认值 |
| `expapportionruleid` | `expapportionruleid` | `expapportionruleid` | 分摊规则id |
| `confirmstaffname` | `confirmstaffname` | `confirmstaffname` | 稽核确认人姓名 |
| `isendsettleproxypaytype` | `isendsettleproxypaytype` | `isendsettleproxypaytype` | 传财资代发方式 |
| `billcode` | `billcode` | `billcode` | 账单编号 |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `` | `source` | `source` | 上游单据类型 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `vinvoicesituation` | `vinvoicesituation` | `vinvoicesituation` | 账单情况 |
| `` | `upcode` | `upcode` | 上游单据号 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `bar_code` | `bar_code` | `barCode` | 条形码 |
| `` | `creator` | `creator` | 创建人名称 |
| `dbegintime` | `dbegintime` | `dbegintime` | 开始时间 |
| `dendtime` | `dendtime` | `dendtime` | 结束时间 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `pk_billtype` | `pk_billtype` | `pk_billtype` | 单据类型 |
| `pk_ncvoucher` | `pk_ncvoucher` | `pk_ncvoucher` | nc凭证id |
| `thirdsysbill` | `thirdsysbill` | `thirdsysbill` | 第三方系统单据id |
| `thirdsysflag` | `thirdsysflag` | `thirdsysflag` | 第三方系统标识 |
| `vattachmentass` | `vattachmentass` | `vattachmentass` | 单据附件id |
| `vbeginperiod` | `vbeginperiod` | `vbeginperiod` | 开始摊销会计期间 |
| `vdef1` | `vdef1` | `vdef1` | 自定义项1 |
| `vdef10` | `vdef10` | `vdef10` | 自定义项10 |
| `vdef2` | `vdef2` | `vdef2` | 自定义项2 |
| `vdef3` | `vdef3` | `vdef3` | 自定义项3 |
| `vdef4` | `vdef4` | `vdef4` | 自定义项4 |
| `vdef5` | `vdef5` | `vdef5` | 自定义项5 |
| `vdef6` | `vdef6` | `vdef6` | 自定义项6 |
| `vdef7` | `vdef7` | `vdef7` | 自定义项7 |
| `vdef8` | `vdef8` | `vdef8` | 自定义项8 |
| `vdef9` | `vdef9` | `vdef9` | 自定义项9 |
| `vdescription` | `vdescription` | `vdescription` | 说明 |
| `vendperiod` | `vendperiod` | `vendperiod` | 摊销结束会计期间 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |
| `voucherstate` | `voucherstate` | `voucherstate` | 凭证状态 |
| `vreason` | `vreason` | `vreason` | 报销说明 |
| `vvoucherno` | `vvoucherno` | `vvoucherno` | 凭证号 |
| `vvouchertype` | `vvouchertype` | `vvouchertype` | 凭证类型 |

### 引用字段 (40个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体 |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 报销人 |
| `chandleorg` | `chandleorg` | `chandleorg` | 报销人组织 |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 报销人部门 |
| `chandlecostcenter` | `chandlecostcenter` | `chandlecostcenter` | 报销人成本中心 |
| `cfinacecostcenter` | `cfinacecostcenter` | `cfinacecostcenter` | 费用承担成本中心 |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织 |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门 |
| `pk_expapportionruleid_11` | `pk_expapportionruleid_11` | `pk_expapportionruleid_11` | 1:1分摊规则ID |
| `pk_expapportionruleid_settlement_11` | `pk_expapportionruleid_settlement_11` | `pk_expapportionruleid_settlement_11` | 1:1结算规则ID |
| `profitcenter` | `profitcenter` | `profitcenter` | 利润中心 |
| `submitter` | `submitter` | `submitter` | 提交人 |
| `voriginbillid` | `voriginbillid` | `voriginbillid` | 原单据表头 |
| `withdrawpp` | `withdrawpp` | `withdrawpp` | 撤回提交的人 |
| `corexchratetype` | `corexchratetype` | `corexchratetype` | 企业汇率类型 |
| `activity` | `activity` | `activity` | 活动 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `wbs` | `wbs` | `wbs` | WBS |
| `contractLedgerId` | `contractLedgerId` | `contractLedgerId` | 合同台账id |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `pk_apct` | `pk_apct` | `pk_apct` | 付款合同 |
| `pk_begaddr` | `pk_begaddr` | `pk_begaddr` | 出发地点 |
| `pk_beginperiod` | `pk_beginperiod` | `pk_beginperiod` | 开始摊销会计期间pk |
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目 |
| `pk_busimemotype` | `pk_busimemotype` | `pk_busimemotype` | 费用项目类别 |
| `pk_cusdoc` | `pk_cusdoc` | `pk_cusdoc` | 供应商 |
| `pk_customer` | `pk_customer` | `pk_customer` | 客户 |
| `pk_dutyjob` | `pk_dutyjob` | `pk_dutyjob` | 职务 |
| `pk_dutypost` | `pk_dutypost` | `pk_dutypost` | 岗位 |
| `pk_dutyrank` | `pk_dutyrank` | `pk_dutyrank` | 职级 |
| `pk_endaddr` | `pk_endaddr` | `pk_endaddr` | 到达地点 |
| `pk_endperiod` | `pk_endperiod` | `pk_endperiod` | 摊销结束会计期间pk |
| `pk_project` | `pk_project` | `pk_project` | 项目 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `vcurrency` | `vcurrency` | `vcurrency` | 报销币种 |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币 |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型 |

### 日期字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `check_date` | `check_date` | `check_date` | 收单时间 |
| `nsettledate` | `nsettledate` | `nsettledate` | 实际结算日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `dbegindate` | `dbegindate` | `dbegindate` | 开始日期 |
| `dcostdate` | `dcostdate` | `dcostdate` | 发生日期 |
| `denddate` | `denddate` | `denddate` | 结束日期 |
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `submit_time` | `submit_time` | `submitTime` | 提交时间 |
| `withdraw_time` | `withdraw_time` | `withdrawTime` | 撤回提交时间 |

### 布尔字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ismulticurrency` | `ismulticurrency` | `ismulticurrency` | 是否多币种 |
| `isinstallment` | `isinstallment` | `isinstallment` | 是否挂账 |
| `bredback` | `bredback` | `bredback` | 是否红冲 |
| `istransferloan` | `istransferloan` | `istransferloan` | 转借款 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |
| `isdeferexpense` | `isdeferexpense` | `isdeferexpense` | 是否待摊 |
| `isfinished` | `isfinished` | `isfinished` | 付款已结束 |
| `ishaveloanbill` | `ishaveloanbill` | `ishaveloanbill` | 是否有借款 |
| `isoverstd` | `isoverstd` | `isoverstd` | 是否超标 |
| `iswithholdingcav` | `iswithholdingcav` | `iswithholdingcav` | 是否手工预提冲销 |

### 整数 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imakebilltype` | `imakebilltype` | `imakebilltype` | 单据生成方式 |
| `iinvreleaserange` | `iinvreleaserange` | `iinvreleaserange` | 账单释放范围 |
| `directPrintCount` | `directPrintCount` | `directPrintCount` | 直接打印次数 |
| `previewPrintCount` | `previewPrintCount` | `previewPrintCount` | 预览打印次数 |
| `withholdingstatus` | `withholdingstatus` | `withholdingstatus` | 在途预提情况 |
| `isSendBackBankElectronic` | `isSendBackBankElectronic` | `isSendBackBankElectronic` | 是否自动回传银行电子回单 |
| `withholdingrule` | `withholdingrule` | `withholdingrule` | 在途预提红冲规则 |
| `printCount` | `printCount` | `printCount` | 打印次数 |
| `ibudgetexectype` | `ibudgetexectype` | `ibudgetexectype` | 预算控制类型 |
| `islink` | `islink` | `islink` | 是否联动报销明细 |

### 短整数 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isendefatype` | `isendefatype` | `isendefatype` | 传固定资产方式 |
| `isendtaxtype` | `isendtaxtype` | `isendtaxtype` | 传税务方式 |
| `isendsettletype` | `isendsettletype` | `isendsettletype` | 传财资方式 |
| `isendvouchertype` | `isendvouchertype` | `isendvouchertype` | 传核算方式 |
| `ibillmakemethod` | `ibillmakemethod` | `ibillmakemethod` | 填单方式 |
| `irejectstatus` | `irejectstatus` | `irejectstatus` | 驳回状态 |
| `check_status` | `check_status` | `check_status` | 收单验符状态 |
| `iredbluestatus` | `iredbluestatus` | `iredbluestatus` | 红蓝单状态 |
| `isendefastatus` | `isendefastatus` | `isendefastatus` | 转固状态 |
| `transferloanstatus` | `transferloanstatus` | `transferloanstatus` | 转借款情况 |
| `iauditdealstatus` | `iauditdealstatus` | `iauditdealstatus` | 稽核处理状态 |
| `iauditresult` | `iauditresult` | `iauditresult` | 稽核合规性状态 |
| `ibudgetctrltype` | `ibudgetctrltype` | `ibudgetctrltype` | 预算控制结果 |
| `igenmethod` | `igenmethod` | `igenmethod` | 单据制作途径 |
| `isettleresult` | `isettleresult` | `isettleresult` | 财资结算结果 |
| `isettlestatus` | `isettlestatus` | `isettlestatus` | 结算状态 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `voucherGenerationTime` | `voucherGenerationTime` | `voucherGenerationTime` | 凭证生成时点 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `sourceid` | `sourceid` | 上游单据主表id |
| `` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `id` | `id` | `id` | ID |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (59个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ncavwithholdingredmny` | `ncavwithholdingredmny` | `ncavwithholdingredmny` | 预提红冲总额 |
| `nnatcavwithholdingredmny` | `nnatcavwithholdingredmny` | `nnatcavwithholdingredmny` | 预提红冲总额-本币 |
| `neleinvoicemny` | `neleinvoicemny` | `neleinvoicemny` | 电子账单金额 |
| `nnatcompanypaytaxmny` | `nnatcompanypaytaxmny` | `nnatcompanypaytaxmny` | 企业支付可抵扣税额-本币 |
| `nwhtax_amount` | `nwhtax_amount` | `nwhtax_amount` | 代扣税税额 |
| `nnatwhtax_amount` | `nnatwhtax_amount` | `nnatwhtax_amount` | 本币代扣税税额 |
| `ndeferreduntaxmny` | `ndeferreduntaxmny` | `ndeferreduntaxmny` | 待摊不含税总额 |
| `nnatdeferreduntaxmny` | `nnatdeferreduntaxmny` | `nnatdeferreduntaxmny` | 待摊不含税总额-本币 |
| `nnattransferloanmny` | `nnattransferloanmny` | `nnattransferloanmny` | 转借款金额-本币 |
| `nnatcpuntaxmny` | `nnatcpuntaxmny` | `nnatcpuntaxmny` | 本期发生不含税总额-本币 |
| `ncpmny` | `ncpmny` | `ncpmny` | 本期发生总额 |
| `ndeferredmny` | `ndeferredmny` | `ndeferredmny` | 待摊总额 |
| `nnatdeferredmny` | `nnatdeferredmny` | `nnatdeferredmny` | 待摊总额-本币 |
| `ncpuntaxmny` | `ncpuntaxmny` | `ncpuntaxmny` | 本期发生不含税总额 |
| `ntranswithholdingmny` | `ntranswithholdingmny` | `ntranswithholdingmny` | 在途预提总额 |
| `nnattranswithholdingmny` | `nnattranswithholdingmny` | `nnattranswithholdingmny` | 在途预提总额-本币 |
| `nnatcpmny` | `nnatcpmny` | `nnatcpmny` | 本期发生总额-本币 |
| `ntransferloanmny` | `ntransferloanmny` | `ntransferloanmny` | 转借款金额 |
| `nnattotaluntaxmny` | `nnattotaluntaxmny` | `nnattotaluntaxmny` | 报销总额(含企业支付)不含税金额-本币 |
| `nnatcompanypayuntaxmny` | `nnatcompanypayuntaxmny` | `nnatcompanypayuntaxmny` | 企业支付不含税金额-本币 |
| `ntotaltaxmny` | `ntotaltaxmny` | `ntotaltaxmny` | 报销总额(含企业支付)可抵扣税额 |
| `ncompanypayuntaxmny` | `ncompanypayuntaxmny` | `ncompanypayuntaxmny` | 企业支付不含税金额 |
| `ntotaluntaxmny` | `ntotaluntaxmny` | `ntotaluntaxmny` | 报销总额(含企业支付)不含税金额 |
| `ncompanypaytaxmny` | `ncompanypaytaxmny` | `ncompanypaytaxmny` | 企业支付可抵扣税额 |
| `nnattotaltaxmny` | `nnattotaltaxmny` | `nnattotaltaxmny` | 报销总额(含企业支付)可抵扣税额-本币 |
| `installment_amount` | `installment_amount` | `installment_amount` | 挂账总额 |
| `nnattotalwelfaremny` | `nnattotalwelfaremny` | `nnattotalwelfaremny` | 补助合计-本币 |
| `ntotalwelfaremny` | `ntotalwelfaremny` | `ntotalwelfaremny` | 补助合计 |
| `nnateleinvoicemny` | `nnateleinvoicemny` | `nnateleinvoicemny` | 电子账单金额-本币 |
| `installment_balance` | `installment_balance` | `installment_balance` | 挂账余额 |
| `naccpaymny` | `naccpaymny` | `naccpaymny` | 累计付款额 |
| `nbusitravalday` | `nbusitravalday` | `nbusitravalday` | 出差天数 |
| `ncavmny` | `ncavmny` | `ncavmny` | 核销总额 |
| `ncavwithholdingmny` | `ncavwithholdingmny` | `ncavwithholdingmny` | 预提核销总额 |
| `ncompanypaymny` | `ncompanypaymny` | `ncompanypaymny` | 企业支付价税合计 |
| `ndeferexpensenum` | `ndeferexpensenum` | `ndeferexpensenum` | 总摊销期 |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |
| `nexpensemny` | `nexpensemny` | `nexpensemny` | 不含税金额 |
| `nnataccpaymny` | `nnataccpaymny` | `nnataccpaymny` | 累计付款额-本币 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 组织本币企业汇率 |
| `nnatcavmny` | `nnatcavmny` | `nnatcavmny` | 核销总额-本币 |
| `nnatcavwithholdingmny` | `nnatcavwithholdingmny` | `nnatcavwithholdingmny` | 预提核销总额-本币 |
| `nnatcompanypaymny` | `nnatcompanypaymny` | `nnatcompanypaymny` | 企业支付价税合计-本币 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 组织本币汇率 |
| `nnatexpensemny` | `nnatexpensemny` | `nnatexpensemny` | 不含税总额-本币 |
| `nnatpaymentmny` | `nnatpaymentmny` | `nnatpaymentmny` | 付款总额-本币 |
| `nnatshouldpaymny` | `nnatshouldpaymny` | `nnatshouldpaymny` | 应付总额-本币 |
| `nnatsummny` | `nnatsummny` | `nnatsummny` | 报销价税总额-本币 |
| `nnattaxmny` | `nnattaxmny` | `nnattaxmny` | 可抵扣税额-本币 |
| `nnattotalmny` | `nnattotalmny` | `nnattotalmny` | 报销总额(含企业支付)-本币 |
| `npaymentmny` | `npaymentmny` | `npaymentmny` | 付款总额 |
| `nshouldpaymny` | `nshouldpaymny` | `nshouldpaymny` | 应付总额 |
| `nsummny` | `nsummny` | `nsummny` | 报销价税总额 |
| `ntaxmny` | `ntaxmny` | `ntaxmny` | 可抵扣税额 |
| `ntotalmny` | `ntotalmny` | `ntotalmny` | 报销总额(含企业支付) |

### other (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
| `` | `` | `expapportions` | 差旅费报销单费用分摊 |
| `` | `` | `expenseBillibpmcurrentauditor` | 差旅费报销单审批当前审批人 |
| `` | `` | `expenseBillibpmstep` | 差旅费报销单审批业务阶段 |
| `` | `` | `expensebillbs` | 差旅费报销单子表 |
| `` | `` | `expensebillmileages` | 差旅费报销单记事 |
| `` | `` | `expensebilluserdefs` | 差旅费报销单主表（自定义项）表 |
| `` | `` | `expinvoicedetails` | 差旅费报销单发票明细 |
| `` | `` | `expsettleinfos` | 差旅费报销单结算信息 |
| `` | `` | `expsubsidydetails` | 差旅费报销单补贴明细 |
| `` | `` | `loancavs` | 差旅费报销单借款核销 |
| `` | `` | `withholdingcavs` | 差旅费报销单预提冲销 |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nsettletime` | `nsettletime` | `nsettletime` | 实际结算时间 |
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `expensebillDcs` | `expensebillDcs` | `expensebillDcs` | 差旅费报销单自定义项 |
