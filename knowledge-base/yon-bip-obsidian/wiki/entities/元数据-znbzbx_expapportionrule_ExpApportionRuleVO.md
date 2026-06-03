---
tags: [BIP, 元数据, 数据字典, znbzbx.expapportionrule.ExpApportionRuleVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 分摊规则主表 (`znbzbx.expapportionrule.ExpApportionRuleVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`znbz_expapportionrule` | domain：`znbzbx` | 应用：`RBSM` | 业务对象ID：`c1ccd3a0-4b75-47dd-9a1b-b05511edd7f4`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 分摊规则主表 |
| 物理表 | `znbz_expapportionrule` |
| 数据库 schema | `znbzbx` |
| 所属应用 | `RBSM` |
| 直连字段 | 24 个 |
| 子表 | 5 个 |
| 关联引用 | 10 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `ExpApportionRuleCombVO` | `znbzbx.expapportionrule.ExpApportionRuleCombVO` | composition |
| `ExpApportionRuleFinaceOrgVO` | `znbzbx.expapportionrule.ExpApportionRuleFinaceOrgVO` | composition |
| `ExpSettlementRuleDimVO` | `znbzbx.expapportionrule.ExpSettlementRuleDimVO` | composition |
| `ExpApportionRuleDimVO` | `znbzbx.expapportionrule.ExpApportionRuleDimVO` | composition |
| `ExpSettlementRuleCombVO` | `znbzbx.expapportionrule.ExpSettlementRuleCombVO` | composition |

## 关联引用 (10个)

| 字段名 | 引用类型 |
|--------|---------|
| `` | `` |
| `cfinaceorg` | `ucf-org-center.org_pure_tree_ref` |
| `ytenant_id` | `` |
| `tenant_id` | `` |

## 继承接口 (4个, 12字段)

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
- **租户相关** (`base.itf.ITenant`)
  - `tenant_id` → `tenant_id`
- **统一租户接口(扩展)** (`ucfbase.ucfbaseItf.IYTenantExt`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 24 个直连字段

### 文本字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rulegroupcode` | `rulegroupcode` | `rulegroupcode` | 规则组编码 |
| `billtypecode` | `billtypecode` | `billtypecode` | 单据类型 |
| `` | `creator` | `creator` | 创建人 |
| `` | `modifier` | `modifier` | 修改人 |
| `ruletypecode` | `ruletypecode` | `ruletypecode` | 规则类型编码 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户id |
| `cfinaceorg` | `cfinaceorg` | `cfinaceorg` | 业务单元 |
| `tenant_id` | `tenant_id` | `tenant` | 租户 |
| `` | `creatorId` | `creatorId` | 创建人ID |
| `` | `modifierId` | `modifierId` | 修改人ID |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `create_date` | `create_date` | `createDate` | 创建日期 |
| `modify_date` | `modify_date` | `modifyDate` | 修改日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `stopstatus` | `stopstatus` | `stopstatus` | 停用状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### timestamp (4个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `stop_time` | `stop_time` | `stoptime` | 停用时间 |
| `create_time` | `create_time` | `createTime` | 创建时间 |
| `modify_time` | `modify_time` | `modifyTime` | 修改时间 |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `rulegroupname` | `rulegroupname` | `rulegroupname` | 规则组名称 |

### other (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `ExpApportionRuleCombVO` | 分摊规则 |
| `` | `` | `ExpApportionRuleDimVO` | 分摊规则转换/分摊维度 |
| `` | `` | `ExpApportionRuleFinaceOrgVO` | 业务单元 |
| `` | `` | `ExpSettlementRuleCombVO` | 结算规则 |
| `` | `` | `ExpSettlementRuleDimVO` | 结算规则转换/结算维度 |
