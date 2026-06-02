---
tags: [BIP, 元数据, 数据字典, bd, bd.receivables.ReceiveStartBase]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 收款起算时点 (`bd.receivables.ReceiveStartBase`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_receivestartbase` | 应用: `DPMSETL` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 收款起算时点 |
| 物理表 | `bd_receivestartbase` |
| 应用 | `DPMSETL` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | Long |
| 编码 | `code` | `cCode` | |

## 部署信息

- 部署时间: 2026-05-22 22:42:59:000
- 安装来源: `/app/apdoc-basedoc/iuap-apdoc-basedoc/iuap-apdoc-basedoc/scripts/db/patch/mongodb/V7_R0_2507/0001_iuap-apdoc-basedoc_basedoc/0010_iuap_common/DML/0270_iuap_metadata/20260515-itr/202603251024_metadata_bd-receivables.zip`

## 术语标记

`MasterData`, `doc`, `DirectConnection`, `state_tag`

## 依赖接口（4 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| AuditInfo (`AuditInfo`) | `basedoc.basedocItf.AuditInfo` | 289 | 4 |
| LogicDelete (`LogicDelete`) | `basedoc.basedocItf.LogicDelete` | 31 | 0 |
| BasedocIState (`BasedocIState`) | `basedoc.basedocItf.BasedocIState` | 101 | 1 |
| IYTenant (`IYTenant`) | `ucfbase.ucfbaseItf.IYTenant` | 40 | 1 |

---

## 全部属性（19 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | Long | `long` |  |  |
| 2 | `code` | 编码 | `cCode` | String | `text` | true |  |
| 3 | `name` | 名称 | `cName` | String | `multiLanguage` | true |  |
| 4 | `objid` | objid | `objid` | String | `text` |  |  |
| 5 | `order` | order | `iorder` | Integer | `int` |  |  |
| 6 | `comment` | omment | `cComment` | String | `text` |  |  |
| 7 | `enable` | enable | `enable` | Integer | `int` |  | true |
| 8 | `receiveBase` | receiveBase | `receivebase` | String | `text` |  |  |
| 9 | `startColumn` | startColumn | `startcolumn` | String | `text` |  |  |
| 10 | `sourcetype` | sourcetype | `sourcetype` | Boolean | `switch` |  |  |
| 11 | `sysid` | sysid | `sysid` | String | `text` |  |  |
| 12 | `dr` | 逻辑删除 | `dr` | Integer | `int` |  |  |
| 13 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  |  |
| 14 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 15 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 16 | `creationtime` | reationtime | `creationtime` | DateTime | `timestamp` |  | true |
| 17 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 18 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |  | true |
| 19 | `tenant` | tenant | `tenantid` | String | `text` |  |  |

## 关联属性（3 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `creator` | 创建人 | `base.user.BipUser` | `creator` | 外键 |  |  | Service |  |
| 2 | `ytenant` | ytenant | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |
| 3 | `modifier` | 修改人 | `base.user.BipUser` | `modifier` | 外键 |  |  | Service |  |

---

## SQL 示例

```sql
SELECT id, cCode, cName, objid, iorder, cComment, enable, receivebase
FROM bd_receivestartbase
```