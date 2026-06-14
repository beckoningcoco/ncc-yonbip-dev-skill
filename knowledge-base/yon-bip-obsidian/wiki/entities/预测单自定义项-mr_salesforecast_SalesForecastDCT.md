---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.salesforecast.SalesForecastDCT"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 预测单自定义项 (`mr.salesforecast.SalesForecastDCT`)

> MR | 物理表：`mr_sales_forecast_dct`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 预测单自定义项 |
| 物理表 | `mr_sales_forecast_dct` |
| domain/服务域 | `requirementsplanning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:16:53.9960` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（5个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `BM` | 提报需求部门 | `vcol1` | a4352e3c-3eda-4539-a7a9-ec00799be118 |
| 2 | `id` | ID | `id` | String |
| 3 | `jhrq` | 计划日期 | `dcol50` | Date |
| 4 | `pubts` | 时间戳 | `pubts` | DateTime |
| 5 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `BM` | 提报需求部门 | `bd.adminOrg.AdminOrgVO` | Service |  |
