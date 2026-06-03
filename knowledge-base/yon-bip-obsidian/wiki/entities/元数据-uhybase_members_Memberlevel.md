---
tags: [BIP, 元数据, 数据字典, uhybase.members.Memberlevel]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 会员等级 (`uhybase.members.Memberlevel`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_memberlevel` | domain：`uhy` | 应用：`SDMB` | 业务对象ID：`4d5efab4-dfd0-46d9-97fc-0f4fdd9f8ba9`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 会员等级 |
| 物理表 | `mp_memberlevel` |
| 数据库 schema | `uhy` |
| 所属应用 | `SDMB` |
| 直连字段 | 63 个 |
| 子表 | 2 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `rightScope` | `uhybase.members.RightScope` | composition |
| `premiumLevelCondition` | `uhybase.members.PremiumLevelCondition` | composition |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `cAppID` | `mm_corphierarchyref` |
| `iCreator` | `` |
| `` | `` |
| `ytenant_id` | `` |
| `iModifier` | `` |

## 继承接口 (4个, 6字段)

- **会员租户相关** (`base.itf.IMembercorp`)
  - `iCorpId` → `iCorpId`
- **会员管理维度** (`uhy.itf.Scope`)
  - `iScopeID` → `iScopeID`
  - `iScopeLevel` → `iScopeLevel`
  - `cScopeName` → `cScopeName`
- **创建时间** (`uhy.itf.CreateTime`)
  - `dCreateTime` → `dCreateTime`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 63 个直连字段

### 文本字段 (22个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cMemberLevelCode` | `cMemberLevelCode` | `cMemberLevelCode` | 等级编码 |
| `cMemberLevelName` | `cMemberLevelName` | `cMemberLevelName` | 等级名称 |
| `cGoodsName` | `cGoodsName` | `cGoodsName` | 关联商品 |
| `cGoodsSKUName` | `cGoodsSKUName` | `cGoodsSKUName` | 关联商品SKU |
| `cLevelProtocol` | `cLevelProtocol` | `cLevelProtocol` | 付费会员协议 |
| `cRightDesc` | `cRightDesc` | `cRightDesc` | 会员权益描述 |
| `cStyleImageUrl` | `cStyleImageUrl` | `cStyleImageUrl` | 预制模板 |
| `cFontColor` | `cFontColor` | `cFontColor` | 等级名称文字样式 |
| `cPicUrl` | `cPicUrl` | `cPicUrl` | 图片路径 |
| `cCardLogoUrl` | `cCardLogoUrl` | `cCardLogoUrl` | Logo |
| `cBackColor` | `cBackColor` | `cBackColor` | 背景颜色 |
| `cBgColor` | `cBgColor` | `cBgColor` | 背景色 |
| `cCardNoPrefix` | `cCardNoPrefix` | `cCardNoPrefix` | 卡编码英文前缀 |
| `cCardNoStart` | `cCardNoStart` | `cCardNoStart` | 流水起始码 |
| `cHint` | `cHint` | `cHint` | 首页提示文字 |
| `cMemberRightIDs` | `cMemberRightIDs` | `cMemberRightIDs` | 会员权限ID |
| `cName` | `cName` | `cName` | 名称 |
| `cRightPicUrl` | `cRightPicUrl` | `cRightPicUrl` | 背景图片 |
| `cSpecification` | `cSpecification` | `cSpecification` | 商家说明 |
| `cUseRule` | `cUseRule` | `cUseRule` | 使用规则 |
| `cWXAccountID` | `cWXAccountID` | `cWXAccountID` | 微信账号 |
| `cScopeName` | `cScopeName` | `scopeName` | 会员管理维度名称 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cAppID` | `cAppID` | `cAppID` | 会籍code |
| `iCreator` | `iCreator` | `iCreator` | 创建人 |
| `iModifier` | `iModifier` | `iModifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 布尔字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bPremium` | `bPremium` | `bPremium` | 付费会员级别 |
| `bPromotion` | `bPromotion` | `bPromotion` | 是否参与晋级 |
| `bPhoneVisible` | `bPhoneVisible` | `bPhoneVisible` | 显示手机号码 |

### 整数 (15个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iMemberProperty` | `iMemberProperty` | `iMemberProperty` | 会员类型 |
| `iOrder` | `iOrder` | `iOrder` | 顺序 |
| `iPointsLimit` | `iPointsLimit` | `iPointsLimit` | 最低积分要求 |
| `iEffectiveNum` | `iEffectiveNum` | `iEffectiveNum` | 有效期时间 |
| `iBackgroundSetting` | `iBackgroundSetting` | `iBackgroundSetting` | 背景设置 |
| `iTextSize` | `iTextSize` | `iTextSize` | 文字大小 |
| `bBarCodeVisible` | `bBarCodeVisible` | `bBarCodeVisible` | 条码是否显示 |
| `iPhonePosition` | `iPhonePosition` | `iPhonePosition` | 手机号显示位置 |
| `dCreateTime` | `dCreateTime` | `createTime` | 创建时间 |
| `iCardID` | `iCardID` | `iCardID` | 卡号ID |
| `iDisplayStyle` | `iDisplayStyle` | `iDisplayStyle` | 风格 |
| `iLevel` | `iLevel` | `iLevel` | 级别 |
| `iRightDesignSetting` | `iRightDesignSetting` | `iRightDesignSetting` | 权益项设计 |
| `iScopeLevel` | `iScopeLevel` | `iScopeLevel` | 会员管理维度 |
| `iScopeLevel` | `iScopeLevel` | `scopeLevel` | 会员管理维度 |

### 短整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iEffectiveType` | `iEffectiveType` | `iEffectiveType` | 级别有效期 |
| `iEffectiveUnit` | `iEffectiveUnit` | `iEffectiveUnit` | 有效期单位 |
| `iEffectivePeriodUnit` | `iEffectivePeriodUnit` | `iEffectivePeriodUnit` | 有效期过期 |

### 长整数 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | 主键 |
| `iGoodsID` | `iGoodsID` | `iGoodsID` | 关联商品ID |
| `iGoodsSKUID` | `iGoodsSKUID` | `iGoodsSKUID` | 关联商品SKUID |
| `iPremiumGood` | `iPremiumGood` | `iPremiumGood` | 付费级别关联商品id |
| `iScopeID` | `iScopeID` | `iScopeID` | 会籍ID |
| `iCorpId` | `iCorpId` | `membercorp` | 租户 |
| `iScopeID` | `iScopeID` | `scopeID` | 会员管理维度id |

### 数值字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `fPrice` | `fPrice` | `fPrice` | 付费价格 |
| `fPointMultiple` | `fPointMultiple` | `fPointMultiple` | 积分倍数 |
| `fDiscount` | `fDiscount` | `fDiscount` | 折扣 |
| `fPriceDiscount` | `fPriceDiscount` | `fPriceDiscount` | 付费会员购买折扣 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
| `dCreationTime` | `dCreationTime` | `dCreationTime` | 创建时间 |
| `dModifyTime` | `dModifyTime` | `dModifyTime` | 修改时间 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `premiumLevelCondition` | 付费级别购买资格 |
| `` | `` | `rightScope` | 会员等级关联权益子表 |
