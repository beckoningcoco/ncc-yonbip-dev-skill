---
tags: [BIP, 元数据, 数据字典, mka.marketingplan.EstimateCost]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 营销方案费用子表 (`mka.marketingplan.EstimateCost`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mka_estimate_cost` | domain：`yycrm` | 应用：`MKA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 营销方案费用子表 |
| 物理表 | `mka_estimate_cost` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `MKA` |
| 直连字段 | 66 个 |
| 子表 | 1 个 |
| 关联引用 | 25 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyDef` | `mka.marketingplan.EstimateCostDef` | composition |

## 关联引用 (25个)

| 字段名 | 引用类型 |
|--------|---------|
| `expenseItem` | `finbd.bd_expenseitemref` |
| `` | `` |
| `goods` | `productcenter.pc_productquerytreeref` |
| `measurement` | `productcenter.pc_unitref` |
| `parent_item_id` | `` |
| `expenseItemType` | `finbd.bd_expenseitemtyperef` |
| `settleVendor` | `yssupplier.aa_vendor` |
| `deptCost` | `ucf-org-center.bd_adminorgsharetreeref` |
| `tenant_id` | `` |
| `materialClass` | `productcenter.pc_managementclassref` |
| `productClass` | `productcenter.pc_presentationclassref` |
| `settleCustomer` | `yycrm.cust_customerref` |
| `ytenant_id` | `` |
| `marketPlanId` | `` |
| `saleArea` | `productcenter.aa_salearearef` |
| `costProductLine` | `productcenter.pc_productlineref` |
| `productDefineCharacter` | `` |
| `settlePerson` | `ucf-staff-center.bd_staff_ref` |
| `businessPeriod` | `ucfbasedoc.businessperiod_defendref` |
| `chainSystem` | `yxybase.aa_chainsystemref` |
| `costDefineCharacter` | `` |
| `orgCost` | `ucf-org-center.bd_salesorg_na` |
| `customer` | `yycrm.cust_customerref` |

## 继承接口 (4个, 17字段)

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
- **生单回写** (`base.itf.IBackWrite`)
  - `groupTaskKey` → `groupTaskKey`
  - `makerule_code` → `makerule_code`
  - `` → ``
  - `` → ``
  - `` → ``
  - `sourceMainPubts` → `sourceMainPubts`
  - `` → ``

## 字段列表（按类型分组）

> 共 66 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `source` | `source` | `source` | 父级单据类型 |
| `` | `upcode` | `upcode` | 上游单据号 |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `allow_super_application` | `allow_super_application` | `allowSuperApplication` | 允许超申请 |

### 引用字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `customer` | `customer` | `customer` | 活动客户 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `settlePerson` | `settlePerson` | `settlePerson` | 结算个人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `marketPlanId` | `marketPlanId` | `marketPlanId` | 营销方案id |
| `chainSystem` | `chainSystem` | `chainSystem` | 连锁系统ID |
| `saleArea` | `saleArea` | `saleArea` | 销售区域ID |
| `expenseItem` | `expenseItem` | `expenseItem` | 费用项ID |
| `expenseItemType` | `expenseItemType` | `expenseItemType` | 费用类型ID |
| `goods` | `goods` | `goods` | 商品ID |
| `measurement` | `measurement` | `measurement` | 计量单位ID |
| `orgCost` | `orgCost` | `orgCost` | 销售组织ID |
| `deptCost` | `deptCost` | `deptCost` | 部门ID |
| `materialClass` | `materialClass` | `materialClass` | 物料分类ID |
| `productClass` | `productClass` | `productClass` | 商品分类ID |
| `settleVendor` | `settleVendor` | `settleVendor` | 结算供应商id |
| `settleCustomer` | `settleCustomer` | `settleCustomer` | 结算客户id |
| `parent_item_id` | `parent_item_id` | `parentItemId` | 父级编号 |
| `businessPeriod` | `businessPeriod` | `businessPeriod` | 预算期间ID |
| `costProductLine` | `costProductLine` | `costProductLine` | 产品线id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 枚举字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cashMethod` | `cashMethod` | `cashMethod` | 兑付方式 |
| `customerType` | `customerType` | `customerType` | 结算对象类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `settle_status` | `settle_status` | `settleStatus` | 结算状态 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `sourceid` | `sourceid` | 上游单据主表id |
| `` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `id` | `id` | `id` | 编号 |

### 数值字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `count` | `count` | `count` | 数量 |
| `occupy_superior_amount` | `occupy_superior_amount` | `occupySuperiorAmount` | 占用上级金额 |
| `activity_plan_amount` | `activity_plan_amount` | `activityPlanAmount` | 计划金额 |
| `activity_amount` | `activity_amount` | `activityAmount` | 活动金额 |
| `summary_amount` | `summary_amount` | `summaryAmount` | 小结金额 |
| `expense_apply_amount` | `expense_apply_amount` | `expenseApplyAmount` | 费用申请金额 |
| `activity_plan_release_amount` | `activity_plan_release_amount` | `activityPlanReleaseAmount` | 计划释放金额 |
| `activity_release_amount` | `activity_release_amount` | `activityReleaseAmount` | 活动释放金额 |
| `summary_release_amount` | `summary_release_amount` | `summaryReleaseAmount` | 小结释放金额 |
| `expense_apply_release_amount` | `expense_apply_release_amount` | `expenseApplyReleaseAmount` | 费用申请释放金额 |
| `lineNo` | `lineNo` | `lineNo` | 行号 |
| `unitInput` | `unitInput` | `unitInput` | 单位投入 |
| `cost` | `cost` | `cost` | 预计费用 |
| `commitmentRatio` | `commitmentRatio` | `commitmentRatio` | 承担比例% |
| `commitmentAmount` | `commitmentAmount` | `commitmentAmount` | 承担金额 |
| `estimateSale` | `estimateSale` | `estimateSale` | 预计销售额 |
| `rate` | `rate` | `rate` | 预计费率% |
| `nextOccupyAmount` | `nextOccupyAmount` | `nextOccupyAmount` | 下级占用金额 |
| `nextSettleAmount` | `nextSettleAmount` | `nextSettleAmount` | 下级结算金额 |
| `SettleAmount` | `SettleAmount` | `SettleAmount` | 本级结算金额 |
| `amount` | `amount` | `amount` | 余额 |
| `parentLineNo` | `parentLineNo` | `parentLineNo` | 来源行号 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `costDefineCharacter` | `costDefineCharacter` | `costDefineCharacter` | 自定义项特征属性组 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productDefineCharacter` | `productDefineCharacter` | `productDefineCharacter` | 物料自由项特征组 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodyDef` | 预计费用自定义项 |
