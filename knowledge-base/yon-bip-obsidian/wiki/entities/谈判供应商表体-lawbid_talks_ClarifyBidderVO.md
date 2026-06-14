---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.talks.ClarifyBidderVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 谈判供应商表体 (`lawbid.talks.ClarifyBidderVO`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_clarify_bidder_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 谈判供应商表体 |
| 物理表 | `cpu_clarify_bidder_detail` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:03:07.2660` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 投标人 |

## 部署信息

- 部署时间: 2026-05-22 23:54:59:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 2 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（43个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `multipleCurrentStage` | 招标阶段 | `multiple_current_stage` | Integer |
| 3 | `pubts` | 时间戳 | `pubts` | DateTime |
| 4 | `taxLowestOffer` | 最低含税报价 | `tax_lowest_offer` | Decimal |
| 5 | `ytenant` | 租户 | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 6 | `ytenantId` | 租户 | `ytenant_id` | String |
| 7 | `id` | 投标人 | `id` | Long |
| 8 | `bidderCompanyName` | 供应商名称 | `bidder_company_name` | String |
| 9 | `bidderLinkmanName` | 联系人 | `bidder_linkman_name` | String |
| 10 | `bidderMobile` | 联系方式 | `bidder_mobile` | String |
| 11 | `bidderEmiall` | 邮箱 | `bidder_emiall` | String |
| 12 | `markRmbTotal` | 上次无税总报价 | `mark_rmb_total` | Decimal |
| 13 | `taxMarkRmbTotal` | 上次含税总报价 | `tax_mark_rmb_total` | Decimal |
| 14 | `rmbTotal` | 本次无税总报价 | `rmb_total` | Decimal |
| 15 | `taxRmbTotal` | 本次含税总报价 | `tax_rmb_total` | Decimal |
| 16 | `clarifySubmit` | 状态 | `clarify_submit` | Integer |
| 17 | `bidClarifyId` | 投标澄清 | `bid_clarify_id` | d318ae13-0f72-4ceb-84dc-25c79f08b220 |
| 18 | `supEnterpriseId` | 投标人 | `bidder_id` | Long |
| 19 | `enterpriseId` | 租户 | `enterprise_id` | Long |
| 20 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 21 | `ts` | 时间戳 | `ts` | DateTime |
| 22 | `dr` | 删除标志位 | `dr` | Integer |
| 23 | `title` | 标题 | `title` | String |
| 24 | `priceWhether` | 是否报价 | `price_whether` | Integer |
| 25 | `responseTime` | 澄清截至时间 | `response_time` | DateTime |
| 26 | `status` | 澄清时间是否截至 | `status` | Integer |
| 27 | `sectionId` | 标段(包) | `section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 28 | `sectionCode` | 标段(包)编码 | `section_code` | String |
| 29 | `sectionName` | 标段(包)名称 | `section_name` | String |
| 30 | `responseClarifyTime` | 供应商回复澄清时间 | `response_clarify_time` | DateTime |
| 31 | `rank` | 排名 | `rank` | String |
| 32 | `lowestOffer` | 最低报价 | `lowest_offer` | Decimal |
| 33 | `rankType` | 展示供应商排名 | `rank_type` | Integer |
| 34 | `billType` | 类型 | `bill_type` | String |
| 35 | `videoConferenceFlag` | 视频会议开启状态 | `video_conference_flag` | Integer |
| 36 | `joinMeetingFlag` | 是否被邀请参会 | `join_meeting_flag` | Integer |
| 37 | `clarifyBidderDetailMaterials` | 价格谈判表体 | `` | 191cbf46-5b2f-4c83-90fa-1d21d452dc3f |
| 38 | `clarifyBidderDetailProblems` | 投标人商务技术谈判表体 | `` | a6bb2a88-754b-43aa-8cac-d4556c80aac4 |
| 39 | `guidePrice` | 判断指导价 | `guide_price` | Short |
| 40 | `noHigher` | 不高于上次报价 | `no_higher` | Short |
| 41 | `stepSize` | 报价步长 | `step_size` | Short |
| 42 | `supplydocId` | 供应商档案 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 43 | `totalScore` | 总分 | `total_score` | Decimal |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `bidClarifyId` | 投标澄清 | `lawbid.talks.BidClarifyVO` | None | true |
| 2 | `supplydocId` | 供应商档案 | `aa.vendor.Vendor` | Service |  |
| 3 | `ytenant` | 租户 | `yht.tenant.YhtTenant` | Service |  |
| 4 | `clarifyBidderDetailProblems` | 投标人商务技术谈判表体 | `lawbid.talks.ClarifyBidderDetailProblemVO` | None | true |
| 5 | `clarifyBidderDetailMaterials` | 价格谈判表体 | `lawbid.talks.ClarifyBidderDetailMaterialVO` | None | true |
| 6 | `sectionId` | 标段(包) | `lawbid.section.LawbidSection` | None |  |
