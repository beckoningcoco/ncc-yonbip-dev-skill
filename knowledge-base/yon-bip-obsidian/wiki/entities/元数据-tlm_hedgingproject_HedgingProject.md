---
tags: [BIP, 元数据, 数据字典, tlm.hedgingproject.HedgingProject]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 套保项目登记 (`tlm.hedgingproject.HedgingProject`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_hedgingproject` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`245210a2-b888-498e-95d0-f65b3794d5da`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 套保项目登记 |
| 物理表 | `tlm_hedgingproject` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 54 个 |
| 子表 | 0 个 |
| 关联引用 | 13 个 |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `characterDef` | `` |
| `accentity_raw` | `` |
| `` | `` |
| `accentity` | `bd_accbody` |
| `project_ref` | `tlm_financingregisterRef` |
| `invest_cash` | `tlm_financeinRef` |
| `currency` | `bd_currencytenantreflist` |
| `financing_cash` | `tlm_purchaseregisterRef` |
| `trade_type` | `bd_transtypelistref` |
| `tenant_id` | `` |

## 继承接口 (5个, 17字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 54 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审核人 |
| `code` | `code` | `code` | 单据编号 |
| `project_code` | `project_code` | `projectCode` | 项目编号 |
| `cash_code` | `cash_code` | `cashCode` | 现金流编号 |
| `explanation` | `explanation` | `explanation` | 补充说明 |
| `remark` | `remark` | `remark` | 备注 |
| `accentity_name` | `accentity_name` | `accentityName` | 会计主体名称 |
| `currency_name` | `currency_name` | `currencyName` | 币种名称 |
| `financing_cash_code` | `financing_cash_code` | `financingCashCode` | 现金流编号 |
| `invest_cash_code` | `invest_cash_code` | `investCashCode` | 现金流编号 |
| `project_ref_code` | `project_ref_code` | `projectRefCode` | 项目编号 |

### 引用字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 会计主体id |
| `project_ref` | `project_ref` | `projectRef` | 项目id |
| `invest_cash` | `invest_cash` | `investCash` | 融入登记现金流 |
| `financing_cash` | `financing_cash` | `financingCash` | 投资登记现金流 |
| `currency` | `currency` | `currency` | 项目币种Id |
| `trade_type` | `trade_type` | `tradeType` | 交易类型Id |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审核日期 |
| `voucher_date` | `voucher_date` | `voucherDate` | 单据日期 |
| `plan_year` | `plan_year` | `planYear` | 计划年度 |
| `start_date` | `start_date` | `startDate` | 项目起始日期 |
| `end_date` | `end_date` | `endDate` | 项目终止日期 |
| `` | `vouchdate` | `vouchdate` | 单据日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 审批流控制 |

### 枚举字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_status` | `bill_status` | `billStatus` | 单据状态 |
| `project_type` | `project_type` | `projectType` | 项目分类 |
| `project_status` | `project_status` | `projectStatus` | 项目状态 |
| `direction` | `direction` | `direction` | 资产负债方向 |
| `subject_matter` | `subject_matter` | `subjectMatter` | 对冲标的 |
| `data_sources` | `data_sources` | `dataSources` | 数据来源 |
| `is_use` | `is_use` | `isUse` | 参照是否引用 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `project_detail_type` | `project_detail_type` | `projectDetailType` | 项目细类 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `verifystate` | `verifystate` | 审批状态 |
| `bill_type` | `bill_type` | `billType` | 单据类型 |
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `status` | `status` | 单据状态 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |
| `` | `tplid` | `tplid` | 模板id |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `project_scale` | `project_scale` | `projectScale` | 项目规模 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 单据时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审核时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `characterDef` | `characterDef` | `characterDef` | 套保项目特征 |
