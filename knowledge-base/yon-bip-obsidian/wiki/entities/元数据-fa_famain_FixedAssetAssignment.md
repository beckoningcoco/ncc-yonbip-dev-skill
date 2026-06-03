---
tags: [BIP, 元数据, 数据字典, fa.famain.FixedAssetAssignment]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 分配信息 (`fa.famain.FixedAssetAssignment`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_asset_asgmt` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`f54930fa-f5c7-4f3a-9e76-823c78ba4871`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 分配信息 |
| 物理表 | `fa_asset_asgmt` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 20 个 |
| 子表 | 0 个 |
| 关联引用 | 13 个 |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `usage_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `product_id` | `productcenter.baseProductRef` |
| `activity` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `usage_dept_id` | `ucf-org-center.bd_adminorgsharetreeref` |
| `wbs` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `usage_cost_center_id` | `finbd.bd_costcenterref` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `project_id` | `ucfbasedoc.bd_projectNewRef` |

## 继承接口 (1个, 1字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 20 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `remarks` | `remarks` | `remarks` | 备注 |

### 引用字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `asset_id` | `asset_id` | `assetId` | 固定资产 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `activity` | `activity` | `activity` | 活动 |
| `usage_cost_center_id` | `usage_cost_center_id` | `costCenterId` | 使用成本中心 |
| `creator` | `creator` | `creator` | 创建人 |
| `usage_dept_id` | `usage_dept_id` | `deptId` | 使用部门 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `product_id` | `product_id` | `productId` | 产品 |
| `usage_profit_center_id` | `usage_profit_center_id` | `profitCenterId` | 使用利润中心 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `wbs` | `wbs` | `wbs` | WBS |
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

### 数值字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `asgmt_ratio` | `asgmt_ratio` | `proportion` | 分配比例 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义项 |
