---
tags: ["BIP", "元数据", "数据字典", "ycAuction", "saleauction.talks.ClarifyBidderVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 谈判供应商表体 (`saleauction.talks.ClarifyBidderVO`)

> ycAuction | 物理表：`cpu_clarify_bidder_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 谈判供应商表体 |
| 物理表 | `cpu_clarify_bidder_detail` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycAuction` |
| 构建时间 | `2026-06-04 23:45:34.7340` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 投标信息 |

---

## 直接属性（37个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 投标信息 | `id` | Long |
| 2 | `bidClarifyId` | 投标澄清 | `bid_clarify_id` | 006ef228-db7d-4d3b-a5b8-bacc392affce |
| 3 | `supEnterpriseId` | 投标人 | `bidder_id` | Long |
| 4 | `bidderCompanyName` | 供应商名称 | `bidder_company_name` | String |
| 5 | `bidderLinkmanName` | 联系人 | `bidder_linkman_name` | String |
| 6 | `bidderMobile` | 联系方式 | `bidder_mobile` | String |
| 7 | `bidderEmiall` | 邮箱 | `bidder_emiall` | String |
| 8 | `enterpriseId` | 租户 | `enterprise_id` | Long |
| 9 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 10 | `title` | 标题 | `title` | String |
| 11 | `priceWhether` | 是否报价 | `price_whether` | Integer |
| 12 | `responseTime` | 澄清截至时间 | `response_time` | DateTime |
| 13 | `sectionId` | 标段（包） | `section_id` | 052621d8-fde7-4ab0-94bf-b179c720ce6d |
| 14 | `sectionCode` | 标段(包)编码 | `section_code` | String |
| 15 | `sectionName` | 标段（包）名称 | `section_name` | String |
| 16 | `ts` | 时间戳 | `ts` | DateTime |
| 17 | `clarifySubmit` | 提交状态 | `clarify_submit` | Integer |
| 18 | `dr` | 删除标志位 | `dr` | Integer |
| 19 | `responseClarifyTime` | 供应商回复澄清时间 | `response_clarify_time` | DateTime |
| 20 | `rmbTotal` | 本次无税总报价 | `rmb_total` | Decimal |
| 21 | `lowestOffer` | 最低报价 | `lowest_offer` | Decimal |
| 22 | `rankType` | 供应商排名 | `rank_type` | Integer |
| 23 | `status` | 澄清时间是否截至 | `status` | Integer |
| 24 | `billType` | 类型 | `bill_type` | String |
| 25 | `taxRmbTotal` | 人民币含税总价 | `tax_rmb_total` | Decimal |
| 26 | `markRmbTotal` | 上次无税总报价 | `mark_rmb_total` | Decimal |
| 27 | `taxMarkRmbTotal` | 原始投标人民币含税总价 | `tax_mark_rmb_total` | Decimal |
| 28 | `rank` | 排名 | `rank` | String |
| 29 | `videoConferenceFlag` | 视频会议开启状态 | `video_conference_flag` | Integer |
| 30 | `joinMeetingFlag` | 是否被邀请参会 | `join_meeting_flag` | Integer |
| 31 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 32 | `clarifyBidderDetailMaterials` | 供应商谈判物料表体 | `` | b144fb7a-9fe6-4184-b386-7880c871337a |
| 33 | `multipleCurrentStage` | 招标阶段 | `multiple_current_stage` | Integer |
| 34 | `pubts` | 时间戳 | `pubts` | DateTime |
| 35 | `taxLowestOffer` | 最低含税报价 | `tax_lowest_offer` | Decimal |
| 36 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 37 | `ytenantId` | 租户 | `ytenant_id` | String |

---

## 关联属性（4个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidClarifyId` | 投标澄清 | `saleauction.talks.BidClarifyVO` | None | true |
| 2 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 3 | `clarifyBidderDetailMaterials` | 供应商谈判物料表体 | `saleauction.talks.ClarifyMaterialVO` | None | true |
| 4 | `sectionId` | 标段（包） | `saleauction.project.AuctionSection` | None |  |
