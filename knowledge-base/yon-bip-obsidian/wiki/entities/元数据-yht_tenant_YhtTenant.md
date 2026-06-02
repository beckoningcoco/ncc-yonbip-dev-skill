---
tags: [BIP, 元数据, 数据字典, yht, yht.tenant.YhtTenant]
created: 2026-06-03
updated: 2026-06-03
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-03
status: verified
source_type: api_response
---
# 友户通租户 (`yht.tenant.YhtTenant`)

> ⚡ **平台版本：BIP 旗舰版 V5** — 仅适用于用友 BIP 旗舰版（YonBIP），不适用于 NCC / NC Cloud 高级版。
> 物理表: `pub_tenant` | 应用: `` | 类型: `Class`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 友户通租户 |
| 物理表 | `pub_tenant` |
| 应用 | `` |
| 元数据类型 | `Class` |

## 主键与编码

| 角色 | 字段 | 列 | 类型 |
|------|------|-----|------|
| 主键 | `tenant_id` | `tenant_id` | String |

## 部署信息

- 部署时间: 2025-10-24 22:26:45:000
- 安装来源: `/app/yhtdb/scripts/db/patch/mongodb/V7_R0_2507/0001_iuap-uuas-user/0010_iuap_common/DML/0270_iuap_metadata/202507231050_metadata_yht-tenant.zip`

## 术语标记

`doc`

---

## 全部属性（1 个）

| # | 字段名 | 显示名 | 列 | 类型 | biztype | 必填 | 可空 |
|---|--------|--------|-----|------|---------|------|------|
| 1 | `tenant_id` | tenant_id | `tenant_id` | String | `text` |  | true |

---

## SQL 示例

```sql
SELECT tenant_id
FROM pub_tenant
```