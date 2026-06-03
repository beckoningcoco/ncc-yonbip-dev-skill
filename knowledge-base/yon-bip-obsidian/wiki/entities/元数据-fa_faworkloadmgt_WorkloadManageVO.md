---
tags: [BIP, 元数据, 数据字典, fa.faworkloadmgt.WorkloadManageVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 工作量管理 (`fa.faworkloadmgt.WorkloadManageVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_asset_workload` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`5722b36f-1d98-42c1-9816-188e49828e28`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工作量管理 |
| 物理表 | `fa_asset_workload` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 9 个 |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `period_id` | `finbd.bd_period` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `asset_calc_id` | `` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref` |

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

> 共 22 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `period_code` | `period_code` | `period` | 会计期间编码 |
| `asset_code` | `asset_code` | `assetCode` | 固定资产编码 |
| `workload_unit` | `workload_unit` | `workloadUnit` | 工作量单位 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accpurpose_id` | `accpurpose_id` | `accpurposeId` | 核算目的 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `asset_calc_id` | `asset_calc_id` | `calculateId` | 核算信息 |
| `period_id` | `period_id` | `periodId` | 会计期间 |
| `asset_id` | `asset_id` | `assetId` | 固定资产 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
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

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `total_workload` | `total_workload` | `totalWorkload` | 工作总量 |
| `last_month_workload` | `last_month_workload` | `lastMonthWorkload` | 上期工作量 |
| `month_workload` | `month_workload` | `monthWorkload` | 本期工作量 |
| `accum_workload` | `accum_workload` | `existingWorkload` | 累计工作量 |
| `residual_workload` | `residual_workload` | `residualWorkload` | 剩余工作量 |
