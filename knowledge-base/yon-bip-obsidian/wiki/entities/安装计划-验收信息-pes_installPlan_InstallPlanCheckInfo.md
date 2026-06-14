---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.installPlan.InstallPlanCheckInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 安装计划-验收信息 (`pes.installPlan.InstallPlanCheckInfo`)

> IMP_PES | 物理表：`sms_installation_plan_checkinfos`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 安装计划-验收信息 |
| 物理表 | `sms_installation_plan_checkinfos` |
| domain/服务域 | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:19:54.1280` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（32个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `soId` | 对应工单ID | `soId` | 18332b41-ebd3-4301-90af-714dfea07d9f |
| 2 | `checkResult` | 验收结果 | `Check_Result` | String |
| 3 | `beginCheckDate` | 开始验收时间 | `Begin_Check_Date` | String |
| 4 | `checkDate` | 验收结束时间 | `Check_Date` | String |
| 5 | `smsProjectName` | 服务项目 | `sms_project_name` | String |
| 6 | `checkByName` | 验收人 | `Check_By_Name` | String |
| 7 | `checkByPhone` | 验收人手机 | `Check_By_Phone` | String |
| 8 | `checkMemo` | 验收说明 | `Check_Memo` | String |
| 9 | `planId` | 安装计划ID | `Plan_ID` | c20e1a0b-799a-419e-997d-d8c9c59a4b77 |
| 10 | `smsProjectId` | 服务项目ID | `sms_project_id` | String |
| 11 | `smsProjectCode` | 服务项目编码 | `sms_project_code` | String |
| 12 | `checkBy` | 验收人 | `Check_By` | String |
| 13 | `checkStatus` | 验收类型 | `Check_Status` | String |
| 14 | `lineNo` | 行号 | `Line_No` | String |
| 15 | `orgId` | 组织ID | `Org_ID` | 14302233-1394-4a70-94e1-bed51636f312 |
| 16 | `creator` | 创建人名称 | `creator` | String |
| 17 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `createUser` | 创建者 | `create_user` | String |
| 19 | `createTime` | 创建时间 | `create_time` | DateTime |
| 20 | `createDate` | 创建日期 | `create_date` | Date |
| 21 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 22 | `modifier` | 修改人名称 | `modifier` | String |
| 23 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 24 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 25 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 26 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 27 | `id` | ID | `id` | String |
| 28 | `dr` | 逻辑删除 | `dr` | Integer |
| 29 | `tenant` | 租户ID | `tenant_id` | String |
| 30 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 31 | `pubts` | 时间戳 | `pubts` | DateTime |
| 32 | `ts` | 版本号 | `ts` | String |

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
