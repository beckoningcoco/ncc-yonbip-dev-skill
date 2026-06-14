---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.produce.GroupRule"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 分组规则定义 (`cmp.produce.GroupRule`)

> DCRP | 物理表：`cmp_produce_grouprule`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 分组规则定义 |
| 物理表 | `cmp_produce_grouprule` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:59:39.4190` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（8个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `fieldCode` | 字段编码 | `field_code` | String |
| 2 | `fieldName` | 字段名称 | `field_name` | String |
| 3 | `fieldType` | 字段类型 | `field_type` | FieldTypeEnum |
| 4 | `id` | ID | `id` | Long |
| 5 | `priority` | 优先级 | `priority` | Decimal |
| 6 | `produceRule` | 排产顺序约束 | `produce_rule` | 16571e47-05ae-4603-9d19-43e2e28bc747 |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `produceRule` | 排产顺序约束 | `cmp.produce.ProduceRule` | None | true |
