---
tags: [BIP, 元数据, 数据字典, voucher.rebate.RebateShareSetting]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 返利分摊设置 (`voucher.rebate.RebateShareSetting`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`udh_rebatesharesetting` | domain：`marketingbill` | 应用：`BBSMK` | 业务对象ID：`2c418d2a-66d0-42bd-a347-2a6c6a4d7fee`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 返利分摊设置 |
| 物理表 | `udh_rebatesharesetting` |
| 数据库 schema | `marketingbill` |
| 所属应用 | `BBSMK` |
| 直连字段 | 30 个 |
| 子表 | 3 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `WhiteProduct` | `voucher.rebate.WhiteProduct` | composition |
| `rebateShareSettingTransTypeRecords` | `voucher.rebate.RebateShareSettingTransTypeRecord` | composition |
| `rebateShareSettingDetails` | `voucher.rebate.RebateShareSettingDetail` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `rebateShareSettingDefineCharacter` | `` |
| `iSaleOrgId` | `market_salesorgref` |
| `` | `` |
| `ytenant_id` | `` |
| `iBizId` | `` |
| `iSubmiterId` | `` |
| `iModifierId` | `` |

## 继承接口 (5个, 14字段)

- **U订货租户相关** (`base.itf.IUordercorp`)
  - `iCorpId` → `iCorpId`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **商家相关** (`base.itf.IShop`)
  - `iShopID` → `iShopID`
- **启用** (`ucfbase.ucfbaseItf.IEnable`)
  - `disablets` → `disablets`
  - `enable` → `enable`
  - `enablets` → `enablets`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 30 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cName` | `cName` | `name` | 规则名称 |
| `rebateType` | `rebateType` | `rebateType` | 费用适用类型 |
| `cModifier` | `cModifier` | `modifier` | 修改人 |
| `cCreator` | `cCreator` | `creator` | 创建人 |
| `payMode` | `payMode` | `payMode` | 兑付方式 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iSaleOrgId` | `iSaleOrgId` | `saleOrgId` | 销售组织 |
| `iSubmiterId` | `iSubmiterId` | `creatorId` | 创建人 |
| `iModifierId` | `iModifierId` | `modifierId` | 修改人id |
| `iBizId` | `iBizId` | `bizId` | 供应商id |
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

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isOrderDiscountControl` | `isOrderDiscountControl` | `isOrderDiscountControl` | 订单优惠控制 |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `priority` | `priority` | `priority` | 优先级 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enable` | `enable` | `enable` | 是否启用 |
| `ideleted` | `ideleted` | `iDeleted` | 删除标记 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 单据主表id |
| `iShopID` | `iShopID` | `shop` | 商家 |
| `iCorpId` | `iCorpId` | `uordercorp` | 租户 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubuts` | `pubuts` | `pubts` | 时间戳 |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `WhiteProduct` | 例外商品 |
| `amountCalculationBasis` | `amountCalculationBasis` | `amountCalculationBasis` | 金额计算依据 |
| `applicableDocType` | `applicableDocType` | `applicableDocType` | 适用单据类型 |
| `` | `` | `rebateShareSettingDetails` | 返利分摊设置明细 |
| `` | `` | `rebateShareSettingTransTypeRecords` | 账户使用规则交易类型记录表 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rebateShareSettingDefineCharacter` | `rebateShareSettingDefineCharacter` | `rebateShareSettingDefineCharacter` | 自定义项特征属性组 |
