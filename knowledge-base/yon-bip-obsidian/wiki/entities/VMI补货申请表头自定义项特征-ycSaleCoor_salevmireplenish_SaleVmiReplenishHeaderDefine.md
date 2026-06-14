---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "ycSaleCoor.salevmireplenish.SaleVmiReplenishHeaderDefine"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# VMI补货申请表头自定义项特征 (`ycSaleCoor.salevmireplenish.SaleVmiReplenishHeaderDefine`)

> ycSaleCoor | 物理表：`cpu_sale_vmi_replenish_header_define`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | VMI补货申请表头自定义项特征 |
| 物理表 | `cpu_sale_vmi_replenish_header_define` |
| domain/服务域 | `cpu-cooperation` |
| schema | `cpu_cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:17.8880` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（4个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short |
| 2 | `id` | ID | `id` | String |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime |
| 4 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（1个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
