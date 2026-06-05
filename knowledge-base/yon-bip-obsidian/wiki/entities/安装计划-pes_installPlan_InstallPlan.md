---
tags: ["BIP", "元数据", "数据字典", "IMP_PES", "pes.installPlan.InstallPlan"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 安装计划 (`pes.installPlan.InstallPlan`)

> IMP_PES | 物理表：`sms_installation_plans`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 安装计划 |
| 物理表 | `sms_installation_plans` |
| 数据库 schema | `imppes` |
| 所属应用 | `IMP_PES` |
| 构建时间 | `2026-06-05 17:18:40.9870` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |

---

## 直接属性（38个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `orgId` | 组织ID | `Org_ID` | 14302233-1394-4a70-94e1-bed51636f312 |
| 2 | `customerId` | 客户ID | `Customer_ID` | 94b3280a-27a4-485a-b90b-b7bce57c6df2 |
| 3 | `customFactory` | 客户工厂 | `custom_factory` | cfde0823-db21-43ef-94cd-0b511e013ba6 |
| 4 | `equipmentId` | 设备 | `Equipment_ID` | e9f23971-1c19-49e1-83d7-3a84ebcb187e |
| 5 | `name` | 名称 | `Name` | String |
| 6 | `installPlanTemplate` | 安装计划模板 | `installPlanTemplate` | 8b360e39-a263-4733-b5c3-c5f5bf99cb47 |
| 7 | `installPolicy` | 安装策略 | `install_policy` | String |
| 8 | `status` | 状态 | `Status` | String |
| 9 | `isUsed` | 启用状态 | `Is_Used` | Integer |
| 10 | `isFinished` | 安装完成 | `Is_Finished` | Integer |
| 11 | `isDebugged` | 调试完成 | `Is_Debugged` | Integer |
| 12 | `checked` | 验收完成 | `Checked` | Integer |
| 13 | `installProcess` | 安装进度 | `install_process` | String |
| 14 | `positionId` | 设备位置ID | `Position_ID` | 95577e23-979f-4f09-a629-61fea93e576d |
| 15 | `contractId` | 服务合同ID | `Contract_ID` | eafb7e7b-746e-4b48-8773-e48df89613f1 |
| 16 | `remarks` | 备注 | `Remarks` | String |
| 17 | `userDefineCharacter` | 自定义项特征 | `user_define_character` | 1e01b4c6-5fed-4778-9840-afcb4e68a421 |
| 18 | `planOrg` | 计划组织ID | `Plan_Org` | 14302233-1394-4a70-94e1-bed51636f312 |
| 19 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 20 | `creator` | 创建人名称 | `creator` | String |
| 21 | `createUser` | 创建者 | `create_user` | String |
| 22 | `createTime` | 创建时间 | `create_time` | DateTime |
| 23 | `createDate` | 创建日期 | `create_date` | Date |
| 24 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 25 | `modifier` | 修改人名称 | `modifier` | String |
| 26 | `lastModifyUser` | 最近修改者 | `last_modify_user` | String |
| 27 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 28 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 29 | `lastModified` | 最近修改时间 | `last_modified` | String |
| 30 | `id` | ID | `id` | String |
| 31 | `dr` | 逻辑删除 | `dr` | Integer |
| 32 | `tenant` | 租户ID | `tenant_id` | String |
| 33 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 34 | `pubts` | 时间戳 | `pubts` | DateTime |
| 35 | `ts` | 版本号 | `ts` | String |
| 36 | `installPlanCheckInfoList` | 安装计划-验收信息 | `` | 227a3768-e408-41f3-8219-ff62f80331e9 |
| 37 | `installPlanDebugInfoList` | 安装计划-调试信息 | `` | fa79d7e9-7a8c-4738-91dc-05c741f5ff40 |
| 38 | `installPlanJobList` | 安装计划-安装作业 | `` | bf2b7270-bc7e-41ed-aca9-a0e8a6bb2d9b |

---

## 关联属性（15个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `userDefineCharacter` | 自定义项特征 | `pes.installPlan.SmsInstallationPlansDefineCharacter` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `installPlanDebugInfoList` | 安装计划-调试信息 | `pes.installPlan.InstallPlanDebugInfo` | None | true |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `equipmentId` | 设备 | `aim.equip.EquipHeadVO` | Service |  |
| 7 | `orgId` | 组织ID | `org.func.BaseOrg` | Service |  |
| 8 | `planOrg` | 计划组织ID | `org.func.BaseOrg` | Service |  |
| 9 | `positionId` | 设备位置ID | `bd.region.BaseRegionVO` | Service |  |
| 10 | `customFactory` | 客户工厂 | `pes.customFactory.CustomFactory` | None |  |
| 11 | `installPlanCheckInfoList` | 安装计划-验收信息 | `pes.installPlan.InstallPlanCheckInfo` | None | true |
| 12 | `contractId` | 服务合同ID | `pes.smsContracts.SmsContracts` | None |  |
| 13 | `customerId` | 客户ID | `aa.merchant.Merchant` | Service |  |
| 14 | `installPlanTemplate` | 安装计划模板 | `pes.installPlanTpl.InstallPlanTpl` | None |  |
| 15 | `installPlanJobList` | 安装计划-安装作业 | `pes.installPlan.InstallPlanJob` | None | true |
