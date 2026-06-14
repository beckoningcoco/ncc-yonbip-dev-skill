---
tags: [BIP, 元数据, 数据字典, aa.agent.Agent]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户 (`aa.agent.Agent`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`agent` | domain：`udinghuo` | 应用：`` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户 |
| 物理表 | `agent` |
| domain/服务域 | `udinghuo` |
| 所属应用 | `` |
| 直连字段 | 13 个 |
| 子表 | 1 个 |
| 关联引用 | 3 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `agents` | `aa.agent.AgentRelation` | composition |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `iInvoicingAgentId` | `` |
| `` | `` |

## 继承接口 (2个, 2字段)

- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 13 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cCode` | `cCode` | `code` | 客户编码 |
| `cInvalidDate` | `cInvalidDate` | `invalidDate` | 日期 |
| `cTaxNo` | `cTaxNo` | `taxNo` | 税号 |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iInvoicingAgentId` | `iInvoicingAgentId` | `invoicingAgentId` | 开票客户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bRetailInvestors` | `bRetailInvestors` | `retailInvestors` | 是否是散户 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iPrivateUserSize` | `iPrivateUserSize` | `privateUserSize` | 允许开通的客户子账户数 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iAddressId` | `iAddressId` | `addressId` | 代理商地址id |
| `id` | `id` | `id` | ID |
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `agents` | 客户交易关系 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cName` | `cName` | `name` | 名称 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
