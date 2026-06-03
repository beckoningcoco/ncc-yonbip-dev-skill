---
tags: [BIP, 元数据, 数据字典, bd.bank.BankDotVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---

# 银行网点 (`bd.bank.BankDotVO`)

> **平台版本：BIP 旗舰版 V5**
> 物理表：`bd_bank_dot` | domain：`ucfbasedoc` | 应用：`DPMSETL` | 业务对象ID：`c2bc55f9-5636-4042-8a44-2c4b9369c771`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 银行网点 |
| 物理表 | `bd_bank_dot` |
| 数据库 schema | `ucfbasedoc` |
| 所属应用 | `DPMSETL` |
| 直连字段 | 39 个 |
| 关联引用 | 9 个 |

## 子表

| 字段名 | URI | 关系 |
|--------|-----|------|
| `defines` | `bd.bank.BankDotVODefine` | composition |

## 关联引用 (9个)

| 字段名 | 引用类型 |
|--------|---------|
| `country` | `ucfbasedoc.bd_countryref` |
| `bank` | `ucfbasedoc.bd_bankcard` |
| `creator` | `` |
| `address` | `` |
| `ytenant_id` | `` |
| `modifier` | `` |
| `settleorgid` | `ucf-org-center.bd_settlementorg` |
| `defineCharacter` | `` |
| `` | `` |

## 继承接口 (6个, 10字段)

- **UCF公共状态** (`basedoc.basedocItf.BasedocIState`)
  - `enable` → `enable`
- **逻辑删除(待废除)** (`basedoc.basedocItf.LogicDelete`)
- **审计信息** (`basedoc.basedocItf.AuditInfo`)
  - `creationtime` → `creationtime`
  - `creator` → `creator`
  - `modifiedtime` → `modifiedtime`
  - `modifier` → `modifier`
- **自动编号** (`voucher.base.IAutoCode`)
  - `` → ``
- **社会化企业群档案** (`bd.social.ISocialMcType`)
  - `social_mctype` → `social_mctype`
  - `social_srcid` → `social_srcid`
  - `social_tenantid` → `social_tenantid`
- **统一租户接口** (`ucfbase.ucfbaseItf.IYTenant`)
  - `ytenant_id` → `ytenant_id`

## 字段列表（按类型分组）

> 共 39 个直连字段

### 文本字段 (19个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `id` | `id` | String | ID |
| `code` | `code` | String | 编码 |
| `objid` | `objid` | String | 外系统主键 |
| `province` | `province` | String | 省(直辖市) |
| `city` | `city` | String | 市 |
| `area` | `area` | String | 区(县) |
| `postcode` | `postcode` | String | 邮编 |
| `linenumber` | `linenumber` | String | 联行号 |
| `swift_code` | `swift_code` | String | swift码 |
| `iban` | `iban` | String | IBAN |
| `sysid` | `sysid` | String | 应用标识 |
| `bankdotid` | `bankdotid` | String | 银行网点 |
| `social_tenantid` | `social_tenantid` | String | 社会化来源租户 |
| `social_srcid` | `social_srcid` | String | 社会化来源 |
| `sourceid` | `sourceid` | String | 云端数据 |
| `name_resid` | `name_resid` | String | 多语资源 |
| `log` | `log` | String | 操作日志 |
| `tenantid` | `tenantid` | String | 租户 |
| `exec_status` | `exec_status` | String | 执行状态 |

### 引用字段 (7个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `country` | `country` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | 国家(地区) |
| `address` | `address` | 878c4138-3b8e-4f44-aee6-d48a42b3bef5 | 详细地址 |
| `bank` | `bank` | b7ee7189-ed97-48d5-91e4-808228664429 | 银行类别 |
| `settleorgid` | `settleorgid` | c8022140-b5fa-4f19-a0b2-2be0192eac18 | 结算中心 |
| `ytenant_id` | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | 租户 |
| `creator` | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 创建人 |
| `modifier` | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | 修改人 |

### 整数 (2个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `social_mctype` | `social_mctype` | Integer | 社会化管控类型 |
| `dr` | `dr` | Integer | 删除状态 |

### 短整数 (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `enable` | `enable` | Short | 启用状态 |

### multiLanguage (5个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `name` | `name` | String | 名称 |
| `addressone` | `addressone` | String | 地址1 |
| `addresstwo` | `addresstwo` | String | 地址2 |
| `addressthree` | `addressthree` | String | 地址3 |
| `addressfour` | `addressfour` | String | 地址4 |

### timestamp (3个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `pubts` | `pubts` | DateTime | 时间戳 |
| `creationtime` | `creationtime` | DateTime | 创建时间 |
| `modifiedtime` | `modifiedtime` | DateTime | 修改时间 |

### UserDefine (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `defineCharacter` | `defineCharacter` | 87115777-c0f4-46ac-b70d-caa196dd102c | 自定义项特征 |

### other (1个)

| 字段名 | 数据库列 | 类型 | 显示名 |
|--------|---------|------|--------|
| `` | `` | dc5b4760-d257-4149-92b0-5f6feb4c9ef4 | 银行网点扩展表(自定义项扩展表) |
