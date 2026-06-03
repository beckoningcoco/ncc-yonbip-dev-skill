---
tags: [BIP, 元数据, 数据字典, mka.marketingplan.MarketingPlan]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 营销方案 (`mka.marketingplan.MarketingPlan`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mka_marketing_plan` | domain：`yycrm` | 应用：`MKA` | 业务对象ID：`e28eeb84-e6e5-4754-b28e-75f5180f4ceb`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 营销方案 |
| 物理表 | `mka_marketing_plan` |
| 数据库 schema | `yycrm` |
| 所属应用 | `MKA` |
| 直连字段 | 85 个 |
| 子表 | 8 个 |
| 关联引用 | 29 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `estimateCostList` | `mka.marketingplan.EstimateCost` | composition |
| `partakeScopeConditionList` | `mka.marketingplan.PartakeScopeCondition` | composition |
| `headDef` | `mka.marketingplan.MarketingPlanDef` | composition |
| `unjoinCustomerList` | `mka.marketingplan.UnjoinCustomer` | composition |
| `marketingPlanParticipantList` | `mka.marketingplan.MarketingPlanParticipant` | composition |
| `productScopeConditionList` | `mka.marketingplan.ProductScopeCondition` | composition |
| `unjoinProductList` | `mka.marketingplan.UnjoinProduct` | composition |
| `integralRule` | `mka.marketingplan.IntegralRule` | composition |

## 关联引用 (29个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `bizFlowId` | `` |
| `defaultDept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `profitCenter` | `finbd.bd_allaccbodyref` |
| `defaultOrg` | `ucf-org-center.bd_salesorg_na` |
| `productLine` | `productcenter.pc_productlineref` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `tenant_id` | `` |
| `ower` | `ucf-staff-center.bd_staff_ref` |
| `planDefineCharacter` | `` |
| `org` | `ucf-org-center.bd_salesorg_na` |
| `ytenant_id` | `` |
| `costCenter` | `finbd.bd_costcenterref` |
| `salearea` | `productcenter.aa_salearearef` |
| `dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `bustype` | `transtype.bd_billtyperef` |
| `parent_id` | `yycrm.mka_marketingplanref` |
| `supply_customer` | `yycrm.cust_customerref` |
| `customer` | `yycrm.cust_customerref` |

## 继承接口 (9个, 29字段)

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
- **树型结构** (`base.itf.ITree`)
  - `` → ``
  - `level` → `level`
  - `parent_id` → `parent_id`
  - `path` → `path`
  - `sort_num` → `sort_num`
- **流程接口** (`base.itf.IBusinessFlow`)
  - `bizFlowId` → `bizFlowId`
  - `isFlowCoreBill` → `isFlowCoreBill`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 85 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 方案编号 |
| `marketing_theme` | `marketing_theme` | `marketingTheme` | 方案主题 |
| `version_no` | `version_no` | `versionNo` | 变更版本号 |
| `marketing_content` | `marketing_content` | `marketingContent` | 方案内容 |
| `` | `auditor` | `auditor` | 审批人 |
| `settle_state` | `settle_state` | `settleState` | 关闭状态 |
| `path` | `path` | `path` | 下级路径 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (20个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `auditorId` | `auditorId` | 审批人 |
| `dept` | `dept` | `dept` | 部门 |
| `org` | `org` | `org` | 管理组织 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `bustype` | `bustype` | `bustype` | 方案类型ID |
| `supply_customer` | `supply_customer` | `supplyCustomer` | 客户ID |
| `currency` | `currency` | `currency` | 币种ID |
| `customer` | `customer` | `customer` | 客户ID |
| `ower` | `ower` | `ower` | 负责人ID |
| `salearea` | `salearea` | `saleArea` | 销售区域ID |
| `defaultOrg` | `defaultOrg` | `defaultOrg` | 默认承担组织ID |
| `defaultDept` | `defaultDept` | `defaultDept` | 默认承担部门ID |
| `parent_id` | `parent_id` | `parentId` | 上游方案ID |
| `bizFlowId` | `bizFlowId` | `bizFlow` | 流程Id |
| `` | `creatorId` | `creatorId` | 创建人ID |
| `` | `modifierId` | `modifierId` | 修改人ID |
| `productLine` | `productLine` | `productLine` | 产品线ID |
| `costCenter` | `costCenter` | `costCenter` | 成本中心ID |
| `profitCenter` | `profitCenter` | `profitCenter` | 利润中心ID |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `audit_date` | `audit_date` | `auditDate` | 审批日期 |
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isBudgetOver` | `isBudgetOver` | `isBudgetOver` | 预算超额 |
| `` | `isWfControlled` | `isWfControlled` | 是否审批流控制 |
| `isFlowCoreBill` | `isFlowCoreBill` | `isFlowCoreBill` | 是否核心单据 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cashMethod` | `cashMethod` | `cashMethod` | 默认兑付方式 |
| `autoClosingRule` | `autoClosingRule` | `autoClosingRule` | 自动关闭规则 |

### 整数 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sort_num` | `sort_num` | `sort` | 排序号 |
| `people_num` | `people_num` | `peopleNum` | 预计人数 |
| `expect_place` | `expect_place` | `expectPlace` | 预计场次 |
| `reality_place` | `reality_place` | `realityPlace` | 实际场次 |
| `closeStateNum` | `closeStateNum` | `closeStateNum` | 已结案 |
| `settleStateNum` | `settleStateNum` | `settleStateNum` | 已关闭 |
| `level` | `level` | `level` | 等级 |
| `sort_num` | `sort_num` | `sortNum` | 序号 |
| `isEnd` | `isEnd` | `isEnd` | 是否末级 |
| `hasIntegRule` | `hasIntegRule` | `hasIntegRule` | hasIntegRule |

### 短整数 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `calculation_method` | `calculation_method` | `calculationMethod` | 营销活动积分计算方式 |
| `integral_basis` | `integral_basis` | `integralBasis` | 积分依据 |
| `is_apply` | `is_apply` | `isApply` | 活动需申请 |
| `isUnifiedPromotion` | `isUnifiedPromotion` | `isUnifiedPromotion` | 统一促销 |
| `verifystate` | `verifystate` | `verifystate` | 审批状态 |
| `issued_status` | `issued_status` | `issuedStatus` | 下发状态 |
| `` | `returncount` | `returncount` | 退回次数 |
| `opening_scheme` | `opening_scheme` | `openingScheme` | 期初方案 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `parent_id` | `parent_id` | `parent` | 上级分类 |
| `id` | `id` | `id` | ID |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sales_num` | `sales_num` | `salesNum` | 预计销量 |
| `total_fee` | `total_fee` | `totalFee` | 预计费用 |
| `commitmentAmount` | `commitmentAmount` | `commitmentAmount` | 承担金额 |
| `expect_percent` | `expect_percent` | `expectPercent` | 预计费率% |
| `nextOccupyAmount` | `nextOccupyAmount` | `nextOccupyAmount` | 下级占用金额 |
| `nextSettleAmount` | `nextSettleAmount` | `nextSettleAmount` | 下级结算金额 |
| `SettleAmount` | `SettleAmount` | `SettleAmount` | 本级结算金额 |
| `estimateSaleSum` | `estimateSaleSum` | `estimateSaleSum` | 预计销售额 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `planDefineCharacter` | `planDefineCharacter` | `planDefineCharacter` | 自定义项特征属性组 |

### timestamp (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `materialapply_date` | `materialapply_date` | `materialApplyDate` | 物料申领截止日期 |
| `begin_date` | `begin_date` | `beginDate` | 开始日期 |
| `end_date` | `end_date` | `endDate` | 结束日期 |
| `due_date` | `due_date` | `dueDate` | 申请截止日 |
| `closingDate` | `closingDate` | `closingDate` | 结算截止日 |
| `apply_time` | `apply_time` | `applyTime` | 申请时间 |
| `audit_time` | `audit_time` | `auditTime` | 审批时间 |
| `settle_time` | `settle_time` | `settleTime` | 关闭时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `estimateCostList` | 营销方案费用子表 |
| `` | `` | `headDef` | 营销方案自定义项 |
| `` | `` | `integralRule` | 营销方案积分规则 |
| `` | `` | `marketingPlanParticipantList` | 营销方案参与人 |
| `` | `` | `partakeScopeConditionList` | 营销方案参与范围条件设定 |
| `` | `` | `productScopeConditionList` | 营销方案促销商品范围条件设定 |
| `` | `` | `unjoinCustomerList` | 营销方案排除客户 |
| `` | `` | `unjoinProductList` | 营销方案排除商品 |
