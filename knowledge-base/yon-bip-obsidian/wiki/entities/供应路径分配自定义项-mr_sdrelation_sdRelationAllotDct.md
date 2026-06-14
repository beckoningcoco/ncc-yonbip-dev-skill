---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.sdrelation.sdRelationAllotDct"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 供应路径分配自定义项 (`mr.sdrelation.sdRelationAllotDct`)

> MR | 物理表：`mr_sd_relation_allot_dct`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 供应路径分配自定义项 |
| 物理表 | `mr_sd_relation_allot_dct` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:17:19.5150` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（3个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | String |
| 2 | `pubts` | 时间戳 | `pubts` | DateTime |
| 3 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（1个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
