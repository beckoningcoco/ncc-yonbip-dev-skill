---
tags: [BIP, 元数据, 数据字典, bd, bd.currencytenant.CurrencyTenantVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 币种 (`bd.currencytenant.CurrencyTenantVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_currency_tenant` | 应用: `DPMPI` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 币种 |
| 物理表 | `bd_currency_tenant` |
| 应用 | `DPMPI` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-05-22 22:42:58:000
- 安装来源: `/app/apdoc-basedoc/iuap-apdoc-basedoc/iuap-apdoc-basedoc/scripts/db/patch/mongodb/V7_R0_2507/0001_iuap-apdoc-basedoc_basedoc/0010_iuap_common/DML/0270_iuap_metadata/20260515-itr/202603251020_metadata_bd-currencytenant.zip`

## 术语标记

`data_auth`, `MasterData`, `isMain`, `report`, `use_translate_server`, `doc`, `DirectConnection`, `state_tag`

## 依赖接口（5 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| LogicDelete (`LogicDelete`) | `basedoc.basedocItf.LogicDelete` | 31 | 0 |
| BasedocIState (`BasedocIState`) | `basedoc.basedocItf.BasedocIState` | 101 | 1 |
| AuditInfo (`AuditInfo`) | `basedoc.basedocItf.AuditInfo` | 289 | 4 |
| ISocialMcType(类型) (`ISocialMcType`) | `bd.social.ISocialMcType` | 977 | 3 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（28 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | String | `text` |  | true |
| 2 | `code` | 编码 | `code` | String | `text` | true | false |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` | true | false |
| 4 | `objid` | objid | `objid` | String | `text` |  | true |
| 5 | `currTypeSign` | urrTypeSign | `currtypesign` | String | `text` | false | true |
| 6 | `priceDigit` | priceDigit | `pricedigit` | Integer | `int` | true | false |
| 7 | `priceRount` | priceRount | `pricerount` | Integer | `int` | true | false |
| 8 | `moneyDigit` | moneyDigit | `moneydigit` | Integer | `int` | true | false |
| 9 | `moneyRount` | moneyRount | `moneyrount` | Integer | `int` | true | false |
| 10 | `enable` | enable | `enable` | Integer | `int` |  | true |
| 11 | `isDefault` | 是否Default | `isdefault` | String | `text` |  | true |
| 12 | `orderGrade` | orderGrade | `ordergrade` | Integer | `int` |  | true |
| 13 | `sysid` | sysid | `sysid` | String | `text` |  | true |
| 14 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 15 | `name_resid` | name_resid | `name_resid` | String | `text` |  | true |
| 16 | `cloudid` | loudid | `cloudid` | String | `text` |  | true |
| 17 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |  | true |
| 18 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |  | true |
| 19 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |  | true |
| 20 | `log` | log | `log` | String | `text` |  | true |
| 21 | `dr` | 逻辑删除 | `dr` | Integer | `int` |  | true |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 23 | `tenant` | tenant | `tenantid` | String | `text` |  | true |
| 24 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 25 | `creationtime` | reationtime | `creationtime` | DateTime | `timestamp` |  | true |
| 26 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 27 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |  | true |
| 28 | `execStatus` | execStatus(状态) | `exec_status` | String | `text` |  | true |

## 关联属性（3 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | `creator` | 外键 |  |  | Service |  |
| 2 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 3 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` | 外键 |  |  | Service |  |

---

## SQL 示例

```sql
SELECT id, code, name, objid, currtypesign, pricedigit, pricerount, moneydigit
FROM bd_currency_tenant
```