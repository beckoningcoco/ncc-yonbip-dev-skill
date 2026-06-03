---
tags: [BIP, 元数据, 数据字典, pc.tpl.ProductTplCharacter4SKU]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料模板SKU属性-特征 (`pc.tpl.ProductTplCharacter4SKU`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`product_tpl_character` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料模板SKU属性-特征 |
| 物理表 | `product_tpl_character` |
| 数据库 schema | `productcenter` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 29 个 |
| 子表 | 0 个 |
| 关联引用 | 8 个 |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `tpl_id` | `` |
| `iCharacterId` | `` |
| `iCharacteristicsId` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `iCharacteristicsTypeId` | `` |
| `tenant_id` | `` |

## 字段列表（按类型分组）

> 共 29 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cCharacterCode` | `cCharacterCode` | `characterCode` | 特征编码 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `tpl_id` | `tpl_id` | `template` | 物料模板 |
| `iCharacteristicsTypeId` | `iCharacteristicsTypeId` | `characteristicsType` | 特征组类型 |
| `iCharacteristicsId` | `iCharacteristicsId` | `characteristics` | 特征组 |
| `iCharacterId` | `iCharacterId` | `character` | 特征 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 整数 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `data_type` | `data_type` | `dataType` | 特征类型 |
| `bSkuSens` | `bSkuSens` | `skuSens` | SKU敏感 |
| `bBatchSens` | `bBatchSens` | `batchSens` | 批次敏感 |
| `bSNSens` | `bSNSens` | `SNSens` | 序列号敏感 |
| `bStockSens` | `bStockSens` | `stockSens` | 仅现存量敏感 |
| `bCostAffec` | `bCostAffec` | `costAffec` | 成本敏感 |
| `bBOMAffec` | `bBOMAffec` | `BOMAffec` | BOM敏感 |
| `bManuAffec` | `bManuAffec` | `manuAffec` | 工艺敏感 |
| `bTwoDimensionalInput` | `bTwoDimensionalInput` | `twoDimensionalInput` | 二维录入 |
| `iOrder` | `iOrder` | `iOrder` | 排序号 |
| `web_show` | `web_show` | `webShow` | 商城前端显示 |
| `bPriceAffec` | `bPriceAffec` | `priceAffec` | 销售/采购价格敏感 |

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
