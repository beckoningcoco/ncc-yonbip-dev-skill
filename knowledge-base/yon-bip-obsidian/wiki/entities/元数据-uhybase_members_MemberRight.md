---
tags: [BIP, 元数据, 数据字典, uhybase.members.MemberRight]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 会员权益 (`uhybase.members.MemberRight`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_memberrightdoc` | domain：`uhy` | 应用：`SDMB` | 业务对象ID：`2cc7b2e3-02d3-43da-bf81-be580d77b6f8`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 会员权益 |
| 物理表 | `mp_memberrightdoc` |
| domain/服务域 | `uhy` |
| schema | `yilian` |
| 所属应用 | `SDMB` |
| 直连字段 | 19 个 |
| 子表 | 2 个 |
| 关联引用 | 6 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `couponScope` | `uhybase.members.CouponScope` | composition |
| `lotteryScope` | `uhybase.members.LotteryScope` | composition |

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

> 共 19 个直连字段

### 文本字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cName` | `cName` | `name` | 权益名称 |
| `cContent` | `cContent` | `content` | 权益积分 |
| `cDes` | `cDes` | `dec` | 权益描述 |
| `cScopeName` | `cScopeName` | `scopeName` | 会员管理维度名称 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cAppID` | `cAppID` | `cAppID` | 会籍code |
| `iCreator` | `iCreator` | `iCreator` | 创建人 |
| `iModifier` | `iModifier` | `iModifier` | 修改人 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dCreateTime` | `dCreateTime` | `createTime` | 创建时间 |
| `iScopeLevel` | `iScopeLevel` | `scopeLevel` | 会员管理维度 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `iCorpId` | `iCorpId` | `membercorp` | 租户 |
| `iScopeID` | `iScopeID` | `scopeID` | 会员管理维度id |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
| `dCreationTime` | `dCreationTime` | `dCreationTime` | 创建时间 |
| `dModifyTime` | `dModifyTime` | `dModifyTime` | 修改时间 |

### byte (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iType` | `iType` | `type` | 权益类型 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `couponScope` | 权益关联卡券子表 |
| `` | `` | `lotteryScope` | 权益关联活动子表 |
