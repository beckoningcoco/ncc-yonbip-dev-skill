---
tags: [BIP, 元数据, 数据字典, EIA.periodprice.periodPriceBodyVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 期间价格子表 (`EIA.periodprice.periodPriceBodyVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_period_price_b` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`9ebdfef2-0d99-4be4-b7f0-984a7d156953`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 期间价格子表 |
| 物理表 | `ia_period_price_b` |
| domain/服务域 | `yonbip-fi-eia` |
| schema | `fieia` |
| 所属应用 | `EIA` |
| 直连字段 | 27 个 |
| 子表 | 0 个 |
| 关联引用 | 11 个 |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `component_id` | `fiepub.epub_component_ref` |
| `cost_element_id` | `` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `header_id` | `` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref_inner` |
| `acc_year_id` | `finbd.bd_periodyear` |

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

> 共 27 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_code` | `acc_year_code` | `accYearCode` | 会计年编码 |
| `id` | `id` | `id` | 主键 |
| `period_code` | `period_code` | `periodCode` | 会计期间编码 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `acc_year_id` | `acc_year_id` | `accYearId` | 会计年ID |
| `accbook_id` | `accbook_id` | `accbook` | 账簿ID |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `accpurpose_id` | `accpurpose_id` | `accpurpose` | 核算目的 |
| `component_id` | `component_id` | `componentId` | 组件结构ID |
| `cost_element_id` | `cost_element_id` | `costElementId` | 成本要素ID |
| `creator` | `creator` | `creator` | 创建人 |
| `header_id` | `header_id` | `header` | 期间价格主表 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `period_id` | `period_id` | `period` | 会计期间ID |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_price` | `accbook_price` | `accbookPrice` | 账簿本币单价 |
| `accbook_this_price` | `accbook_this_price` | `accbookThisPrice` | 账簿本币本层单价 |
| `balance_num` | `balance_num` | `balanceNum` | 还原数量 |
| `global_price` | `global_price` | `globalPrice` | 全局本币单价 |
| `global_this_price` | `global_this_price` | `globalThisPrice` | 全局本币本层单价 |
| `group_price` | `group_price` | `groupPrice` | 集团本币单价 |
| `group_this_price` | `group_this_price` | `groupThisPrice` | 集团本币本层单价 |
| `org_price` | `org_price` | `orgPrice` | 组织本币单价 |
| `org_this_price` | `org_this_price` | `orgThisPrice` | 组织本币本层单价 |
