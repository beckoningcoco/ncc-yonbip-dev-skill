---
tags: [BIP, 元数据, 数据字典, znbzbx.budgetestablish.BudgetEstablishVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 预算编制 (`znbzbx.budgetestablish.BudgetEstablishVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_budgetestablish` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`fbedbb96-aa3c-4cb5-b010-c3b9f8d0783b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 预算编制 |
| 物理表 | `znbz_budgetestablish` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 77 个 |
| 子表 | 3 个 |
| 关联引用 | 22 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `budgetestablishibpmstep` | `znbzbx.budgetestablish.BudgetEstablishIBpmStep` | composition |
| `BudgetEstablishBVO` | `znbzbx.budgetestablish.BudgetEstablishBVO` | composition |
| `budgetestablishibpmcurrentauditor` | `znbzbx.budgetestablish.BudgetEstablishIBpmCurrentAuditor` | composition |

## 关联引用 (22个)

| 字段名 | 引用类型 |
|--------|---------|
| `chandleorg` | `ucf-org-center.org_pure_tree_ref` |
| `vhandledeptid` | `ucf-org-center.admin_dept_tree_ref` |
| `pk_period` | `finbd.bd_period` |
| `ytenant_id` | `` |
| `vfinacedeptid` | `ucf-org-center.bd_adminorgsharetreeref` |
| `` | `` |
| `pk_periodyear` | `finbd.bd_periodyear` |
| `bustype` | `znbzbx.bd_billtyperef` |
| `caccountorg` | `ucf-org-center.bd_financeorgtreeref` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `budgetEstablishDcs` | `` |
| `budget_year_id` | `` |
| `pk_budgetmodeldef` | `znbzbx.znbzbx_budgetmodeldefref` |
| `accounting_period_plan_id` | `` |
| `costcenter` | `finbd.bd_costcenterref` |
| `pk_handlepsn` | `ucf-staff-center.bd_staff_ref` |
| `tenant_id` | `` |

## 继承接口 (4个, 16字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``

## 字段列表（按类型分组）

> 共 77 个直连字段

### 文本字段 (25个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `code` | `code` | 单据编号 |
| `pk_billtype` | `pk_billtype` | `pk_billtype` | 单据类型 |
| `adjustlog` | `adjustlog` | `adjustlog` | 调整历史 |
| `budget_cycle` | `budget_cycle` | `budgetCycle` | 预算周期 |
| `system_version` | `system_version` | `systemVersion` | 费用预算系统版本 |
| `vname2` | `vname2` | `vname2` | 方案名称(英语) |
| `vname3` | `vname3` | `vname3` | 方案名称(繁体) |
| `vname4` | `vname4` | `vname4` | 方案名称(印尼语) |
| `vname5` | `vname5` | `vname5` | 方案名称(日语) |
| `vname6` | `vname6` | `vname6` | 方案名称(韩语) |
| `vmemo` | `vmemo` | `vmemo` | 备注 |
| `vattachmentass` | `vattachmentass` | `vattachmentass` | 单据附件id |
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

### 引用字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 费用承担组织id |
| `vfinacedeptid` | `vfinacedeptid` | `vfinacedeptid` | 费用承担部门id |
| `accounting_period_plan_id` | `accounting_period_plan_id` | `accountingPeriodPlanId` | 会计期间方案id |
| `budget_year_id` | `budget_year_id` | `budgetYearId` | 预算年度id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `caccountorg` | `caccountorg` | `caccountorg` | 会计主体id |
| `bustype` | `bustype` | `bustype` | 交易类型id |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 编制人id |
| `vhandledeptid` | `vhandledeptid` | `vhandledeptid` | 编制人部门id |
| `chandleorg` | `chandleorg` | `chandleorg` | 编制人组织id |
| `pk_budgetmodeldef` | `pk_budgetmodeldef` | `pk_budgetmodeldef` | 预算模型id |
| `pk_period` | `pk_period` | `pk_period` | 期间id |
| `costcenter` | `costcenter` | `costcenter` | 成本中心id |
| `` | `creatorId` | `creatorId` | 创建人id |
| `` | `modifierId` | `modifierId` | 修改人id |
| `` | `auditorId` | `auditorId` | 审批人ID |
| `pk_periodyear` | `pk_periodyear` | `pk_periodyear` | 期间(年)id |

### 日期字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `vouchdate` | `vouchdate` | 单据日期 |
| `dbegindate` | `dbegindate` | `dbegindate` | 开始日期 |
| `denddate` | `denddate` | `denddate` | 结束日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `effectiveImmediately` | `effectiveImmediately` | `effectiveImmediately` | 是否立即生效 |
| `ibudgettype` | `ibudgettype` | `ibudgettype` | 编制类型 |
| `ieffectstatus` | `ieffectstatus` | `ieffectstatus` | 生效状态 |

### 短整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `virement_type` | `virement_type` | `virementType` | 调剂类型 |
| `` | `status` | `status` | 单据状态 |
| `irejectstatus` | `irejectstatus` | `irejectstatus` | 驳回状态 |
| `ibillmakemethod` | `ibillmakemethod` | `ibillmakemethod` | 填单方式 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `` | `returncount` | `returncount` | 退回次数 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `tplid` | `tplid` | 模板id |
| `id` | `id` | `id` | ID |

### 数值字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `budget_amount` | `budget_amount` | `budgetAmount` | 预算数总额 |
| `revision_amount` | `revision_amount` | `revisionAmount` | 调整数总额 |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vname` | `vname` | `vname` | 方案名称 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `budgetEstablishDcs` | `budgetEstablishDcs` | `budgetEstablishDcs` | 预算编制自定义项 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `BudgetEstablishBVO` | 预算编制子表 |
| `` | `` | `budgetestablishibpmcurrentauditor` | 预算编制审批当前审批人 |
| `` | `` | `budgetestablishibpmstep` | 预算编制审批业务阶段 |
