---
tags: ["BIP", "元数据", "数据字典", "DCRP", "cmp.capacitycalculate.CapacityCalculate"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 产能运算 (`cmp.capacitycalculate.CapacityCalculate`)

> DCRP | 物理表：`cmp_capacity_calculate`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 产能运算 |
| 物理表 | `cmp_capacity_calculate` |
| 数据库 schema | `yonbip-mm-plan` |
| 所属应用 | `DCRP` |
| 构建时间 | `2026-06-05 13:58:38.2710` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `orgId` | 组织ID | `org_id` | eaa75c14-e58f-4b35-9ae5-0032f4a98f54 |
| 3 | `id` | ID | `id` | Long |
| 4 | `app` | 应用 | `app` | String |
| 5 | `code` | 编码 | `code` | String |
| 6 | `name` | 名称 | `name` | String |
| 7 | `memo` | 备注 | `memo` | String |
| 8 | `version` | 版本号 | `version` | String |
| 9 | `formal` | 正式版本 | `formal` | Short |
| 10 | `planScheme` | 计划方案 | `plan_scheme` | 041020b1-3648-445c-9ed9-4343313ab927 |
| 11 | `runState` | 运算状态 | `run_state` | String |
| 12 | `startDate` | 运算开始时间 | `start_date` | DateTime |
| 13 | `endDate` | 运算结束时间 | `end_date` | DateTime |
| 14 | `planParamId` | 计划参数id | `plan_param_id` | Long |
| 15 | `dr` | 逻辑删除标记 | `dr` | Short |
| 16 | `createTime` | 创建时间 | `create_time` | DateTime |
| 17 | `createDate` | 创建日期 | `create_date` | Date |
| 18 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 19 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 20 | `creator` | 创建人名称 | `creator` | String |
| 21 | `modifier` | 修改人名称 | `modifier` | String |
| 22 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 23 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime |
| 25 | `calOrderList` | 运算单据 | `` | a6056cfa-5f66-411e-ae5d-50576fd189f3 |
| 26 | `progressList` | 运算进度 | `` | fa2b4776-bf76-47d9-a46d-f332c28ee771 |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `calOrderList` | 运算单据 | `cmp.capacitycalculate.CalOrder` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `progressList` | 运算进度 | `cmp.capacitycalculate.Progress` | None | true |
| 6 | `planScheme` | 计划方案 | `cmp.capacityassessmentplan.CapacityAssessmentPlan` | None |  |
| 7 | `orgId` | 组织ID | `aa.baseorg.OrgMV` | Service |  |
