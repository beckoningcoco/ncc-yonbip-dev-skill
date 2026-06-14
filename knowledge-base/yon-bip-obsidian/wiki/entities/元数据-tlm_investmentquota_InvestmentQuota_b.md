---
tags: [BIP, 元数据, 数据字典, tlm.investmentquota.InvestmentQuota_b]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 投资额度子表 (`tlm.investmentquota.InvestmentQuota_b`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`tlm_investmentquota_b` | domain：`yonbip-fi-ctmtlm` | 应用：`TLM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 投资额度子表 |
| 物理表 | `tlm_investmentquota_b` |
| domain/服务域 | `yonbip-fi-ctmtlm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `TLM` |
| 直连字段 | 21 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `financing_org_bank` | `` |
| `supplier` | `` |
| `mainid` | `` |
| `accentity` | `` |
| `characterDefb` | `` |
| `financial_product` | `` |
| `tenant_id` | `` |
| `customer` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `financing_org_other` | `financing_org_other` | `financingOrgForOther` | 投资机构 |
| `financing_org_type` | `financing_org_type` | `financingOrgType` | 投资机构类型 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 资金组织 |
| `customer` | `customer` | `customer` | 客户id |
| `financial_product` | `financial_product` | `financialProduct` | 金融产品 |
| `financing_org_bank` | `financing_org_bank` | `financingOrgForBank` | 投资机构 |
| `mainid` | `mainid` | `mainid` | 主表id |
| `supplier` | `supplier` | `supplier` | 供应商id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accumulatedinvestmentamount` | `accumulatedinvestmentamount` | `accumulatedinvestmentamount` | 累计投资规模(金融产品) |
| `actualavailableamount` | `actualavailableamount` | `actualavailableamount` | 实际可用金额(金融产品) |
| `notionalavailableamount` | `notionalavailableamount` | `notionalavailableamount` | 名义可用金额(金融产品) |
| `occupiedamount` | `occupiedamount` | `occupiedamount` | 已占用金额(金融产品) |
| `productlimitamount` | `productlimitamount` | `productlimitamount` | 金融产品限额 |
| `releasedamount` | `releasedamount` | `releasedamount` | 已释放金额(金融产品) |
| `singlelimitamount` | `singlelimitamount` | `singlelimitamount` | 单笔投资限额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `characterDefb` | `characterDefb` | `characterDefb` | 投资额度子表 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
