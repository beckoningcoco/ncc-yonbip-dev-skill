---
tags: [BIP, 元数据, 数据字典, znbzbx.airticketcheck.AirticketCheckVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 机票查验结果 (`znbzbx.airticketcheck.AirticketCheckVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_airticketcheck` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`70586a9a-0a4c-4b6a-9213-98b8a32c6ff7`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 机票查验结果 |
| 物理表 | `znbz_airticketcheck` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 34 个 |
| 子表 | 0 个 |
| 关联引用 | 5 个 |

## 关联引用 (5个)

| 字段名 | 引用类型 |
|--------|---------|
| `cfinaceorg` | `` |
| `ytenant_id` | `` |
| `` | `` |
| `tenant_id` | `` |

## 继承接口 (3个, 10字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 34 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `checkdata` | `checkdata` | `checkdata` | 查验数据 |
| `` | `creator` | `creator` | 创建人名称 |
| `` | `modifier` | `modifier` | 修改人名称 |
| `vdestination` | `vdestination` | `vdestination` | 目的地 |
| `vfirstcarrier` | `vfirstcarrier` | `vfirstcarrier` | 承运公司 |
| `videntitynumber` | `videntitynumber` | `videntitynumber` | 证件号 |
| `videntitytype` | `videntitytype` | `videntitytype` | 证件类型 |
| `vinvoiceno` | `vinvoiceno` | `vinvoiceno` | 票号 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |
| `vname` | `vname` | `vname` | 姓名 |
| `vorigin` | `vorigin` | `vorigin` | 始发地 |
| `vprintnumber` | `vprintnumber` | `vprintnumber` | 印刷号 |
| `vsubtrips` | `vsubtrips` | `vsubtrips` | 行程 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 业务单元 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `dcheckdate` | `dcheckdate` | `dcheckdate` | 查验时间 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 长整数 (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `pk_checkman` | `pk_checkman` | `pk_checkman` | 查验人 |
| `pk_tallydata` | `pk_tallydata` | `pk_tallydata` | 来源票据pk |

### 数值字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ncadevelopmentfund` | `ncadevelopmentfund` | `ncadevelopmentfund` | 民航发展基金 |
| `nfare` | `nfare` | `nfare` | 票价 |
| `nfuelsurcharge` | `nfuelsurcharge` | `nfuelsurcharge` | 燃油附加费 |
| `ninsurance` | `ninsurance` | `ninsurance` | 保险费 |
| `nmny` | `nmny` | `nmny` | 金额 |
| `ntaxmny` | `ntaxmny` | `ntaxmny` | 税额 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `dstarttime` | `dstarttime` | `dstarttime` | 出发时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
