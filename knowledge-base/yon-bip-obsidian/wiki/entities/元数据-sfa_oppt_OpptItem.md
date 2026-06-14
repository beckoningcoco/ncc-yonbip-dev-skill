---
tags: [BIP, 元数据, 数据字典, sfa.oppt.OpptItem]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 商机子表 (`sfa.oppt.OpptItem`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`sfa_oppt_item` | domain：`yycrm` | 应用：`SFA` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 商机子表 |
| 物理表 | `sfa_oppt_item` |
| domain/服务域 | `yycrm` |
| schema | `crm` |
| 所属应用 | `SFA` |
| 直连字段 | 32 个 |
| 子表 | 1 个 |
| 关联引用 | 14 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `bodyDef` | `sfa.oppt.OpptItemDef` | composition |

## 关联引用 (14个)

| 字段名 | 引用类型 |
|--------|---------|
| `product` | `productcenter.pc_productquerytreeref` |
| `product_class` | `productcenter.pc_presentationclassref` |
| `ytenant_id` | `` |
| `item_currency` | `ucfbasedoc.bd_currencytenantref` |
| `` | `` |
| `oppt_id` | `yycrm.sfa_opptref` |
| `opptItemDefineCharacter` | `` |
| `sale_unit` | `productcenter.pc_productassitunitsref` |
| `product_line` | `productcenter.pc_productlineref` |
| `manage_class` | `productcenter.pc_managementclassref` |
| `brand` | `productcenter.pc_brandref` |
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

> 共 32 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `remark` | `remark` | `remark` | 备注 |

### 引用字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `manage_class` | `manage_class` | `manageClass` | 物料分类ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `oppt_id` | `oppt_id` | `opptId` | 商机ID |
| `product` | `product` | `product` | 物料ID |
| `product_class` | `product_class` | `productClass` | 商品分类ID |
| `brand` | `brand` | `brand` | 品牌ID |
| `product_line` | `product_line` | `productLine` | 产品线ID |
| `sale_unit` | `sale_unit` | `saleUnit` | 销售单位ID |
| `item_currency` | `item_currency` | `itemCurrency` | 币种ID |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键ID |

### 数值字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nat_currency_money` | `nat_currency_money` | `natCurrencyMoney` | 本币金额 |
| `row_no` | `row_no` | `rowNo` | 行序号 |
| `unit_price` | `unit_price` | `unitPrice` | 单价 |
| `num` | `num` | `num` | 销售数量 |
| `discount` | `discount` | `discount` | 折扣% |
| `money` | `money` | `money` | 金额 |
| `discount_money` | `discount_money` | `discountMoney` | 折扣额 |

### timestamp (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `expect_delivery_date` | `expect_delivery_date` | `expectDeliveryDate` | 预计交货日期 |
| `expect_payment_date` | `expect_payment_date` | `expectPaymentDate` | 预计回款日期 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `opptItemDefineCharacter` | `opptItemDefineCharacter` | `opptItemDefineCharacter` | 商机子表自定义项特征属性组 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `bodyDef` | 商机子表自定义项扩展 |
