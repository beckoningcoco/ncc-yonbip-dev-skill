---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.scoringtask.ExpertScoringTask"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 评标任务主表 (`lawbid.scoringtask.ExpertScoringTask`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_mark_expert`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 评标任务主表 |
| 物理表 | `cpu_mark_expert` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:24:57.5770` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 评分任务id |

## 部署信息

- 部署时间: 2025-10-24 23:57:35:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（51个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `bidType` | 采购方式 | `bid_type` | String |
| 2 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 3 | `createDate` | 创建日期 | `create_date` | Date |
| 4 | `createTime` | 创建时间 | `create_time` | DateTime |
| 5 | `creator` | 创建人名称 | `creator` | String |
| 6 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 7 | `dr` | 逻辑删除标记 | `dr` | Short |
| 8 | `enterpriseId` | 租户 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 9 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 10 | `ifSignin` | 是否签到 | `if_signin` | Short |
| 11 | `expectEndTime` | 预计结束时间 | `expect_end_time` | DateTime |
| 12 | `expectStartTime` | 预计开始时间 | `expect_start_time` | DateTime |
| 13 | `expertExternalId` | 专家外部系统 | `expert_external_id` | String |
| 14 | `ifEvadeOrg` | 有无回避信息 | `if_evade_org` | String |
| 15 | `ifHeadman` | 是否组长 | `if_headman` | String |
| 16 | `markSegment` | 打分项目 | `mark_segment` | String |
| 17 | `markSegmentName` | 评分环节名称 | `mark_segment_name` | String |
| 18 | `modifier` | 修改人名称 | `modifier` | String |
| 19 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 20 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 21 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 22 | `pubts` | 时间戳 | `pubts` | DateTime |
| 23 | `signinStatus` | 签到状态 | `signin_status` | Integer |
| 24 | `signinTime` | 签到时间 | `signin_time` | DateTime |
| 25 | `ts` | 时间戳 | `ts` | DateTime |
| 26 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 27 | `id` | 评分任务id | `id` | Long |
| 28 | `projectId` | 招标项目 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 29 | `bidSectionId` | 标段(包) | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 30 | `qualifyCheckStep` | 资格审核当前流程阶段 | `qualify_check_step` | Integer |
| 31 | `qualifyCheckType` | 资格审核方式 | `qualify_check_type` | Integer |
| 32 | `expertId` | 专家 | `expert_doc_id` | ddf859b7-981f-4c8a-b2b9-9d760e5d2bc7 |
| 33 | `scoreRound` | 当前评标轮次 | `score_round` | Integer |
| 34 | `scoringGroupId` | 评标组 | `scoring_group_id` | bd52c08b-9c24-45c6-b5ba-6209956c1411 |
| 35 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 36 | `reviewType` | 评审类型 | `review_type` | String |
| 37 | `userId` | 人员 | `expert_id` | Long |
| 38 | `bSignCommitment` | 是否签署承诺 | `sign_commitment` | Short |
| 39 | `billVersionId` | 版本id | `bill_version_id` | a3a5ef89-acd9-4d26-bfa0-f2828d18ef6b |
| 40 | `commitmentSignStatus` | 签署状态 | `commitment_sign_status` | Integer |
| 41 | `commitmentSignTime` | 签署时间 | `commitment_sign_time` | DateTime |
| 42 | `currentEvaluationStage` | 当前评标阶段 | `current_evaluation_stage` | Integer |
| 43 | `detailList` | 专家评分明细表 | `` | 9a649f8a-614f-4f2f-b528-705bf82f019a |
| 44 | `evaluationStage` | 评审阶段 | `evaluation_stage` | String |
| 45 | `expertName` | 专家姓名 | `expert_name` | String |
| 46 | `file` | 附件 | `file` | String |
| 47 | `noticeContent` | 公告内容 | `notice_content` | String |
| 48 | `noticeTemplateId` | 公告模板id | `notice_template_id` | 9afba638-be6f-4d54-b870-3448a8ccf849 |
| 49 | `reviewStatus` | 评审状态 | `review_status` | Integer |
| 50 | `subScoring` | 是否代打分 | `sub_scoring` | Short |
| 51 | `templateContent` | 公告信息 | `template_content` | String |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `billVersionId` | 版本id | `lawbid.billversion.BizBillVersion` | None |  |
| 2 | `expertId` | 专家 | `lawbid.cpuexpert.CpuExpert` | None |  |
| 3 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 4 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 5 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 6 | `detailList` | 专家评分明细表 | `lawbid.scoringtask.ExpertScoringDetail` | None | true |
| 7 | `scoringGroupId` | 评标组 | `lawbid.scoringgroup.ScoringGroupVO` | None |  |
| 8 | `enterpriseId` | 租户 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 9 | `noticeTemplateId` | 公告模板id | `bctask.noticetemplate.NoticeTemplate` | Service |  |
| 10 | `projectId` | 招标项目 | `lawbid.project.LawbidProject` | None |  |
| 11 | `bidSectionId` | 标段(包) | `lawbid.section.LawbidSection` | None |  |
