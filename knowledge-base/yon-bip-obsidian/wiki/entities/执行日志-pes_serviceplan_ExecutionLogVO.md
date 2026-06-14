---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.serviceplan.ExecutionLogVO"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 执行日志 (`pes.serviceplan.ExecutionLogVO`)

> IMP_PES | 物理表：`imp_pes_sp_exection_log`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 执行日志 |
| 物理表 | `imp_pes_sp_exection_log` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:21.1350` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | id |

---

## 直接属性（18个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `executor` | 执行人ID | `executor` | 98ac0ca3-2fd2-4a38-8a21-5d8243cddc8b |
| 2 | `executeTime` | 计划开始时间 | `execute_time` | DateTime |
| 3 | `isSuccess` | 是否成功 | `is_success` | Short |
| 4 | `failureCause` | 失败原因 | `failure_cause` | String |
| 5 | `servicePlanId` | 服务计划ID | `service_plan_id` | da03b7d0-3bee-4528-bb4a-34b21f182a5f |
| 6 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `creator` | 创建人名称 | `creator` | String |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime |
| 9 | `createDate` | 创建日期 | `create_date` | Date |
| 10 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `modifier` | 修改人名称 | `modifier` | String |
| 12 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 13 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 14 | `id` | id | `id` | String |
| 15 | `dr` | DR | `dr` | Short |
| 16 | `tenant` | 租户ID | `tenant_id` | String |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `executor` | 执行人ID | `base.user.BipUser` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `servicePlanId` | 服务计划ID | `pes.serviceplan.ServicePlanVO` | None | true |
