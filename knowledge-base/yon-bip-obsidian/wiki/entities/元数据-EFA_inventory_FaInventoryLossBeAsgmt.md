---
tags: [BIP, 元数据, 数据字典, EFA.inventory.FaInventoryLossBeAsgmt]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 固定资产盘亏变动前分配信息 (`EFA.inventory.FaInventoryLossBeAsgmt`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`fa_bill_inventory_loss_be_asgmt` | domain：`yonbip-fi-efa` | 应用：`EFA` | 业务对象ID：`9a470a14-e6ed-41b3-9cdf-ce49ab5d79e3`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 固定资产盘亏变动前分配信息 |
| 物理表 | `fa_bill_inventory_loss_be_asgmt` |
| domain/服务域 | `yonbip-fi-efa` |
| schema | `fiefa` |
| 所属应用 | `EFA` |
| 直连字段 | 34 个 |
| 子表 | 0 个 |
| 关联引用 | 14 个 |

## 关联引用 (14个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `bip-usercenter.bip_user_ref` |
| `product_id` | `productcenter.pc_nomalproductref` |
| `activity` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `wbs` | `` |
| `fa_inventory_loss_detail_id` | `` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `usage_dept_id` | `ucf-org-center.org_unit_tree_ref` |
| `accentity` | `finbd.bd_allaccbodyref` |
| `usage_cost_center_id` | `finbd.bd_costcenterref` |
| `usage_profit_center_id` | `finbd.bd_allaccbodyref_inner` |
| `asset_id` | `yonbip-fi-efa.fa_assetsquery_basic_ref` |
| `project_id` | `ucfbasedoc.bd_projectcardref` |

## 继承接口 (6个, 21字段)

- **逻辑删除** (`iuap.busiObj.LogicDelete`)
  - `dr` → `dr`
- **统一租户接口** (`iuap.busiObj.IYTenant`)
  - `ytenant_id` → `ytenant_id`
- **业务流多来源** (`iuap.busiObj.BusinessFlowSourcesItf`)
  - `firstbusiobj` → `firstbusiobj`
  - `firstchild_id` → `firstchild_id`
  - `firstcode` → `firstcode`
  - `first_id` → `first_id`
  - `sourcegrand_id` → `sourcegrand_id`
- **业务流基础** (`iuap.busiObj.BusinessFlowItf`)
  - `bizflow_id` → `bizflow_id`
  - `bizflowinstance_id` → `bizflowinstance_id`
  - `bizflow_makebillcode` → `bizflow_makebillcode`
  - `bizflowname` → `bizflowname`
  - `sourcebusiobj` → `sourcebusiobj`
  - `sourcechild_id` → `sourcechild_id`
  - `sourcecode` → `sourcecode`
  - `source_id` → `source_id`
- **项目结构属性** (`BGDM.wbs.projectStructureProperties`)
  - `activity` → `activity`
  - `wbs` → `wbs`
- **审计信息** (`iuap.busiObj.IAuditInfo`)
  - `create_time` → `create_time`
  - `creator` → `creator`
  - `modifier` → `modifier`
  - `modify_time` → `modify_time`

## 字段列表（按类型分组）

> 共 34 个直连字段

### 文本字段 (14个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bizflowinstance_id` | `bizflowinstance_id` | `bizFlowInstanceId` | 业务流实例id |
| `bizflow_makebillcode` | `bizflow_makebillcode` | `bizFlowMakeBillCode` | 单据转换规则编码 |
| `bizflow_id` | `bizflow_id` | `bizflowId` | 业务流id |
| `bizflowname` | `bizflowname` | `bizflowName` | 流程名称 |
| `firstbusiobj` | `firstbusiobj` | `firstBusiObj` | 来源业务对象 |
| `firstchild_id` | `firstchild_id` | `firstChildId` | 来源单据子表id |
| `firstcode` | `firstcode` | `firstCode` | 来源单据号 |
| `first_id` | `first_id` | `firstId` | 来源单据主表id |
| `id` | `id` | `id` | 主键 |
| `sourcebusiobj` | `sourcebusiobj` | `sourceBusiObj` | 上游业务对象 |
| `sourcechild_id` | `sourcechild_id` | `sourceChildId` | 上游单据子表id |
| `sourcecode` | `sourcecode` | `sourceCode` | 上游单据号 |
| `sourcegrand_id` | `sourcegrand_id` | `sourceGrandId` | 来源孙表id |
| `source_id` | `source_id` | `sourceId` | 上游单据主表id |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `accentity` | `accentity` | `accentity` | 会计主体ID |
| `activity` | `activity` | `activity` | 活动 |
| `asset_id` | `asset_id` | `assetId` | 固定资产 |
| `creator` | `creator` | `creator` | 创建人 |
| `fa_inventory_loss_detail_id` | `fa_inventory_loss_detail_id` | `faInventoryLossDetailId` | 固定资产盘亏明细 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `product_id` | `product_id` | `productId` | 产品 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `usage_cost_center_id` | `usage_cost_center_id` | `usageCostCenterId` | 使用成本中心 |
| `usage_dept_id` | `usage_dept_id` | `usageDeptId` | 使用部门 |
| `usage_profit_center_id` | `usage_profit_center_id` | `usageProfitCenterId` | 使用利润中心 |
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
| `asgmt_ratio` | `asgmt_ratio` | `asgmtRatio` | 分配比例 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 自定义项特征id |

### bigText (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `remarks` | `remarks` | `remarks` | 备注 |
