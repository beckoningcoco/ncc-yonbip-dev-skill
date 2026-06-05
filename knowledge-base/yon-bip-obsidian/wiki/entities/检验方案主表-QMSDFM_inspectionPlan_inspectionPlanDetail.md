---
tags: ["BIP", "元数据", "数据字典", "QIC", "QMSDFM.inspectionPlan.inspectionPlanDetail"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验方案主表 (`QMSDFM.inspectionPlan.inspectionPlanDetail`)

> QIC | 物理表：`qms_dfm_inspectionplan_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验方案主表 |
| 物理表 | `qms_dfm_inspectionplan_detail` |
| 数据库 schema | `QMS-DFM` |
| 所属应用 | `QIC` |
| 构建时间 | `2026-06-05 16:44:38.7760` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | String | 手工码 |
| 编码 | `code` | String | 检验方案编码 |

---

## 直接属性（54个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `orgId` | 使用组织 | `org_id` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 3 | `id` | 手工码 | `id` | String |
| 4 | `code` | 检验方案编码 | `code` | String |
| 5 | `name` | 检验方案名称 | `name` | String |
| 6 | `inspectionType` | 检验类型 | `inspectionType` | String |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `samplingUnit` | 取样单位 | `samplingUnit` | String |
| 9 | `newestVer` | 是否最新版本 | `newest_ver` | String |
| 10 | `sampleMethodDetailid` | 取样方式主表id | `sample_method_detailid` | 5653b278-1a57-42ea-81ab-e579e060556a |
| 11 | `isMultiInspect` | 是否多版本检验 | `is_multi_inspect` | Short |
| 12 | `validFrom` | 有效期从 | `valid_from` | DateTime |
| 13 | `expiryDate` | 有效期止 | `expiry_date` | DateTime |
| 14 | `containStep` | 是否设置质检步骤 | `containStep` | String |
| 15 | `extras` | 附加信息 | `extras` | String |
| 16 | `inspectRule` | 适用检验规则 | `inspect_rule` | String |
| 17 | `leniencyAdjust` | 启用宽严度调整检验 | `leniency_adjust` | String |
| 18 | `returncount` | 退回次数 | `returncount` | Short |
| 19 | `modifier` | 修改人id | `modifier` | String |
| 20 | `inspectionPlanClass` | 检验方案分类id | `inspectionPlanClass` | fb967f62-dd79-432d-88d0-aa4789da86d4 |
| 21 | `inspectionPlanId` | 检验方案ID | `inspectionplan_id` | 14bcdfef-7982-4772-baf8-e0d6ebef507e |
| 22 | `definect_d` | 检验方案主表自定义项 | `definect_d` | c6cc63a4-4a4a-41d2-9625-754a8b36b105 |
| 23 | `tenant` | 租户ID | `tenant_id` | String |
| 24 | `version` | 版本 | `version` | String |
| 25 | `isInspectionItemConfirm` | 单一取样方式 | `isInspectionItemConfirm` | String |
| 26 | `storage` | 启用状态 | `storage` | String |
| 27 | `inspectionFrequency` | 检验频次 | `inspectionFrequency` | String |
| 28 | `samplingMethod` | 取样方式id | `samplingMethod` | d21eaba0-3431-4238-b178-c6216a31b34b |
| 29 | `inspectionBasic` | 检测依据id | `inspectionBasic` | f0529fa3-5e4b-444a-8212-716743519d68 |
| 30 | `recordValue` | 记录样本值 | `recordValue` | String |
| 31 | `verifystate` | 单据状态 | `verifystate` | Short |
| 32 | `note` | 备注 | `note` | String |
| 33 | `isWfControlled` | 是否审批流控制 | `isWfControlled` | Boolean |
| 34 | `qualityInspectionCenter` | 质检中心id | `qualityInspectionCenter` | 9d2a4a8b-1b44-4c00-b39d-4fbcf8fa958a |
| 35 | `qualityLevel` | 质量等级组id | `qualityLevel` | 8a7f6d68-6241-4364-be90-2b4b3d57e135 |
| 36 | `bustype` | 交易类型id | `bustype` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 37 | `historyID` | 历史版本ID | `historyID` | String |
| 38 | `bpmcode` | 审批编码 | `bpmcode` | String |
| 39 | `pubts` | 时间戳 | `pubts` | DateTime |
| 40 | `createDate` | 创建日期 | `create_date` | Date |
| 41 | `createTime` | 创建时间 | `create_time` | DateTime |
| 42 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 43 | `creator` | 创建人 | `creator` | String |
| 44 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 45 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 46 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 47 | `auditDate` | 审批日期 | `audit_date` | Date |
| 48 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 49 | `auditor` | 审批人名称 | `auditor` | String |
| 50 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 51 | `defines` | 检验方案自定义项 | `` | 0488d9d7-206a-4626-b9bf-34bc4324f81a |
| 52 | `inspectionItemBList` | 检验方案项目信息 | `` | 5b4c30ac-48b7-41ad-9875-0350d15062e2 |
| 53 | `inspectionPlan` | 检验方案(停用) | `` | 14bcdfef-7982-4772-baf8-e0d6ebef507e |
| 54 | `matchPlanList` | 检验对象 | `` | 6d8809cb-2fb1-45d6-b9a0-35230c8dde00 |

---

## 关联属性（18个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 3 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 4 | `qualityInspectionCenter` | 质检中心id | `org.func.QualityOrg` | Service |  |
| 5 | `matchPlanList` | 检验对象 | `QMSDFM.inspectionPlan.matchPlan` | None | true |
| 6 | `inspectionPlanClass` | 检验方案分类id | `QMSDFM.inspectionPlanClass.inspectionplanclass` | None |  |
| 7 | `qualityLevel` | 质量等级组id | `QMSDFM.qualityGrade.qualityGrade` | None |  |
| 8 | `inspectionBasic` | 检测依据id | `QMSDFM.detectionbasis.qam_detectionbasis` | None |  |
| 9 | `bustype` | 交易类型id | `bd.bill.TransType` | Service |  |
| 10 | `orgId` | 使用组织 | `org.func.QualityOrg` | Service |  |
| 11 | `defines` | 检验方案自定义项 | `QMSDFM.inspectionPlan.inspectionPlanDefine` | None | true |
| 12 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 13 | `definect_d` | 检验方案主表自定义项 | `QMSDFM.inspectionPlan.InspectionPlanDetailDefineCharacter` | None |  |
| 14 | `inspectionPlan` | 检验方案(停用) | `QMSDFM.inspectionPlan.inspectionPlan` | None | true |
| 15 | `sampleMethodDetailid` | 取样方式主表id | `QMSDFM.sampleMethod.sampleMethodDetail` | None |  |
| 16 | `inspectionPlanId` | 检验方案ID | `QMSDFM.inspectionPlan.inspectionPlan` | None |  |
| 17 | `samplingMethod` | 取样方式id | `QMSDFM.sampleMethod.sampleMethod` | None |  |
| 18 | `inspectionItemBList` | 检验方案项目信息 | `QMSDFM.inspectionPlan.inspectionItemB` | None | true |
