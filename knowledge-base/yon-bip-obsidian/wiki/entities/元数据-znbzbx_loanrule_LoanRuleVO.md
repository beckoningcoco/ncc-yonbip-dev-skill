---
tags: [BIP, 元数据, 数据字典, znbzbx.loanrule.LoanRuleVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 借款规则主表 (`znbzbx.loanrule.LoanRuleVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_loanrule` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`25c62c0f-2d44-4cfa-a9c2-9aaa60692f18`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 借款规则主表 |
| 物理表 | `znbz_loanrule` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 45 个 |
| 子表 | 3 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `loanRuleBustypeVOs` | `znbzbx.loanrule.LoanRuleBustypeVO` | composition |
| `loanRuleFinaceOrgVOs` | `znbzbx.loanrule.LoanRuleFinaceOrgVO` | composition |
| `loanquotavos` | `znbzbx.loanrule.LoanQuotaVO` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `ytenant_id` | `` |
| `loanbustype` | `bd_billtyperef` |
| `tenant_id` | `` |

## 继承接口 (5个, 13字段)

- **审计信息** (`base.itf.IAuditInfo`)
  - `create_date` → `create_date`
  - `create_time` → `create_time`
  - `` → ``
  - `` → ``
  - `` → ``
  - `` → ``
  - `modify_date` → `modify_date`
  - `modify_time` → `modify_time`
- **停用信息** (`base.itf.IStopping`)
  - `stopstatus` → `stopstatus`
  - `stop_time` → `stop_time`
- **erp编码** (`base.itf.IErpCode`)
  - `erpCode` → `erpCode`
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 45 个直连字段

### 文本字段 (13个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vrulecode` | `vrulecode` | `vrulecode` | 规则编码 |
| `erpCode` | `erpCode` | `erpCode` | 商家编码 |
| `pk_loanbilltype` | `pk_loanbilltype` | `pk_loanbilltype` | 借款单据 |
| `vloanbilltypeid` | `vloanbilltypeid` | `vloanbilltypeid` | 借款单据类型ID |
| `vmemo` | `vmemo` | `vmemo` | 备注 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `pk_billtype` | `pk_billtype` | `pk_billtype` | 单据类型 |
| `vdef1` | `vdef1` | `vdef1` | 自定义项1 |
| `vdef2` | `vdef2` | `vdef2` | 自定义项2 |
| `vdef3` | `vdef3` | `vdef3` | 自定义项3 |
| `vdef4` | `vdef4` | `vdef4` | 自定义项4 |
| `vdef5` | `vdef5` | `vdef5` | 自定义项5 |

### 引用字段 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 业务单元ID |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `loanbustype` | `loanbustype` | `loanbustype` | 借款交易类型ID |
| `` | `creatorId` | `creatorId` | 创建人id |
| `` | `modifierId` | `modifierId` | 修改人id |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 启用状态 |
| `imust` | `imust` | `imust` | 前款不清后款不借 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `inumtype` | `inumtype` | `inumtype` | 控制方式 |
| `inumcontobj` | `inumcontobj` | `inumcontobj` | 控制对象 |
| `idaytype` | `idaytype` | `idaytype` | 控制方式 |
| `idaycontobj` | `idaycontobj` | `idaycontobj` | 控制对象 |
| `imusttype` | `imusttype` | `imusttype` | 控制方式 |
| `imustcontobj` | `imustcontobj` | `imustcontobj` | 控制对象 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `nnum` | `nnum` | `nnum` | 允许借款数量(张) |
| `nday` | `nday` | `nday` | 允许最长借款期限(天) |
| `ndefnum1` | `ndefnum1` | `ndefnum1` | 自定义项(小数)1 |
| `ndefnum2` | `ndefnum2` | `ndefnum2` | 自定义项(小数)2 |
| `ndefnum3` | `ndefnum3` | `ndefnum3` | 自定义项(小数)3 |
| `ndefnum4` | `ndefnum4` | `ndefnum4` | 自定义项(小数)4 |
| `ndefnum5` | `ndefnum5` | `ndefnum5` | 自定义项(小数)5 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `vrulename` | `vrulename` | `vrulename` | 规则名称 |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### other (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `loanRuleBustypeVOs` | 适用交易类型 |
| `` | `` | `loanRuleFinaceOrgVOs` | 适用业务单元 |
| `` | `` | `loanquotavos` | 允许借款额度 |
