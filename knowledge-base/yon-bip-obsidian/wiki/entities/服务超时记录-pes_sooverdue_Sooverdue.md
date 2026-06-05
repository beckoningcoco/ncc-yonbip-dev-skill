---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.sooverdue.Sooverdue"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 服务超时记录 (`pes.sooverdue.Sooverdue`)

> IMP_PES | 物理表：`sms_so_overdues`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 服务超时记录 |
| 物理表 | `sms_so_overdues` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:18:01.6540` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（29个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `logId` | 服务记录ID | `log_id` | String |
| 2 | `soId` | 服务工单ID | `so_id` | 18332b41-ebd3-4301-90af-714dfea07d9f |
| 3 | `planCompletedAt` | 计划完工时间 | `plan_completed_at` | String |
| 4 | `planNodeCompletedAt` | 当前节点计划完成时间 | `plan_node_completed_at` | String |
| 5 | `allOverduesTime` | 总超时时长 | `all_overdues_time` | String |
| 6 | `responseOverduesTime` | 响应超时时长 | `response_overdues_time` | String |
| 7 | `stepResponseOverduesTime` | 单步响应超时时长 | `step_response_overdues_time` | String |
| 8 | `memo` | 备注 | `memo` | String |
| 9 | `messageIsSend` | 消息是否已经发送 | `message_is_send` | String |
| 10 | `soStatus` | 工单状态 | `so_status` | String |
| 11 | `allottimeId` | 服务时限ID | `allottime_id` | String |
| 12 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 13 | `creator` | 创建人名称 | `creator` | String |
| 14 | `createUser` | 创建者 | `create_user` | String |
| 15 | `createTime` | 创建时间 | `create_time` | DateTime |
| 16 | `createDate` | 创建日期 | `create_date` | Date |
| 17 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 18 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `modifier` | 修改人名称 | `modifier` | String |
| 20 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 21 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 22 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 23 | `orgId` | 组织 | `org_id` | 14302233-1394-4a70-94e1-bed51636f312 |
| 24 | `id` | ID | `id` | String |
| 25 | `dr` | 逻辑删除 | `dr` | Integer |
| 26 | `tenant` | 租户ID | `tenant_id` | String |
| 27 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 28 | `pubts` | 时间戳 | `pubts` | DateTime |
| 29 | `ts` | 版本号 | `ts` | String |

---

## 关联属性（5个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `soId` | 服务工单ID | `pes.sos.SmsSos` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `orgId` | 组织 | `org.func.BaseOrg` | Service |  |
