---
tags: [BIP, 元数据, 数据字典, ec.suiteGoodsInfo.EcSuiteGoods]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 套件商品 (`ec.suiteGoodsInfo.EcSuiteGoods`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ec_suite_goods` | domain：`dst` | 应用：`SDOC` | 业务对象ID：`5c062ca3-ea0d-437b-8da7-360f7e4eb0af`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 套件商品 |
| 物理表 | `ec_suite_goods` |
| 数据库 schema | `dst` |
| 所属应用 | `SDOC` |
| 直连字段 | 20 个 |
| 子表 | 1 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `ecSuiteGoods` | `ec.suiteGoodsInfo.EcSuiteGoodsSub` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `product_id` | `ec_productskuref` |
| `productsku_id` | `ec_productskuref` |
| `ytenant_id` | `` |
| `` | `` |
| `oms_suiteGoods_custom_character` | `` |
| `cust_id` | `` |
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

> 共 20 个直连字段

### 文本字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `product_id` | `product_id` | `product` | 套件编码 |
| `productsku_id` | `productsku_id` | `productSku` | 套件编码 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `cust_id` | `cust_id` | `cust` | 客户 |
| `` | `modifierId` | `modifierId` | 修改人 |
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
| `item_type` | `item_type` | `itemType` | 商品结构类型 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `synSuitegooddata` | `synSuitegooddata` | `synSuitegooddata` | 同步固定套餐 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `ecSuiteGoods` | 套件货品 |
| `suite_status` | `suite_status` | `suiteStatus` | 是否停用 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `oms_suiteGoods_custom_character` | `oms_suiteGoods_custom_character` | `ecSuiteGoodsCustomCharacter` | 表头自定义项特征属性组 |
