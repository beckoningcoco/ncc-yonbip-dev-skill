---
tags: [BIP, 元数据, 数据字典, pmc.giftcard.GiftCard]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 礼品卡主表信息 (`pmc.giftcard.GiftCard`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mk_giftcard` | domain：`upromotion` | 应用：`PMC` | 业务对象ID：`c855dc0c-14f8-42a3-9724-8381784c4313`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 礼品卡主表信息 |
| 物理表 | `mk_giftcard` |
| 数据库 schema | `upromotion` |
| 所属应用 | `PMC` |
| 直连字段 | 31 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 继承接口 (6个, 11字段)

- **商城租户相关** (`base.itf.IMallcorp`)
  - `iCorpId` → `iCorpId`
- **多会籍相关** (`promotion.itf.MultiMember`)
  - `cOrgId` → `cOrgId`
  - `cOrgPath` → `cOrgPath`
  - `iEnterpriseID` → `iEnterpriseID`
- **商城商家相关** (`um.base.IMallshop`)
  - `iShopId` → `iShopId`
- **审计信息** (`promotion.itf.IAuditInfo`)
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 31 个直连字段

### 文本字段 (11个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cOrgPath` | `cOrgPath` | `cOrgPath` | 组织ID(会籍对应的组织路径) |
| `name` | `name` | `name` | 未知字段 |
| `productPicUrl` | `productPicUrl` | `productPicUrl` | 未知字段 |
| `cOrgId` | `cOrgId` | `cOrgId` | 组织ID |
| `cImgName` | `cImgName` | `cImgName` | 背景图片 |
| `giftCardName` | `giftCardName` | `giftCardName` | 礼品卡名称 |
| `giftCardCode` | `giftCardCode` | `giftCardCode` | 礼品卡号码 |
| `cFolder` | `cFolder` | `cFolder` | 图片路径 |
| `cOriginalName` | `cOriginalName` | `cOriginalName` | 原图名称 |
| `fontColor` | `fontColor` | `fontColor` | 文字颜色 |
| `directionForUse` | `directionForUse` | `directionForUse` | 使用说明 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `expireStartDate` | `expireStartDate` | `expireStartDate` | 有效时间 |
| `expireEndDate` | `expireEndDate` | `expireEndDate` | 至 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `isDelete` | `isDelete` | `isDelete` | 是否已删除 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `styleId` | `styleId` | `styleId` | 预制模板 |
| `status` | `status` | `status` | 状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `allMemberLevel` | `allMemberLevel` | `allMemberLevel` | 所有会员适用 |

### 长整数 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iEnterpriseID` | `iEnterpriseID` | `iEnterpriseID` | 企业ID(多会籍时会籍对应的根结点) |
| `id` | `id` | `id` | id |
| `iShopId` | `iShopId` | `iShopId` | 商家ID |
| `iCorpId` | `iCorpId` | `mallcorp` | 租户ID |
| `promotionClassId` | `promotionClassId` | `promotionClassId` | promotionClassId |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `reduceAmount` | `reduceAmount` | `reduceAmount` | 面值 |
| `salePrice` | `salePrice` | `salePrice` | 售价 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
