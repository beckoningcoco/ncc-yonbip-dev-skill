---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.scoringgroup.ScoringGroupVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 评标组主表 (`lawbid.scoringgroup.ScoringGroupVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_scoring_group`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 评标组主表 |
| 物理表 | `cpu_scoring_group` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:25:01.7870` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-01-23 23:56:30:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（38个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `scoringGroupCode` | 评标组号 | `scoring_group_code` | String |
| 3 | `scoringGroupName` | 评标组名称 | `scoring_group_name` | String |
| 4 | `lawbidSystemId` | 原始主键 | `lawbid_system_id` | Long |
| 5 | `file` | 附件 | `file` | String |
| 6 | `conclusionInfo` | 评标结果描述 | `conclusion_info` | String |
| 7 | `billVersionId` | 版本id | `bill_version_id` | a3a5ef89-acd9-4d26-bfa0-f2828d18ef6b |
| 8 | `createTime` | 创建时间 | `create_time` | DateTime |
| 9 | `createDate` | 创建日期 | `create_date` | Date |
| 10 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 11 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 12 | `creator` | 创建人名称 | `creator` | String |
| 13 | `modifier` | 修改人名称 | `modifier` | String |
| 14 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 15 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 16 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 17 | `dr` | 逻辑删除标记 | `dr` | Short |
| 18 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |
| 20 | `roomNumber` | 房间号 | `room_number` | Integer |
| 21 | `expectStartTime` | 预计开始时间 | `expect_start_time` | DateTime |
| 22 | `expectEndTime` | 预计结束时间 | `expect_end_time` | DateTime |
| 23 | `principalId` | 委托人主键 | `principal_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 24 | `principalName` | 委托人 | `principal_name` | String |
| 25 | `sectionNum` | 评标项目数 | `section_num` | Integer |
| 26 | `status` | 状态 | `status` | String |
| 27 | `enterpriseId` | 租户主键 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 28 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 29 | `formQualificationGroup` | 是否组建评审小组 | `form_qualification_group` | Short |
| 30 | `shareOtherSection` | 评审小组是否共享给本项目下其他标包 | `share_other_section` | Short |
| 31 | `projectId` | 招标项目ID | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 32 | `bidSectionId` | 标段(包)主键 | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 33 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 34 | `currentEvaluationStage` | 当前评标阶段 | `current_evaluation_stage` | Integer |
| 35 | `auths` | 评标专家权限 | `` | ad076e4f-e17f-4864-a1a2-2aee34d17cd3 |
| 36 | `bidsections` | 评标关联标段表 | `` | af9ddb7a-9100-43e0-9f70-3c17580c0778 |
| 37 | `experts` | 评标组专家表 | `` | e20263d2-5a5e-49b8-ac5e-2b894374f692 |
| 38 | `withdraws` | 评标撤回历史 | `` | 9e766c03-9bff-43fa-9860-4826c1af0937 |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `billVersionId` | 版本id | `lawbid.billversion.BizBillVersion` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `withdraws` | 评标撤回历史 | `lawbid.scoringgroup.ScoringGroupWithdrawVO` | None | true |
| 4 | `auths` | 评标专家权限 | `lawbid.scoringgroup.ScoringGroupExpertAuthVO` | None | true |
| 5 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 6 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 7 | `principalId` | 委托人主键 | `bd.staff.Staff` | Service |  |
| 8 | `enterpriseId` | 租户主键 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 9 | `bidsections` | 评标关联标段表 | `lawbid.scoringgroup.ScoringGroupBidsectionVO` | None | true |
| 10 | `projectId` | 招标项目ID | `lawbid.project.LawbidProject` | None |  |
| 11 | `experts` | 评标组专家表 | `lawbid.scoringgroup.ScoringGroupExpertVO` | None | true |
| 12 | `bidSectionId` | 标段(包)主键 | `lawbid.section.LawbidSection` | None |  |
