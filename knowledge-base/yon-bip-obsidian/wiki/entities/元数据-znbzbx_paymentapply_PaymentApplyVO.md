---
tags: [BIP, 元数据, 数据字典, znbzbx.paymentapply.PaymentApplyVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 付款申请单主表 (`znbzbx.paymentapply.PaymentApplyVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_paymentapply` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`3eeefe8c-6536-4562-9e02-69feca99eb56`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 付款申请单主表 |
| 物理表 | `znbz_paymentapply` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 132 个 |
| 子表 | 5 个 |
| 关联引用 | 37 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `paymentapplyibpmstep` | `znbzbx.paymentapply.PaymentApplyIBpmStep` | composition |
| `paymentapplysettleinfos` | `znbzbx.paymentapply.PaymentApplySettleVO` | composition |
| `taxEngineCalResults` | `znbzbx.paymentapply.TaxEngineCalResultVO` | composition |
| `defpaymentapplyinfos` | `znbzbx.paymentapply.DeferPaymentapplyVO` | composition |
| `paymentapplyibpmcurrentauditor` | `znbzbx.paymentapply.PaymentApplyIBpmCurrentAuditor` | composition |

## 关联引用 (37个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `ucf-org-center.org_pure_tree_ref` |
| `vhandledeptid` | `ucf-org-center.bd_admindepttreeviewref` |
| `` | `` |
| `submitter` | `` |
| `activity` | `` |
| `wbs` | `` |
| `pk_busimemotype` | `finbd.bd_expenseitemtyperef` |
| `pk_project` | `bd_projectref` |
| `pk_cusdoc` | `yssupplier.aa_vendor` |
| `chandlecostcenter` | `finbd.bd_costcenterref` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `profitcenter` | `finbd.bd_allaccbodyref_inner` |
| `withdrawpp` | `` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `pk_apct` | `apct.apct_apctref` |
| `pk_dutypost` | `ucf-staff-center.bd_position_timeline_ref` |
| `tenant_id` | `` |
| `pk_dutyjob` | `ucf-staff-center.bd_duty` |
| `pk_dutyrank` | `ucf-staff-center.bd_rankref` |
| `pk_customer` | `productcenter.aa_merchantref` |
| `ytenant_id` | `` |
| `vfinacedeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `bustype` | `bd_billtyperef` |
| `pk_busimemo` | `finbd.bd_expenseitemref` |
| `cfinacecostcenter` | `finbd.bd_costcenterref` |
| `caccountorg` | `ucf-org-center.bd_financeorgtreeref` |
| `paymentapplyDcs` | `` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |

## 继承接口 (12个, 39字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **条形码** (`ucfbase.ucfbaseItf.IBarCode`)
  - `bar_code` → `bar_code`
- **审批提交信息** (`ucfbase.ucfbaseItf.ISubmitInfo`)
  - `submitter` → `submitter`
  - `submit_time` → `submit_time`
  - `withdrawpp` → `withdrawpp`
  - `withdraw_time` → `withdraw_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **通用标准** (`znbzbx.itf.IGenericStandard`)
  - `ngenericstdmny1` → `ngenericstdmny1`
  - `ngenericstdmny2` → `ngenericstdmny2`
  - `ngenericstdmny3` → `ngenericstdmny3`
  - `ngenericstdmny4` → `ngenericstdmny4`
  - `ngenericstdmny5` → `ngenericstdmny5`
- **打印次数** (`base.itf.IPrintCount`)
  - `printCount` → `printCount`
- **打印次数拆分** (`base.itf.IPrintCountSplit`)
  - `directPrintCount` → `directPrintCount`
  - `previewPrintCount` → `previewPrintCount`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **生单回写** (`base.itf.IBackWrite`)
  - `groupTaskKey` → `groupTaskKey`
  - `makerule_code` → `makerule_code`
  - `` → ``
  - `` → ``
  - `` → ``
  - `sourceMainPubts` → `sourceMainPubts`
  - `` → ``

## 字段列表（按类型分组）

> 共 132 个直连字段

### 文本字段 (32个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `eventvoucherno` | `eventvoucherno` | `eventvoucherno` | 事项分录编码 |
| `itplid` | `itplid` | `itplid` | 模板id |
| `` | `source` | `source` | 上游单据类型 |
| `` | `upcode` | `upcode` | 上游单据号 |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `glvoucherno` | `glvoucherno` | `glvoucherno` | 总账凭证号 |
| `confirmstaffname` | `confirmstaffname` | `confirmstaffname` | 稽核确认人姓名 |
| `confirmstaffid` | `confirmstaffid` | `confirmstaffid` | 稽核确认人 |
| `` | `code` | `code` | 单据编号 |
| `bar_code` | `bar_code` | `barCode` | 条形码 |
| `pk_billtype` | `pk_billtype` | `pk_billtype` | 单据类型 |
| `vreason` | `vreason` | `vreason` | 申请说明 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |
| `vattachmentass` | `vattachmentass` | `vattachmentass` | 单据附件id |
| `vvoucherno` | `vvoucherno` | `vvoucherno` | 凭证号 |
| `vvouchertype` | `vvouchertype` | `vvouchertype` | 凭证类型 |
| `voucherstate` | `voucherstate` | `voucherstate` | 凭证状态 |
| `pk_ncvoucher` | `pk_ncvoucher` | `pk_ncvoucher` | nc凭证id |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |
| `vdef1` | `vdef1` | `vdef1` | 自定义项1 |
| `vdef2` | `vdef2` | `vdef2` | 自定义项2 |
| `vdef3` | `vdef3` | `vdef3` | 自定义项3 |
| `vdef4` | `vdef4` | `vdef4` | 自定义项4 |
| `vdef5` | `vdef5` | `vdef5` | 自定义项5 |
| `vdef6` | `vdef6` | `vdef6` | 自定义项6 |
| `vdef7` | `vdef7` | `vdef7` | 自定义项7 |
| `vdef8` | `vdef8` | `vdef8` | 自定义项8 |
| `vdef9` | `vdef9` | `vdef9` | 自定义项9 |
| `vdef10` | `vdef10` | `vdef10` | 自定义项10 |

### 引用字段 (31个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `submitter` | `submitter` | `submitter` | 提交人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `withdrawpp` | `withdrawpp` | `withdrawpp` | 撤回提交的人 |
| `bustype` | `bustype` | `bustype` | 交易类型id |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 申请人id |
| `pk_dutyjob` | `pk_dutyjob` | `pk_dutyjob` | 职务id |
| `pk_dutypost` | `pk_dutypost` | `pk_dutypost` | 岗位 |
| `pk_dutyrank` | `pk_dutyrank` | `pk_dutyrank` | 职级id |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 申请人部门id |
| `chandleorg` | `chandleorg` | `chandleorg` | 申请人组织id |
| `chandlecostcenter` | `chandlecostcenter` | `chandlecostcenter` | 申请人成本中心id |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门id |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织id |
| `cfinacecostcenter` | `cfinacecostcenter` | `cfinacecostcenter` | 费用承担成本中心id |
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体id |
| `profitcenter` | `profitcenter` | `profitcenter` | 利润中心id |
| `pk_apct` | `pk_apct` | `pk_apct` | 合同台账 |
| `pk_cusdoc` | `pk_cusdoc` | `pk_cusdoc` | 供应商id |
| `pk_customer` | `pk_customer` | `pk_customer` | 客户id |
| `pk_project` | `pk_project` | `pk_project` | 项目id |
| `pk_busimemo` | `pk_busimemo` | `pk_busimemo` | 费用项目id |
| `pk_busimemotype` | `pk_busimemotype` | `pk_busimemotype` | 费用项目类别id |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币id |
| `vcurrency` | `vcurrency` | `vcurrency` | 申请币种id |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 组织本币汇率类型id |
| `` | `creatorId` | `creatorId` | 创建人ID |
| `` | `modifierId` | `modifierId` | 修改人ID |
| `` | `auditorId` | `auditorId` | 审批人ID |

### 日期字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nsettledate` | `nsettledate` | `nsettledate` | 实际结算日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 组织本币汇率日期 |
| `check_date` | `check_date` | `check_date` | 收单时间 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `submit_time` | `submit_time` | `submitTime` | 提交时间 |
| `withdraw_time` | `withdraw_time` | `withdrawTime` | 撤回提交时间 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isdeferpaymentapply` | `isdeferpaymentapply` | `isdeferpaymentapply` | 是否分摊 |
| `ismulticurrency` | `ismulticurrency` | `ismulticurrency` | 是否多币种 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `directPrintCount` | `directPrintCount` | `directPrintCount` | 直接打印次数 |
| `imakebilltype` | `imakebilltype` | `imakebilltype` | 单据生成方式 |
| `isSendBackBankElectronic` | `isSendBackBankElectronic` | `isSendBackBankElectronic` | 是否自动回传银行电子回单 |
| `previewPrintCount` | `previewPrintCount` | `previewPrintCount` | 预览打印次数 |
| `printCount` | `printCount` | `printCount` | 打印次数 |
| `ibudgetexectype` | `ibudgetexectype` | `ibudgetexectype` | 预算控制类型 |

### 短整数 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `igenmethod` | `igenmethod` | `igenmethod` | 单据制作途径 |
| `` | `status` | `status` | 单据状态 |
| `iauditresult` | `iauditresult` | `iauditresult` | 稽核合规性状态 |
| `iauditdealstatus` | `iauditdealstatus` | `iauditdealstatus` | 稽核处理状态 |
| `isendvouchertype` | `isendvouchertype` | `isendvouchertype` | 传核算方式 |
| `voucherGenerationTime` | `voucherGenerationTime` | `voucherGenerationTime` | 凭证生成时点 |
| `isendsettletype` | `isendsettletype` | `isendsettletype` | 传财资方式 |
| `isettlestatus` | `isettlestatus` | `isettlestatus` | 结算状态 |
| `isettleresult` | `isettleresult` | `isettleresult` | 财资结算结果 |
| `ibudgetctrltype` | `ibudgetctrltype` | `ibudgetctrltype` | 预算控制结果 |
| `check_status` | `check_status` | `check_status` | 收单验符状态 |
| `irejectstatus` | `irejectstatus` | `irejectstatus` | 驳回状态 |
| `ibillmakemethod` | `ibillmakemethod` | `ibillmakemethod` | 填单方式 |
| `` | `verifystate` | `verifystate` | 审批状态  |
| `` | `returncount` | `returncount` | 退回次数 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `sourceid` | `sourceid` | 上游单据主表id |
| `` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | ID |

### 数值字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ngenericstdmny1` | `ngenericstdmny1` | `ngenericstdmny1` | 通用标准1 |
| `ngenericstdmny2` | `ngenericstdmny2` | `ngenericstdmny2` | 通用标准2 |
| `ngenericstdmny3` | `ngenericstdmny3` | `ngenericstdmny3` | 通用标准3 |
| `ngenericstdmny4` | `ngenericstdmny4` | `ngenericstdmny4` | 通用标准4 |
| `ngenericstdmny5` | `ngenericstdmny5` | `ngenericstdmny5` | 通用标准5 |
| `nwhtax_amount` | `nwhtax_amount` | `nwhtax_amount` | 代扣税税额 |
| `nnatwhtax_amount` | `nnatwhtax_amount` | `nnatwhtax_amount` | 代扣税税额-本币 |
| `napplymny` | `napplymny` | `napplymny` | 申请金额 |
| `nnatapplymny` | `nnatapplymny` | `nnatapplymny` | 申请金额-本币 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 组织本币企业汇率 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 组织本币汇率 |
| `nexpensemny` | `nexpensemny` | `nexpensemny` | 申请总额 |
| `nnatexpensemny` | `nnatexpensemny` | `nnatexpensemny` | 申请总额-本币 |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `paymentapplyDcs` | `paymentapplyDcs` | `paymentapplyDcs` | 挂账付款申请自定义项 |

### other (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
| `` | `` | `defpaymentapplyinfos` | 挂账付款申请单费用分摊 |
| `` | `` | `paymentapplyibpmcurrentauditor` | 付款申请单审批当前审批人 |
| `` | `` | `paymentapplyibpmstep` | 付款申请单审批业务阶段 |
| `` | `` | `paymentapplysettleinfos` | 挂账付款申请单结算信息 |
| `` | `` | `taxEngineCalResults` | 计税税单 |

### timestamp (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |
| `nsettletime` | `nsettletime` | `nsettletime` | 实际结算时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
