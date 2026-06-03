---
tags: [BIP, 元数据, 数据字典, EIA.EIA.DepreciationBillVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 计提跌价准备 (`EIA.EIA.DepreciationBillVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ia_depreciation_bill` | domain：`yonbip-fi-eia` | 应用：`EIA` | 业务对象ID：`9b23ae50-f691-42a5-853b-c53019d58caf`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计提跌价准备 |
| 物理表 | `ia_depreciation_bill` |
| 数据库 schema | `yonbip-fi-eia` |
| 所属应用 | `EIA` |
| 直连字段 | 42 个 |
| 子表 | 6 个 |
| 关联引用 | 24 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `DepreciationBillVO_stockOrgIdList` | `EIA.EIA.DepreciationBillVO_stockOrgId` | composition |
| `DepreciationBillBodyVOList` | `EIA.EIA.DepreciationBillBodyVO` | composition |
| `DepreciationBillVO_materialClassList` | `EIA.EIA.DepreciationBillVO_materialClass` | composition |
| `DepreciationBillVO_costClassList` | `EIA.EIA.DepreciationBillVO_costClass` | composition |
| `DepreciationBillVO_warehouseIdList` | `EIA.EIA.DepreciationBillVO_warehouseId` | composition |
| `DepreciationBillVO_materialIdList` | `EIA.EIA.DepreciationBillVO_materialId` | composition |

## 关联引用 (24个)

| 字段名 | 引用类型 |
|--------|---------|
| `accpurpose_id` | `finbd.bd_accpurposeref` |
| `` | `` |
| `period_id` | `finbd.bd_period` |
| `material_class` | `productcenter.pc_managementclassref` |
| `creator` | `bip-usercenter.bip_user_ref` |
| `accentity_id` | `finbd.bd_allaccbodyref` |
| `bill_type` | `transtype.bd_billtypetreeref` |
| `modifier` | `bip-usercenter.bip_user_ref` |
| `auditor` | `bip-usercenter.bip_user_ref` |
| `free_ch_id` | `` |
| `ytenant_id` | `` |
| `material_id` | `productcenter.baseProductRef` |
| `cost_class` | `productcenter.pc_costclassref` |
| `accbook_id` | `fiepub.fiepub_accountbookref` |
| `accbooktype` | `` |
| `depreciation_rule_id` | `yonbip-fi-eia.RefTable_fdbb785d33` |
| `warehouse_id` | `productcenter.aa_warehouse` |
| `stock_org_id` | `ucf-org-center.bd_inventoryorg` |
| `currency_id` | `ucfbasedoc.bd_currencytenantref` |

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

> 共 42 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `depreciation_rate_id` | `depreciation_rate_id` | `depreciationRateId` | 计提比率ID |
| `auditnote` | `auditnote` | `auditNote` | 审批批语 |
| `procinst_id` | `procinst_id` | `procinstId` | 流程实例ID |
| `id` | `id` | `id` | 主键 |
| `code` | `code` | `code` | 编码 |
| `description` | `description` | `description` | 备注 |
| `period_code` | `period_code` | `periodCode` | 会计期间编码 |
| `sequenceno` | `sequenceno` | `sequenceno` | 顺序号 |

### 引用字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `auditor` | `auditor` | `auditor` | 审批人 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenantId` | 租户id |
| `accpurpose_id` | `accpurpose_id` | `accpurposeId` | 核算目的 |
| `depreciation_rule_id` | `depreciation_rule_id` | `depreciationRuleId` | 计提方案 |
| `currency_id` | `currency_id` | `currencyId` | 币种 |
| `period_id` | `period_id` | `periodId` | 会计期间 |
| `accentity_id` | `accentity_id` | `accentityId` | 会计主体 |
| `bill_type` | `bill_type` | `billType` | 单据类型 |
| `accbook_id` | `accbook_id` | `accbookId` | 账薄ID |
| `accbooktype` | `accbooktype` | `accbooktype` | 账簿类型 |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bill_date` | `bill_date` | `billDate` | 单据日期 |

### 日期时间 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_time` | `audit_time` | `auditTime` | 审批日期 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `depreciation_time` | `depreciation_time` | `depreciationTime` | 计提时间 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `verifystate` | `verifystate` | `verifyState` | 单据状态 |
| `bill_status` | `bill_status` | `billStatus` | 订单状态 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `status` | `status` | `status` | 单据状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dr` | `dr` | `dr` | 逻辑删除 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `free_ch_id` | `free_ch_id` | `freeChId` | 计提跌价准备自定义项特征 |

### other (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `DepreciationBillBodyVOList` | 计提跌价准备子表 |
| `` | `` | `DepreciationBillVO_stockOrgIdList` | 库存组织多选子表 |
| `` | `` | `DepreciationBillVO_warehouseIdList` | 仓库多选子表 |
| `` | `` | `DepreciationBillVO_costClassList` | 成本分类多选子表 |
| `` | `` | `DepreciationBillVO_materialIdList` | 物料多选子表 |
| `` | `` | `DepreciationBillVO_materialClassList` | 物料分类多选子表 |

### quoteList (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `material_class` | `material_class` | `materialClass` | 物料大类 |
| `material_id` | `material_id` | `materialId` | 物料 |
| `cost_class` | `cost_class` | `costClass` | 成本分类 |
| `warehouse_id` | `warehouse_id` | `warehouseId` | 仓库ID |
| `stock_org_id` | `stock_org_id` | `stockOrgId` | 库存组织 |
