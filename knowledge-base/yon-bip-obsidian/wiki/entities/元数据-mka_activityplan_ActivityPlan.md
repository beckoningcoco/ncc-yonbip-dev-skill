---
tags: [BIP, 元数据, 数据字典, mka.activityplan.ActivityPlan]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 活动计划 (`mka.activityplan.ActivityPlan`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mka_activityplan` | domain：`yycrm` | 应用：`MKA` | 业务对象ID：`483f22ef-48bf-4be8-8ec0-148c8e995635`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 活动计划 |
| 物理表 | `mka_activityplan` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `MKA` |
| 直连字段 | 59 个 |
| 子表 | 5 个 |
| 关联引用 | 25 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `activityPlanInfos` | `mka.activityplan.ActivityPlanInfo` | composition |
| `activityPlanCosts` | `mka.activityplan.ActivityPlanCost` | composition |
| `activityPlanFreeDef` | `mka.activityplan.ActivityPlanFreeDef` | composition |
| `activityPlanDisplays` | `mka.activityplan.ActivityPlanDisplay` | composition |
| `activityPlanMaterials` | `mka.activityplan.ActivityPlanMaterial` | composition |

## 关联引用 (25个)

| 字段名 | 引用类型 |
|--------|---------|
| `activity_bustype` | `transtype.bd_billtyperef` |
| `` | `` |
| `bizFlowId` | `` |
| `marketing_plan` | `yycrm.mka_marketingplanref` |
| `product_line` | `productcenter.pc_productlineref` |
| `activityPlanDefineCharacter` | `` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `tenant_id` | `` |
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `org` | `ucf-org-center.bd_salesorg_na` |
| `ytenant_id` | `` |
| `salearea` | `productcenter.aa_salearearef` |
| `dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `bustype` | `transtype.bd_billtyperef` |
| `partner_person` | `ucf-staff-center.bd_outerstaff_info` |
| `supply_customer` | `yycrm.cust_customerref` |
| `partner_dept` | `` |
| `partner` | `` |

## 继承接口 (8个, 24字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **数字营销数据权限** (`crmc.base.IDataPermissions`)
  - `dept` → `dept`
  - `org` → `org`
  - `ower` → `ower`
  - `salearea` → `salearea`
- **审批流信息** (`base.itf.IApprovalFlow`)
  - `` → ``
  - `` → ``
  - `` → ``
- **审批信息** (`base.itf.IApprovalInfo`)
  - `audit_date` → `audit_date`
  - `` → ``
  - `` → ``
  - `audit_time` → `audit_time`
- **流程接口** (`base.itf.IBusinessFlow`)
  - `bizFlowId` → `bizFlowId`
  - `isFlowCoreBill` → `isFlowCoreBill`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 59 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `modifier` | `modifier` | 修改人名称 |
| `code` | `code` | `code` | 计划单号 |
| `theme` | `theme` | `theme` | 活动主题 |
| `content` | `content` | `content` | 活动内容 |
| `` | `auditor` | `auditor` | 审批人 |
| `` | `creator` | `creator` | 制单人 |
| `version_no` | `version_no` | `versionNo` | 变更版本号 |

### 引用字段 (19个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `org` | `org` | `org` | 销售组织主键 |
| `bustype` | `bustype` | `bustype` | 计划类型主键 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `auditorId` | `auditorId` | 审批人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `activity_bustype` | `activity_bustype` | `activityBustype` | 活动类型主键 |
| `marketing_plan` | `marketing_plan` | `marketingPlan` | 营销方案主键 |
| `product_line` | `product_line` | `productLine` | 产品线主键 |
| `currency` | `currency` | `currency` | 币种ID |
| `ower` | `ower` | `ower` | 负责人主键 |
| `dept` | `dept` | `dept` | 部门主键 |
| `salearea` | `salearea` | `saleArea` | 销售区域主键 |
| `partner_person` | `partner_person` | `partnerPerson` | 伙伴人员主键 |
| `supply_customer` | `supply_customer` | `supplyCustomer` | 客户ID |
| `bizFlowId` | `bizFlowId` | `bizFlow` | 流程主键 |
| `partner` | `partner` | `cust` | 伙伴 |
| `partner_dept` | `partner_dept` | `partnerDept` | 伙伴部门 |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |

### 布尔字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isBudgetOver` | `isBudgetOver` | `isBudgetOver` | 预算超额 |
| `syn_material` | `syn_material` | `synMaterial` | 同步申领物料 |
| `merge_material` | `merge_material` | `mergeMaterial` | 合并申领物料 |
| `partner_execute` | `partner_execute` | `partnerExecute` | 伙伴执行 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |
| `isFlowCoreBill` | `isFlowCoreBill` | `isFlowCoreBill` | 是否核心单据 |

### 短整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `returncount` | `returncount` | 退回次数 |
| `` | `verifystate` | `verifystate` | 审批状态 |
| `openActivityPlan` | `openActivityPlan` | `openActivityPlan` | 期初计划 |
| `settle_state` | `settle_state` | `settleState` | 关闭状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `expenses_total` | `expenses_total` | `expensesTotal` | 费用投入 |
| `expect_produce` | `expect_produce` | `expectProduce` | 预计产出 |
| `expect_sales_rate` | `expect_sales_rate` | `expectSalesRate` | 预计费率 |
| `assumeAmountTotal` | `assumeAmountTotal` | `assumeAmountTotal` | 承担金额 |
| `settleAmount` | `settleAmount` | `settleAmount` | 应结算金额 |

### timestamp (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `start_date` | `start_date` | `startDate` | 开始日期 |
| `end_date` | `end_date` | `endDate` | 结束日期 |
| `materialapply_date` | `materialapply_date` | `materialApplyDate` | 物料申领截止日期 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `create_time` | `create_time` | `createTime` | 制单时间 |
| `settle_time` | `settle_time` | `settleTime` | 关闭时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `activityPlanDefineCharacter` | `activityPlanDefineCharacter` | `activityPlanDefineCharacter` | 活动计划自定义特征组 |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `activityPlanCosts` | 活动计划费用 |
| `` | `` | `activityPlanDisplays` | 活动计划陈列 |
| `` | `` | `activityPlanFreeDef` | 活动计划主表自由自定义项扩展 |
| `` | `` | `activityPlanInfos` | 活动计划明细 |
| `` | `` | `activityPlanMaterials` | 活动计划物料 |
