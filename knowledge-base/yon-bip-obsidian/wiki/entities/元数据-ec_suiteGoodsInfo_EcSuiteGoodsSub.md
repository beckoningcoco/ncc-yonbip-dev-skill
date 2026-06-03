---
tags: [BIP, 元数据, 数据字典, ec.suiteGoodsInfo.EcSuiteGoodsSub]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 套件货品 (`ec.suiteGoodsInfo.EcSuiteGoodsSub`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ec_suite_goods_sub` | domain：`dst` | 应用：`SDOC` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 套件货品 |
| 物理表 | `ec_suite_goods_sub` |
| 数据库 schema | `dst` |
| 所属应用 | `SDOC` |
| 直连字段 | 31 个 |
| 子表 | 0 个 |
| 关联引用 | 11 个 |

## 关联引用 (11个)

| 字段名 | 引用类型 |
|--------|---------|
| `product_id` | `ec_productskuref` |
| `productsku_id` | `ec_productskuref` |
| `org_id` | `` |
| `ytenant_id` | `` |
| `assistUnitId` | `` |
| `` | `` |
| `suite_good` | `` |
| `i_cust_id` | `` |
| `tenant_id` | `` |
| `oms_suiteGoods_detail_custom_character` | `` |

## 继承接口 (4个, 11字段)

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
- **特征适配相关信息** (`gscm.itf.CharacterInfo`)
  - `stockSensClue` → `stockSensClue`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 31 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `goodsRange` | `goodsRange` | `goodsRange` | 商品范围 |
| `` | `creator` | `creator` | 创建人名称 |
| `group_name` | `group_name` | `groupName` | 组名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `stockSensClue` | `stockSensClue` | `stockSensClue` | 现存量特征敏感线索 |

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `product_id` | `product_id` | `product` | 商品 |
| `productsku_id` | `productsku_id` | `productSku` | SKUId |
| `assistUnitId` | `assistUnitId` | `assistUnitId` | 销售单位ID |
| `suite_good` | `suite_good` | `suiteGood` | 表头主键 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `i_cust_id` | `i_cust_id` | `cust` | 客户 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `org_id` | `org_id` | `org` | 销售组织 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `sku_type` | `sku_type` | `skuType` | 类型 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 行ID |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `amount` | `amount` | `amount` | 数量 |
| `maxFee` | `maxFee` | `maxFee` | 最大金额 |
| `price_weight` | `price_weight` | `priceWeight` | 金额权重比(%) |
| `assistUnitNum` | `assistUnitNum` | `assistUnitNum` | 件数 |
| `rate` | `rate` | `rate` | 换算率 |
| `price` | `price` | `price` | 零售价 |
| `rateden` | `rateden` | `rateDen` | 换算率分母 |
| `ratenum` | `ratenum` | `rateNum` | 换算率分子 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `oms_suiteGoods_detail_custom_character` | `oms_suiteGoods_detail_custom_character` | `ecSuiteGoodsDetailCustomCharacter` | 表体自定义项特征属性组 |
