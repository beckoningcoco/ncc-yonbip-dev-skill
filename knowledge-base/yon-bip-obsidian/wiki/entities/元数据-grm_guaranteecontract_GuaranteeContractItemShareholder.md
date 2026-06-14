---
tags: [BIP, 元数据, 数据字典, grm.guaranteecontract.GuaranteeContractItemShareholder]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 股东担保明细 (`grm.guaranteecontract.GuaranteeContractItemShareholder`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`grm_guarantee_contract_item_shareholder` | domain：`yonbip-fi-ctmgrm` | 应用：`GRM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 股东担保明细 |
| 物理表 | `grm_guarantee_contract_item_shareholder` |
| domain/服务域 | `yonbip-fi-ctmgrm` |
| schema | `yonbip_fi_ctmfm` |
| 所属应用 | `GRM` |
| 直连字段 | 16 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `accentity_guarantt_shareholder` | `` |
| `shareholder_characterDef` | `` |
| `customer_guarant_shareholder` | `` |
| `vendor_guarant_shareholder` | `` |
| `ytenant_id` | `` |
| `mainid` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 16 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `guarant_shareholder_type` | `guarant_shareholder_type` | `guarantShareholderType` | 担保股东类型 |
| `is_sync` | `is_sync` | `isSync` | 是否协同生成行数据 |
| `stock_ratio_type` | `stock_ratio_type` | `stockRatioType` | 超股比标识 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity_guarantt_shareholder` | `accentity_guarantt_shareholder` | `accentityGuarantShareholder` | 担保股东(资金伙伴) |
| `customer_guarant_shareholder` | `customer_guarant_shareholder` | `customerGuarantShareholder` | 担保股东(客户) |
| `mainid` | `mainid` | `mainid` | 担保合同id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `vendor_guarant_shareholder` | `vendor_guarant_shareholder` | `vendorGuarantShareholder` | 担保股东(供应商) |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rowno` | `rowno` | `rowno` | 序号 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `guarantee_amount` | `guarantee_amount` | `guaranteeAmount` | 担保金额 |
| `guarantee_ratio` | `guarantee_ratio` | `guaranteeRatio` | 担保比例 |
| `shareholding_ratio` | `shareholding_ratio` | `shareholdingRatio` | 持股比例(%) |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `shareholder_characterDef` | `shareholder_characterDef` | `shareholderCharacterDef` | 担保股东自定义项 |
