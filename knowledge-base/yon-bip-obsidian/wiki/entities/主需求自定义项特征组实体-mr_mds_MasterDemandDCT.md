---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.mds.MasterDemandDCT"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 主需求自定义项特征组实体 (`mr.mds.MasterDemandDCT`)

> MR | 物理表：`mr_mds_master_demand_dct`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 主需求自定义项特征组实体 |
| 物理表 | `mr_mds_master_demand_dct` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:15:53.5220` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（5个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short |
| 2 | `id` | ID | `id` | String |
| 3 | `lzxqfl001` | 绿洲需求分类 | `vcol1` | f48843cb-7ad2-47c8-a0f4-bb451e90022d |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `lzxqfl001` | 绿洲需求分类 | `bd.customerdoc_XQFL.XQFL` | Service |  |
