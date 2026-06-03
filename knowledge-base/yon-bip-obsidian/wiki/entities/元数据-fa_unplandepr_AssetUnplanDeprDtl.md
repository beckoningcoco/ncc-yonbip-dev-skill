---
tags: [BIP, 元数据, 数据字典, fa.unplandepr.AssetUnplanDeprDtl]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计划外折旧明细 (`fa.unplandepr.AssetUnplanDeprDtl`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_depr_unplan_dtl` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`c58a032e-abe9-4cb9-a88c-d74ab9912514`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划外折旧明细 |
| 物理表 | `fa_bill_depr_unplan_dtl` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 29 个 |
| 子表 | 1 个 |
| 关联引用 | 14 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `assignments` | `fa.unplandepr.AssetUnplanDeprAssign` | composition |

## 关联引用 (14个)

| 字段名 | 引用类型 |
|--------|---------|
| `accbook_category_id` | `efa.fa_accbookassetclassref` |
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `accbook_property_id` | `fiepub.epub_accountbookpropertyref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `asset_calc_id` | `` |
| `ytenant_id` | `` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `unplan_depr_bill_id` | `` |
| `asset_category_id` | `yonbip-fi-efa.fa_categorymainref` |
| `accbook_currtype_id` | `ucfbasedoc.bd_currencytenantref` |

## 继承接口 (3个, 6字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 29 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `period_code` | `period_code` | `periodCode` | 会计期间编码 |
| `asset_code` | `asset_code` | `assetCode` | 固定资产卡片编码 |
| `asset_name` | `asset_name` | `assetName` | 固定资产名称 |
| `tag_no` | `tag_no` | `tagno` | 标签号 |
| `effective_date` | `effective_date` | `effectiveDate` | 生效日期 |
| `amorti_adjust_date` | `amorti_adjust_date` | `amortiAdjustDate` | 摊销调整日期 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `accbook_property_id` | `accbook_property_id` | `accbookProperty` | 账簿属性 |
| `unplan_depr_bill_id` | `unplan_depr_bill_id` | `billId` | 主表 |
| `period_id` | `period_id` | `periodId` | 会计期间 |
| `asset_id` | `asset_id` | `assetId` | 固定资产 |
| `asset_category_id` | `asset_category_id` | `assetCategoryId` | 固定资产类别 |
| `accbook_category_id` | `accbook_category_id` | `assetBookCategoryId` | 固定资产账簿类别 |
| `asset_calc_id` | `asset_calc_id` | `calculateId` | 核算信息 |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 本币币种 |
| `org_currtype_id` | `org_currtype_id` | `orgCurrtypeId` | 组织币币种 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_curr_period_amort` | `bln_curr_period_amort` | `blnCurrPeriod` | 是否当期开始摊销 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `unplan_depr_amount` | `unplan_depr_amount` | `outPlanDeprAmount` | 本币计划外折旧 |
| `org_unplan_depr_amount` | `org_unplan_depr_amount` | `orgUnplanDeprAmount` | 组织币计划外折旧 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `remarks` | `remarks` | `remarks` | 备注 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `assignments` | 计划外折旧分配行 |
