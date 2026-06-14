---
tags: [BIP, 元数据, 数据字典, fa.unplandepr.AssetUnplanDeprAssign]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计划外折旧分配行 (`fa.unplandepr.AssetUnplanDeprAssign`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_depr_unplan_assign` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`c58a032e-abe9-4cb9-a88c-d74ab9912514`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划外折旧分配行 |
| 物理表 | `fa_bill_depr_unplan_assign` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 25 个 |
| 子表 | 0 个 |
| 关联引用 | 16 个 |

## 关联引用 (16个)

| 字段名 | 引用类型 |
|--------|---------|
| `usage_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `org_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `product_id` | `productcenter.pc_nomalproductref` |
| `activity` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `wbs` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `accsubject_id` | `fiepub.fiepub_accsubjectref` |
| `usage_cost_center_id` | `finbd.bd_costcenterref` |
| `unplan_depr_bill_id` | `` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |
| `accbook_currtype_id` | `ucfbasedoc.bd_currencytenantref` |
| `unplan_depr_dtl_id` | `` |

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

> 共 25 个直连字段

### 文本字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |

### 引用字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `unplan_depr_bill_id` | `unplan_depr_bill_id` | `billId` | 主表 |
| `unplan_depr_dtl_id` | `unplan_depr_dtl_id` | `billDtlId` | 单据明细 |
| `usage_cost_center_id` | `usage_cost_center_id` | `costCenterId` | 使用成本中心 |
| `usage_profit_center_id` | `usage_profit_center_id` | `profitCenterId` | 使用利润中心 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `activity` | `activity` | `activity` | 活动 |
| `product_id` | `product_id` | `productId` | 产品 |
| `wbs` | `wbs` | `wbs` | WBS |
| `dept_id` | `dept_id` | `deptId` | 部门 |
| `accbook_currtype_id` | `accbook_currtype_id` | `accbookCurrtypeId` | 本币币种 |
| `accsubject_id` | `accsubject_id` | `subjectId` | 折旧费用科目 |
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

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `asgmt_ratio` | `asgmt_ratio` | `proportion` | 比例 |
| `unplan_depr_amount` | `unplan_depr_amount` | `curPeriodDeprAmount` | 本币计划外折旧 |
| `org_unplan_depr_amount` | `org_unplan_depr_amount` | `orgUnplanDeprAmount` | 组织币计划外折旧 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义项 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `remarks` | `remarks` | `remarks` | 备注 |
