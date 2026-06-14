---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.installPlan.InstallPlanDebugInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 安装计划-调试信息 (`pes.installPlan.InstallPlanDebugInfo`)

> IMP_PES | 物理表：`sms_installation_plan_debuginfos`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 安装计划-调试信息 |
| 物理表 | `sms_installation_plan_debuginfos` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:55.5440` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（32个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `soId` | 对应工单ID | `SO_ID` | 18332b41-ebd3-4301-90af-714dfea07d9f |
| 2 | `completeStatus` | 完成状态 | `Complete_Status` | String |
| 3 | `completedAt` | 完成时间 | `Completed_at` | String |
| 4 | `planId` | 安装计划ID | `Plan_ID` | c20e1a0b-799a-419e-997d-d8c9c59a4b77 |
| 5 | `lineNo` | 行号 | `Line_No` | String |
| 6 | `orgId` | 组织ID | `Org_ID` | 14302233-1394-4a70-94e1-bed51636f312 |
| 7 | `soDocNo` | 对应工单号 | `SO_DocNo` | String |
| 8 | `soCreateUser` | 工单创建人 | `SO_CREATE_USER` | String |
| 9 | `soCreateUserName` | 工单创建人 | `SO_CREATE_USER_Name` | String |
| 10 | `soCreateTime` | 工单创建时间 | `SO_CREATE_TIME` | String |
| 11 | `seName` | 工程师 | `Se_name` | String |
| 12 | `confirmDate` | 确认时间 | `Confirm_Date` | String |
| 13 | `dispatchedAt` | 派工时间 | `Dispatched_at` | String |
| 14 | `receiveDate` | 接单时间 | `Receive_Date` | String |
| 15 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `creator` | 创建人名称 | `creator` | String |
| 17 | `createUser` | 创建者 | `create_user` | String |
| 18 | `createTime` | 创建时间 | `create_time` | DateTime |
| 19 | `createDate` | 创建日期 | `create_date` | Date |
| 20 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 21 | `modifier` | 修改人名称 | `modifier` | String |
| 22 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 23 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 24 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 25 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 26 | `seId` | 工程师id | `Se_id` | String |
| 27 | `dr` | 逻辑删除 | `dr` | Integer |
| 28 | `tenant` | 租户ID | `tenant_id` | String |
| 29 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 30 | `pubts` | 时间戳 | `pubts` | DateTime |
| 31 | `ts` | 版本号 | `ts` | String |
| 32 | `id` | ID | `id` | String |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `soId` | 对应工单ID | `pes.sos.SmsSos` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `planId` | 安装计划ID | `pes.installPlan.InstallPlan` | None | true |
| 6 | `orgId` | 组织ID | `org.func.BaseOrg` | Service |  |
