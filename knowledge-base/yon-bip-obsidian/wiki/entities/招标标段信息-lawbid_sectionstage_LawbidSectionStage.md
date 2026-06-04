---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.sectionstage.LawbidSectionStage"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 招标标段信息 (`lawbid.sectionstage.LawbidSectionStage`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_section_stage_info`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 招标标段信息 |
| 物理表 | `cpu_section_stage_info` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:25:59.1360` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2025-01-17 23:15:21:000

## 依赖接口（4个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 4 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（29个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `agoMarkGroupId` | 上一阶段评标小组ID | `ago_mark_group_id` | Long |
| 2 | `bidDocStatus` | 招标文件状态 | `bid_doc_status` | String |
| 3 | `bidFileTemplateId` | 招标文件模板ID | `bid_file_template_id` | Long |
| 4 | `bidNoticeStatus` | 招标公告状态 | `bid_notice_status` | String |
| 5 | `bidScorePlanId` | 标书评分方案ID | `bid_score_plan_id` | Long |
| 6 | `bidScoreTemplateVoteId` | 评标定标会模板ID | `bid_score_template_vote_id` | Long |
| 7 | `bidSectionId` | 标段ID | `bid_section_id` | Long |
| 8 | `bidType` | 招标方式 | `bid_type` | String |
| 9 | `billMakerId` | 制单人ID | `bill_maker_id` | String |
| 10 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 11 | `dr` | 逻辑删除标记 | `dr` | Short |
| 12 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 13 | `expertPlanId` | 专家抽取方案ID | `expert_plan_id` | Long |
| 14 | `hasPublishBiddoc` | 是否发布标书 | `has_publish_biddoc` | Integer |
| 15 | `hasPublishNotice` | 是否发布公告 | `has_publish_notice` | Integer |
| 16 | `id` | ID | `id` | Long |
| 17 | `lawbidSystemId` | 原始ID | `lawbid_system_id` | Long |
| 18 | `lawbidSystemType` | 原始表 | `lawbid_system_type` | String |
| 19 | `markGroupId` | 评标小组ID | `mark_group_id` | Long |
| 20 | `markStatus` | 评标状态 | `mark_status` | String |
| 21 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 22 | `multipleStageBid` | 是否是两阶段招标 | `multiple_stage_bid` | Integer |
| 23 | `pubts` | 时间戳 | `pubts` | DateTime |
| 24 | `purchaseCode` | 招标方式编码 | `purchase_code` | String |
| 25 | `purchaseName` | 招标方式名称 | `purchase_name` | String |
| 26 | `purchaseTypeId` | 采购方式ID | `purchase_type_id` | Long |
| 27 | `qualificationGroupId` | 资格评审小组ID | `qualification_group_id` | Long |
| 28 | `sectionStatus` | 标包状态 | `section_status` | String |
| 29 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（2个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
