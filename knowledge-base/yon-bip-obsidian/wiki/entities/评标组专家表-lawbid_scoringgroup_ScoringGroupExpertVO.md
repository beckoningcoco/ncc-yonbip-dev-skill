---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.scoringgroup.ScoringGroupExpertVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 评标组专家表 (`lawbid.scoringgroup.ScoringGroupExpertVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_scoring_group_expert`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 评标组专家表 |
| 物理表 | `cpu_scoring_group_expert` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:02:54.7100` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2026-01-23 23:56:30:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（39个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `dr` | 逻辑删除标记 | `dr` | Short |
| 3 | `exeprtType` | 评委类型 | `exeprt_type` | String |
| 4 | `expertCode` | 专家编码 | `expert_code` | String |
| 5 | `expertTel` | 联系方式 | `expert_tel` | String |
| 6 | `expertName` | 专家名称 | `expert_name` | String |
| 7 | `bSignCommitment` | 是否签署承诺 | `sign_commitment` | Short |
| 8 | `commitmentSignStatus` | 签署状态 | `commitment_sign_status` | Integer |
| 9 | `commitmentSignTime` | 签署时间 | `commitment_sign_time` | DateTime |
| 10 | `noticeTemplateId` | 公告模板id | `notice_template_id` | 9afba638-be6f-4d54-b870-3448a8ccf849 |
| 11 | `templateContent` | 公告信息 | `template_content` | String |
| 12 | `noticeContent` | 公告内容 | `notice_content` | String |
| 13 | `fileId` | 附件 | `file_id` | String |
| 14 | `memo` | 备注 | `memo` | String |
| 15 | `expertCompany` | 专家单位 | `expert_company` | String |
| 16 | `subScoring` | 是否代打分 | `sub_scoring` | Short |
| 17 | `lawbidSystemId` | 原始主键 | `lawbid_system_id` | Long |
| 18 | `ifSignin` | 是否签到 | `if_signin` | Short |
| 19 | `pubts` | 时间戳 | `pubts` | DateTime |
| 20 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 21 | `id` | id | `id` | Long |
| 22 | `scoringGroupId` | 评标组主键 | `scoring_group_id` | bd52c08b-9c24-45c6-b5ba-6209956c1411 |
| 23 | `expertId` | 专家主键 | `expert_id` | ddf859b7-981f-4c8a-b2b9-9d760e5d2bc7 |
| 24 | `signTime` | 签到信息 | `sign_time` | DateTime |
| 25 | `status` | 评委状态 | `status` | String |
| 26 | `userId` | 专家对应人员主键 | `user_id` | 4effed83-35f5-4e3b-9be1-092b5ae602e8 |
| 27 | `deptName` | 部门名称 | `dept_name` | String |
| 28 | `evadeInfo` | 回避信息 | `evade_info` | String |
| 29 | `source` | 来源 | `source` | String |
| 30 | `ifHeadman` | 是否是组长 | `if_headman` | Short |
| 31 | `headmanReason` | 选为组长原因 | `headman_reason` | String |
| 32 | `enterpriseId` | 租户主键 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 33 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 34 | `expertAuthority` | 评委类型 | `expert_authority` | String |
| 35 | `expertPropertyName` | 评审专家属性名称 | `expert_property_name` | String |
| 36 | `expertPropertyCode` | 评审专家属性编码 | `expert_property_code` | String |
| 37 | `markStatus` | 评标状态 | `mark_status` | String |
| 38 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 39 | `reviewTypes` | 评标组专家评标类型表 | `` | 3d3289da-ae96-4046-84ec-7908e571691c |

---

## 关联属性（7个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `expertId` | 专家主键 | `lawbid.cpuexpert.CpuExpert` | None |  |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `reviewTypes` | 评标组专家评标类型表 | `lawbid.scoringgroup.ScoringGroupExpertReviewTypeVO` | None | true |
| 4 | `scoringGroupId` | 评标组主键 | `lawbid.scoringgroup.ScoringGroupVO` | None | true |
| 5 | `enterpriseId` | 租户主键 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `noticeTemplateId` | 公告模板id | `bctask.noticetemplate.NoticeTemplate` | Service |  |
| 7 | `userId` | 专家对应人员主键 | `bd.staff.Staff` | Service |  |
