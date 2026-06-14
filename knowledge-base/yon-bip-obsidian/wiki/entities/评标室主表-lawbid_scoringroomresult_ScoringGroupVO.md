---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.scoringroomresult.ScoringGroupVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 评标室主表 (`lawbid.scoringroomresult.ScoringGroupVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_scoring_group`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 评标室主表 |
| 物理表 | `cpu_scoring_group` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:25:00.3290` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

## 部署信息

- 部署时间: 2026-01-23 23:56:30:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 4 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |

---

## 直接属性（41个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键 | `id` | Long |
| 2 | `status` | 状态 | `status` | String |
| 3 | `conclusionInfo` | 评标结果描述 | `conclusion_info` | String |
| 4 | `file` | 附件 | `file` | String |
| 5 | `approvalId` | 评标结果审批信息 | `approval_id` | edc8535f-9b8d-48ab-8575-cf38ee3b7f5f |
| 6 | `scoringGroupVODefineCharacter` | 评标组特征自定义项 | `define_character_id` | f847b366-ebda-4d4a-88e8-fe4ee21e05d6 |
| 7 | `billVersionId` | 版本号 | `bill_version_id` | a3a5ef89-acd9-4d26-bfa0-f2828d18ef6b |
| 8 | `bidSectionId` | 标段 | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 9 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 10 | `createDate` | 创建日期 | `create_date` | Date |
| 11 | `createTime` | 创建时间 | `create_time` | DateTime |
| 12 | `creator` | 创建人名称 | `creator` | String |
| 13 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 14 | `currentEvaluationStage` | 分步开评标阶段标识 | `current_evaluation_stage` | Integer |
| 15 | `defines` | 评标室主表自定义项 | `` | cf5881a3-ee01-4166-a338-ad9d3eeacffc |
| 16 | `dr` | 逻辑删除标记 | `dr` | Short |
| 17 | `enterpriseId` | 租户 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 18 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 19 | `expectEndTime` | 预计结束时间 | `expect_end_time` | DateTime |
| 20 | `expectStartTime` | 预计开始时间 | `expect_start_time` | DateTime |
| 21 | `formQualificationGroup` | 组建类型 | `form_qualification_group` | Integer |
| 22 | `gather` | 结果汇总表 | `` | 26b11e1d-e5b6-4cb4-b991-d0c2f0597955 |
| 23 | `modifier` | 修改人名称 | `modifier` | String |
| 24 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 25 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 26 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 27 | `multipleCurrentStage` | 招标阶段 | `multiple_current_stage` | Integer |
| 28 | `plagiarismFile` | 查重报告附件 | `plagiarism_file` | String |
| 29 | `plagiarismReportId` | 查重报告ID | `plagiarism_report_id` | String |
| 30 | `plagiarismStatus` | 查重状态 | `plagiarism_status` | Integer |
| 31 | `principalId` | 委托人 | `principal_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 32 | `principalName` | 委托人 | `principal_name` | String |
| 33 | `projectId` | 项目 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 34 | `pubts` | 时间戳 | `pubts` | DateTime |
| 35 | `roomNumber` | 房间号 | `room_number` | Integer |
| 36 | `scoringGroupCode` | 评标组号 | `scoring_group_code` | String |
| 37 | `scoringGroupName` | 评标组名称 | `scoring_group_name` | String |
| 38 | `sectionNum` | 评标项目数 | `section_num` | Integer |
| 39 | `segments` | 环节信息表 | `` | 37368fe3-ea12-4e0a-9f0f-5624bbc10a30 |
| 40 | `shareOtherSection` | 评审小组是否共享给本项目下其他标包 | `share_other_section` | Short |
| 41 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（13个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `billVersionId` | 版本号 | `lawbid.billversion.BizBillVersion` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `scoringGroupVODefineCharacter` | 评标组特征自定义项 | `lawbid.scoringroomresult.ScoringGroupVODefineCharacter` | None |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `principalId` | 委托人 | `bd.staff.Staff` | Service |  |
| 7 | `gather` | 结果汇总表 | `lawbid.scoringroomresult.ScoringRoomGather` | None | true |
| 8 | `segments` | 环节信息表 | `lawbid.scoringroomresult.ScoringRoomSegment` | None | true |
| 9 | `defines` | 评标室主表自定义项 | `lawbid.scoringroomresult.ScoringGroupVOFreeDefine` | None | true |
| 10 | `approvalId` | 评标结果审批信息 | `lawbid.scoringroomresultapproval.ScoringGroupApproval` | None |  |
| 11 | `enterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 12 | `projectId` | 项目 | `lawbid.project.LawbidProject` | None |  |
| 13 | `bidSectionId` | 标段 | `lawbid.section.LawbidSection` | None |  |
