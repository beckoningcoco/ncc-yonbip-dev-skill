---
tags: [BIP, 元数据, 数据字典, pc.manage.MaterialStatusDetail]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 物料状态明细 (`pc.manage.MaterialStatusDetail`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`pc_materialstatus_detail` | domain：`productcenter` | 应用：`GZTBDM` | 业务对象ID：``

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料状态明细 |
| 物理表 | `pc_materialstatus_detail` |
| 数据库 schema | `productcenter` |
| 所属应用 | `GZTBDM` |
| 直连字段 | 23 个 |
| 子表 | 1 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `materialStatusDetailAction` | `pc.manage.MaterialStatusDetailAction` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `transtype` | `transtype.bd_billtyperef` |
| `ytenant_id` | `` |
| `` | `` |
| `pc_materialstatus_id` | `` |
| `tenant_id` | `` |

## 继承接口 (4个, 13字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 23 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |
| `service_code` | `service_code` | `serviceCode` | 服务编码 |
| `service_name` | `service_name` | `serviceName` | 服务编码名称 |
| `social_srcid` | `social_srcid` | `socialSrcid` | 社会化来源 |
| `social_tenantid` | `social_tenantid` | `socialTenantid` | 社会化来源租户 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `transtype` | `transtype` | `transType` | 交易类型 |
| `pc_materialstatus_id` | `pc_materialstatus_id` | `materialStatusId` | 物料状态 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户(废弃) |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 整数 (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `granularity_control` | `granularity_control` | `granularityControl` | 控制粒度 |
| `control_rule` | `control_rule` | `controlRule` | 控制规则 |
| `system_flag` | `system_flag` | `systemFlag` | 系统预置 |
| `social_mctype` | `social_mctype` | `socialMctype` | 社会化管控类型 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `materialStatusDetailAction` | 物料状态明细-控制点明细 |
