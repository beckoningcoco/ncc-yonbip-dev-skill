---
tags: ["BIP", "元数据", "数据字典", "QMSQIT", "QMSQIT.CheckPlan.CheckInfo"]
created: 2026-06-05
updated: 2026-06-05
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-05
status: verified
source_type: api_response
---

# 检验信息 (`QMSQIT.CheckPlan.CheckInfo`)

> QMSQIT | 物理表：`qms_qit_checkplan_m_info`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 检验信息 |
| 物理表 | `qms_qit_checkplan_m_info` |
| domain/服务域 | `QMS-QIT` |
| schema | `qms_qit_rejectbill` |
| 所属应用 | `QMSQIT` |
| 构建时间 | `2026-06-05 16:44:57.3670` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（39个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 2 | `id` | ID | `id` | Long |
| 3 | `bodyID` | 表体ID | `body_id` | ad4dfcac-8d02-4f5f-9f0c-cdbd98788ee8 |
| 4 | `inspectionUnit` | 检验值单位 | `inspection_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 5 | `inspectionItemClass` | 检验项目分类 | `inspectionitem_class` | c3b4c20b-a758-485f-8565-7cec8f466bf4 |
| 6 | `samplingMethod` | 取样方式id(停用) | `sampling_method` | d21eaba0-3431-4238-b178-c6216a31b34b |
| 7 | `inspectionItem` | 检验项目id(停用) | `inspection_item` | 10e9d13b-12d5-44ea-8f94-ada2ea783264 |
| 8 | `attachmentId` | 检测方法附件id | `attachment_id` | String |
| 9 | `lineNo` | 行号 | `line_no` | Integer |
| 10 | `controlStandards` | 内控标准规定 | `control_standards` | String |
| 11 | `statutoryStandard` | 法定标准规定 | `statutory_sandard` | String |
| 12 | `inspectionType` | 检验值类型 | `inspection_type` | String |
| 13 | `qualityNature` | 质量指标性质 | `quality_nature` | String |
| 14 | `recordValue` | 记录样本值 | `record_value` | String |
| 15 | `number` | 小数位数 | `number` | Integer |
| 16 | `rules` | 修约规则 | `rules` | String |
| 17 | `multipleCheckValue` | 多样本检验值 | `multiple_check_value` | String |
| 18 | `standardValueFormula` | 标准值计算公式 | `standard_value_formula` | String |
| 19 | `additionalInspection` | 附加检验 | `additional_inspection` | String |
| 20 | `keyItem` | 关键项目 | `key_item` | String |
| 21 | `checkNumber` | 取样数量 | `check_number` | Decimal |
| 22 | `samplingUnit` | 取样单位 | `sampling_unit` | 9ea02a0b-3a48-4051-bcbe-59c7bcc7a25b |
| 23 | `inspectionBasic` | 检测依据 | `inspection_basic` | f0529fa3-5e4b-444a-8212-716743519d68 |
| 24 | `inspectionMethod` | 检测方法 | `inspection_method` | 90d44bff-eef4-4fd8-a0c1-8ce14fbab951 |
| 25 | `note` | 备注 | `note` | String |
| 26 | `defineCharacter` | 自定义项特征组 | `define_character` | 74524a5b-c1d4-4d95-a2ce-22d1b5f27577 |
| 27 | `inspectValueFormula` | 检验值计算公式 | `inspect_value_formula` | String |
| 28 | `inspectItemDetailId` | 检验项目主表id | `inspectitemdetail_id` | 3ef85f41-6ab5-4748-9805-2c9ccf03e399 |
| 29 | `sampleMethodDetailId` | 取样方式主表id | `sampledetail_id` | 5653b278-1a57-42ea-81ab-e579e060556a |
| 30 | `dr` | 逻辑删除标记 | `dr` | Short |
| 31 | `createTime` | 创建时间 | `create_time` | DateTime |
| 32 | `createDate` | 创建日期 | `create_date` | Date |
| 33 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 34 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 35 | `creator` | 创建人名称 | `creator` | String |
| 36 | `modifier` | 修改人名称 | `modifier` | String |
| 37 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 38 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 39 | `pubts` | 时间戳 | `pubts` | DateTime |

---

## 关联属性（14个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `inspectionItem` | 检验项目id(停用) | `QMSDFM.checkProject.checkProject` | Service |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 4 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 5 | `samplingUnit` | 取样单位 | `pc.unit.Unit` | Service |  |
| 6 | `inspectionBasic` | 检测依据 | `QMSDFM.detectionbasis.qam_detectionbasis` | Service |  |
| 7 | `inspectionItemClass` | 检验项目分类 | `QMSDFM.checkProjectClass.checkProjectClass` | Service |  |
| 8 | `inspectItemDetailId` | 检验项目主表id | `QMSDFM.checkProject.checkProjectDetail` | Service |  |
| 9 | `sampleMethodDetailId` | 取样方式主表id | `QMSDFM.sampleMethod.sampleMethodDetail` | Service |  |
| 10 | `bodyID` | 表体ID | `QMSQIT.CheckPlan.CheckPlanBody` | None | true |
| 11 | `samplingMethod` | 取样方式id(停用) | `QMSDFM.sampleMethod.sampleMethod` | Service |  |
| 12 | `defineCharacter` | 自定义项特征组 | `QMSQIT.CheckPlan.CheckInfoDefineCharacter` | None |  |
| 13 | `inspectionMethod` | 检测方法 | `QMSDFM.detectionMethod.QmsDfmDetectionMethod` | Service |  |
| 14 | `inspectionUnit` | 检验值单位 | `pc.unit.Unit` | Service |  |
