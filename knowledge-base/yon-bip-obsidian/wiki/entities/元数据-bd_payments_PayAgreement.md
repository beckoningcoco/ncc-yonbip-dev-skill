---
tags: [BIP, 元数据, 数据字典, bd.payments.PayAgreement]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 付款协议 (`bd.payments.PayAgreement`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_payagreement` | domain：`ucfbasedoc` | 应用：`DPMSETL` | 业务对象ID：`2ad6920b-7d5a-4c04-9fb0-f06ab09fbd1f`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 付款协议 |
| 物理表 | `bd_payagreement` |
| 数据库 schema | `ucfbasedoc` |
| 所属应用 | `DPMSETL` |
| 直连字段 | 29 个 |
| 关联引用 | 8 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `paymentDates` | `bd.payments.PaymentDate` | composition |
| `defines` | `bd.payments.PayAgreementDefine` | composition |

## 关联引用 (8个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `` | `` |
| `ytenant_id` | `` |
| `org_group_id` | `` |
| `modifier` | `` |
| `defineCharacter` | `` |
| `manageorg` | `ucf-org-center.org_unit_tree_ref` |

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

> 共 29 个直连字段

### 文本字段 (7个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `cCode` | `cCode` | String | 编码 |
| `objid` | `objid` | String | 外系统主键 |
| `cComment` | `cComment` | String | 说明 |
| `log` | `log` | String | 操作日志 |
| `sysid` | `sysid` | String | 应用标识 |
| `tenantid` | `tenantid` | String | 租户(废弃) |
| `exec_status` | `exec_status` | String | 执行状态 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `manageorg` | `manageorg` | 14302233-1394-4a70-94e1-bed51636f312 | 管理组织 |
| `org_group_id` | `org_group_id` | 44210b7f-0ffa-4cf9-be11-8fdfa006a2ae | 适用范围 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户 |
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |

### 日期字段 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `enablestartdate` | `enablestartdate` | Date | 协议生效日期 |
| `enableenddate` | `enableenddate` | Date | 协议失效日期 |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `instalment` | `instalment` | Boolean | 分期付款 |

### 整数 (6个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `oadayConfirmType` | `oadayConfirmType` | Integer | 出账日确定方式 |
| `expiredayConfirmType` | `expiredayConfirmType` | Integer | 到期日确定方式 |
| `prePayType` | `prePayType` | Integer | 预付折算方式 |
| `enable` | `enable` | Integer | 启用状态 |
| `iorder` | `iorder` | Integer | 排序 |
| `dr` | `dr` | Integer | 删除状态 |

### 长整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | Long | ID |

### other (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | d0985843-1843-42de-b0f6-da39ae7c6a4d | 付款账期 |
| `` | `` | 41977f13-8157-49cd-ba6b-f6f6e2738ce2 | 付款协议扩展表(自定义项扩展表) |

### multiLanguage (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `cName` | `cName` | String | 名称 |

### timestamp (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `pubts` | `pubts` | DateTime | 时间戳 |
| `creationtime` | `creationtime` | DateTime | 创建时间 |
| `modifiedtime` | `modifiedtime` | DateTime | 修改时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `defineCharacter` | `defineCharacter` | de45e9f7-0155-40d7-a032-913ae3a3acde | 自定义项特征 |
