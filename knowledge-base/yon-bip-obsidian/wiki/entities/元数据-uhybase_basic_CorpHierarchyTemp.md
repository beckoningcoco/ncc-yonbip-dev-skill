---
tags: [BIP, 元数据, 数据字典, uhybase.basic.CorpHierarchyTemp]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 会籍 (`uhybase.basic.CorpHierarchyTemp`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_corphierarchy` | domain：`uhy` | 应用：`SDMB` | 业务对象ID：`fe6d2cb8-d520-45f2-9471-ce6271124ba4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 会籍 |
| 物理表 | `mp_corphierarchy` |
| domain/服务域 | `uhy` |
| schema | `yilian` |
| 所属应用 | `SDMB` |
| 直连字段 | 16 个 |
| 子表 | 0 个 |
| 关联引用 | 2 个 |

## 关联引用 (2个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `iOrgID` | `` |

## 继承接口 (3个, 3字段)

- **会员租户相关** (`base.itf.IMembercorp`)
  - `iCorpId` → `iCorpId`
- **创建时间** (`uhy.itf.CreateTime`)
  - `dCreateTime` → `dCreateTime`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 16 个直连字段

### 文本字段 (8个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cAppID` | `cAppID` | `cAppID` | 会籍ID |
| `cAppName` | `cAppName` | `cAppName` | 会籍名称 |
| `cECCustomerID` | `cECCustomerID` | `cECCustomerID` | 电商客户id |
| `cOrgName` | `cOrgName` | `cOrgName` | 组织名称 |
| `cOrgPath` | `cOrgPath` | `cOrgPath` | 组织路径 |
| `cRegAgreement` | `cRegAgreement` | `cRegAgreement` | 会员协议 |
| `cUserName` | `cUserName` | `cUserName` | 最近修改人 |
| `id` | `id` | `id` | ID |

### 引用字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iOrgID` | `iOrgID` | `iOrgID` | 组织ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dCreateTime` | `dCreateTime` | `createTime` | 创建时间 |
| `dUpdateTime` | `dUpdateTime` | `dUpdateTime` | 更新时间 |

### 短整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `bIsOpenUpMall` | `bIsOpenUpMall` | `bIsOpenUpMall` | 是否允许开通U商城， |
| `bOpenUpMall` | `bOpenUpMall` | `bOpenUpMall` | 是否开通商城 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iCorpId` | `iCorpId` | `membercorp` | 租户 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
