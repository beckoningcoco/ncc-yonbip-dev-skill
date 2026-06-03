---
tags: [BIP, 元数据, 数据字典, tlm.yeartradeplan.Yeartradeplan]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 年度交易计划 (`tlm.yeartradeplan.Yeartradeplan`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_yeartradeplan` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：`8c4f5133-f864-4514-864c-2b2c55da5f7a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 年度交易计划 |
| 物理表 | `tlm_yeartradeplan` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 39 个 |
| 子表 | 0 个 |
| 关联引用 | 10 个 |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `yeartradeplan_character_def` | `` |
| `ytenant_id` | `` |
| `accentity_raw` | `` |
| `currency` | `bd_currencytenantreflist` |
| `accentity` | `bd_accbody` |
| `bustype` | `bd_transtypelistref` |
| `tenant_id` | `` |

## 继承接口 (7个, 18字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **自动编码** (`ucfbase.ucfbaseItf.IAutoCode`)
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **打印次数** (`base.itf.IPrintCount`)
  - `printCount` → `printCount`

## 字段列表（按类型分组）

> 共 39 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 单据编号 |
| `paln_name` | `paln_name` | `palnName` | 计划名称 |
| `trade_type` | `trade_type` | `tradeType` | 交易品种分类 |
| `unit` | `unit` | `unit` | 单位 |
| `early_warning_describe` | `early_warning_describe` | `earlyWarningDescribe` | 止损或亏扣预警线描述 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `` | `auditor` | `auditor` | 审批人 |
| `name` | `name` | `name` | 名称 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 会计主体id |
| `currency` | `currency` | `currency` | 币种id |
| `bustype` | `bustype` | `bustype` | 交易类型id |
| `accentity_raw` | `accentity_raw` | `accentityRaw` | 核算会计主体 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vouch_date` | `vouch_date` | `vouchdate` | 单据日期 |
| `paln_year` | `paln_year` | `palnYear` | 计划年度 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `isWfControlled` | `isWfControlled` | 是否适配审批流 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `printCount` | `printCount` | `printCount` | 打印次数 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_status` | `audit_status` | `auditStatus` | 审批状态 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `bill_type` | `bill_type` | `billType` | 关联单据类型 |
| `` | `returncount` | `returncount` | 退回次数 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 交易交割ID |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `finance_occupy` | `finance_occupy` | `financeOccupy` | 资金占用规模 |
| `manage_scope` | `manage_scope` | `manageScope` | 年度实货经营规模 |
| `hedging_scope` | `hedging_scope` | `hedgingScope` | 年度保值规模 |
| `position_scope` | `position_scope` | `positionScope` | 时点最大净持仓规模 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `yeartradeplan_character_def` | `yeartradeplan_character_def` | `yeartradeplanCharacterDef` | 年度交易申请特征 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
