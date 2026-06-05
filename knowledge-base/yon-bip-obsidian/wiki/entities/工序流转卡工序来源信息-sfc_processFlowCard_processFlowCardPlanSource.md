---
tags: ["BIP", "元数据", "数据字典", "IMPSFC", "sfc.processFlowCard.processFlowCardPlanSource"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 工序流转卡工序来源信息 (`sfc.processFlowCard.processFlowCardPlanSource`)

> IMPSFC | 物理表：`imp_sfc_procflowcard_plan_source`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 工序流转卡工序来源信息 |
| 物理表 | `imp_sfc_procflowcard_plan_source` |
| 数据库 schema | `IMP-SFC` |
| 所属应用 | `IMPSFC` |
| 构建时间 | `2026-06-05 09:26:23.2700` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `rowno` | Integer | 序号 |

---

## 直接属性（20个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `dr` | 逻辑删除标记 | `dr` | Short |
| 2 | `groupKey` | 分组标识 | `group_key` | Long |
| 3 | `id` | ID | `id` | Long |
| 4 | `mainUnitId` | 主计量单位 | `main_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 5 | `num` | 数量 | `num` | Decimal |
| 6 | `num1` | 件数 | `num1` | Decimal |
| 7 | `num2` | 数量(产出) | `num2` | Decimal |
| 8 | `outUnitId` | 产出单位 | `out_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 9 | `procFlowCardId` | 工序流转卡 | `process_flow_id` | a1d46721-c171-401e-9f07-ef70a36e2abf |
| 10 | `procFlowCardPlanId` | 工序流转卡工序 | `process_flow_plan_id` | e4a42545-5567-4ba7-be49-38a63843cfab |
| 11 | `productionUnitId` | 生产单位 | `production_unit_id` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |
| 13 | `rowno` | 序号 | `rowno` | Integer |
| 14 | `sourceCode` | 来源单据编码 | `source_code` | String |
| 15 | `sourceId` | 来源单据 | `source_id` | String |
| 16 | `sourceLineId` | 来源单据行 | `source_line_id` | String |
| 17 | `sourceLineNo` | 来源单据行号 | `source_line_no` | String |
| 18 | `sourceType` | 来源单据类型 | `source_type` | String |
| 19 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `procFlowCardPlanId` | 工序流转卡工序 | `sfc.processFlowCard.processFlowCardPlan` | None | true |
| 3 | `procFlowCardId` | 工序流转卡 | `sfc.processFlowCard.processFlowCard` | None |  |
| 4 | `productionUnitId` | 生产单位 | `pc.unit.Unit` | Service |  |
| 5 | `outUnitId` | 产出单位 | `pc.unit.Unit` | Service |  |
| 6 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
| 7 | `mainUnitId` | 主计量单位 | `pc.unit.Unit` | Service |  |
