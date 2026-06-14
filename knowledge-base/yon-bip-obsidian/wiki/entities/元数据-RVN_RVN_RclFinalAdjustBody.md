---
tags: [BIP, 元数据, 数据字典, RVN.RVN.RclFinalAdjustBody]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 期末调整子表 (`RVN.RVN.RclFinalAdjustBody`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`rcl_finaladjust_b` | domain：`yonbip-fi-ercl` | 应用：`RVN` | 业务对象ID：`2d24c180-52f9-46ef-bc38-d854e7b23760`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 期末调整子表 |
| 物理表 | `rcl_finaladjust_b` |
| domain/服务域 | `yonbip-fi-ercl` |
| schema | `fiercl` |
| 所属应用 | `RVN` |
| 直连字段 | 30 个 |
| 子表 | 0 个 |
| 关联引用 | 14 个 |

## 关联引用 (14个)

| 字段名 | 引用类型 |
|--------|---------|
| `ori_currency` | `ucfbasedoc.bd_currencytenantref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `activity` | `` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `wbs` | `` |
| `src_trans_type` | `ucfbasedoc.bd_billtyperef` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `material_id` | `productcenter.pc_nomalproductref` |
| `src_bill_type` | `ucfbasedoc.bd_billtypetreeref` |
| `src_bill_system` | `fiepub.fiepub_sourceapplicationref` |
| `revenue_contract_bill_row_id` | `yonbip-fi-ercl.RefTable_c75ebbb386` |
| `rcl_final_adjust_header_id` | `` |
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

> 共 30 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `src_bill_id` | `src_bill_id` | `srcBillId` | 来源单据id |
| `src_bill_no` | `src_bill_no` | `srcBillNo` | 来源单据号 |
| `src_bill_row_id` | `src_bill_row_id` | `srcBillRowId` | 来源单据行id |

### 引用字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `activity` | `activity` | `activity` | 活动 |
| `creator` | `creator` | `creator` | 创建人 |
| `material_id` | `material_id` | `materialId` | 物料 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ori_currency` | `ori_currency` | `oriCurrency` | 币种 |
| `project_id` | `project_id` | `projectId` | 项目 |
| `rcl_final_adjust_header_id` | `rcl_final_adjust_header_id` | `rclFinalAdjustHeaderId` | 期末调整主表 |
| `revenue_contract_bill_row_id` | `revenue_contract_bill_row_id` | `revenueContractBillRowId` | 履约义务行Id |
| `src_bill_system` | `src_bill_system` | `srcBillSystem` | 来源应用 |
| `src_bill_type` | `src_bill_type` | `srcBillType` | 来源单据类型 |
| `src_trans_type` | `src_trans_type` | `srcTransType` | 来源交易类型 |
| `wbs` | `wbs` | `wbs` | WBS |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |

### 日期时间 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `control_condition` | `control_condition` | `controlCondition` | 控制条件 |
| `differ_calculation_item` | `differ_calculation_item` | `differCalculationItem` | 差异计算项 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `localmny` | `localmny` | `localmny` | 本币含税金额 |
| `localmny_notax` | `localmny_notax` | `localmnyNotax` | 本币无税金额 |
| `localmny_tax` | `localmny_tax` | `localmnyTax` | 本币税额 |
| `orimny` | `orimny` | `orimny` | 含税金额 |
| `orimny_notax` | `orimny_notax` | `orimnyNotax` | 无税金额 |
| `orimny_tax` | `orimny_tax` | `orimnyTax` | 税额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 特征 |
