---
tags: [BIP, 元数据, 数据字典, aa.store.StoreLevel]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 终端等级 (`aa.store.StoreLevel`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`mp_storelevel` | domain：`yxybase` | 应用：`Marketingpublic` | 业务对象ID：`7ae9ad53-a12f-4e4d-a9cc-1ac54291e4e4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 终端等级 |
| 物理表 | `mp_storelevel` |
| 数据库 schema | `yxybase` |
| 所属应用 | `Marketingpublic` |
| 直连字段 | 19 个 |
| 子表 | 0 个 |
| 关联引用 | 4 个 |

## 关联引用 (4个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `` | `` |
| `tenant_id` | `` |

## 继承接口 (4个, 10字段)

- **U会员审计信息** (`membase.itf.IYlAuditable`)
  - `dCreateDate` → `dCreateDate`
  - `dCreateTime` → `dCreateTime`
  - `cCreator` → `cCreator`
  - `cModifier` → `cModifier`
  - `dModifyDate` → `dModifyDate`
  - `dModifyTime` → `dModifyTime`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 19 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cCode` | `cCode` | `code` | 编码 |
| `cCreator` | `cCreator` | `creator` | 创建人 |
| `cModifier` | `cModifier` | `modifier` | 修改人 |
| `cAppID` | `cAppID` | `cAppID` | 会员体系ID |
| `cBgColor` | `cBgColor` | `bgColor` | 等级颜色 |

### 引用字段 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dModifyDate` | `dModifyDate` | `modifyDate` | 修改日期 |
| `dCreateDate` | `dCreateDate` | `createDate` | 创建日期 |

### 日期时间 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dCreateTime` | `dCreateTime` | `createTime` | 创建时间 |
| `dModifyTime` | `dModifyTime` | `modifyTime` | 修改时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### multiLanguage (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cName` | `cName` | `name` | 名称 |
| `cMemo` | `cMemo` | `memo` | 备注 |

### timestamp (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ts` | `ts` | `pubts` | 时间戳 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
