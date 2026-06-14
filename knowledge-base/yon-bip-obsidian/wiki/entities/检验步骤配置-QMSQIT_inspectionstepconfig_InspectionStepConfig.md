---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.inspectionstepconfig.InspectionStepConfig"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验步骤配置 (`QMSQIT.inspectionstepconfig.InspectionStepConfig`)

> QMSQIT | 物理表：`qms_qit_inspection_step_config`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验步骤配置 |
| 物理表 | `qms_qit_inspection_step_config` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:43:11.2440` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（25个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `orgId` | 质检组织 | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 4 | `code` | 编码 | `code` | String |
| 5 | `inspectionType` | 检验类型 | `inspection_type` | String |
| 6 | `standardAcqMethod` | 标准获取方式 | `standard_acq_type` | String |
| 7 | `template` | 适用对象模版 | `template` | 9cf5f5cd-70ea-4d73-bb89-e348a0630dc2 |
| 8 | `inspectionStepConfigDCT` | 检验步骤配置自定义项 | `inspection_step_config_dct` | 91fd14a5-c1a2-488c-b3c7-c14cffd4fd8c |
| 9 | `memo` | 备注 | `memo` | String |
| 10 | `name` | 名称 | `name` | String |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime |
| 12 | `createDate` | 创建日期 | `create_date` | Date |
| 13 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 14 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 15 | `creator` | 创建人名称 | `creator` | String |
| 16 | `modifier` | 修改人名称 | `modifier` | String |
| 17 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 18 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 19 | `enable` | 启用 | `enable` | sys_intboolean |
| 20 | `enablets` | 启用时间 | `enablets` | DateTime |
| 21 | `disablets` | 停用时间 | `disablets` | DateTime |
| 22 | `dr` | 逻辑删除标记 | `dr` | Short |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |
| 24 | `applicableObjectList` | 适用对象明细 | `` | ed0c207e-faeb-41fe-bbea-6e12b95b7b56 |
| 25 | `steps` | 检验步骤明细 | `` | 74dadc89-6a07-4427-8be8-58dca0d6f6e6 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `template` | 适用对象模版 | `QMSQIT.applicableobjecttemplate.ApplicableObjectTemplate` | None |  |
| 2 | `inspectionStepConfigDCT` | 检验步骤配置自定义项 | `QMSQIT.inspectionstepconfig.InspectionStepConfigDCT` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `applicableObjectList` | 适用对象明细 | `QMSQIT.inspectionstepconfig.ApplicableObject` | None | true |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `steps` | 检验步骤明细 | `QMSQIT.inspectionstepconfig.InspectionSteps` | None | true |
| 8 | `orgId` | 质检组织 | `org.func.QualityOrg` | Service |  |
