---
tags: [BIP, 元数据, 数据字典, fa.faimpairmentbill.ImpairmentAssignment]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 减值单分配信息 (`fa.faimpairmentbill.ImpairmentAssignment`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_impairment_dtl_asgmt` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`f72ee487-da6b-4411-b344-7739d770b213`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 减值单分配信息 |
| 物理表 | `fa_bill_impairment_dtl_asgmt` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 23 个 |
| 子表 | 0 个 |
| 关联引用 | 13 个 |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `usage_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `product_id` | `productcenter.pc_nomalproductref` |
| `activity` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `impairment_dtl_id` | `` |
| `wbs` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `accsubject_id` | `fiepub.fiepub_accsubjectref` |
| `usage_cost_center_id` | `finbd.bd_costcenterref` |
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

> 共 23 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity_id` | `accentity_id` | `accentity` | 会计主体 |
| `remarks` | `remarks` | `remarks` | 备注 |
| `id` | `id` | `id` | id |

### 引用字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `impairment_dtl_id` | `impairment_dtl_id` | `detailId` | 减值单表体 |
| `accsubject_id` | `accsubject_id` | `subjectId` | 减值科目 |
| `dept_id` | `dept_id` | `deptId` | 部门 |
| `usage_cost_center_id` | `usage_cost_center_id` | `costCenterId` | 使用成本中心 |
| `usage_profit_center_id` | `usage_profit_center_id` | `profitCenterId` | 使用利润中心 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `activity` | `activity` | `activity` | 活动 |
| `product_id` | `product_id` | `productId` | 产品 |
| `wbs` | `wbs` | `wbs` | WBS |
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
| `assign_amount` | `assign_amount` | `assignAmount` | 本币分摊金额 |
| `org_assign_amount` | `org_assign_amount` | `orgAssignAmount` | 组织币分摊金额 |
| `asgmt_ratio` | `asgmt_ratio` | `proportion` | 分摊比例 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义项 |
