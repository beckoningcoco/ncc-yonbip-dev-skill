---
tags: [BIP, 元数据, 数据字典, fa.transfer.TransferBillRow]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产转移明细-分配信息 (`fa.transfer.TransferBillRow`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_transfer_dtl_asgmt` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`afa3bc37-a2cc-4ba1-95b7-d9beead8765e`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产转移明细-分配信息 |
| 物理表 | `fa_bill_transfer_dtl_asgmt` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 24 个 |
| 子表 | 0 个 |
| 关联引用 | 14 个 |

## 关联引用 (14个)

| 字段名 | 引用类型 |
|--------|---------|
| `usage_profit_center_id` | `` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `product_id` | `pc_product` |
| `activity` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `dept_id` | `ucf-org-center.bd_adminorgsharetreeref` |
| `wbs` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `asset_asgmt_id` | `` |
| `usage_cost_center_id` | `finbd.bd_costcenterref` |
| `asset_id` | `` |
| `transfer_bill_dtl_id` | `` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |

## 继承接口 (4个, 8字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 24 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `maintanence_type` | `maintanence_type` | `maintanenceType` | maintanenceType |
| `remarks` | `remarks` | `remarks` | 备注 |
| `id` | `id` | `id` | ID |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `asset_id` | `asset_id` | `assetId` | 固定资产 |
| `transfer_bill_dtl_id` | `transfer_bill_dtl_id` | `transferbillDtlId` | 转移单子表id |
| `asset_asgmt_id` | `asset_asgmt_id` | `assignmentId` | 固定资产分配id |
| `usage_cost_center_id` | `usage_cost_center_id` | `costCenterId` | 使用成本中心 |
| `usage_profit_center_id` | `usage_profit_center_id` | `profitCenterId` | 使用利润中心 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `activity` | `activity` | `activity` | 活动 |
| `product_id` | `product_id` | `productId` | 产品 |
| `wbs` | `wbs` | `wbs` | WBS |
| `dept_id` | `dept_id` | `deptId` | 部门 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | pubts |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `be_asgmt_ratio` | `be_asgmt_ratio` | `beProportion` | 转移前比例 |
| `af_asgmt_ratio` | `af_asgmt_ratio` | `afProportion` | 转移后比例 |
| `change_asgmt_ratio` | `change_asgmt_ratio` | `deltaProportion` | 比例增减 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义特征id |
