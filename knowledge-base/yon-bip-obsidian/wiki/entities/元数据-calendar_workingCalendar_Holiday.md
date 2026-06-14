---
tags: [BIP, 元数据, 数据字典, calendar.workingCalendar.Holiday]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 假日定义 (`calendar.workingCalendar.Holiday`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`ts_holiday` | domain：`ucf-staff-center` | 应用：`DPMWDC` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 假日定义 |
| 物理表 | `ts_holiday` |
| domain/服务域 | `ucf-staff-center` |
| schema | `iuap_apdoc_basedoc` |
| 所属应用 | `DPMWDC` |
| 直连字段 | 22 个 |
| 子表 | 0 个 |
| 关联引用 | 6 个 |

## 关联引用 (6个)

| 字段名 | 引用类型 |
|--------|---------|
| `CREATOR` | `` |
| `ytenant_id` | `` |
| `MODIFIER` | `` |
| `parentid` | `` |
| `tenantid` | `` |

## 继承接口 (2个, 2字段)

- **租户接口** (`ucfbase.ucfbaseItf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 22 个直连字段

### 文本字段 (10个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `holidyname2` | `holidyname2` | `holidyname2` | 节假日名称2 |
| `holidyname3` | `holidyname3` | `holidyname3` | 节假日名称3 |
| `holidyname4` | `holidyname4` | `holidyname4` | 节假日名称4 |
| `holidyname5` | `holidyname5` | `holidyname5` | 节假日名称5 |
| `holidyname6` | `holidyname6` | `holidyname6` | 节假日名称6 |
| `id` | `id` | `id` | ID |
| `ispreset` | `ispreset` | `ispreset` | 是否预置 0：否，1：是 |
| `legalholiday` | `legalholiday` | `legalholiday` | 法定假日 时间戳的JSON数组格式 |
| `reptime` | `reptime` | `reptime` | 调休上班日期 时间戳 |
| `year` | `year` | `year` | 年 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `CREATOR` | `CREATOR` | `creator` | 创建者 |
| `MODIFIER` | `MODIFIER` | `modifier` | 修改者 |
| `parentid` | `parentid` | `parentid` | 假日所属类别ID |
| `tenantid` | `tenantid` | `tenant` | 租户ID |
| `ytenant_id` | `ytenant_id` | `yTenantId` | 友互通租户ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `begintime` | `begintime` | `begintime` | 开始时间 |
| `endtime` | `endtime` | `endtime` | 结束时间 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `creationtime` | `creationtime` | `createTime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifyTime` | 修改时间 |
| `TS` | `TS` | `pubts` | ts |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `holidyname` | `holidyname` | `holidyname` | 节假日名称 |
