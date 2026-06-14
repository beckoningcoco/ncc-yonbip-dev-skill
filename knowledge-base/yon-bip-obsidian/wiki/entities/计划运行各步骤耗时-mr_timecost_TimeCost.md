---
tags: ["BIP", "元数据", "数据字典", "MR", "mr.timecost.TimeCost"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 计划运行各步骤耗时 (`mr.timecost.TimeCost`)

> MR | 物理表：`mr_time_cost`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 计划运行各步骤耗时 |
| 物理表 | `mr_time_cost` |
| domain/服务域 | `yonbip-mm-plan` |
| schema | `requirements_planning` |
| 所属应用 | `MR` |
| 构建时间 | `2026-06-05 15:11:26.3890` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `calculateMaxLowLevelCode` | 计算最大低阶码耗时 | `calculate_max_low_level_code` | Integer |
| 2 | `doBalance` | 供需平衡耗时 | `do_balance` | Integer |
| 3 | `doConsumption` | 消抵耗时 | `do_consumption` | Integer |
| 4 | `endWork` | 收尾工作耗时 | `end_work` | Integer |
| 5 | `generatePlanOrder` | 生成计划订单耗时 | `generate_plan_order` | Integer |
| 6 | `id` | ID | `id` | Long |
| 7 | `init` | 初始化耗时 | `init` | Integer |
| 8 | `orgId` | 所属组织 | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 9 | `planParamId` | 计划参数id | `plan_param_id` | 0d105898-52f1-4a97-971d-b334f721c74b |
| 10 | `preProcess` | 预处理耗时 | `pre_process` | Integer |
| 11 | `pubts` | 时间戳 | `pubts` | DateTime |
| 12 | `remark` | 备注 | `remark` | String |
| 13 | `requirementSupplySnapshot` | 快照数据耗时 | `requirement_supply_snapshot` | Integer |
| 14 | `tenant` | 租户 | `tenant_id` | c213cd56-d5de-421f-bae7-d77455b557cd |
| 15 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `planParamId` | 计划参数id | `mr.planworkbench.PlanParam` | None |  |
| 3 | `orgId` | 所属组织 | `aa.baseorg.OrgMV` | Service |  |
| 4 | `tenant` | 租户 | `base.tenant.Tenant` | Service |  |
