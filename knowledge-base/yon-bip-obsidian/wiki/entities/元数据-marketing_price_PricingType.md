---
tags: [BIP, 元数据, 数据字典, marketing.price.PricingType]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 定价类型 (`marketing.price.PricingType`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`udh_price_type` | domain：`marketingbill` | 应用：`B2Bpricing` | 业务对象ID：`dddc3cc3-2cae-46a8-ac81-cb45d3faebac`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 定价类型 |
| 物理表 | `udh_price_type` |
| domain/服务域 | `marketingbill` |
| 所属应用 | `B2Bpricing` |
| 直连字段 | 53 个 |
| 子表 | 0 个 |
| 关联引用 | 10 个 |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `inventory_Org` | `` |
| `exchange_Rate_Type` | `` |
| `quantity_properties_three` | `` |
| `unit_properties_two` | `` |
| `ytenant_id` | `` |
| `quantity_properties_two` | `` |
| `stock_id` | `` |
| `unit_properties_three` | `` |
| `` | `` |

## 继承接口 (5个, 14字段)

- **逻辑删除相关** (`base.itf.Deletable`)
  - `iDeleted` → `iDeleted`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`
- **启用** (`ucfbase.ucfbaseItf.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 53 个直连字段

### 文本字段 (21个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `code` | `code` | `code` | 编号 |
| `calculation_type` | `calculation_type` | `calculationType` | 计算类型 |
| `description` | `description` | `description` | 描述 |
| `amount_ladder_type` | `amount_ladder_type` | `amountLadderType` | 阶梯方式 |
| `price_ladder_type` | `price_ladder_type` | `priceLadderType` | 阶梯依据 |
| `transition_type` | `transition_type` | `transitionType` | 转换规则 |
| `` | `creator` | `creator` | 制单人 |
| `` | `modifier` | `modifier` | 修改人 |
| `cost_Type` | `cost_Type` | `costType` | 成本类型 |
| `ext_source_type` | `ext_source_type` | `extSourceType` | 外部来源单据类型 |
| `ladde_based_type` | `ladde_based_type` | `ladderBasedType` | 阶梯判断依据 |
| `name2` | `name2` | `name2` | 名称2 |
| `name3` | `name3` | `name3` | 名称3 |
| `name4` | `name4` | `name4` | 名称4 |
| `name5` | `name5` | `name5` | 名称5 |
| `name6` | `name6` | `name6` | 名称6 |
| `pricing_classify_code` | `pricing_classify_code` | `pricingClassifyCode` | 定价分类 |
| `pricing_scheme` | `pricing_scheme` | `pricingScheme` | 取价方案 |
| `quantity_one` | `quantity_one` | `quantityOne` | 数量1 |
| `quantity_three` | `quantity_three` | `quantityThree` | 数量3 |
| `quantity_two` | `quantity_two` | `quantityTwo` | 数量2 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `exchange_Rate_Type` | `exchange_Rate_Type` | `exchangeRateType` | 汇率类型 |
| `inventory_Org` | `inventory_Org` | `inventoryOrg` | 库存组织 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `quantity_properties_three` | `quantity_properties_three` | `quantityPropertiesThree` | 数量3特征 |
| `quantity_properties_two` | `quantity_properties_two` | `quantityPropertiesTwo` | 数量2特征 |
| `stock_id` | `stock_id` | `stockId` | 仓库 |
| `unit_properties_three` | `unit_properties_three` | `unitPropertiesThree` | 数量3单位特征 |
| `unit_properties_two` | `unit_properties_two` | `unitPropertiesTwo` | 数量2单位特征 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isladder_pricing` | `isladder_pricing` | `isLadderPricing` | 是否阶梯类型 |
| `isTaxIncluded` | `isTaxIncluded` | `isTaxIncluded` | 是否含税 |
| `inferior_edit` | `inferior_edit` | `inferiorEdit` | 价格记录允许下级修改 |
| `b_edit_price` | `b_edit_price` | `bEditPrice` | 允许在定价过程中手工修改 |
| `b_portal_price` | `b_portal_price` | `isPortalPrice` | 订货门户价格 |
| `b_edit_negative` | `b_edit_negative` | `bEditNegative` | 是否允许录入负数 |
| `quoted` | `quoted` | `quoted` | 是否被引用 |
| `iSystem` | `iSystem` | `iSystem` | 系统预设 |
| `iDeleted` | `iDeleted` | `isDeleted` | 逻辑删除标记 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 状态 |
| `version` | `version` | `version` | 版本号 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 单据id |
| `iBizId` | `iBizId` | `bizId` | 商家ID |
| `tenant_id` | `tenant_id` | `uordercorp` | 租户ID |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `name` | `name` | `name` | 名称 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |
| `pubuts` | `pubuts` | `pubts` | 时间戳 |
