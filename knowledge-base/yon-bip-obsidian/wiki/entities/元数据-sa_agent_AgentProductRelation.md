---
tags: [BIP, 元数据, 数据字典, sa.agent.AgentProductRelation]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 客户商品对照表 (`sa.agent.AgentProductRelation`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`agentproductrelation` | domain：`udinghuo` | 应用：`SCMSA` | 业务对象ID：`5f77662c-6c3f-4c29-90c2-745ee702a253`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 客户商品对照表 |
| 物理表 | `agentproductrelation` |
| 数据库 schema | `udinghuo` |
| 所属应用 | `SCMSA` |
| 直连字段 | 46 个 |
| 子表 | 2 个 |
| 关联引用 | 20 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `agentProductApplyRange` | `sa.agent.AgentProductApplyRange` | composition |
| `detail` | `sa.agent.AgentProductExtend` | composition |

## 关联引用 (20个)

| 字段名 | 引用类型 |
|--------|---------|
| `iagentId` | `` |
| `iproductclassid` | `` |
| `iAgentLevelId` | `` |
| `iunitid` | `` |
| `iproductid` | `` |
| `iTransactionTypeId` | `` |
| `ytenant_id` | `` |
| `iAgentId` | `` |
| `` | `` |
| `iagentrelationid` | `` |
| `masterUnitId` | `` |
| `cTaxId` | `` |
| `iProductId` | `` |
| `iProductUnitId` | `` |
| `iagentcategoryid` | `` |
| `iskuid` | `` |
| `isalesorgid` | `` |

## 继承接口 (5个, 14字段)

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
- **商家相关** (`base.itf.IShop`)
  - `iShopID` → `iShopID`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`
- **启用** (`ucfbase.ucfbaseItf.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`

## 字段列表（按类型分组）

> 共 46 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `cTaxCode` | `cTaxCode` | `taxCode` | 税目税率编码 |
| `cTaxItems` | `cTaxItems` | `taxItems` | 税目 |
| `transactionTypeId_name` | `transactionTypeId_name` | `transactionTypeId_name` | 交易类型 |
| `cProductUnitName` | `cProductUnitName` | `productUnitName` | 计价单位 |
| `cProductAuxUnitName` | `cProductAuxUnitName` | `unitName` | 销售单位 |

### 引用字段 (18个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iagentcategoryid` | `iagentcategoryid` | `agentCategoryId` | 客户分类 |
| `iagentId` | `iagentId` | `agentId` | agentId |
| `iAgentLevelId` | `iAgentLevelId` | `agentLevelId` | 客户级别 |
| `iagentrelationid` | `iagentrelationid` | `agentRelationId` | agentRelationId |
| `` | `creatorId` | `creatorId` | 创建人 |
| `iAgentId` | `iAgentId` | `merchantAuth` | 客户权限 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `iProductId` | `iProductId` | `productAuth` | 物料权限 |
| `iproductclassid` | `iproductclassid` | `productClassId` | 商品分类id |
| `iproductid` | `iproductid` | `productId` | 商品id |
| `isalesorgid` | `isalesorgid` | `salesOrgId` | 组织ID |
| `iskuid` | `iskuid` | `skuId` | skuId |
| `cTaxId` | `cTaxId` | `taxId` | 税目税率id |
| `iTransactionTypeId` | `iTransactionTypeId` | `transactionTypeId` | 交易类型Id |
| `iunitid` | `iunitid` | `iProductAuxUnitId` | 销售单位Id |
| `iProductUnitId` | `iProductUnitId` | `iProductUnitId` | 计价单位Id |
| `masterUnitId` | `masterUnitId` | `masterUnitId` | 主计量单位id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `disablets` | `disablets` | `disablets` | 停用时间 |
| `enablets` | `enablets` | `enablets` | 启用时间 |

### 枚举字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 启用 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | Id |
| `iShopID` | `iShopID` | `shop` | 商家 |
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |

### 数值字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iminorderqty` | `iminorderqty` | `minOrderQty` | 最小起订量 |
| `fTaxRate` | `fTaxRate` | `taxRate` | 税率 |
| `fAuxExchangeRate` | `fAuxExchangeRate` | `invExchRate` | 销售换算率 |
| `invexchrateden` | `invexchrateden` | `invExchRateDen` | 换算率分母 |
| `invexchratenum` | `invexchratenum` | `invExchRateNum` | 换算率分子 |
| `fMainExchangeRate` | `fMainExchangeRate` | `invPriceExchRate` | 计价换算率 |
| `invpriceexchrateden` | `invpriceexchrateden` | `invPriceExchRateDen` | 计价换算率分母 |
| `invpriceexchratenum` | `invpriceexchratenum` | `invPriceExchRateNum` | 计价换算率分子 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubuts` | `pubuts` | `pubts` | 时间戳 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `agentProductApplyRange` | 客户商品对照适用范围 |
| `` | `` | `detail` | 客户商品对照详情(管理组织) |
