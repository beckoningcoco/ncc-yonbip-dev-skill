---
tags: ["BIP", "元数据", "数据字典", "ycAuction", "saleauction.talks.BidClarifyVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 谈判单表头 (`saleauction.talks.BidClarifyVO`)

> ycAuction | 物理表：`cpu_bid_clarify`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 谈判单表头 |
| 物理表 | `cpu_bid_clarify` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycAuction` |
| 构建时间 | `2026-06-04 23:44:58.9810` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |
| 编码 | `clarify_code` | String | 谈判编码 |

---

## 直接属性（59个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `projectId` | 招标项目 | `project_id` | 9f8b9356-4cd6-4ae7-8dc0-c84dfecdda07 |
| 3 | `code` | 谈判编码 | `clarify_code` | String |
| 4 | `clarifyTitle` | 谈判标题 | `clarify_title` | String |
| 5 | `videoConferenceFlag` | 视频会议 | `video_conference_flag` | Integer |
| 6 | `sectionId` | 标段（包） | `section_id` | 052621d8-fde7-4ab0-94bf-b179c720ce6d |
| 7 | `priceWhether` | 是否报价 | `price_whether` | Integer |
| 8 | `priceRange` | 报价范围 | `price_range` | Integer |
| 9 | `responseClarifyTime` | 谈判开始时间 | `response_clarify_time` | DateTime |
| 10 | `responseTime` | 谈判截止时间 | `Response_time` | DateTime |
| 11 | `enterpriseId` | 租户 | `enterprise_id` | Long |
| 12 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 13 | `submit` | 提交状态 | `submit` | Integer |
| 14 | `purchaseType` | 采购类型 | `purchase_type` | String |
| 15 | `status` | 澄清时间是否截至 | `status` | Integer |
| 16 | `consignationId` | 委托单 | `consignation_id` | Long |
| 17 | `responseAll` | 已答复家数/全部 | `response_all` | String |
| 18 | `talksContent` | 谈判内容 | `talks_content` | String |
| 19 | `allMaterials` | 全部物料 | `all_materials` | Integer |
| 20 | `noHigher` | 不高于上次报价 | `no_higher` | Integer |
| 21 | `stepSize` | 报价步长 | `step_size` | Integer |
| 22 | `eliminate` | 淘汰未选择的供应商 | `eliminate` | Integer |
| 23 | `guidePrice` | 谈判指导价 | `guide_price` | Integer |
| 24 | `talksStatus` | 是否最新轮次 | `talks_status` | Integer |
| 25 | `talksRounds` | 谈判轮次 | `talks_rounds` | Integer |
| 26 | `talksSequence` | 谈判次数 | `talks_sequence` | Integer |
| 27 | `billType` | 单据类型 | `bill_type` | String |
| 28 | `clarifySetId` | 谈判设置 | `clarify_set_id` | b148829a-dca8-490c-ac15-40c3ab0f7b1f |
| 29 | `approvalFlowStatus` | 审批状态 | `approval_flow_status` | String |
| 30 | `multipleCurrentStage` | 当前招标阶段 | `multiple_current_stage` | Integer |
| 31 | `templateId` | 模板ID | `template_id` | Long |
| 32 | `billTemplateId` | 采购模板ID | `bill_template_id` | Long |
| 33 | `files` | 附件 | `files` | String |
| 34 | `ts` | 时间戳 | `ts` | DateTime |
| 35 | `dr` | 删除标志位 | `dr` | Integer |
| 36 | `ytenantId` | 租户名 | `ytenant_id` | String |
| 37 | `bidClarifyIdOld` | 上轮谈判 | `bid_clarify_id_old` | Long |
| 38 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 39 | `BidClarifyDefineCharacter` | 谈判单表头自定义项 | `define_character_id` | 58bd786d-7bbd-4e5c-afd0-d174095da4f8 |
| 40 | `auditDate` | 审批日期 | `audit_date` | Date |
| 41 | `auditTime` | 审批时间 | `audit_time` | DateTime |
| 42 | `auditor` | 审批人名称 | `auditor` | String |
| 43 | `auditorId` | 审批人 | `auditorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 44 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 45 | `clarifyBidders` | 谈判供应商表体 | `` | 857fa83e-f705-4f1f-8512-dc700f21a774 |
| 46 | `clarifyMaterialOffers` | 价格谈判回复表体 | `` | 964f395c-6c72-405c-b19e-70a4462ad8b9 |
| 47 | `createDate` | 创建日期 | `create_date` | Date |
| 48 | `createTime` | 创建时间 | `create_time` | DateTime |
| 49 | `creator` | 创建人名称 | `creator` | String |
| 50 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 51 | `headdefine` | 谈判单自定义项 | `` | 3f93537e-7049-47e3-9c3b-b03f97c4ffb7 |
| 52 | `modifier` | 修改人名称 | `modifier` | String |
| 53 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 54 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 55 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 56 | `openPriceStatus` | 报价单开启状态:1是、0否 | `open_price_status` | Integer |
| 57 | `pubts` | 时间戳 | `pubts` | DateTime |
| 58 | `quoteViewablePostNeg` | 报价查看权限控制：1 = 需开启权限方可查看报价，0 = 无需开启权限，直接查看报价 | `quote_viewable_post_neg` | Integer |
| 59 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `clarifyBidders` | 谈判供应商表体 | `saleauction.talks.ClarifyBidderVO` | None | true |
| 2 | `headdefine` | 谈判单自定义项 | `saleauction.talks.BidClarifyDefine` | None | true |
| 3 | `auditorId` | 审批人 | `base.user.User` | Service |  |
| 4 | `BidClarifyDefineCharacter` | 谈判单表头自定义项 | `saleauction.talks.BidClarifyDefineCharacter` | None |  |
| 5 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 6 | `clarifySetId` | 谈判设置 | `saleauction.clarifySet.ClarifySet` | None |  |
| 7 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 8 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 9 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 10 | `sectionId` | 标段（包） | `saleauction.project.AuctionSection` | None |  |
| 11 | `clarifyMaterialOffers` | 价格谈判回复表体 | `saleauction.talks.ClarifyMaterialOfferVO` | None | true |
| 12 | `projectId` | 招标项目 | `saleauction.project.AuctionProject` | None |  |
