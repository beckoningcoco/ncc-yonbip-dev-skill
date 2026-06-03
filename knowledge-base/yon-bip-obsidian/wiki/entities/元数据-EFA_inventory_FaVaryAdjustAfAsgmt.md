---
tags: [BIP, 元数据, 数据字典, EFA.inventory.FaVaryAdjustAfAsgmt]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 盘点差异调整单变动后分配信息 (`EFA.inventory.FaVaryAdjustAfAsgmt`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_vary_adjust_af_asgmt` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`0e2b4e52-d1f7-4d01-821a-9223106ea401`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 盘点差异调整单变动后分配信息 |
| 物理表 | `fa_bill_vary_adjust_af_asgmt` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 13 个 |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `product_id` | `productcenter.pc_nomalproductref` |
| `activity` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `wbs` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `usage_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `fa_vary_adjust_detail_id` | `` |
| `usage_cost_center_id` | `finbd.bd_costcenterref` |
| `usage_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |

## 继承接口 (4个, 8字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `remarks` | `remarks` | `remarks` | 备注 |
| `id` | `id` | `id` | 主键 |

### 引用字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `asset_id` | `asset_id` | `assetId` | 固定资产卡片 |
| `fa_vary_adjust_detail_id` | `fa_vary_adjust_detail_id` | `faVaryAdjustDetailId` | 盘点差异调整子表 |
| `product_id` | `product_id` | `productId` | 产品 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `usage_cost_center_id` | `usage_cost_center_id` | `usageCostCenterId` | 成本中心 |
| `usage_dept_id` | `usage_dept_id` | `usageDeptId` | 部门 |
| `usage_profit_center_id` | `usage_profit_center_id` | `usageProfitCenterId` | 利润中心 |
| `activity` | `activity` | `activity` | 活动 |
| `wbs` | `wbs` | `wbs` | WBS |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `asgmt_ratio` | `asgmt_ratio` | `asgmtRatio` | 分配比例 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征id |
