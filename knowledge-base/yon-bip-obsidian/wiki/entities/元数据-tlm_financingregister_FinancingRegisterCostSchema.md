---
tags: [BIP, 元数据, 数据字典, tlm.financingregister.FinancingRegisterCostSchema]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 金融合同费用方案 (`tlm.financingregister.FinancingRegisterCostSchema`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_financingregister_cost_schema` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 金融合同费用方案 |
| 物理表 | `tlm_financingregister_cost_schema` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 16 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `cost_schema_define_character` | `` |
| `ytenant_id` | `` |
| `cost_currency` | `` |
| `mainid` | `` |
| `fee_item` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 16 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `charge_type` | `charge_type` | `chargeType` | 费用收取方式 |
| `cost_basis` | `cost_basis` | `costBasis` | 费用基数 |
| `cost_code` | `cost_code` | `costCode` | 费用方案编号 |
| `cost_cycle` | `cost_cycle` | `costCycle` | 费用周期 |
| `cost_days` | `cost_days` | `costDays` | 计费天数 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cost_currency` | `cost_currency` | `costCurrency` | 费用币种 |
| `fee_item` | `fee_item` | `feeItem` | 付费项目 |
| `mainid` | `mainid` | `mainid` | 金融合同ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `first_cost_day` | `first_cost_day` | `firstCostDay` | 首次计费日 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `annual_rate` | `annual_rate` | `annualRate` | 年费率(%) |
| `cost_amount` | `cost_amount` | `costAmount` | 费用金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cost_schema_define_character` | `cost_schema_define_character` | `fRCostSchemaCharacterDef` | 费用方案子表特征 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
