---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.ps.MaterielQuotaDetailVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 物料定额明细表 (`pes.ps.MaterielQuotaDetailVO`)

> IMP_PES | 物理表：`imp_pes_ps_material_quota_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 物料定额明细表 |
| 物理表 | `imp_pes_ps_material_quota_detail` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:03.3490` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（12个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `materialId` | 物料Id | `material_id` | 89f3b06e-23df-4403-b4a7-19f99eeeae72 |
| 2 | `quantity` | 所需数量 | `quantity` | Decimal |
| 3 | `autoConsume` | 是否自动消耗 | `auto_consume` | Boolean |
| 4 | `content` | 备注 | `content` | String |
| 5 | `planId` | 计划工单Id | `plan_id` | fb011718-aab6-4d01-849c-15dcd313e46d |
| 6 | `materialCode` | 物料编码 | `material_code` | String |
| 7 | `materialName` | 物料名称 | `material_name` | String |
| 8 | `unit` | 单位 | `unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 9 | `id` | ID | `id` | String |
| 10 | `tenant` | 租户ID | `tenant_id` | String |
| 11 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `unit` | 单位 | `pc.unit.Unit` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `planId` | 计划工单Id | `pes.ps.PlanSoVO` | None | true |
| 4 | `materialId` | 物料Id | `pc.product.Product` | Service |  |
