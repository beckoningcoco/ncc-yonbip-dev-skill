---
tags: [BIP, 元数据, 数据字典, znbzbx.memoapply.ApplySubsidyDetailVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 申请单补贴明细 (`znbzbx.memoapply.ApplySubsidyDetailVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_memoapply_expsubsidydetail` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`790d5e45-36c4-4db3-b7ec-9078e2bddd4b`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 申请单补贴明细 |
| 物理表 | `znbz_memoapply_expsubsidydetail` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 65 个 |
| 子表 | 0 个 |
| 关联引用 | 7 个 |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `ytenant_id` | `` |
| `pk_memoapply` | `` |
| `vhotelstdcurrency` | `` |
| `vwelfarestdcurrency` | `` |
| `pk_addr` | `` |
| `pk_handlepsn` | `` |
| `tenant_id` | `` |

## 继承接口 (2个, 2字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 65 个直连字段

### 文本字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dbegintime` | `dbegintime` | `dbegintime` | 开始时间 |
| `dendtime` | `dendtime` | `dendtime` | 结束时间 |
| `remark` | `remark` | `remark` | 备注 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pk_addr` | `pk_addr` | `pk_addr` | 地点 |
| `pk_handlepsn` | `pk_handlepsn` | `pk_handlepsn` | 申请人 |
| `pk_memoapply` | `pk_memoapply` | `pk_memoapply` | 申请单ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `vhotelstdcurrency` | `vhotelstdcurrency` | `vhotelstdcurrency` | 住宿费标准币种 |
| `vwelfarestdcurrency` | `vwelfarestdcurrency` | `vwelfarestdcurrency` | 补贴标准币种 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `dsubsidydate` | `dsubsidydate` | `dsubsidydate` | 日期 |

### 整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `holidaytype` | `holidaytype` | `holidaytype` | 节假日类型 |
| `journeytype` | `journeytype` | `journeytype` | 出发/返回 |
| `weekday` | `weekday` | `weekday` | 星期 |

### 长整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `subsidydetailid` | `subsidydetailid` | `subsidydetailid` | 补贴明细关联id |

### 数值字段 (48个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nbasehotelstdmny` | `nbasehotelstdmny` | `nbasehotelstdmny` | 住宿费每日标准 |
| `nbaseintransstdmny` | `nbaseintransstdmny` | `nbaseintransstdmny` | 市内交通费每日标准 |
| `nbasemealstandard` | `nbasemealstandard` | `nbasemealstandard` | 伙食费每日补贴标准 |
| `nbasemiscellansexpstd` | `nbasemiscellansexpstd` | `nbasemiscellansexpstd` | 公杂费每日补贴标准 |
| `nbasestdotherwelfaremny1` | `nbasestdotherwelfaremny1` | `nbasestdotherwelfaremny1` | 补贴1每日标准 |
| `nbasestdotherwelfaremny10` | `nbasestdotherwelfaremny10` | `nbasestdotherwelfaremny10` | 补贴10每日标准 |
| `nbasestdotherwelfaremny2` | `nbasestdotherwelfaremny2` | `nbasestdotherwelfaremny2` | 补贴2每日标准 |
| `nbasestdotherwelfaremny3` | `nbasestdotherwelfaremny3` | `nbasestdotherwelfaremny3` | 补贴3每日标准 |
| `nbasestdotherwelfaremny4` | `nbasestdotherwelfaremny4` | `nbasestdotherwelfaremny4` | 补贴4每日标准 |
| `nbasestdotherwelfaremny5` | `nbasestdotherwelfaremny5` | `nbasestdotherwelfaremny5` | 补贴5每日标准 |
| `nbasestdotherwelfaremny6` | `nbasestdotherwelfaremny6` | `nbasestdotherwelfaremny6` | 补贴6每日标准 |
| `nbasestdotherwelfaremny7` | `nbasestdotherwelfaremny7` | `nbasestdotherwelfaremny7` | 补贴7每日标准 |
| `nbasestdotherwelfaremny8` | `nbasestdotherwelfaremny8` | `nbasestdotherwelfaremny8` | 补贴8每日标准 |
| `nbasestdotherwelfaremny9` | `nbasestdotherwelfaremny9` | `nbasestdotherwelfaremny9` | 补贴9每日标准 |
| `nbusitravalday` | `nbusitravalday` | `nbusitravalday` | 出差天数 |
| `nhoteldays` | `nhoteldays` | `nhoteldays` | 住宿天数 |
| `nhotelstdmny` | `nhotelstdmny` | `nhotelstdmny` | 住宿费标准 |
| `nintransstdmny` | `nintransstdmny` | `nintransstdmny` | 市内交通费标准 |
| `nlineno` | `nlineno` | `nlineno` | 行号 |
| `nmealstandard` | `nmealstandard` | `nmealstandard` | 伙食费补贴标准 |
| `nmiscellansexpstd` | `nmiscellansexpstd` | `nmiscellansexpstd` | 公杂费补贴标准 |
| `nnathotelstdmny` | `nnathotelstdmny` | `nnathotelstdmny` | 住宿费标准-本币 |
| `nnatintransstdmny` | `nnatintransstdmny` | `nnatintransstdmny` | 市内交通费标准-本币 |
| `nnatmealstdmny` | `nnatmealstdmny` | `nnatmealstdmny` | 伙食费补贴标准-本币 |
| `nnatmiscellansexpstd` | `nnatmiscellansexpstd` | `nnatmiscellansexpstd` | 公杂费补贴标准-本币 |
| `nnatotherwelfarestdmny1` | `nnatotherwelfarestdmny1` | `nnatotherwelfarestdmny1` | 补贴1标准-本币 |
| `nnatotherwelfarestdmny10` | `nnatotherwelfarestdmny10` | `nnatotherwelfarestdmny10` | 补贴10标准-本币 |
| `nnatotherwelfarestdmny2` | `nnatotherwelfarestdmny2` | `nnatotherwelfarestdmny2` | 补贴2标准-本币 |
| `nnatotherwelfarestdmny3` | `nnatotherwelfarestdmny3` | `nnatotherwelfarestdmny3` | 补贴3标准-本币 |
| `nnatotherwelfarestdmny4` | `nnatotherwelfarestdmny4` | `nnatotherwelfarestdmny4` | 补贴4标准-本币 |
| `nnatotherwelfarestdmny5` | `nnatotherwelfarestdmny5` | `nnatotherwelfarestdmny5` | 补贴5标准-本币 |
| `nnatotherwelfarestdmny6` | `nnatotherwelfarestdmny6` | `nnatotherwelfarestdmny6` | 补贴6标准-本币 |
| `nnatotherwelfarestdmny7` | `nnatotherwelfarestdmny7` | `nnatotherwelfarestdmny7` | 补贴7标准-本币 |
| `nnatotherwelfarestdmny8` | `nnatotherwelfarestdmny8` | `nnatotherwelfarestdmny8` | 补贴8标准-本币 |
| `nnatotherwelfarestdmny9` | `nnatotherwelfarestdmny9` | `nnatotherwelfarestdmny9` | 补贴9标准-本币 |
| `nnattotalwelfaremny` | `nnattotalwelfaremny` | `nnattotalwelfaremny` | 补助合计-本币 |
| `nstdotherwelfaremny1` | `nstdotherwelfaremny1` | `nstdotherwelfaremny1` | 补贴1标准 |
| `nstdotherwelfaremny10` | `nstdotherwelfaremny10` | `nstdotherwelfaremny10` | 补贴10标准 |
| `nstdotherwelfaremny2` | `nstdotherwelfaremny2` | `nstdotherwelfaremny2` | 补贴2标准 |
| `nstdotherwelfaremny3` | `nstdotherwelfaremny3` | `nstdotherwelfaremny3` | 补贴3标准 |
| `nstdotherwelfaremny4` | `nstdotherwelfaremny4` | `nstdotherwelfaremny4` | 补贴4标准 |
| `nstdotherwelfaremny5` | `nstdotherwelfaremny5` | `nstdotherwelfaremny5` | 补贴5标准 |
| `nstdotherwelfaremny6` | `nstdotherwelfaremny6` | `nstdotherwelfaremny6` | 补贴6标准 |
| `nstdotherwelfaremny7` | `nstdotherwelfaremny7` | `nstdotherwelfaremny7` | 补贴7标准 |
| `nstdotherwelfaremny8` | `nstdotherwelfaremny8` | `nstdotherwelfaremny8` | 补贴8标准 |
| `nstdotherwelfaremny9` | `nstdotherwelfaremny9` | `nstdotherwelfaremny9` | 补贴9标准 |
| `ntotalwelfaremny` | `ntotalwelfaremny` | `ntotalwelfaremny` | 补助合计 |
| `nwelfaredays` | `nwelfaredays` | `nwelfaredays` | 补贴天数 |

### timestamp (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
