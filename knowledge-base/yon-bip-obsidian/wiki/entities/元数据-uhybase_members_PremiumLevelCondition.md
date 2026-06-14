---
tags: [BIP, 元数据, 数据字典, uhybase.members.PremiumLevelCondition]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 付费级别购买资格 (`uhybase.members.PremiumLevelCondition`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_premiumlevelcondition` | domain：`uhy` | 应用：`SDMB` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 付费级别购买资格 |
| 物理表 | `mp_premiumlevelcondition` |
| domain/服务域 | `uhy` |
| schema | `yilian` |
| 所属应用 | `SDMB` |
| 直连字段 | 18 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `cAppID` | `` |
| `ytenant_id` | `` |
| `iLabelID` | `mm_labeldocref` |
| `iLevelID` | `` |
| `iParentGroup` | `` |

## 继承接口 (3个, 3字段)

- **会员租户相关** (`base.itf.IMembercorp`)
  - `iCorpId` → `iCorpId`
- **创建时间** (`uhy.itf.CreateTime`)
  - `dCreateTime` → `dCreateTime`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 18 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cAttr` | `cAttr` | `cAttr` | 属性 |
| `cAttrSource` | `cAttrSource` | `cAttrSource` | 属性来源 |
| `cCode` | `cCode` | `cCode` | 数据编码 |
| `cCondition` | `cCondition` | `cCondition` | 条件 |
| `cConditionRelation` | `cConditionRelation` | `cConditionRelation` | 条件关系 |
| `cParentCode` | `cParentCode` | `cParentCode` | 父级数据编码 |
| `cType` | `cType` | `cType` | 条件类型 |
| `cValue1` | `cValue1` | `cValue1` | 条件值1 |
| `cValue2` | `cValue2` | `cValue2` | 条件值2 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iLabelID` | `iLabelID` | `iLabelID` | 付费会员购买资格标签 |
| `cAppID` | `cAppID` | `cAppID` | 会籍APPId |
| `iLevelID` | `iLevelID` | `iLevelID` | 级别 |
| `iParentGroup` | `iParentGroup` | `iParentGroup` | 父节点ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dCreateTime` | `dCreateTime` | `createTime` | 创建时间 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | id |
| `iCorpId` | `iCorpId` | `membercorp` | 租户 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
