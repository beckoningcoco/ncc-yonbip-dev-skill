---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.planworkbench.OrderDCT"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划订单自定义项 (`mr.planworkbench.OrderDCT`)

> MR | 物理表：`mr_plan_order_dct`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划订单自定义项 |
| 物理表 | `mr_plan_order_dct` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:12:59.9490` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（7个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `BM` | 提报需求部门 | `vcol2` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `id` | ID | `id` | String |
| 4 | `lzxqfl001` | 绿洲需求分类 | `vcol1` | f48843cb-7ad2-47c8-a0f4-bb451e90022d |
| 5 | `pubts` | 时间戳 | `pubts` | DateTime |
| 6 | `ymtz001` | ymtz001 | `vcol55` | String |
| 7 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（3个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `lzxqfl001` | 绿洲需求分类 | `bd.customerdoc_XQFL.XQFL` | Service |  |
| 3 | `BM` | 提报需求部门 | `bd.adminOrg.AdminOrgVO` | Service |  |
