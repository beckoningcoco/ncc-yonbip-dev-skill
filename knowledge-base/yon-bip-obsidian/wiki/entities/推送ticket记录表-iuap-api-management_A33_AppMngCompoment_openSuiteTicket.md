---
tags: ["BIP", "元数据", "数据字典", "INPAPI", "iuap-api-management.A33_AppMngCompoment.openSuiteTicket"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 推送ticket记录表 (`iuap-api-management.A33_AppMngCompoment.openSuiteTicket`)

> INPAPI | 物理表：`open_suite_ticket`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 推送ticket记录表 |
| 物理表 | `open_suite_ticket` |
| 数据库 schema | `iuap-ipaas-base` |
| 所属应用 | `INPAPI` |
| 构建时间 | `2026-06-05 18:03:06.7320` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（7个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | dr | `dr` | Integer |
| 2 | `enable` | enable | `enable` | Integer |
| 3 | `gmtCreate` | gmtCreate | `gmt_create` | String |
| 4 | `gmtUpdate` | gmtUpdate | `gmt_update` | String |
| 5 | `id` | id | `id` | String |
| 6 | `suiteTicket` | suiteTicket | `suite_ticket` | String |
| 7 | `ytenantId` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（1个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenantId` | 租户id | `yht.tenant.YhtTenant` | Service |  |
