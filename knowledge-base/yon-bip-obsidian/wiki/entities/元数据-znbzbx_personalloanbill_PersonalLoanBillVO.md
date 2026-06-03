---
tags: [BIP, 元数据, 数据字典, znbzbx.personalloanbill.PersonalLoanBillVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 借款单表头 (`znbzbx.personalloanbill.PersonalLoanBillVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_loanbill` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`6e2bbb26-6930-403d-a435-4ee12f102ff8`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 借款单表头 |
| 物理表 | `znbz_loanbill` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 168 个 |
| 子表 | 5 个 |
| 关联引用 | 49 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `loanbilluserdefs` | `znbzbx.personalloanbill.PersonalLoanBillUserdefVO` | composition |
| `loanBillibpmstep` | `znbzbx.personalloanbill.PersonalLoanBillIBpmStep` | composition |
| `loanBillibpmcurrentauditor` | `znbzbx.personalloanbill.PersonalLoanBillIBpmCurrentAuditor` | composition |
| `loanbillbvos` | `znbzbx.personalloanbill.PersonalLoanBillBVO` | composition |
| `loansettleinfovos` | `znbzbx.personalloanbill.PersonalLoanSettleInfoVO` | composition |

## 关联引用 (49个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `ucf-org-center.org_pure_tree_ref` |
| `expbillauditorid` | `` |
| `vhandledeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `` | `` |
| `be_id` | `` |
| `contractLedgerId` | `` |
| `former_vhandledeptid` | `` |
| `former_cfinaceorgid` | `` |
| `wbs` | `` |
| `pk_project` | `ucfbasedoc.bd_projectcardref` |
| `pk_cusdoc` | `yssupplier.aa_vendor` |
| `chandlecostcenter` | `finbd.bd_costcenterref` |
| `loanBillDcs` | `` |
| `pk_expensebill` | `` |
| `profitcenter` | `` |
| `pk_apct` | `pk_apct` |
| `pk_dutypost` | `ucf-staff-center.bd_position_timeline_ref` |
| `former_vfinacedeptid` | `` |
| `tenant_id` | `` |
| `pk_dutyjob` | `ucf-staff-center.bd_duty` |
| `transfer_id` | `` |
| `pk_busimemo` | `finbd.bd_expenseitemref` |
| `cfinacecostcenter` | `finbd.bd_costcenterref` |
| `caccountorg` | `ucf-org-center.bd_financeorgtreeref` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `former_busimemo` | `` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |
| `submitter` | `` |
| `activity` | `` |
| `pk_busimemotype` | `finbd.bd_expenseitemtyperef` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `former_handlepsnid` | `` |
| `former_chandleorgid` | `` |
| `withdrawpp` | `` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `pk_dutyrank` | `ucf-staff-center.bd_rankref` |
| `pk_customer` | `productcenter.aa_merchantref` |
| `ytenant_id` | `` |
| `vfinacedeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `bustype` | `bd_billtyperef` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `pk_expapportionruleid_settlement_11` | `` |

## 字段列表（按类型分组）

> 共 168 个直连字段

### 文本字段 (38个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `code` | `code` | 单据编码 |
| `bizFlow` | `bizFlow` | `bizFlow` | 业务流id |
| `itplid` | `itplid` | `itplid` | 模板id |
| `vreason` | `vreason` | `vreason` | 借款原因 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |
| `eventvoucherno` | `eventvoucherno` | `eventvoucherno` | 事项分录编码 |
| `glvoucherno` | `glvoucherno` | `glvoucherno` | 总账凭证号 |
| `issettlecurrencydefaultvalue` | `issettlecurrencydefaultvalue` | `issettlecurrencydefaultvalue` | 期望收款币种默认值 |
| `expbillcode` | `expbillcode` | `expbillcode` | 上游转单编号 |
| `vdescription` | `vdescription` | `vdescription` | 说明 |
| `confirmstaffname` | `confirmstaffname` | `confirmstaffname` | 稽核确认人姓名 |
| `confirmstaffid` | `confirmstaffid` | `confirmstaffid` | 稽核确认人 |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `` | `source` | `source` | 上游单据类型 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `` | `upcode` | `upcode` | 上游单据号 |
| `` | `auditor` | `auditor` | 审批人名称 |
| `bar_code` | `bar_code` | `barCode` | 条形码 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `pk_billtype` | `pk_billtype` | `pk_billtype` | 单据类型 |
| `pk_ncvoucher` | `pk_ncvoucher` | `pk_ncvoucher` | nc凭证id |
| `thirdsysbill` | `thirdsysbill` | `thirdsysbill` | 第三方系统单据id |
| `thirdsysflag` | `thirdsysflag` | `thirdsysflag` | 第三方系统标识 |
| `vattachmentass` | `vattachmentass` | `vattachmentass` | 单据附件id |
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
| `voucherstate` | `voucherstate` | `voucherstate` | 凭证状态 |
| `vvoucherno` | `vvoucherno` | `vvoucherno` | 凭证号 |
| `vvouchertype` | `vvouchertype` | `vvouchertype` | 凭证类型 |

### 引用字段 (43个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体 |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 借款人 |
| `chandleorg` | `chandleorg` | `chandleorg` | 借款人组织 |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 借款人部门 |
| `chandlecostcenter` | `chandlecostcenter` | `chandlecostcenter` | 借款人成本中心 |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织 |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门 |
| `cfinacecostcenter` | `cfinacecostcenter` | `cfinacecostcenter` | 费用承担成本中心 |
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目 |
| `pk_project` | `pk_project` | `pk_project` | 项目 |
| `pk_expapportionruleid_settlement_11` | `pk_expapportionruleid_settlement_11` | `pk_expapportionruleid_settlement_11` | 1:1结算规则ID |
| `profitcenter` | `profitcenter` | `profitcenter` | 利润中心 |
| `former_busimemo` | `former_busimemo` | `former_busimemo` | 转交前费用项目 |
| `expbillauditorid` | `expbillauditorid` | `expbillauditorid` | 报销单终审人id |
| `pk_expensebill` | `pk_expensebill` | `pk_expensebill` | 报销单主表id |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `be_id` | `be_id` | `be_id` | 转交前单据id |
| `contractLedgerId` | `contractLedgerId` | `contractLedgerId` | 合同台账id |
| `former_cfinaceorgid` | `former_cfinaceorgid` | `former_cfinaceorgid` | 转交前费用承担组织 |
| `pk_dutypost` | `pk_dutypost` | `pk_dutypost` | 岗位 |
| `former_vfinacedeptid` | `former_vfinacedeptid` | `former_vfinacedeptid` | 转交前费用承担部门 |
| `former_vhandledeptid` | `former_vhandledeptid` | `former_vhandledeptid` | 转交前经办人/借款人部门 |
| `pk_dutyjob` | `pk_dutyjob` | `pk_dutyjob` | 职务 |
| `transfer_id` | `transfer_id` | `transfer_id` | 转交人 |
| `former_handlepsnid` | `former_handlepsnid` | `former_handlepsnid` | 转交前借款人/经办人 |
| `former_chandleorgid` | `former_chandleorgid` | `former_chandleorgid` | 转交前经办人/借款人组织 |
| `pk_dutyrank` | `pk_dutyrank` | `pk_dutyrank` | 职级 |
| `submitter` | `submitter` | `submitter` | 提交人 |
| `withdrawpp` | `withdrawpp` | `withdrawpp` | 撤回提交的人 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `pk_apct` | `pk_apct` | `pk_apct` | 付款合同 |
| `pk_busimemotype` | `pk_busimemotype` | `pk_busimemotype` | 费用项目类别 |
| `pk_cusdoc` | `pk_cusdoc` | `pk_cusdoc` | 供应商 |
| `pk_customer` | `pk_customer` | `pk_customer` | 客户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `vcurrency` | `vcurrency` | `vcurrency` | 借款币种 |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币 |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型 |

### 日期字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `nsettledate` | `nsettledate` | `nsettledate` | 实际结算日期 |
| `check_date` | `check_date` | `check_date` | 收单时间 |
| `transfer_date` | `transfer_date` | `transfer_date` | 转交日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `dcostdate` | `dcostdate` | `dcostdate` | 发生日期 |
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `submit_time` | `submit_time` | `submitTime` | 提交时间 |
| `withdraw_time` | `withdraw_time` | `withdrawTime` | 撤回提交时间 |

### 布尔字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ismulticurrency` | `ismulticurrency` | `ismulticurrency` | 是否多币种 |
| `isgenfromexp` | `isgenfromexp` | `isgenfromexp` | 报销转借款 |
| `transfer_mark` | `transfer_mark` | `transfer_mark` | 是否转出 |
| `receive_mark` | `receive_mark` | `receive_mark` | 是否接收 |
| `bcav` | `bcav` | `bcav` | 是否核销完毕 |
| `bfinalcav` | `bfinalcav` | `bfinalcav` | 清账状态 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `directPrintCount` | `directPrintCount` | `directPrintCount` | 直接打印次数 |
| `previewPrintCount` | `previewPrintCount` | `previewPrintCount` | 预览打印次数 |
| `printCount` | `printCount` | `printCount` | 打印次数 |
| `isSendBackBankElectronic` | `isSendBackBankElectronic` | `isSendBackBankElectronic` | 是否自动回传银行电子回单 |
| `imakebilltype` | `imakebilltype` | `imakebilltype` | 单据生成方式 |
| `ibudgetexectype` | `ibudgetexectype` | `ibudgetexectype` | 预算控制类型 |

### 短整数 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isendvouchertype` | `isendvouchertype` | `isendvouchertype` | 传核算方式 |
| `isendsettletype` | `isendsettletype` | `isendsettletype` | 传财资方式 |
| `check_status` | `check_status` | `check_status` | 收单验符状态 |
| `transfer_rate` | `transfer_rate` | `transfer_rate` | 转交进度 |
| `transfer_state` | `transfer_state` | `transfer_state` | 转交状态 |
| `beginning_flag` | `beginning_flag` | `beginningFlag` | 期初标志 |
| `iauditdealstatus` | `iauditdealstatus` | `iauditdealstatus` | 稽核处理状态 |
| `iauditresult` | `iauditresult` | `iauditresult` | 稽核合规性状态 |
| `ibillmakemethod` | `ibillmakemethod` | `ibillmakemethod` | 填单方式 |
| `ibudgetctrltype` | `ibudgetctrltype` | `ibudgetctrltype` | 预算控制结果 |
| `igenmethod` | `igenmethod` | `igenmethod` | 单据制作途径 |
| `irejectstatus` | `irejectstatus` | `irejectstatus` | 驳回状态 |
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

### 数值字段 (27个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nloanmny` | `nloanmny` | `nloanmny` | 借款额 |
| `nwhtax_amount` | `nwhtax_amount` | `nwhtax_amount` | 代扣税税额 |
| `nnatwhtax_amount` | `nnatwhtax_amount` | `nnatwhtax_amount` | 代扣税税额-本币 |
| `natstoppedamountb` | `natstoppedamountb` | `natstoppedamountb` | 实际结算止付金额-本币 |
| `nfinalsummnyb` | `nfinalsummnyb` | `nfinalsummnyb` | 实际结算金额 |
| `nnatfinalsummnyb` | `nnatfinalsummnyb` | `nnatfinalsummnyb` | 实际付款金额-本币 |
| `stoppedamountb` | `stoppedamountb` | `stoppedamountb` | 累计结算止付金额 |
| `transfer_finalloanmny` | `transfer_finalloanmny` | `transfer_finalloanmny` | 转交金额 |
| `transfer_loanmny` | `transfer_loanmny` | `transfer_loanmny` | 转交金额(含未审核) |
| `transfer_natfinalloanmny` | `transfer_natfinalloanmny` | `transfer_natfinalloanmny` | 转交金额-本币 |
| `transfer_natloanmny` | `transfer_natloanmny` | `transfer_natloanmny` | 转交金额(含未审核)-本币 |
| `ncavmny` | `ncavmny` | `ncavmny` | 核销额(含未审核) |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |
| `nfinalcavmny` | `nfinalcavmny` | `nfinalcavmny` | 核销额 |
| `nfinalreturnmny` | `nfinalreturnmny` | `nfinalreturnmny` | 还款额 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 组织本币基准汇率 |
| `nnatcavmny` | `nnatcavmny` | `nnatcavmny` | 核销额(含未审核)-本币 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 组织本币汇率 |
| `nnatfinalcavmny` | `nnatfinalcavmny` | `nnatfinalcavmny` | 核销额-本币 |
| `nnatfinalreturnmny` | `nnatfinalreturnmny` | `nnatfinalreturnmny` | 还款额-本币 |
| `nnatloanmny` | `nnatloanmny` | `nnatloanmny` | 借款金额-本币 |
| `nnatreturnmny` | `nnatreturnmny` | `nnatreturnmny` | 还款额(含未审核)-本币 |
| `nreturnmny` | `nreturnmny` | `nreturnmny` | 还款额(含未审核) |

### other (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
| `` | `` | `loanBillibpmcurrentauditor` | 个人借款单审批当前审批人 |
| `` | `` | `loanBillibpmstep` | 个人借款单审批业务阶段 |
| `` | `` | `loanbillbvos` | 个人借款单表体 |
| `` | `` | `loanbilluserdefs` | 个人借款单主表（自定义项）表 |
| `` | `` | `loansettleinfovos` | 个人借款单结算信息 |

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
| `loanBillDcs` | `loanBillDcs` | `loanBillDcs` | 个人借款单自定义项 |
