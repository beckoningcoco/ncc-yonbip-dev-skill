---
tags: [BIP, 元数据, 数据字典, znbzbx.deferexpensedetail.DeferExpenseDetailVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 摊销明细单表头 (`znbzbx.deferexpensedetail.DeferExpenseDetailVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_deferexpensedetail` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`59c41be8-943e-4638-a6e6-0886877b4194`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 摊销明细单表头 |
| 物理表 | `znbz_deferexpensedetail` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 100 个 |
| 子表 | 2 个 |
| 关联引用 | 28 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `DeferExpenseDetailBVO` | `znbzbx.deferexpensedetail.DeferExpenseDetailBVO` | composition |
| `deferexpensedetailibpmcurrentauditor` | `znbzbx.deferexpensedetail.DeferexpensedetailIBpmCurrentAuditor` | composition |

## 关联引用 (28个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `ucf-org-center.org_pure_tree_ref` |
| `vhandledeptid` | `ucf-org-center.admin_dept_tree_ref` |
| `submitter` | `` |
| `activity` | `` |
| `vlastbillbustype` | `bd_billtyperef` |
| `` | `` |
| `wbs` | `` |
| `vsrcbillbustype` | `bd_billtyperef` |
| `chandlecostcenter` | `finbd.bd_costcenterref` |
| `vcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `profitcenter` | `finbd.bd_allaccbodyref_inner` |
| `withdrawpp` | `` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `tenant_id` | `` |
| `pk_period` | `` |
| `ytenant_id` | `` |
| `vfinacedeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `deferExpenseDetailDcs` | `` |
| `bustype` | `bd_billtyperef` |
| `cfinacecostcenter` | `finbd.bd_costcenterref` |
| `caccountorg` | `ucf-org-center.bd_financeorgtreeref` |
| `vnatcurrency` | `ucfbasedoc.bd_currencytenantref` |
| `vnatexchratetype` | `ucfbasedoc.bd_exchangeratetyperef` |
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
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **打印次数** (`base.itf.IPrintCount`)
  - `printCount` → `printCount`
- **打印次数拆分** (`base.itf.IPrintCountSplit`)
  - `directPrintCount` → `directPrintCount`
  - `previewPrintCount` → `previewPrintCount`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`

## 字段列表（按类型分组）

> 共 100 个直连字段

### 文本字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `code` | `code` | 单据编号 |
| `pk_ncvoucher` | `pk_ncvoucher` | `pk_ncvoucher` | nc凭证id |
| `eventvoucherno` | `eventvoucherno` | `eventvoucherno` | 事项分录编码 |
| `glvoucherno` | `glvoucherno` | `glvoucherno` | 总账凭证号 |
| `pk_billtype` | `pk_billtype` | `pk_billtype` | 单据类型 |
| `vperiod` | `vperiod` | `vperiod` | 当前摊销期间 |
| `vlastbillcode` | `vlastbillcode` | `vlastbillcode` | 上游单据编号 |
| `vlastbilltype` | `vlastbilltype` | `vlastbilltype` | 上游单据类型 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |
| `vreason` | `vreason` | `vreason` | 报销说明 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |
| `voucherstate` | `voucherstate` | `voucherstate` | 凭证状态 |
| `vvoucherno` | `vvoucherno` | `vvoucherno` | 凭证号 |
| `vvouchertype` | `vvouchertype` | `vvouchertype` | 凭证类型 |
| `vsrcbillcode` | `vsrcbillcode` | `vsrcbillcode` | 来源单据编号 |
| `vsrcbilltype` | `vsrcbilltype` | `vsrcbilltype` | 来源单据类型 |
| `bar_code` | `bar_code` | `barCode` | 条形码 |

### 引用字段 (25个)

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
| `profitcenter` | `profitcenter` | `profitcenter` | 利润中心 |
| `submitter` | `submitter` | `submitter` | 提交人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `wbs` | `wbs` | `wbs` | WBS |
| `activity` | `activity` | `activity` | 活动 |
| `withdrawpp` | `withdrawpp` | `withdrawpp` | 撤回提交的人 |
| `pk_period` | `pk_period` | `pk_period` | 当前摊销期间id |
| `vlastbillbustype` | `vlastbillbustype` | `vlastbillbustype` | 上游单据交易类型 |
| `` | `creatorId` | `creatorId` | 创建人id |
| `` | `modifierId` | `modifierId` | 修改人id |
| `` | `auditorId` | `auditorId` | 审批人id |
| `vcurrency` | `vcurrency` | `vcurrency` | 摊销币种 |
| `vnatcurrency` | `vnatcurrency` | `vnatcurrency` | 组织本币 |
| `vnatexchratetype` | `vnatexchratetype` | `vnatexchratetype` | 汇率类型 |
| `vsrcbillbustype` | `vsrcbillbustype` | `vsrcbillbustype` | 来源单据交易类型 |
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

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ismulticurrency` | `ismulticurrency` | `ismulticurrency` | 是否多币种 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `imakebilltype` | `imakebilltype` | `imakebilltype` | 单据生成方式 |
| `directPrintCount` | `directPrintCount` | `directPrintCount` | 直接打印次数 |
| `previewPrintCount` | `previewPrintCount` | `previewPrintCount` | 预览打印次数 |
| `printCount` | `printCount` | `printCount` | 打印次数 |
| `ibudgetexectype` | `ibudgetexectype` | `ibudgetexectype` | 预算控制类型 |

### 短整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isendvouchertype` | `isendvouchertype` | `isendvouchertype` | 传核算方式 |
| `check_status` | `check_status` | `check_status` | 收单验符状态 |
| `` | `status` | `status` | 单据状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `` | `returncount` | `returncount` | 退回次数 |
| `ibudgetctrltype` | `ibudgetctrltype` | `ibudgetctrltype` | 预算控制结果 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `vlastbillid` | `vlastbillid` | `vlastbillid` | 上游单据id |
| `vsrcbillid` | `vsrcbillid` | `vsrcbillid` | 来源单据id |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nsumnum` | `nsumnum` | `nsumnum` | 总摊销期 |
| `ntotalnum` | `ntotalnum` | `ntotalnum` | 已摊销期 |
| `nlavenum` | `nlavenum` | `nlavenum` | 剩余摊销期 |
| `nnatuntaxmny` | `nnatuntaxmny` | `nnatuntaxmny` | 本期摊销不含税金额-本币 |
| `nnatuntaxsummny` | `nnatuntaxsummny` | `nnatuntaxsummny` | 总摊销不含税金额-本币 |
| `nmny` | `nmny` | `nmny` | 本期摊销金额 |
| `nnattotaluntaxmny` | `nnattotaluntaxmny` | `nnattotaluntaxmny` | 已摊销不含税金额-本币 |
| `nsummny` | `nsummny` | `nsummny` | 总摊销金额 |
| `ntotalmny` | `ntotalmny` | `ntotalmny` | 已摊销金额 |
| `nlavemny` | `nlavemny` | `nlavemny` | 剩余摊销金额 |
| `nnatuntaxlavemny` | `nnatuntaxlavemny` | `nnatuntaxlavemny` | 剩余摊销不含税金额-本币 |
| `nuntaxmny` | `nuntaxmny` | `nuntaxmny` | 本期摊销不含税金额 |
| `nuntaxsummny` | `nuntaxsummny` | `nuntaxsummny` | 总摊销不含税金额 |
| `ntotaluntaxmny` | `ntotaluntaxmny` | `ntotaluntaxmny` | 已摊销不含税金额 |
| `nuntaxlavemny` | `nuntaxlavemny` | `nuntaxlavemny` | 剩余摊销不含税金额 |
| `nnatbaseexchrate` | `nnatbaseexchrate` | `nnatbaseexchrate` | 组织本币企业汇率 |
| `nnatexchrate` | `nnatexchrate` | `nnatexchrate` | 组织本币汇率 |
| `nnatmny` | `nnatmny` | `nnatmny` | 本期摊销金额-本币 |
| `nnatsummny` | `nnatsummny` | `nnatsummny` | 总摊销金额-本币 |
| `nnattotalmny` | `nnattotalmny` | `nnattotalmny` | 已摊销金额-本币 |
| `nnatlavemny` | `nnatlavemny` | `nnatlavemny` | 剩余摊销金额-本币 |

### other (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | `nnatbaseexchrateOps` | 组织本币基准汇率折算方式 |
| `nnatexchrateOps` | `nnatexchrateOps` | `nnatexchrateOps` | 组织本币汇率折算方式 |
| `` | `` | `DeferExpenseDetailBVO` | 摊销明细单表体 |
| `` | `` | `deferexpensedetailibpmcurrentauditor` | 待摊费用单审批当前审批人 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `deferExpenseDetailDcs` | `deferExpenseDetailDcs` | `deferExpenseDetailDcs` | 摊销明细单表头自定义项 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
