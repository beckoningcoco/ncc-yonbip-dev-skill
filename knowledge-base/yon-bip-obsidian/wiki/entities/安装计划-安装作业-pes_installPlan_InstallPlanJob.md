---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.installPlan.InstallPlanJob"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 安装计划-安装作业 (`pes.installPlan.InstallPlanJob`)

> IMP_PES | 物理表：`sms_installation_plan_details`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 安装计划-安装作业 |
| 物理表 | `sms_installation_plan_details` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:57.1690` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `lineNo` | 行号 | `Line_No` | String |
| 2 | `jobId` | 安装作业ID | `Job_ID` | eb52c260-ba96-4244-9393-e7325b3f163a |
| 3 | `standId` | 安装作业标准ID | `stand_id` | 64ca3661-a2e6-4df4-b64f-00ba5bc77383 |
| 4 | `isFinished` | 完工 | `Is_Finished` | Boolean |
| 5 | `finishDate` | 完工时间 | `Finish_Date` | String |
| 6 | `planId` | 安装计划ID | `Plan_ID` | c20e1a0b-799a-419e-997d-d8c9c59a4b77 |
| 7 | `userDefineCharacter` | 自定义项特征 | `user_define_character` | ba238b4e-e8d1-4389-bbed-a66b510c151f |
| 8 | `orgId` | 组织ID | `Org_ID` | 14302233-1394-4a70-94e1-bed51636f312 |
| 9 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 10 | `creator` | 创建人名称 | `creator` | String |
| 11 | `createUser` | 创建者 | `create_user` | String |
| 12 | `createTime` | 创建时间 | `create_time` | DateTime |
| 13 | `createDate` | 创建日期 | `create_date` | Date |
| 14 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `modifier` | 修改人名称 | `modifier` | String |
| 16 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 18 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 19 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 20 | `id` | ID | `id` | String |
| 21 | `dr` | 逻辑删除 | `dr` | Integer |
| 22 | `tenant` | 租户ID | `tenant_id` | String |
| 23 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 24 | `pubts` | 时间戳 | `pubts` | DateTime |
| 25 | `ts` | 版本号 | `ts` | String |
| 26 | `soId` | 对应工单ID | `so_id` | 18332b41-ebd3-4301-90af-714dfea07d9f |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `jobId` | 安装作业ID | `pes.installJob.InstallJob` | None |  |
| 2 | `soId` | 对应工单ID | `pes.sos.SmsSos` | None |  |
| 3 | `userDefineCharacter` | 自定义项特征 | `pes.installPlan.SmsInstallationPlanDetailsDefineCharacter` | None |  |
| 4 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 5 | `standId` | 安装作业标准ID | `pes.installStandard.InstallStandard` | None |  |
| 6 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 7 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 8 | `planId` | 安装计划ID | `pes.installPlan.InstallPlan` | None | true |
| 9 | `orgId` | 组织ID | `org.func.BaseOrg` | Service |  |
