---
tags: [BIP, 元数据, 数据字典, tlm.financeapply.FinanceApplyInvestors]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 投资人子表 (`tlm.financeapply.FinanceApplyInvestors`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financeapply_investors` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投资人子表 |
| 物理表 | `tlm_financeapply_investors` |
| 数据库 schema | `yonbip-fi-ctmtlm` |
| 所属应用 | `TLM` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `investor` | `` |
| `mainid` | `` |
| `protocol_currency` | `` |
| `investor_type` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 6字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditor` | `auditor` | 审批人名称 |
| `beiyong1` | `beiyong1` | `beiyong1` | 备用1 |
| `beiyong2` | `beiyong2` | `beiyong2` | 备用2 |
| `beiyong3` | `beiyong3` | `beiyong3` | 备用3 |
| `investorscphone` | `investorscphone` | `investorscphone` | 联系电话 |
| `investorscremard` | `investorscremard` | `investorscremard` | 备注 |
| `occupysx` | `occupysx` | `occupySX` | 是否占用授信 |
| `personincharge` | `personincharge` | `personincharge` | 负责人 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditorId` | `auditorId` | 审批人 |
| `investor` | `investor` | `investorid` | 投资人 |
| `investor_type` | `investor_type` | `investortype` | 投资人机构类型 |
| `mainid` | `mainid` | `mainid` | 融入申请id |
| `protocol_currency` | `protocol_currency` | `protocolCurrency` | 协议币种 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `underwriter_amountxy` | `underwriter_amountxy` | `investorAmountXY` | 投资金额（协议币种） |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
