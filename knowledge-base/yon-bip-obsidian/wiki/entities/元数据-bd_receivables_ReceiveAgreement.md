---
tags: [BIP, 元数据, 数据字典, bd.receivables.ReceiveAgreement]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 收款协议 (`bd.receivables.ReceiveAgreement`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_receiveagreement` | domain：`ucfbasedoc` | 应用：`DPMSETL` | 业务对象ID：`f453e337-8793-4732-a675-27f17b90ac1a`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收款协议 |
| 物理表 | `bd_receiveagreement` |
| 数据库 schema | `ucfbasedoc` |
| 所属应用 | `DPMSETL` |
| 直连字段 | 31 个 |
| 子表 | 2 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `bd.receivables.ReceiveAgreementDefine` | composition |
| `receivableDates` | `bd.receivables.ReceivableDate` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `ytenant_id` | `` |
| `org_group_id` | `` |
| `modifier` | `` |
| `defineCharacter` | `` |
| `manageorg` | `ucf-org-center.org_unit_tree_ref` |
| `` | `` |

## 继承接口 (4个, 6字段)

- **审计信息** (`basedoc.basedocItf.AuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 31 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cCode` | `cCode` | `code` | 编码 |
| `objid` | `objid` | `objid` | 外系统主键 |
| `cComment` | `cComment` | `comment` | 说明 |
| `sysid` | `sysid` | `sysid` | 应用标识 |
| `log` | `log` | `log` | 操作日志 |
| `tenantid` | `tenantid` | `tenant` | 租户(废弃) |
| `exec_status` | `exec_status` | `execStatus` | 执行状态 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `manageorg` | `manageorg` | `orgId` | 管理组织 |
| `org_group_id` | `org_group_id` | `orgGroupId` | 适用范围集合 |
| `ytenant_id` | `ytenant_id` | `ytenant` | 租户 |
| `creator` | `creator` | `creator` | 创建人 |
| `modifier` | `modifier` | `modifier` | 修改人 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `enablestartdate` | `enablestartdate` | `enableStartDate` | 协议生效时间 |
| `enableenddate` | `enableenddate` | `enableEndDate` | 协议失效时间 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `instalment` | `instalment` | `instalment` | 分期收款 |

### 整数 (6个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `oadayConfirmType` | `oadayConfirmType` | `oadayConfirmType` | 出账日确定方式 |
| `expiredayConfirmType` | `expiredayConfirmType` | `expiredayConfirmType` | 到期日确定方式 |
| `prereceivetype` | `prereceivetype` | `preReceiveType` | 预收折算方式 |
| `iorder` | `iorder` | `order` | 顺序 |
| `enable` | `enable` | `enable` | 启用状态 |
| `dr` | `dr` | `dr` | 删除状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `id` | `id` | `id` | ID |

### 数值字段 (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `interestrate` | `interestrate` | `interestRate` | 分期利率 |
| `servicecount` | `servicecount` | `servicecount` | 手续费 |

### other (2个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `` | `` | `receivableDates` | 收款账期 |
| `` | `` | `defines` | 收款协议扩展表(自定义项扩展表) |

### multiLanguage (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `cName` | `cName` | `name` | 名称 |

### UserDefine (1个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `defineCharacter` | `defineCharacter` | `defineCharacter` | 自定义项特征 |

### timestamp (3个)

| 字段名 | 数据库列 | 字段编码 | 显示名 |
|--------|---------|---------|--------|
| `pubts` | `pubts` | `pubts` | 时间戳 |
| `creationtime` | `creationtime` | `creationtime` | 创建时间 |
| `modifiedtime` | `modifiedtime` | `modifiedtime` | 修改时间 |
