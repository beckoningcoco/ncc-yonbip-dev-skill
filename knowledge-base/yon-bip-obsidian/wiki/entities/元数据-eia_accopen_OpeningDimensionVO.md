---
tags: [BIP, 元数据, 数据字典, eia.accopen.OpeningDimensionVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 期初对账维度模型 (`eia.accopen.OpeningDimensionVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_opening_dimension` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`1bf43a7f-c0f3-46da-8478-791239350fad`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 期初对账维度模型 |
| 物理表 | `ia_opening_dimension` |
| domain/服务域 | `yonbip-fi-eia` |
| schema | `fieia` |
| 所属应用 | `EIA` |
| 直连字段 | 39 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `ytenant_id` | `` |
| `accentity_id` | `finbd.bd_allaccbodyref_inner` |

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

> 共 39 个直连字段

### 文本字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `batch_no` | `batch_no` | `batchNo` | 批次 |
| `busi_bill_code` | `busi_bill_code` | `busiBillCode` | 业务单据编码 |
| `busi_dept_id` | `busi_dept_id` | `busiDept` | 部门 |
| `busi_man_id` | `busi_man_id` | `busiManId` | 业务员 |
| `busi_wbs_id` | `busi_wbs_id` | `busiWbs` | 业务wbs |
| `code` | `code` | `code` | 编码 |
| `grouping_dimension` | `grouping_dimension` | `groupingDimension` | 分组维度 |
| `id` | `id` | `id` | 主键 |
| `inventory_obj_id` | `inventory_obj_id` | `inventoryObjId` | 存货对象 |
| `mto_id` | `mto_id` | `mtoId` | mto订单ID |
| `mto_no` | `mto_no` | `mtoNo` | mto订单号 |
| `mto_row_id` | `mto_row_id` | `mtoRowId` | mto行ID |
| `opp_profit_center_id` | `opp_profit_center_id` | `oppProfitCenter` | 对方利润中心 |
| `profit_center_id` | `profit_center_id` | `profitCenter` | 利润中心 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `status` | `status` | `status` | 对账状态 |
| `stock_org_id` | `stock_org_id` | `stockOrg` | 库存组织 |
| `storekeeper_id` | `storekeeper_id` | `storekeeperId` | 库管员 |
| `wbs_id` | `wbs_id` | `wbs` | wbs |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accbook_id` | `accbook_id` | `accbook` | 账簿 |
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `accpurpose_id` | `accpurpose_id` | `accpurpose` | 核算目的 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bln_gift` | `bln_gift` | `blnGift` | 是否赠品 |
| `bln_waste` | `bln_waste` | `blnWaste` | 是否废品 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 长整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `customer_id` | `customer_id` | `customer` | 客户 |
| `material_id` | `material_id` | `materialId` | 物料 |
| `product_id` | `product_id` | `productId` | 产品ID |
| `warehouse_id` | `warehouse_id` | `warehouse` | 仓库 |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `diff_num` | `diff_num` | `diffNum` | 差异数量 |
| `mto_row_no` | `mto_row_no` | `mtoRowNo` | mto订单行号 |
| `num` | `num` | `num` | 数量 |
| `stock_num` | `stock_num` | `stockNum` | 库存数量 |
