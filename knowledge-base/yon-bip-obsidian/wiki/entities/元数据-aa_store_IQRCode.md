---
tags: [BIP, 元数据, 数据字典, aa.store.IQRCode]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 渠道 (`aa.store.IQRCode`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_entchannel` | domain：`yxybase` | 应用：`Marketingpublic` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 渠道 |
| 物理表 | `mp_entchannel` |
| 数据库 schema | `yxybase` |
| 所属应用 | `Marketingpublic` |
| 直连字段 | 12 个 |
| 子表 | 0 个 |
| 关联引用 | 3 个 |

## 关联引用 (3个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `iStoreId` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 12 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cAppID` | `cAppID` | `cAppID` | 会员体系ID |
| `cChannelCode` | `cChannelCode` | `cChannelCode` | 渠道编码 |
| `cChannelName` | `cChannelName` | `cChannelName` | 渠道名称 |
| `cChannelScope` | `cChannelScope` | `cChannelScope` | 渠道类型补充 |
| `iBizId` | `iBizId` | `iBizId` | 主表主键 |

### 引用字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iStoreId` | `iStoreId` | `iStoreId` | 门店主键 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iChannelType` | `iChannelType` | `iChannelType` | 渠道类型 |
| `iQRCodeSceneId` | `iQRCodeSceneId` | `iQRCodeSceneId` | 码值 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `iQRCodeType` | `iQRCodeType` | `iQRCodeType` | 二维码类型 |
