---
tags: [BIP, 元数据, 数据字典, bd, bd.enterprise.EnterpriseNatureVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 企业性质 (`bd.enterprise.EnterpriseNatureVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `org_enterprise_nature` | 应用: `DPMSETL`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `code` | |

## 全部属性（14 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | String | `text` |  | true |
| 2 | `code` | 编码 | `code` | String | `text` | true | true |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` | true | true |
| 4 | `enable` | enable | `enable` | Integer | `int` | false | true |
| 5 | `sysid` | sysid | `sysid` | String | `text` |  | true |
| 6 | `dr` | 逻辑删除 | `dr` | Integer | `int` |  | true |
| 7 | `log` | log | `log` | String | `text` | false | true |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 9 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 10 | `tenant` | tenant | `tenantid` | String | `text` | false | true |
| 11 | `creationtime` | creationtime | `creationtime` | DateTime | `timestamp` |  | true |
| 12 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 13 | `modifiedtime` | modifiedtime | `modifiedtime` | DateTime | `timestamp` |  | true |
| 14 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |

## 关联属性（3 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `creator` | `base.user.BipUser` | `creator` |  |  |  |
| 2 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 3 | `modifier` | `base.user.BipUser` | `modifier` |  |  |  |

## 依赖接口（4 个）

- `AuditInfo` → `basedoc.basedocItf.AuditInfo` (v289)
- `LogicDelete` → `basedoc.basedocItf.LogicDelete` (v31)
- `BasedocIState` → `basedoc.basedocItf.BasedocIState` (v101)
- `IYTenant` → `ucfbase.ucfbaseItf.IYTenant` (v40)

## SQL 示例

```sql
SELECT id, code, name, enable, sysid, dr, log, pubts
FROM org_enterprise_nature
```