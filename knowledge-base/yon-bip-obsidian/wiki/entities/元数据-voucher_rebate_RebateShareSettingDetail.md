---
tags: [BIP, 元数据, 数据字典, voucher.rebate.RebateShareSettingDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 返利分摊设置明细 (`voucher.rebate.RebateShareSettingDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`udh_rebatesharesettingdetail` | domain：`marketingbill` | 应用：`BBSMK` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 返利分摊设置明细 |
| 物理表 | `udh_rebatesharesettingdetail` |
| 数据库 schema | `marketingbill` |
| 所属应用 | `BBSMK` |
| 直连字段 | 21 个 |
| 子表 | 1 个 |
| 关联引用 | 13 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `stepCondition` | `voucher.rebate.StepCondition` | composition |

## 关联引用 (13个)

| 字段名 | 引用类型 |
|--------|---------|
| `iSaleOrgId` | `` |
| `iProductClassId` | `productcenter.pc_presentationclassref` |
| `iMaterialClassId` | `` |
| `iProductId` | `productcenter.productref` |
| `ytenant_id` | `` |
| `iProductBrandId` | `productcenter.pc_brandref` |
| `rebateShareSettingDetailCharacteristics` | `` |
| `iShareSettingId` | `` |
| `iBizId` | `` |
| `rebateShareSettingDetailDefineCharacter` | `` |
| `` | `` |
| `iProductSkuId` | `productcenter.productskuref` |
| `iProductLineId` | `productcenter.pc_productlineref` |

## 继承接口 (2个, 2字段)

- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 21 个直连字段

### 引用字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iProductLineId` | `iProductLineId` | `productLineId` | 产品线id |
| `iProductBrandId` | `iProductBrandId` | `productBrandId` | 品牌id |
| `iProductClassId` | `iProductClassId` | `productClassId` | 商品分类id |
| `iProductId` | `iProductId` | `productId` | 商品id |
| `iProductSkuId` | `iProductSkuId` | `skuId` | skuid |
| `iBizId` | `iBizId` | `bizId` | 供应商id |
| `iMaterialClassId` | `iMaterialClassId` | `materialClassId` | 物料分类 |
| `iSaleOrgId` | `iSaleOrgId` | `saleOrgId` | 组织id |
| `iShareSettingId` | `iShareSettingId` | `shareSettingId` | 分摊设置id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isDocumentLineControl` | `isDocumentLineControl` | `isDocumentLineControl` | 按单据行控制 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 单据id |
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |

### 数值字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `maxRebateRatio` | `maxRebateRatio` | `maxRebateRatio` | 最大分摊比例(%) |
| `maxRebateMoney` | `maxRebateMoney` | `maxRebateMoney` | 最大分摊金额 |
| `minRebateMoney` | `minRebateMoney` | `minRebateMoney` | 最低购买金额 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `applicableType` | `applicableType` | `applicableType` | 适用类型 |
| `` | `` | `stepCondition` | 阶梯设置 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubuts` | `pubuts` | `pubts` | 时间戳 |

### FreeCT (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rebateShareSettingDetailCharacteristics` | `rebateShareSettingDetailCharacteristics` | `rebateShareSettingDetailCharacteristics` | 自定义项特征组 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rebateShareSettingDetailDefineCharacter` | `rebateShareSettingDetailDefineCharacter` | `rebateShareSettingDetailDefineCharacter` | 自定义项特征属性组 |
