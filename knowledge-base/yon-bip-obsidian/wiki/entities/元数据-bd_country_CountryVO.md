---
tags: [BIP, 元数据, 数据字典, bd, bd.country.CountryVO]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 国家/地区 (`bd.country.CountryVO`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `bd_country` | 应用: `DPMPI`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |
| 编码 | `code` | `code` | |

## 全部属性（23 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | String | `text` |  | true |
| 2 | `code` | 编码 | `code` | String | `text` |  | true |
| 3 | `name` | 名称 | `name` | String | `multiLanguage` |  | true |
| 4 | `alpha_code` | alpha_code | `alpha_code` | String | `text` |  | true |
| 5 | `numeric_code` | numeric_code | `numeric_code` | String | `text` |  | true |
| 6 | `objid` | objid | `objid` | String | `text` |  | true |
| 7 | `ispreset` | 是否preset | `ispreset` | Integer | `int` |  | true |
| 8 | `enable` | enable | `enable` | Long | `long` |  | true |
| 9 | `name_resid` | name_resid | `name_resid` | String | `text` |  | true |
| 10 | `sort_num` | sort_num | `sort_num` | Integer | `int` |  | true |
| 11 | `socialSrcid` | socialSrcid | `social_srcid` | String | `text` |  | true |
| 12 | `socialMctype` | socialMctype | `social_mctype` | Integer | `int` |  | true |
| 13 | `socialTenantid` | socialTenantid | `social_tenantid` | String | `text` |  | true |
| 14 | `sysid` | sysid | `sysid` | String | `text` |  | true |
| 15 | `dr` | 逻辑删除 | `dr` | Integer | `int` |  | true |
| 16 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime | `timestamp` |  | true |
| 18 | `log` | log | `log` | String | `text` |  | true |
| 19 | `tenant` | tenant | `tenantid` | String | `text` |  | true |
| 20 | `creator` | 创建人 | `creator` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 21 | `createTime` | 创建时间 | `create_time` | DateTime | `dateTime` |  | true |
| 22 | `modifier` | 修改人 | `modifier` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b | `quote` |  | true |
| 23 | `modifyTime` | 修改时间 | `modify_time` | DateTime | `dateTime` |  | true |

## 关联属性（3 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `creator` | `base.user.BipUser` | `creator` |  |  |  |
| 2 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 3 | `modifier` | `base.user.BipUser` | `modifier` |  |  |  |

## 依赖接口（5 个）

- `LogicDelete` → `basedoc.basedocItf.LogicDelete` (v31)
- `ISocialMcType` → `bd.social.ISocialMcType` (v977)
- `IYTenant` → `ucfbase.ucfbaseItf.IYTenant` (v40)
- `BasedocIState` → `basedoc.basedocItf.BasedocIState` (v101)
- `IAuditInfo` → `iuap.busiObj.IAuditInfo` (v679)

## SQL 示例

```sql
SELECT id, code, name, alpha_code, numeric_code, objid, ispreset, enable
FROM bd_country
```