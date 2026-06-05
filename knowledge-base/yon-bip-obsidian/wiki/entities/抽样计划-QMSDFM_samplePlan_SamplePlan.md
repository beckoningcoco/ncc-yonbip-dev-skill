---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.samplePlan.SamplePlan"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 抽样计划 (`QMSDFM.samplePlan.SamplePlan`)

> QIC | 物理表：`qms_dfm_sampleplan`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 抽样计划 |
| 物理表 | `qms_dfm_sampleplan` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:47:21.7430` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（25个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `createDate` | 创建日期 | `create_date` | Date |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 4 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 5 | `note` | 备注 | `note` | String |
| 6 | `pubts` | 时间戳 | `pubts` | DateTime |
| 7 | `tenant` | 租户ID | `tenant_id` | String |
| 8 | `id` | ID | `id` | Long |
| 9 | `orgId` | 管理组织id | `orgId` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 10 | `code` | 编码 | `code` | String |
| 11 | `name` | 名称 | `name` | String |
| 12 | `inspectionLevel` | 检验水平 | `inspectionLevel` | String |
| 13 | `AQL` | AQL | `AQL` | String |
| 14 | `dataSources` | 数据来源 | `dataSources` | String |
| 15 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `creator` | 创建人 | `creator` | String |
| 17 | `createTime` | 创建时间 | `create_time` | DateTime |
| 18 | `modifierId` | 修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `modifier` | 修改人 | `modifier` | String |
| 20 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 21 | `SamplePlanRelaxList` | 抽样计划放宽信息表 | `` | dcc257f7-fa3b-462f-90ac-f237e28c7ef3 |
| 22 | `SamplePlanStricterList` | 抽样计划加严信息表 | `` | 1d89de7e-71a7-47a3-a3dc-1be4157a18ef |
| 23 | `definect_h` | 自定义项特征组 | `definect_h` | 2d5d4e2c-456a-408e-b6c4-2b44890b3a16 |
| 24 | `samplePlanbodyList` | 抽样计划正常信息表 | `` | 5254a634-6f8d-4bae-abb6-71e48348110e |
| 25 | `sampleUseOrgList` | 使用组织 | `` | 0621b7f5-f8b8-4c59-9dba-2525a75097ac |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `sampleUseOrgList` | 使用组织 | `QMSDFM.samplePlan.SampleUseOrg` | None | true |
| 3 | `samplePlanbodyList` | 抽样计划正常信息表 | `QMSDFM.samplePlan.SamplePlanNormal` | None | true |
| 4 | `SamplePlanRelaxList` | 抽样计划放宽信息表 | `QMSDFM.samplePlan.SamplePlanRelax` | None | true |
| 5 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人id | `base.user.User` | Service |  |
| 7 | `definect_h` | 自定义项特征组 | `QMSDFM.samplePlan.SamplePlanDefineCharacter` | None |  |
| 8 | `SamplePlanStricterList` | 抽样计划加严信息表 | `QMSDFM.samplePlan.SamplePlanStricter` | None | true |
| 9 | `orgId` | 管理组织id | `org.func.QualityOrg` | Service |  |
