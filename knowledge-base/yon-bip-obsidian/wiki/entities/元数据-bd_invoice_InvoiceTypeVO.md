---
tags: [BIP, 元数据, 数据字典, bd, bd.invoice.InvoiceTypeVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 发票类型 (`bd.invoice.InvoiceTypeVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_invoice_type` | 应用: `DPMTAX` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 发票类型 |
| 物理表 | `bd_invoice_type` |
| 应用 | `DPMTAX` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `realCode` | `real_code` | |

## 部署信息

- 部署时间: 2026-01-23 22:42:29:000
- 安装来源: `/app/apdoc-basedoc/iuap-apdoc-basedoc/iuap-apdoc-basedoc/scripts/db/patch/mongodb/V7_R0_2507/0001_iuap-apdoc-basedoc_basedoc/0010_iuap_common/DML/0270_iuap_metadata/20260115-itr/202512051102_metadata_bd-invoice.zip`

## 术语标记

`MasterData`, `isMain`, `doc`, `DirectConnection`, `state_tag`, `isBusinessObject`

## 依赖接口（4 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| BasedocIState (`BasedocIState`) | `basedoc.basedocItf.BasedocIState` | 101 | 1 |
| AuditInfo (`AuditInfo`) | `basedoc.basedocItf.AuditInfo` | 289 | 4 |
| LogicDelete (`LogicDelete`) | `basedoc.basedocItf.LogicDelete` | 31 | 0 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（19 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | String | `text` |  | true |
| 2 | `code` | 编码 | `code` | String | `text` | false | true |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` | false | true |
| 4 | `standardName` | standard名称 | `standard_name` | String | `multiLanguage` | false | true |
| 5 | `realCode` | real编码 | `real_code` | String | `text` | false | true |
| 6 | `country` | ountry | `country` | String | `text` | false | true |
| 7 | `applicationScope` | applicationScope | `application_scope` | String | `text` | false | true |
| 8 | `enable` | enable | `enable` | Integer | `int` |  | true |
| 9 | `iorder` | order(ID) | `iorder` | Integer | `int` | false | true |
| 10 | `dr` | 逻辑删除 | `dr` | Integer | `int` |  | true |
| 11 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 12 | `sysid` | sysid | `sysid` | String | `text` |  | true |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 14 | `tenant` | tenant | `tenantid` | String | `text` | false | true |
| 15 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 16 | `creationtime` | reationtime | `creationtime` | DateTime | `timestamp` |  | true |
| 17 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 18 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |  | true |
| 19 | `countries` | ountries | `countries` | 8e9602ac-5ca2-4d06-aede-4a0af4c316bf | `referenceList` |  | true |

## 关联属性（4 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | `creator` | 外键 |  |  | Service |  |
| 2 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 3 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` | 外键 |  |  | Service |  |
| 4 | `countries` | ountries | `bd.country.CountryVO` | `countries` | 外键 |  |  | None |  |

---

## SQL 示例

```sql
SELECT id, code, name, standard_name, real_code, country, application_scope, enable
FROM bd_invoice_type
```