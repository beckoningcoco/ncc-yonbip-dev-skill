---
tags: [BIP, 元数据, 数据字典, EFA.inventory.FaInventory]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产盘点 (`EFA.inventory.FaInventory`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_inventory` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`ed522121-30a8-437e-ad5d-815180f16dae`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产盘点 |
| 物理表 | `fa_bill_inventory` |
| 数据库 schema | `yonbip-fi-efa` |
| 所属应用 | `EFA` |
| 直连字段 | 43 个 |
| 子表 | 1 个 |
| 关联引用 | 12 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `FaInventoryDetailList` | `EFA.inventory.FaInventoryDetail` | composition |

## 关联引用 (12个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `ori_bill_trade_type_id` | `ucfbasedoc.bd_billtyperef` |
| `mgmt_dept_id_combine` | `ucf-org-center.org_unit_tree_ref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `` | `` |
| `asset_category_id_combine` | `yonbip-fi-efa.fa_categorymainref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `usage_dept_id_combine` | `ucf-org-center.org_unit_tree_ref` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `usage_state_id_combine` | `yonbip-fi-efa.fa_usagestateref` |
| `bill_type_id` | `ucfbasedoc.bd_billtypetreeref` |

## 继承接口 (5个, 12字段)

- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`
- **审批流接口** (`iuap.busiObj.ApprovalFlowItf`)
  - `auditnote` → `auditnote`
  - `auditor` → `auditor`
  - `audit_time` → `audit_time`
  - `procinst_id` → `procinst_id`
  - `verifystate` → `verifystate`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **编码** (`iuap.busiObj.Code`)
  - `code` → `code`
- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`

## 字段列表（按类型分组）

> 共 43 个直连字段

### 文本字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_date` | `bill_date` | `billDate` | 单据日期 |
| `bill_trade_type_id` | `bill_trade_type_id` | `billTradeTypeId` | 交易类型 |
| `inventory_end_date` | `inventory_end_date` | `inventoryEndDate` | 盘点结束日期 |
| `inventory_method` | `inventory_method` | `inventoryMethod` | 盘点方式  |
| `inventory_range` | `inventory_range` | `inventoryRange` | 盘点范围 |
| `ori_app_id` | `ori_app_id` | `oriAppId` | 源头应用ID |
| `ori_bill_id` | `ori_bill_id` | `oriBillId` | 源头单据ID |
| `ori_bill_no` | `ori_bill_no` | `oriBillNo` | 源头单据号 |
| `ori_bill_type_id` | `ori_bill_type_id` | `oriBillTypeId` | 源头单据类型 |
| `plan_inventory_date` | `plan_inventory_date` | `planInventoryDate` | 计划盘点日期 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `id` | `id` | `id` | 主键 |
| `code` | `code` | `code` | 编码 |

### 引用字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `asset_category_id_combine` | `asset_category_id_combine` | `assetCategoryIdCombine` | 固定资产类别 |
| `bill_type_id` | `bill_type_id` | `billTypeId` | 单据类型 |
| `creator` | `creator` | `creator` | 创建人 |
| `mgmt_dept_id_combine` | `mgmt_dept_id_combine` | `mgmtDeptIdCombine` | 管理部门 |
| `ori_bill_trade_type_id` | `ori_bill_trade_type_id` | `oriBillTradeTypeId` | 源头交易类型 |
| `usage_dept_id_combine` | `usage_dept_id_combine` | `usageDeptIdCombine` | 使用部门 |
| `usage_state_id_combine` | `usage_state_id_combine` | `usageStateIdCombine` | 使用状态 |
| `auditor` | `auditor` | `auditor` | 审批人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |

### 整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `already_inventory_count` | `already_inventory_count` | `alreadyInventoryCount` | 已盘点数 |
| `mismatch_count` | `mismatch_count` | `disagreeCount` | 不符 |
| `inventory_loss_count` | `inventory_loss_count` | `inventoryLossCount` | 盘亏 |
| `inventory_profit_count` | `inventory_profit_count` | `inventoryProfitCount` | 盘盈 |
| `inventory_total_count` | `inventory_total_count` | `inventoryTotalCount` | 盘点总数 |
| `match_count` | `match_count` | `matchCount` | 相符 |
| `un_inventory_count` | `un_inventory_count` | `unInventoryCount` | 未盘点数 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `inventory_loss_rate` | `inventory_loss_rate` | `inventoryLossRate` | 盘亏率 |
| `inventory_profit_rate` | `inventory_profit_rate` | `inventoryProfitRate` | 盘盈率 |
| `inventory_rate` | `inventory_rate` | `inventoryRate` | 盘点率 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `FaInventoryDetailList` | 固定资产盘点详情 |
