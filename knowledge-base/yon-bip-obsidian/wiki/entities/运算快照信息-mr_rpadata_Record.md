---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.rpadata.Record"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 运算快照信息 (`mr.rpadata.Record`)

> MR | 物理表：`mr_rpa_record`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 运算快照信息 |
| 物理表 | `mr_rpa_record` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:13:30.3410` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `SDRelationDetail` | 供需关系临时表 | `` | dbe95405-771c-4042-8d38-f656ad835ab9 |
| 2 | `bomAlternateDetail` | MRP替代料 | `` | 911e00e6-cbd4-4835-bde1-d917cfe0b0a2 |
| 3 | `bomByProductDetail` | MRP联副产品结构 | `` | f1c19d8e-cbbe-46d4-ba02-b385896aa7a7 |
| 4 | `bomDetail` | MRPBom结构 | `` | 105bb162-48a4-441d-8156-ccb92991aa88 |
| 5 | `calendarDetail` | 工作日历临时表 | `` | 3a58eac0-cef3-4b34-ba29-3d45c018e934 |
| 6 | `id` | ID | `id` | Long |
| 7 | `materialDataDetail` | 物料临时表 | `` | 7cd80045-301c-408b-8ba5-a8458a988367 |
| 8 | `orgDetail` | 组织临时表 | `` | 40e0aca9-d8d3-48a8-9989-91d5d9e3ea3b |
| 9 | `periodGridDetail` | 时格 | `` | 83f01e16-5bc3-413c-9eb4-afe46aae643c |
| 10 | `planSchemeDetail` | 计划方案临时表 | `` | 9540a840-7bfb-4686-b0eb-2b6bbd4de238 |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `requirementDetail` | 需求临时表 | `` | 2383b08f-aa33-4021-be20-8fbc579945c4 |
| 13 | `statisticsDetail` | 运算统计信息 | `` | 1fc9baba-9ef0-460c-8335-cb66ee273efc |
| 14 | `supplyDetail` | 供应临时表 | `` | 6949e7f7-1419-4788-82d4-519f3e36b58e |
| 15 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 16 | `timeFenceDetail` | 计划策略临时表 | `` | 5e84c362-252a-4e4f-9a8f-aa478d199c77 |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（15个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `planSchemeDetail` | 计划方案临时表 | `mr.rpadata.RPAPlanScheme` | None | true |
| 2 | `supplyDetail` | 供应临时表 | `mr.rpadata.RPASupply` | None | true |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `calendarDetail` | 工作日历临时表 | `mr.rpadata.RPACalendar` | None | true |
| 5 | `statisticsDetail` | 运算统计信息 | `mr.rpadata.PlanRunStatistics` | None | true |
| 6 | `periodGridDetail` | 时格 | `mr.rpadata.RPAPeriodGrid` | None | true |
| 7 | `bomByProductDetail` | MRP联副产品结构 | `mr.rpadata.RPABomByProduct` | None | true |
| 8 | `requirementDetail` | 需求临时表 | `mr.rpadata.RPARequirement` | None | true |
| 9 | `bomAlternateDetail` | MRP替代料 | `mr.rpadata.RPABomAlternate` | None | true |
| 10 | `timeFenceDetail` | 计划策略临时表 | `mr.rpadata.RPATimeFence` | None | true |
| 11 | `materialDataDetail` | 物料临时表 | `mr.rpadata.RPAMaterialData` | None | true |
| 12 | `orgDetail` | 组织临时表 | `mr.rpadata.RPAOrg` | None | true |
| 13 | `bomDetail` | MRPBom结构 | `mr.rpadata.RPABom` | None | true |
| 14 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 15 | `SDRelationDetail` | 供需关系临时表 | `mr.rpadata.RPASDRelation` | None | true |
