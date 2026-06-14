---
tags: [BIP, 元数据, 数据字典, mka.activityplan.ActivityPlanCost]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 活动计划费用 (`mka.activityplan.ActivityPlanCost`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mka_activityplan_cost` | domain：`yycrm` | 应用：`MKA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 活动计划费用 |
| 物理表 | `mka_activityplan_cost` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `MKA` |
| 直连字段 | 51 个 |
| 子表 | 1 个 |
| 关联引用 | 29 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `activityPlanCostFreeDef` | `mka.activityplan.ActivityPlanCostFreeDef` | composition |

## 关联引用 (29个)

| 字段名 | 引用类型 |
|--------|---------|
| `plan_expense_info` | `` |
| `budget_org` | `ucf-org-center.epm_orgref` |
| `dimension_expense_item` | `finbd.bd_expenseitemref` |
| `assume_org` | `ucf-org-center.bd_salesorg_na` |
| `activityPlanCostDefineCharacter` | `` |
| `dimension_expense_itemType` | `finbd.bd_expenseitemtyperef` |
| `budget_period` | `ucfbasedoc.businessperiod_defendref` |
| `settle_vendor` | `yssupplier.aa_vendor_master` |
| `tenant_id` | `` |
| `bank_account_vendor` | `yssupplier.aa_vendorbankref` |
| `materialClass` | `productcenter.pc_managementclassref` |
| `product` | `productcenter.pc_productquerytreeref` |
| `product_class` | `productcenter.pc_presentationclassref` |
| `settle_customer` | `yycrm.cust_customerref` |
| `ytenant_id` | `` |
| `bank_type` | `ucfbasedoc.bd_bankcard` |
| `saleArea` | `productcenter.aa_salearearef` |
| `costProductLine` | `productcenter.pc_productlineref` |
| `productDefineCharacter` | `` |
| `terminal` | `yycrm.dsfa_storeterminal` |
| `bank_account_person` | `ucf-staff-center.bd_staffbankaccref` |
| `settle_person` | `ucf-staff-center.bd_staff_ref` |
| `chainSystem` | `yxybase.aa_chainsystemref` |
| `unit` | `productcenter.pc_unitref` |
| `activityplan_id` | `` |
| `` | `` |
| `bank_account_cust` | `productcenter.aa_merchantagentfinancialref` |
| `asume_dept` | `ucf-org-center.bd_adminorgsharetreeref` |
| `customer` | `yycrm.cust_customerref` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 51 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `source` | `source` | `source` | 父级单据类型 |
| `address` | `address` | `address` | 活动地址 |
| `bank_account` | `bank_account` | `bankAccount` | 银行账号 |

### 引用字段 (26个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `activityplan_id` | `activityplan_id` | `activityplanId` | 活动计划 |
| `terminal` | `terminal` | `terminal` | 终端主键 |
| `bank_account_cust` | `bank_account_cust` | `bankAccountCustomer` | 客户银行账户 |
| `bank_account_vendor` | `bank_account_vendor` | `bankAccountVendor` | 供应商银行账户 |
| `bank_account_person` | `bank_account_person` | `bankAccountPerson` | 个人银行账户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `customer` | `customer` | `customer` | 客户主键 |
| `dimension_expense_item` | `dimension_expense_item` | `dimensionExpenseItem` | 费用项主键 |
| `dimension_expense_itemType` | `dimension_expense_itemType` | `dimensionExpenseItemType` | 费用类型主键 |
| `saleArea` | `saleArea` | `saleArea` | 销售区域ID |
| `product` | `product` | `product` | 商品主键 |
| `chainSystem` | `chainSystem` | `chainSystem` | 连锁系统ID |
| `product_class` | `product_class` | `productClass` | 商品分类主键 |
| `unit` | `unit` | `unit` | 计量单位主键 |
| `materialClass` | `materialClass` | `materialClass` | 物料分类ID |
| `settle_customer` | `settle_customer` | `settleCustomer` | 结算客户主键 |
| `settle_vendor` | `settle_vendor` | `settleVendor` | 结算供应商主键 |
| `settle_person` | `settle_person` | `settlePerson` | 结算个人主键 |
| `bank_type` | `bank_type` | `bankType` | 银行类型主键 |
| `budget_period` | `budget_period` | `budgetPeriod` | 预算期间主键 |
| `costProductLine` | `costProductLine` | `costProductLine` | 产品线id |
| `budget_org` | `budget_org` | `budgetOrg` | 预算主体主键 |
| `assume_org` | `assume_org` | `assumeOrg` | 承担组织主键 |
| `asume_dept` | `asume_dept` | `asumeDept` | 承担部门主键 |
| `plan_expense_info` | `plan_expense_info` | `planExpenseInfo` | 方案费用行 |

### 布尔字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `is_replenish_goods` | `is_replenish_goods` | `isReplenishGoods` | 货补商品 |
| `allow_settle` | `allow_settle` | `allowSettle` | 允许超额结算 |
| `allow_overage` | `allow_overage` | `allowOverage` | 允许超额发生 |
| `bNeedSettle` | `bNeedSettle` | `bNeedSettle` | 需结算 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pay_mode` | `pay_mode` | `payMode` | 兑付方式 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `settle_status` | `settle_status` | `settleStatus` | 结算状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |

### 数值字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `line_no` | `line_no` | `lineNo` | 行号 |
| `unit_invest` | `unit_invest` | `unitInvest` | 单位投入 |
| `apply_amount` | `apply_amount` | `applyAmount` | 申请金额 |
| `approve_amount` | `approve_amount` | `approveAmount` | 批复金额 |
| `quantity` | `quantity` | `quantity` | 数量 |
| `settled_amount` | `settled_amount` | `settledAmount` | 已结算金额 |
| `assume_rate` | `assume_rate` | `assumeRate` | 承担比例 |
| `assume_amount` | `assume_amount` | `assumeAmount` | 承担金额 |
| `expected_sale_amount` | `expected_sale_amount` | `expectedSaleAmount` | 预计销售额 |
| `expected_expense_rate` | `expected_expense_rate` | `expectedExpenseRate` | 预计费率 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `settlement_type` | `settlement_type` | `settlementType` | 结算对象类型 |
| `` | `` | `activityPlanCostFreeDef` | 活动计划费用自由自定义项扩展 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `activityPlanCostDefineCharacter` | `activityPlanCostDefineCharacter` | `activityPlanCostDefineCharacter` | 活动费用自定义特征组 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productDefineCharacter` | `productDefineCharacter` | `productDefineCharacter` | 物料自由项特征组 |
