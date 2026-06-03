---
tags: [BIP, 元数据, 数据字典, bd.enterprise.OrgFinCashacctVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 企业现金账户 (`bd.enterprise.OrgFinCashacctVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`org_fin_bankacct` | domain：`ucfbasedoc` | 应用：`DPMSETL` | 业务对象ID：`e388d452-2936-465e-af4c-8381e40b3001`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 企业现金账户 |
| 物理表 | `org_fin_bankacct` |
| 数据库 schema | `ucfbasedoc` |
| 所属应用 | `DPMSETL` |
| 直连字段 | 28 个 |
| 关联引用 | 7 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `bd.enterprise.OrgFinCashacctVODefine` | composition |

## 关联引用 (7个)

| 字段名 | 引用类型 |
|--------|---------|
| `creator` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |
| `currency` | `ucfbasedoc.bd_currencytenantref` |
| `defineCharacter` | `` |
| `orgid` | `ucf-org-center.bd_financeorgtreeref` |
| `` | `` |

## 继承接口 (4个, 6字段)

- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **审计信息** (`basedoc.basedocItf.AuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 28 个直连字段

### 文本字段 (9个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `sysid` | `sysid` | String | 应用标识 |
| `id` | `id` | String | id |
| `code` | `code` | String | 账户编码 |
| `account` | `account` | String | 账户 |
| `log` | `log` | String | 操作日志 |
| `objid` | `objid` | String | 友企连同步ID |
| `tenantid` | `tenantid` | String | 租户 |
| `bankacct` | `bankacct` | String | 主表id |
| `tenantid` | `tenantid` | String | 币种租户废弃 |

### 引用字段 (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `orgid` | `orgid` | 60bf293e-5593-454b-be50-5a5fa016e4a6 | 组织 |
| `currency` | `currency` | 02b45339-eb4a-4a31-a8b5-d32f494f4e8e | 币种 |
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户id |

### 布尔字段 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `isdefault` | `isdefault` | Boolean | 默认 |

### 整数 (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `enable` | `enable` | Integer | 状态 |
| `dr` | `dr` | Integer | 逻辑删除标记 |
| `acctopentype` | `acctopentype` | Integer | 开户类型 |
| `busiobj_filterkey` | `busiobj_filterkey` | Integer | 系统filterKey属性 |

### multiLanguage (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `name` | `name` | String | 账户名称 |
| `description` | `description` | String | 备注 |
| `acctname` | `acctname` | String | 开户名 |

### timestamp (4个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `accountOpenDate` | `accountOpenDate` | DateTime | 开户日期 |
| `creationtime` | `creationtime` | DateTime | 创建时间 |
| `modifiedtime` | `modifiedtime` | DateTime | 最后修改时间 |
| `pubts` | `pubts` | DateTime | 时间戳 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `defineCharacter` | `defineCharacter` | d6ce9c8f-6014-4816-adec-c4352e25fa28 | 自定义项特征 |

### other (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | 59b1fe8c-d6eb-4578-b239-2a11eb9d1938 | 企业现金(自定义项)表 |
