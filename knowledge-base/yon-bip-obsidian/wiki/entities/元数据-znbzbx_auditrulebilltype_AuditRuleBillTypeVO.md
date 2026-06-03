---
tags: [BIP, 元数据, 数据字典, znbzbx.auditrulebilltype.AuditRuleBillTypeVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 交易类型稽核规则 (`znbzbx.auditrulebilltype.AuditRuleBillTypeVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_auditrule_billtype` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`a7bb7d68-a0a4-45d9-9928-426843cf5802`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 交易类型稽核规则 |
| 物理表 | `znbz_auditrule_billtype` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 37 个 |
| 子表 | 1 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `AuditRuleBillTypeBusimemoVO` | `znbzbx.auditrulebilltype.AuditRuleBillTypeBusimemoVO` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `ytenant_id` | `` |
| `pk_auditclass` | `znbzbx_auditclassref` |
| `pk_auditrule` | `znbzbx_auditruleref` |
| `` | `` |
| `vbilltypeid` | `` |
| `bustype` | `bd_billtyperef` |
| `tenant_id` | `` |

## 继承接口 (5个, 13字段)

- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 37 个直连字段

### 文本字段 (12个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `erpCode` | `erpCode` | `erpCode` | 商家编码 |
| `pk_billtype` | `pk_billtype` | `pk_billtype` | 单据类型编码 |
| `vsourceaction` | `vsourceaction` | `vsourceaction` | 控制时点 |
| `vmemo` | `vmemo` | `vmemo` | 备注 |
| `` | `creator` | `creator` | 创建者 |
| `` | `modifier` | `modifier` | 修改者 |
| `vdef1` | `vdef1` | `vdef1` | 自定义项1 |
| `vdef2` | `vdef2` | `vdef2` | 自定义项2 |
| `vdef3` | `vdef3` | `vdef3` | 自定义项3 |
| `vdef4` | `vdef4` | `vdef4` | 自定义项4 |
| `vdef5` | `vdef5` | `vdef5` | 自定义项5 |
| `code` | `code` | `code` | 编码 |

### 引用字段 (9个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 业务单元 |
| `vbilltypeid` | `vbilltypeid` | `vbilltypeid` | 单据类型 |
| `` | `creatorId` | `creatorId` | 创建人 |
| `` | `modifierId` | `modifierId` | 修改人 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `bustype` | `bustype` | `bustype` | 交易类型 |
| `pk_auditclass` | `pk_auditclass` | `pk_auditclass` | 稽核类别ID |
| `pk_auditrule` | `pk_auditrule` | `pk_auditrule` | 稽核规则ID |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |

### 整数 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `icontrolprop` | `icontrolprop` | `icontrolprop` | 稽核控制属性 |
| `isuitbusimemo` | `isuitbusimemo` | `isuitbusimemo` | 适用费用项目范围 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### other (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `AuditRuleBillTypeBusimemoVO` | 交易类型稽核规则费用项目 |
