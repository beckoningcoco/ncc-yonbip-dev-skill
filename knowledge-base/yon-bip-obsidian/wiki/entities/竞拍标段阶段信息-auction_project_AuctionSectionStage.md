---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.project.AuctionSectionStage"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍标段阶段信息 (`auction.project.AuctionSectionStage`)

> ycSouringAuction | 物理表：`cpu_section_stage_info`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍标段阶段信息 |
| 物理表 | `cpu_section_stage_info` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:26:07.4740` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（28个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `agoMarkGroupId` | 上一阶段评标小组ID | `ago_mark_group_id` | Long |
| 2 | `bidDocStatus` | 招标文件状态 | `bid_doc_status` | String |
| 3 | `bidFileTemplateId` | 招标文件模板ID | `bid_file_template_id` | Long |
| 4 | `bidNoticeStatus` | 招标公告状态 | `bid_notice_status` | String |
| 5 | `bidScorePlanId` | 标书评分方案ID | `bid_score_plan_id` | Long |
| 6 | `bidScoreTemplateVoteId` | 评标定标会模板ID | `bid_score_template_vote_id` | Long |
| 7 | `bidSectionId` | 标段ID | `bid_section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 8 | `bidType` | 招标方式 | `bid_type` | String |
| 9 | `billMakerId` | 制单人ID | `bill_maker_id` | String |
| 10 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 11 | `dr` | 逻辑删除标记 | `dr` | Short |
| 12 | `enterpriseId` | 所属租户id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 13 | `expertPlanId` | 专家抽取方案ID | `expert_plan_id` | Long |
| 14 | `hasPublishBiddoc` | 是否发布标书 | `has_publish_biddoc` | Integer |
| 15 | `hasPublishNotice` | 是否发布公告 | `has_publish_notice` | Integer |
| 16 | `id` | ID | `id` | Long |
| 17 | `markGroupId` | 评标小组ID | `mark_group_id` | Long |
| 18 | `markStatus` | 评标状态 | `mark_status` | String |
| 19 | `multipleCurrentStage` | 招标阶段 | `multiple_current_stage` | Integer |
| 20 | `multipleStageBid` | 是否是两阶段招标 | `multiple_stage_bid` | Integer |
| 21 | `pubts` | 时间戳 | `pubts` | DateTime |
| 22 | `purchaseCode` | 招标方式编码 | `purchase_code` | String |
| 23 | `purchaseName` | 招标方式名称 | `purchase_name` | String |
| 24 | `purchaseTypeId` | 采购方式ID | `purchase_type_id` | Long |
| 25 | `qualificationGroupId` | 资格评审小组ID | `qualification_group_id` | Long |
| 26 | `sectionStatus` | 标包状态 | `section_status` | String |
| 27 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 28 | `reviewTypes` | 标段评标阶段类型 | `` | 44664aab-a38f-4763-96fd-a346ca44e3df |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `reviewTypes` | 标段评标阶段类型 | `auction.project.AuctionSectionReviewType` | None | true |
| 3 | `enterpriseId` | 所属租户id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 4 | `bidSectionId` | 标段ID | `auction.project.AuctionSection` | None | true |
