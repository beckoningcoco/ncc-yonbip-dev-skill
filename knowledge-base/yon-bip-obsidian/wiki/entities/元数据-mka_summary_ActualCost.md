---
tags: [BIP, 元数据, 数据字典, mka.summary.ActualCost]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 活动小结活动费用 (`mka.summary.ActualCost`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mka_actual_cost` | domain：`yycrm` | 应用：`MKA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 活动小结活动费用 |
| 物理表 | `mka_actual_cost` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `MKA` |
| 直连字段 | 49 个 |
| 子表 | 2 个 |
| 关联引用 | 24 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `actualCostInfoProperty` | `mka.summary.ActualCostInfoProperty` | composition |
| `bodyDef` | `mka.summary.ActualCostDef` | composition |

## 关联引用 (24个)

| 字段名 | 引用类型 |
|--------|---------|
| `dimension_region` | `productcenter.aa_salearearef` |
| `materialClass` | `productcenter.pc_managementclassref` |
| `product` | `productcenter.pc_productquerytreeref` |
| `productClass` | `productcenter.pc_presentationclassref` |
| `ytenant_id` | `` |
| `` | `` |
| `dimension_expense_item` | `finbd.bd_expenseitemref` |
| `productDefineCharacter` | `` |
| `assumeOrg` | `ucf-org-center.bd_salesorg_na` |
| `dimension_customer` | `yycrm.cust_customerref` |
| `productLine` | `productcenter.pc_productlineref` |
| `activityId` | `` |
| `unit` | `productcenter.pc_unitref` |
| `actualCostDefineCharacter` | `` |
| `dimension_expense_itemType` | `finbd.bd_expenseitemtyperef` |
| `activityCostId` | `` |
| `dimension_terminal_chain` | `yxybase.aa_chainsystemref` |
| `dimension_terminal` | `yxybase.aa_storeterminal` |
| `summaryId` | `` |
| `asumeDept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `tenant_id` | `` |

## 继承接口 (3个, 10字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 49 个直连字段

### 文本字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `deductionReason` | `deductionReason` | `deductionReason` | 扣款原因 |
| `expenseApplyId` | `expenseApplyId` | `expenseApplyId` | 来源费用申请 |
| `marketPlanId` | `marketPlanId` | `marketPlanId` | 营销方案id |
| `marketCostId` | `marketCostId` | `marketCostId` | 营销方案费用id |

### 引用字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `assumeOrg` | `assumeOrg` | `assumeOrg` | 承担组织 |
| `asumeDept` | `asumeDept` | `asumeDept` | 承担部门 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `dimension_customer` | `dimension_customer` | `dimension_customer` | 客户 |
| `dimension_region` | `dimension_region` | `dimension_region` | 区域 |
| `dimension_terminal` | `dimension_terminal` | `dimension_terminal` | 终端 |
| `materialClass` | `materialClass` | `materialClass` | 物料分类ID |
| `dimension_terminal_chain` | `dimension_terminal_chain` | `dimension_terminal_chain` | 所属系统 |
| `productLine` | `productLine` | `productLine` | 产品线 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `summaryId` | `summaryId` | `summaryId` | 活动小结ID |
| `dimension_expense_item` | `dimension_expense_item` | `dimension_expense_item` | 费用项ID |
| `dimension_expense_itemType` | `dimension_expense_itemType` | `dimension_expense_itemType` | 费用类型ID |
| `product` | `product` | `product` | 商品ID |
| `productClass` | `productClass` | `productClass` | 商品分类ID |
| `unit` | `unit` | `unit` | 计量单位ID |
| `activityId` | `activityId` | `activityId` | 来源营销活动 |
| `activityCostId` | `activityCostId` | `activityCostId` | 来源营销活动费用行id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `payMode` | `payMode` | `payMode` | 兑付方式 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 活动费用ID |

### 数值字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `assumeRate` | `assumeRate` | `assumeRate` | 承担比例 |
| `assumeAmount` | `assumeAmount` | `assumeAmount` | 承担金额 |
| `unitInvest` | `unitInvest` | `unitInvest` | 单位投入 |
| `actualCount` | `actualCount` | `actualCount` | 实际数量 |
| `actualCost` | `actualCost` | `actualCost` | 实际费用 |
| `actualSale` | `actualSale` | `actualSale` | 实际销售额 |
| `actualRate` | `actualRate` | `actualRate` | 实际费率 |
| `deductionAmount` | `deductionAmount` | `deductionAmount` | 扣款金额 |
| `lineNo` | `lineNo` | `lineNo` | 来源费用行 |
| `settleAmount` | `settleAmount` | `settleAmount` | 已结算金额 |
| `marketCostLineNo` | `marketCostLineNo` | `marketCostLineNo` | 营销方案费用行号 |
| `activityCostLineNo` | `activityCostLineNo` | `activityCostLineNo` | 来源营销活动费用行行号 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `actualCostDefineCharacter` | `actualCostDefineCharacter` | `actualCostDefineCharacter` | 实际费用自定义项特征属性组 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 活动费用时间戳 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productDefineCharacter` | `productDefineCharacter` | `productDefineCharacter` | 物料自由项特征组 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `actualCostInfoProperty` | 实际费用子表填报明细 |
| `` | `` | `bodyDef` | 实际费用自定义项 |
