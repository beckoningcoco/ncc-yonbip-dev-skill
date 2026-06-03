---
tags: [BIP, 元数据, 数据字典, znbzbx.deferexpense.DeferExpenseVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 待摊费用单 (`znbzbx.deferexpense.DeferExpenseVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_deferexpense` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`6d255912-ebae-4e73-b2e8-89adf2e359bb`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 待摊费用单 |
| 物理表 | `znbz_deferexpense` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 134 个 |
| 子表 | 2 个 |
| 关联引用 | 34 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `deferexpenseipbmcurrentauditor` | `znbzbx.deferexpense.DeferexpenseIBpmCurrentAuditor` | composition |
| `DeferExpenseBVO` | `znbzbx.deferexpense.DeferExpenseBVO` | composition |

## 关联引用 (34个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `ucf-org-center.org_pure_tree_ref` |
| `vhandledeptid` | `ucf-org-center.admin_dept_tree_ref` |
| `submitter` | `` |
| `activity` | `` |
| `vlastbillbustype` | `bd_billtyperef` |
| `` | `` |
| `wbs` | `` |
| `pk_beginperiodbak` | `` |
| `pk_cusdoc` | `` |
| `chandlecostcenter` | `finbd.bd_costcenterref` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `profitcenter` | `finbd.bd_allaccbodyref_inner` |
| `withdrawpp` | `` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `pk_beginperiod` | `` |
| `pk_endperiodbak` | `` |
| `tenant_id` | `` |
| `pk_period` | `` |
| `pk_customer` | `` |
| `ytenant_id` | `` |
| `deferExpenseDcs` | `` |
| `vfinacedeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `bustype` | `bd_billtyperef` |
| `cfinacecostcenter` | `finbd.bd_costcenterref` |
| `pk_periodbak` | `` |
| `caccountorg` | `ucf-org-center.bd_financeorgtreeref` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
| `pk_endperiod` | `` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |

## 继承接口 (10个, 27字段)

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
- **打印次数** (`base.itf.IPrintCount`)
  - `printCount` → `printCount`
- **打印次数拆分** (`base.itf.IPrintCountSplit`)
  - `directPrintCount` → `directPrintCount`
  - `previewPrintCount` → `previewPrintCount`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`

## 字段列表（按类型分组）

> 共 134 个直连字段

### 文本字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `code` | `code` | 单据编号 |
| `vperiodbak` | `vperiodbak` | `vperiodbak` | 摊销期间期初备份 |
| `vbeginperiodbak` | `vbeginperiodbak` | `vbeginperiodbak` | 开始摊销会计期间期初备份 |
| `vendperiodbak` | `vendperiodbak` | `vendperiodbak` | 摊销结束会计期间期初备份 |
| `vattachmentass` | `vattachmentass` | `vattachmentass` | 单据附件id |
| `vlastbillcode` | `vlastbillcode` | `vlastbillcode` | 上游单据编号 |
| `pk_billtype` | `pk_billtype` | `pk_billtype` | 单据类型 |
| `vreason` | `vreason` | `vreason` | 报销说明 |
| `vperiod` | `vperiod` | `vperiod` | 当前摊销期间 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |
| `vlastbilltype` | `vlastbilltype` | `vlastbilltype` | 上游单据类型 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |
| `vbeginperiod` | `vbeginperiod` | `vbeginperiod` | 开始摊销期间 |
| `vendperiod` | `vendperiod` | `vendperiod` | 结束摊销会计期间 |
| `bar_code` | `bar_code` | `barCode` | 条形码 |

### 引用字段 (31个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体 |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 经办人 |
| `chandleorg` | `chandleorg` | `chandleorg` | 经办人组织 |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 经办人部门 |
| `chandlecostcenter` | `chandlecostcenter` | `chandlecostcenter` | 经办人成本中心 |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织 |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门 |
| `cfinacecostcenter` | `cfinacecostcenter` | `cfinacecostcenter` | 费用承担成本中心 |
| `pk_periodbak` | `pk_periodbak` | `pk_periodbak` | 摊销期间pk期初备份 |
| `pk_beginperiodbak` | `pk_beginperiodbak` | `pk_beginperiodbak` | 开始摊销会计期间pk期初备份 |
| `pk_endperiodbak` | `pk_endperiodbak` | `pk_endperiodbak` | 摊销结束会计期间pk期初备份 |
| `profitcenter` | `profitcenter` | `profitcenter` | 利润中心 |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `pk_cusdoc` | `pk_cusdoc` | `pk_cusdoc` | 供应商 |
| `pk_customer` | `pk_customer` | `pk_customer` | 客户 |
| `submitter` | `submitter` | `submitter` | 提交人 |
| `withdrawpp` | `withdrawpp` | `withdrawpp` | 撤回提交的人 |
| `pk_period` | `pk_period` | `pk_period` | 当前摊销期间id |
| `` | `creatorId` | `creatorId` | 创建人id |
| `` | `modifierId` | `modifierId` | 修改人id |
| `` | `auditorId` | `auditorId` | 审批人id |
| `vcurrency` | `vcurrency` | `vcurrency` | 待摊币种 |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币 |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型 |
| `pk_beginperiod` | `pk_beginperiod` | `pk_beginperiod` | 开始摊销会计期间 |
| `pk_endperiod` | `pk_endperiod` | `pk_endperiod` | 结束摊销会计期间 |
| `vlastbillbustype` | `vlastbillbustype` | `vlastbillbustype` | 上游单据交易类型 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |

### 日期字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `check_date` | `check_date` | `check_date` | 收单时间 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `dnatexchratedate` | `dnatexchratedate` | `dnatexchratedate` | 汇率日期 |
| `dcostdate` | `dcostdate` | `dcostdate` | 发生日期 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `submit_time` | `submit_time` | `submitTime` | 提交时间 |
| `withdraw_time` | `withdraw_time` | `withdrawTime` | 撤回提交时间 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ismulticurrency` | `ismulticurrency` | `ismulticurrency` | 是否多币种 |
| `bvalid` | `bvalid` | `bvalid` | 数据有效性 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imakebilltype` | `imakebilltype` | `imakebilltype` | 单据生成方式 |
| `detailcount` | `detailcount` | `detailcount` | 下游单据条数 |
| `directPrintCount` | `directPrintCount` | `directPrintCount` | 直接打印次数 |
| `previewPrintCount` | `previewPrintCount` | `previewPrintCount` | 预览打印次数 |
| `printCount` | `printCount` | `printCount` | 打印次数 |
| `ibudgetexectype` | `ibudgetexectype` | `ibudgetexectype` | 预算控制类型 |

### 短整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ideferexpensetypebak` | `ideferexpensetypebak` | `ideferexpensetypebak` | 摊销状态期初备份 |
| `check_status` | `check_status` | `check_status` | 收单验符状态 |
| `beginningflag` | `beginningflag` | `beginningflag` | 期初标志 |
| `ideferexpensetype` | `ideferexpensetype` | `ideferexpensetype` | 摊销状态 |
| `` | `status` | `status` | 单据状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `` | `returncount` | `returncount` | 退回次数 |
| `ibudgetctrltype` | `ibudgetctrltype` | `ibudgetctrltype` | 预算控制结果 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `vlastbillid` | `vlastbillid` | `vlastbillid` | 上游单据id |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (48个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnatsummnybak` | `nnatsummnybak` | `nnatsummnybak` | 总摊销金额-本币期初备份 |
| `nnatuntaxsummnybak` | `nnatuntaxsummnybak` | `nnatuntaxsummnybak` | 总摊销不含税金额-本币期初备份 |
| `nnattotalmnybak` | `nnattotalmnybak` | `nnattotalmnybak` | 已摊销金额-本币期初备份 |
| `nnattotaluntaxmnybak` | `nnattotaluntaxmnybak` | `nnattotaluntaxmnybak` | 已摊销不含税金额-本币期初备份 |
| `nnatlavemnybak` | `nnatlavemnybak` | `nnatlavemnybak` | 剩余摊销金额-本币期初备份 |
| `nnatuntaxlavemnybak` | `nnatuntaxlavemnybak` | `nnatuntaxlavemnybak` | 剩余摊销不含税金额-本币期初备份 |
| `nnatmnybak` | `nnatmnybak` | `nnatmnybak` | 后续每期摊销金额-本币期初备份 |
| `nnatuntaxmnybak` | `nnatuntaxmnybak` | `nnatuntaxmnybak` | 后续每期摊销不含税金额-本币期初备份 |
| `nsummnybak` | `nsummnybak` | `nsummnybak` | 总摊销金额期初备份 |
| `nuntaxsummnybak` | `nuntaxsummnybak` | `nuntaxsummnybak` | 总摊销不含税金额期初备份 |
| `ntotalmnybak` | `ntotalmnybak` | `ntotalmnybak` | 累计摊销金额期初备份 |
| `ntotaluntaxmnybak` | `ntotaluntaxmnybak` | `ntotaluntaxmnybak` | 已摊销不含税金额期初备份 |
| `nlavemnybak` | `nlavemnybak` | `nlavemnybak` | 剩余摊销金额期初备份 |
| `nuntaxlavemnybak` | `nuntaxlavemnybak` | `nuntaxlavemnybak` | 剩余摊销不含税金额期初备份 |
| `ncpdeferredmnybak` | `ncpdeferredmnybak` | `ncpdeferredmnybak` | 本期摊销金额期初备份 |
| `nnatcpdeferredmnybak` | `nnatcpdeferredmnybak` | `nnatcpdeferredmnybak` | 本期摊销金额-本币期初备份 |
| `ncpdeferreduntaxmnybak` | `ncpdeferreduntaxmnybak` | `ncpdeferreduntaxmnybak` | 本期摊销不含税金额期初备份 |
| `nnatcpdeferreduntaxmnybak` | `nnatcpdeferreduntaxmnybak` | `nnatcpdeferreduntaxmnybak` | 本期摊销不含税金额-本币期初备份 |
| `nsumnumbak` | `nsumnumbak` | `nsumnumbak` | 总摊销期期初备份 |
| `ntotalnumbak` | `ntotalnumbak` | `ntotalnumbak` | 累计摊销期期初备份 |
| `nlavenumbak` | `nlavenumbak` | `nlavenumbak` | 剩余摊销期期初备份 |
| `nmnybak` | `nmnybak` | `nmnybak` | 后续每期摊销金额期初备份 |
| `nuntaxmnybak` | `nuntaxmnybak` | `nuntaxmnybak` | 后续每期摊销不含税金额期初备份 |
| `ncpdeferreduntaxmny` | `ncpdeferreduntaxmny` | `ncpdeferreduntaxmny` | 本期摊销不含税金额 |
| `ncpdeferredmny` | `ncpdeferredmny` | `ncpdeferredmny` | 本期摊销金额 |
| `nnatcpdeferreduntaxmny` | `nnatcpdeferreduntaxmny` | `nnatcpdeferreduntaxmny` | 本期摊销不含税金额-本币 |
| `nnatcpdeferredmny` | `nnatcpdeferredmny` | `nnatcpdeferredmny` | 本期摊销金额-本币 |
| `nsummny` | `nsummny` | `nsummny` | 总摊销金额 |
| `ntotalmny` | `ntotalmny` | `ntotalmny` | 已摊销金额 |
| `nlavemny` | `nlavemny` | `nlavemny` | 剩余摊销金额 |
| `nsumnum` | `nsumnum` | `nsumnum` | 总摊销期 |
| `ntotalnum` | `ntotalnum` | `ntotalnum` | 已摊销期 |
| `nlavenum` | `nlavenum` | `nlavenum` | 剩余摊销期 |
| `nmny` | `nmny` | `nmny` | 后续每期摊销金额 |
| `nnatuntaxsummny` | `nnatuntaxsummny` | `nnatuntaxsummny` | 总摊销不含税金额-本币 |
| `nnattotaluntaxmny` | `nnattotaluntaxmny` | `nnattotaluntaxmny` | 已摊销不含税金额-本币 |
| `nnatuntaxlavemny` | `nnatuntaxlavemny` | `nnatuntaxlavemny` | 剩余摊销不含税金额-本币 |
| `nuntaxsummny` | `nuntaxsummny` | `nuntaxsummny` | 总摊销不含税金额 |
| `nnatuntaxmny` | `nnatuntaxmny` | `nnatuntaxmny` | 后续每期摊销不含税金额-本币 |
| `ntotaluntaxmny` | `ntotaluntaxmny` | `ntotaluntaxmny` | 已摊销不含税金额 |
| `nuntaxlavemny` | `nuntaxlavemny` | `nuntaxlavemny` | 剩余摊销不含税金额 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 组织本币企业汇率 |
| `nuntaxmny` | `nuntaxmny` | `nuntaxmny` | 后续每期摊销不含税金额 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 组织本币汇率 |
| `nnatsummny` | `nnatsummny` | `nnatsummny` | 总摊销金额-本币 |
| `nnattotalmny` | `nnattotalmny` | `nnattotalmny` | 已摊销金额-本币 |
| `nnatlavemny` | `nnatlavemny` | `nnatlavemny` | 剩余摊销金额-本币 |
| `nnatmny` | `nnatmny` | `nnatmny` | 后续每期摊销金额-本币 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `DeferExpenseBVO` | 待摊费用单子表 |
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
| `` | `` | `deferexpenseipbmcurrentauditor` | 待摊费用单审批当前审批人 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `deferExpenseDcs` | `deferExpenseDcs` | `deferExpenseDcs` | 待摊费用单自定义项 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
