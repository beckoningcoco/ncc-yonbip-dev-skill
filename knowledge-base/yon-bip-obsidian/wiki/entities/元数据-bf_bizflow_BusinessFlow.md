---
tags: [BIP, 元数据, 数据字典, bf, bf.bizflow.BusinessFlow]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 业务流 (`bf.bizflow.BusinessFlow`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `business_flow` | 应用: `APPBZP` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 业务流 |
| 物理表 | `business_flow` |
| 应用 | `APPBZP` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `id` | `id` | String |

## 部署信息

- 部署时间: 2026-01-23 22:50:06:000
- 安装来源: `/app/business_flow/iuap-apcom-coderule/iuap-yonbuilder-businesssflow/scripts/db/patch/mongodb/V7_R0_2507/20260115/0010_iuap_common/DML/0270_iuap_metadata/202512161104_metadata_bf-bizflow.zip`

## 术语标记

`ConfigData`

## 依赖接口（1 个）

| 接口 | URI | 版本 | 属性数 |
|------|-----|------|--------|
| IYTenant (`IYTenant`) | `iuap.busiObj.IYTenant` | 214 | 1 |

---

## 全部属性（5 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `id` | 主键ID | `id` | String | `text` |  | false |
| 2 | `name` | 名称 | `name` | String | `multiLanguage` |  | false |
| 3 | `tenantId` | 租户ID | `tenant_id` | String | `text` |  |  |
| 4 | `version` | 版本号 | `version` | String | `text` |  |  |
| 5 | `ytenantId` | ytenantId | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 | `quote` |  | true |

## 关联属性（1 个）

| # | 字段 | 显示名 | 目标实体 | 列 | 关系 | 多重性 | 组合 | 隔离 | 废弃 |
|---|------|--------|---------|-----|------|--------|------|------|------|
| 1 | `ytenantId` | ytenantId | `yht.tenant.YhtTenant` | `ytenant_id` | 外键 |  |  | Service |  |

---

## SQL 示例

```sql
SELECT id, name, tenant_id, version, ytenant_id
FROM business_flow WHERE tenantId = ?
```