---
tags: [BIP, 元数据, 数据字典, mka.activity.Activity]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 营销活动 (`mka.activity.Activity`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mka_activity` | domain：`yycrm` | 应用：`MKA` | 业务对象ID：`46d7f2a7-b700-4896-bb6b-2276e763a6eb`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 营销活动 |
| 物理表 | `mka_activity` |
| 数据库 schema | `yycrm` |
| 所属应用 | `MKA` |
| 直连字段 | 95 个 |
| 子表 | 5 个 |
| 关联引用 | 35 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `activityInfs` | `mka.activity.ActivityInfo` | composition |
| `headDef` | `mka.activity.ActivityDef` | composition |
| `activityDisplays` | `mka.activity.ActivityDisplay` | composition |
| `activityMaterialList` | `mka.activity.ActivityMaterial` | composition |
| `activityParticipantList` | `mka.activity.ActivityParticipant` | composition |

## 关联引用 (35个)

| 字段名 | 引用类型 |
|--------|---------|
| `cCountry` | `ucfbasedoc.bd_countryref` |
| `` | `` |
| `activity_plan_info` | `` |
| `bizFlowId` | `` |
| `defaultDimension_terminal_chain` | `yxybase.aa_chainsystemref` |
| `activity_plan` | `yycrm.mka_activityplanref` |
| `defaultAsumeDept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `marketing_plan` | `yycrm.mka_marketingplanref` |
| `product_line` | `productcenter.pc_productlineref` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `accounting_period` | `finbd.bd_period` |
| `defaultAssumeOrg` | `ucf-org-center.bd_salesorg_na` |
| `close_reason` | `yycrm.crmc_custdocref` |
| `activityDefineCharacter` | `` |
| `tenant_id` | `` |
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `org` | `ucf-org-center.bd_salesorg_na` |
| `ytenant_id` | `` |
| `salearea` | `productcenter.aa_salearearef` |
| `terminal` | `yxybase.aa_storeterminal` |
| `dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `bustype` | `transtype.bd_billtyperef` |
| `defaultDimension_region` | `productcenter.aa_salearearef` |
| `partner_person` | `ucf-staff-center.bd_outerstaff_info` |
| `supply_customer` | `yycrm.cust_customerref` |
| `partner_dept` | `` |
| `iCustID` | `yycrm.cust_customerref` |
| `customer` | `yycrm.cust_customerref` |

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

> 共 95 个直连字段

### 文本字段 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `version_no` | `version_no` | `versionNo` | 版本号 |
| `close_statement` | `close_statement` | `closeStatement` | 结案说明 |
| `pc_url` | `pc_url` | `pcUrl` | pc端链接地址 |
| `coupon_standard` | `coupon_standard` | `couponStandard` | 卡券标准 |
| `mobile_url` | `mobile_url` | `mobileUrl` | app端链接地址 |
| `reward_coupon` | `reward_coupon` | `rewardCoupon` | 奖励卡券 |
| `path` | `path` | `path` | 营销活动路径 |
| `code` | `code` | `code` | 活动编号 |
| `theme` | `theme` | `theme` | 活动主题 |
| `cRegionCode` | `cRegionCode` | `regionCode` | 行政区划编码 |
| `address` | `address` | `address` | 活动地点 |
| `content` | `content` | `content` | 活动内容 |
| `` | `auditor` | `auditor` | 审批人 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (29个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `partner_person` | `partner_person` | `partnerPerson` | 伙伴人员 |
| `close_reason` | `close_reason` | `closeReason` | 结案原因 |
| `activity_plan_info` | `activity_plan_info` | `activityPlanInfo` | 计划明细主键 |
| `activity_plan` | `activity_plan` | `activityPlan` | 活动计划主键 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `iCustID` | `iCustID` | `cust` | 客户ID |
| `defaultAssumeOrg` | `defaultAssumeOrg` | `defaultAssumeOrg` | 默认承担组织 |
| `defaultAsumeDept` | `defaultAsumeDept` | `defaultAsumeDept` | 默认承担部门 |
| `defaultDimension_region` | `defaultDimension_region` | `defaultDimension_region` | 默认区域 |
| `defaultDimension_terminal_chain` | `defaultDimension_terminal_chain` | `defaultDimension_terminal_chain` | 默认所属系统 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `org` | `org` | `org` | 销售组织ID |
| `marketing_plan` | `marketing_plan` | `marketingPlan` | 营销方案ID |
| `bustype` | `bustype` | `bustype` | 交易类型ID |
| `terminal` | `terminal` | `terminal` | 活动终端ID |
| `customer` | `customer` | `customer` | 活动客户ID |
| `product_line` | `product_line` | `productLine` | 产品线ID |
| `supply_customer` | `supply_customer` | `supplyCustomer` | 供货客户ID |
| `cCountry` | `cCountry` | `country` | 国家id |
| `` | `creatorId` | `creatorId` | 创建人ID |
| `currency` | `currency` | `currency` | 币种ID |
| `` | `modifierId` | `modifierId` | 修改人ID |
| `ower` | `ower` | `ower` | 负责人ID |
| `dept` | `dept` | `dept` | 部门ID |
| `salearea` | `salearea` | `saleArea` | 销售区域ID |
| `bizFlowId` | `bizFlowId` | `bizFlow` | 流程Id |
| `` | `auditorId` | `auditorId` | 审批人ID |
| `accounting_period` | `accounting_period` | `accountingPeriod` | 费用期间ID |
| `partner_dept` | `partner_dept` | `partnerDept` | 伙伴部门 |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `syn_claim_material` | `syn_claim_material` | `synClaimMaterial` | 同步申领物料 |
| `isBudgetOver` | `isBudgetOver` | `isBudgetOver` | 预算超额 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |
| `partner_execute` | `partner_execute` | `partnerExecute` | 伙伴执行 |
| `isFlowCoreBill` | `isFlowCoreBill` | `isFlowCoreBill` | 是否核心单据 |
| `isAutoGenerate` | `isAutoGenerate` | `isAutoGenerate` | 活动是否自动生成 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `close_state` | `close_state` | `closeState` | 结案状态 |
| `settle_state` | `settle_state` | `settleState` | 关闭状态 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `people_num` | `people_num` | `peopleNum` | 预计人数 |
| `reality_num` | `reality_num` | `realityNum` | 实际人数 |
| `execution_frequency` | `execution_frequency` | `executionFrequency` | 执行频率 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `verifystate` | `verifystate` | `verifystate` | 审批状态 |
| `` | `returncount` | `returncount` | 退回次数 |
| `opening_activity` | `opening_activity` | `openingActivity` | 期初活动 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (16个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `activity_points` | `activity_points` | `activityPoints` | 活动积分 |
| `integral_criterion` | `integral_criterion` | `integralCriterion` | 积分标准 |
| `amountsIncurred` | `amountsIncurred` | `amountsIncurred` | 发生金额 |
| `waitSettleAmount` | `waitSettleAmount` | `waitSettleAmount` | 应结算金额 |
| `freezeAmountTotal` | `freezeAmountTotal` | `freezeAmountTotal` | 已冻结金额 |
| `iLNG` | `iLNG` | `longitude` | 经度 |
| `iLAT` | `iLAT` | `latitude` | 纬度 |
| `applyAmountTotal` | `applyAmountTotal` | `applyAmountTotal` | 申请金额 |
| `expectedSaleAmountTotal` | `expectedSaleAmountTotal` | `expectedSaleAmountTotal` | 预计销售额 |
| `expect_fee` | `expect_fee` | `expectFee` | 预计费用 |
| `expect_sales` | `expect_sales` | `expectSales` | 预计销量 |
| `expectedExpenseRate` | `expectedExpenseRate` | `expectedExpenseRate` | 预计费率 |
| `expect_sales_rate` | `expect_sales_rate` | `expectSalesRate` | 预计费率 |
| `settle_amount` | `settle_amount` | `settleAmount` | 结算费用 |
| `settledAmountTotal` | `settledAmountTotal` | `settledAmountTotal` | 已结算金额 |
| `assumeAmountTotal` | `assumeAmountTotal` | `assumeAmountTotal` | 承担金额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `activityDefineCharacter` | `activityDefineCharacter` | `activityDefineCharacter` | 自定义项特征属性组 |

### timestamp (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `apply_time` | `apply_time` | `applyTime` | 申请时间 |
| `materialapply_date` | `materialapply_date` | `materialApplyDate` | 物料申领截止日期 |
| `start_date` | `start_date` | `startDate` | 开始日期 |
| `end_date` | `end_date` | `endDate` | 结束日期 |
| `execution_time` | `execution_time` | `executionTime` | 执行时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `close_time` | `close_time` | `closeTime` | 结案时间 |
| `settle_time` | `settle_time` | `settleTime` | 关闭时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `activityDisplays` | 营销活动活动陈列 |
| `` | `` | `activityInfs` | 营销活动活动费用 |
| `` | `` | `activityMaterialList` | 营销活动活动物料 |
| `` | `` | `activityParticipantList` | 营销活动参与人 |
| `` | `` | `headDef` | 营销活动主表自定义项 |
