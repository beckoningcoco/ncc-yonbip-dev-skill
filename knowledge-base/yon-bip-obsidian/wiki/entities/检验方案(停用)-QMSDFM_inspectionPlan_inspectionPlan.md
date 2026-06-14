---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.inspectionPlan.inspectionPlan"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验方案(停用) (`QMSDFM.inspectionPlan.inspectionPlan`)

> QIC | 物理表：`qms_dfm_inspectionplan`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验方案(停用) |
| 物理表 | `qms_dfm_inspectionplan` |
| domain/服务域 | `QMS-DFM` |
| schema | `qms_dfm` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 17:29:35.5490` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | ID |
| 编码 | `code` | String | 编码 |

---

## 直接属性（24个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | String |
| 3 | `qualityInspectionCenter` | 质检中心id | `qualityInspectionCenter` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 4 | `code` | 编码 | `code` | String |
| 5 | `name` | 名称 | `name` | String |
| 6 | `createDate` | 创建日期 | `create_date` | Date |
| 7 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 8 | `detailId` | 详情id | `detail_id` | cacc3797-7e23-44d9-aad5-ebfe0c680961 |
| 9 | `modifier` | 修改人id | `modifier` | String |
| 10 | `modifierId` | 修改人id | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 11 | `inspectionPlanClass` | 检验方案分类id | `inspectionPlanClass` | fb967f62-dd79-432d-88d0-aa4789da86d4 |
| 12 | `dr` | 逻辑删除标记 | `dr` | Short |
| 13 | `tenant` | 租户ID | `tenant_id` | String |
| 14 | `version` | 版本 | `version` | String |
| 15 | `createTime` | 创建时间 | `create_time` | DateTime |
| 16 | `verifystate` | 单据状态 | `verifystate` | Short |
| 17 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 18 | `pubts` | 时间戳 | `pubts` | DateTime |
| 19 | `creator` | 创建人id | `creator` | String |
| 20 | `creatorId` | 创建人id | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 21 | `historyID` | 历史版本ID | `historyID` | String |
| 22 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 23 | `returncount` | 退回次数 | `returncount` | Short |
| 24 | `applyRanges` | 检验方案适用范围 | `` | 6e167fe7-6e82-4bef-a37c-afc1e0d1d3de |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `applyRanges` | 检验方案适用范围 | `QMSDFM.inspectionPlan.inspectionPlanApplyRange` | None | true |
| 3 | `creatorId` | 创建人id | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人id | `base.user.User` | Service |  |
| 5 | `detailId` | 详情id | `QMSDFM.inspectionPlan.inspectionPlanDetail` | None | true |
| 6 | `qualityInspectionCenter` | 质检中心id | `org.func.QualityOrg` | Service |  |
| 7 | `inspectionPlanClass` | 检验方案分类id | `QMSDFM.inspectionPlanClass.inspectionplanclass` | None |  |
