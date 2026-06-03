---
tags: [BIP, 元数据, 数据字典, mka.activity.ActivityInfo]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 营销活动活动费用 (`mka.activity.ActivityInfo`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mka_activity_info` | domain：`yycrm` | 应用：`MKA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 营销活动活动费用 |
| 物理表 | `mka_activity_info` |
| 数据库 schema | `yycrm` |
| 所属应用 | `MKA` |
| 直连字段 | 72 个 |
| 子表 | 2 个 |
| 关联引用 | 32 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `freeDefine` | `mka.activity.ActivityInfoFreeDefine` | composition |
| `activityInfoProperty` | `mka.activity.ActivityInfoProperty` | composition |

## 关联引用 (32个)

| 字段名 | 引用类型 |
|--------|---------|
| `dimension_region` | `productcenter.aa_salearearef` |
| `planExpenseInfo` | `` |
| `dimension_expense_item` | `finbd.bd_expenseitemref` |
| `assumeOrg` | `ucf-org-center.bd_salesorg_na` |
| `dimension_customer` | `yycrm.cust_customerref` |
| `productLine` | `productcenter.pc_productlineref` |
| `activityId` | `` |
| `assumeCustomer` | `` |
| `activityInfoDefineCharacter` | `` |
| `activity_plan_cost` | `` |
| `tenant_id` | `` |
| `bankAccountVendor` | `yssupplier.aa_vendorbankref` |
| `advanceCustomer` | `` |
| `materialClass` | `` |
| `product` | `productcenter.pc_productquerytreeref` |
| `settle_vendor` | `yssupplier.aa_vendor` |
| `productClass` | `productcenter.pc_presentationclassref` |
| `ytenant_id` | `` |
| `bankType` | `ucfbasedoc.bd_bankcard` |
| `productDefineCharacter` | `` |
| `settle_person` | `ucf-staff-center.bd_staff_ref` |
| `bankAccountPerson` | `ucf-staff-center.bd_staffbankaccref` |
| `businessPeriod` | `` |
| `unit` | `productcenter.pc_unitref` |
| `` | `` |
| `dimension_expense_itemType` | `finbd.bd_expenseitemtyperef` |
| `settle_customer` | `yycrm.cust_customerref` |
| `dimension_terminal_chain` | `yxybase.aa_chainsystemref` |
| `dimension_terminal` | `yxybase.aa_storeterminal` |
| `bank_account_cust` | `productcenter.aa_merchantagentfinancialref` |
| `asumeDept` | `ucf-org-center.bd_adminorgsharetreeref` |

## 继承接口 (3个, 9字段)

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

> 共 72 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `source` | `source` | `source` | 父级单据类型 |
| `` | `upcode` | `upcode` | 上游单据号 |
| `makerule_code` | `makerule_code` | `makeRuleCode` | 生单规则编号 |
| `groupTaskKey` | `groupTaskKey` | `groupTaskKey` | 分组任务KEY |
| `attachmentId` | `attachmentId` | `attachmentId` | 附件 |
| `bankAccount` | `bankAccount` | `bankAccount` | 银行账号 |
| `rejectReason` | `rejectReason` | `rejectReason` | 批复意见 |
| `planExpenseInfo_lineNo` | `planExpenseInfo_lineNo` | `planExpenseInfo_lineNo` | 方案费用行 |

### 引用字段 (28个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `advanceCustomer` | `advanceCustomer` | `advanceCustomer` | 代垫商家 |
| `bank_account_cust` | `bank_account_cust` | `bankAccountCustomer` | 客户银行账户 |
| `activity_plan_cost` | `activity_plan_cost` | `activityPlanCost` | 计划活动费用主键 |
| `materialClass` | `materialClass` | `materialClass` | 物料分类 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `businessPeriod` | `businessPeriod` | `businessPeriod` | 费用期间 |
| `assumeCustomer` | `assumeCustomer` | `assumeCustomer` | 承担商家 |
| `bankAccountPerson` | `bankAccountPerson` | `bankAccountPerson` | 个人银行账号 |
| `bankAccountVendor` | `bankAccountVendor` | `bankAccountVendor` | 供应商银行账号 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `activityId` | `activityId` | `activityId` | 主表id |
| `dimension_terminal` | `dimension_terminal` | `dimension_terminal` | 终端id |
| `dimension_customer` | `dimension_customer` | `dimension_customer` | 客户id |
| `dimension_region` | `dimension_region` | `dimension_region` | 区域id |
| `dimension_terminal_chain` | `dimension_terminal_chain` | `dimension_terminal_chain` | 所属系统id |
| `dimension_expense_item` | `dimension_expense_item` | `dimension_expense_item` | 费用项id |
| `dimension_expense_itemType` | `dimension_expense_itemType` | `dimension_expense_itemType` | 费用项类别id |
| `product` | `product` | `product` | 商品id |
| `productClass` | `productClass` | `productClass` | 商品分类id |
| `unit` | `unit` | `unit` | 计量单位id |
| `settle_customer` | `settle_customer` | `settle_customer` | 结算客户id |
| `settle_vendor` | `settle_vendor` | `settle_vendor` | 结算供应商id |
| `settle_person` | `settle_person` | `settle_person` | 结算个人id |
| `bankType` | `bankType` | `bankType` | 银行类别 |
| `assumeOrg` | `assumeOrg` | `assumeOrg` | 承担组织id |
| `asumeDept` | `asumeDept` | `asumeDept` | 承担部门id |
| `productLine` | `productLine` | `productLine` | 产品线id |
| `planExpenseInfo` | `planExpenseInfo` | `planExpenseInfo` | 方案费用子表id |

### 布尔字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allowOverage` | `allowOverage` | `allowOverage` | 允许超额发生 |
| `is_replenish_goods` | `is_replenish_goods` | `isReplenishGoods` | 货补商品 |
| `allow_settle` | `allow_settle` | `allowSettle` | 允许超额结算 |
| `bNeedSettle` | `bNeedSettle` | `bNeedSettle` | 需结算 |
| `isSettleComplated` | `isSettleComplated` | `isSettleComplated` | 已结算完毕 |
| `isRejected` | `isRejected` | `isRejected` | 驳回标识 |

### 枚举字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `advancePayMode` | `advancePayMode` | `advancePayMode` | 代垫兑付方式 |
| `settlementType` | `settlementType` | `settlementType` | 结算对象类型 |
| `payMode` | `payMode` | `payMode` | 兑付方式 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `settle_status` | `settle_status` | `settleStatus` | 结算状态 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `sourceid` | `sourceid` | 上游单据主表id |
| `` | `sourceautoid` | `sourceautoid` | 上游单据子表id |
| `id` | `id` | `id` | id |

### 数值字段 (17个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amountsIncurred` | `amountsIncurred` | `amountsIncurred` | 发生金额 |
| `advanceSettledAmount` | `advanceSettledAmount` | `advanceSettledAmount` | 代垫已结算金额 |
| `consultExpenseAmount` | `consultExpenseAmount` | `consultExpenseAmount` | 参考费用额 |
| `consultExpenseRate` | `consultExpenseRate` | `consultExpenseRate` | 参考费率 |
| `consultSaleAmount` | `consultSaleAmount` | `consultSaleAmount` | 参考销售额 |
| `standardExpenseRate` | `standardExpenseRate` | `standardExpenseRate` | 标准费率 |
| `lineNo` | `lineNo` | `lineNo` | 子表行号 |
| `unitInvest` | `unitInvest` | `unitInvest` | 单位投入 |
| `quality` | `quality` | `quality` | 数量 |
| `applyAmount` | `applyAmount` | `applyAmount` | 申请金额 |
| `approveAmount` | `approveAmount` | `approveAmount` | 批复金额 |
| `assumeRate` | `assumeRate` | `assumeRate` | 承担比例(%) |
| `assumeAmount` | `assumeAmount` | `assumeAmount` | 承担金额 |
| `settledAmount` | `settledAmount` | `settledAmount` | 已结算金额 |
| `freezeAmount` | `freezeAmount` | `freezeAmount` | 冻结金额 |
| `expectedSaleAmount` | `expectedSaleAmount` | `expectedSaleAmount` | 预计销售金额 |
| `expectedExpenseRate` | `expectedExpenseRate` | `expectedExpenseRate` | 预计费率(%) |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `activityInfoDefineCharacter` | `activityInfoDefineCharacter` | `activityInfoDefineCharacter` | 自定义项特征属性组 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sourceMainPubts` | `sourceMainPubts` | `sourceMainPubts` | 时间戳 |
| `pubts` | `pubts` | `pubts` | 时间戳 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `productDefineCharacter` | `productDefineCharacter` | `productDefineCharacter` | 活动费用物料自定义项 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `activityInfoProperty` | 实际费用子表填报明细 |
| `` | `` | `freeDefine` | 营销活动子表自由自定义项 |
