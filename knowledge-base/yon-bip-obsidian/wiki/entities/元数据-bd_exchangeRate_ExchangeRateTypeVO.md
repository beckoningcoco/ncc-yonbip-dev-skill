---
tags: [BIP, 元数据, 数据字典, bd, bd.exchangeRate.ExchangeRateTypeVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 汇率类型 (`bd.exchangeRate.ExchangeRateTypeVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_exchangerate_type` | 应用: `DPMPI` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 汇率类型 |
| 物理表 | `bd_exchangerate_type` |
| 应用 | `DPMPI` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `code` | |

## 部署信息

- 部署时间: 2026-01-23 22:42:29:000
- 安装来源: `/app/apdoc-basedoc/iuap-apdoc-basedoc/iuap-apdoc-basedoc/scripts/db/patch/mongodb/V7_R0_2507/0001_iuap-apdoc-basedoc_basedoc/0010_iuap_common/DML/0270_iuap_metadata/20260115-itr/202512051102_metadata_bd-exchangeRate.zip`

## 术语标记

`MasterData`, `isMain`, `doc`, `DirectConnection`, `state_tag`

## 依赖接口（4 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| BasedocIState (`BasedocIState`) | `basedoc.basedocItf.BasedocIState` | 101 | 1 |
| LogicDelete (`LogicDelete`) | `basedoc.basedocItf.LogicDelete` | 31 | 0 |
| AuditInfo (`AuditInfo`) | `basedoc.basedocItf.AuditInfo` | 289 | 4 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（28 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `exchangeRateTypeConfigDefineVO` | exchangeRateTypeConfigDefineVO | `` | 83f4f50c-d8ae-44f7-a941-c75472cb917c | `` |  |  |
| 2 | `id` | 主键ID | `id` | String | `text` |  | true |
| 3 | `code` | 编码 | `code` | String | `text` | true | true |
| 4 | `name` | 名称 | `name` | String | `multiLanguage` | true | true |
| 5 | `objid` | objid | `objid` | String | `text` |  | true |
| 6 | `digit` | igit(日期) | `digit` | Integer | `int` |  | true |
| 7 | `description` | 描述 | `description` | String | `text` |  | true |
| 8 | `isMapHistoryDate` | isMapHistoryDate(日期) | `isMapHistoryDate` | Integer | `int` |  | true |
| 9 | `isSupportRevCalculate` | 是否SupportRevCalculate | `isSupportRevCalculate` | Integer | `int` |  | true |
| 10 | `enable` | enable | `enable` | Integer | `int` |  | true |
| 11 | `autoUpdate` | autoUpdate | `auto_update` | Integer | `int` |  | true |
| 12 | `syncOriginBank` | syncOriginBank | `sync_origin_bank` | String | `text` |  | true |
| 13 | `syncOriginExchangeRate` | syncOriginExchangeRate | `sync_origin_exchangerate` | Integer | `int` |  | true |
| 14 | `syncScope` | syncScope | `sync_scope` | Integer | `int` |  | true |
| 15 | `syncRule` | syncRule | `sync_rule` | String | `text` |  | true |
| 16 | `isDefault` | 是否Default | `isDefault` | Integer | `int` |  | true |
| 17 | `tipsName` | tips名称 | `tipsName` | String | `text` |  | true |
| 18 | `sysid` | sysid | `sysid` | String | `text` |  | true |
| 19 | `dr` | 逻辑删除 | `dr` | Integer | `int` |  | true |
| 20 | `log` | log | `log` | String | `text` |  | true |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 22 | `sourceid` | sourceid | `sourceid` | String | `text` |  | true |
| 23 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 24 | `tenant` | tenant | `tenantid` | String | `text` |  | true |
| 25 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 26 | `creationtime` | reationtime | `creationtime` | DateTime | `timestamp` |  | true |
| 27 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 28 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |  | true |

## 关联属性（4 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | `creator` | 外键 |  |  | Service |  |
| 2 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 3 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` | 外键 |  |  | Service |  |
| 4 | `exchangeRateTypeConfigDefineVO` | exchangeRateTypeConfigDefineVO | `bd.exchangeRate.ExchangeRateTypeConfigDefineVO` | `` | exchangeRateTypeConfigDefineVO → exchangeratetype | 0..n | Y | None |  |

---

## SQL 示例

```sql
SELECT id, code, name, objid, digit, description, isMapHistoryDate, isSupportRevCalculate
FROM bd_exchangerate_type
```