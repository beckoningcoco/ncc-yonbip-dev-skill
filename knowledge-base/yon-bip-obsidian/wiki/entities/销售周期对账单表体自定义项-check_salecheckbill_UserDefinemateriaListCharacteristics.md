---
tags: ["BIP", "元数据", "数据字典", "ycSaleCoor", "check.salecheckbill.UserDefinemateriaListCharacteristics"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 销售周期对账单表体自定义项 (`check.salecheckbill.UserDefinemateriaListCharacteristics`)

> ycSaleCoor | 物理表：`salecheckbill_materiaList_usercharacteristicsdefine`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 销售周期对账单表体自定义项 |
| 物理表 | `salecheckbill_materiaList_usercharacteristicsdefine` |
| 数据库 schema | `cpu-cooperation` |
| 所属应用 | `ycSaleCoor` |
| 构建时间 | `2026-06-04 23:32:28.3320` |

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
