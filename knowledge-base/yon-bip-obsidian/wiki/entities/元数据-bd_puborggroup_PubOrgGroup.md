---
tags: [BIP, 元数据, 数据字典, bd, bd.puborggroup.PubOrgGroup]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 分级管理组织集合 (`bd.puborggroup.PubOrgGroup`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `pub_org_group` | 应用: `DPMPI`

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |

## 全部属性（7 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `code` | 编码 | `code` | String | `text` |  |  |
| 2 | `hashCode` | hash编码 | `hash_code` | String | `text` |  |  |
| 3 | `id` | 主键ID | `id` | String | `text` |  |  |
| 4 | `name` | 名称 | `name` | String | `text` |  |  |
| 5 | `orgGroupDetailList` | orgGroupDetailList | `` | 46389fc6-e2c9-422e-a0cd-c638de2a7f82 | `` |  |  |
| 6 | `tenant` | tenant | `tenantid` | String | `text` |  | true |
| 7 | `ytenant` | ytenant | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` | true | true |

## 关联属性（2 个）

| # | 字段 | 目标实体 | 列 | 多重性 | 组合 | 废弃 |
|---|------|---------|-----|--------|------|------|
| 1 | `ytenant` | `yht.tenant.YhtTenant` | `ytenant_id` |  |  |  |
| 2 | `orgGroupDetailList` | `bd.puborggroup.PubOrgGroupDetail` | `` | 0..n | Y |  |

## 依赖接口（1 个）

- `IYTenant` → `ucfbase.ucfbaseItf.IYTenant` (v40)

## SQL 示例

```sql
SELECT code, hash_code, id, name, tenantid, ytenant_id
FROM pub_org_group
```