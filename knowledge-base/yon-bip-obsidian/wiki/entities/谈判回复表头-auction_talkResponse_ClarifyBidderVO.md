---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "auction.talkResponse.ClarifyBidderVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 谈判回复表头 (`auction.talkResponse.ClarifyBidderVO`)

> ycBusinessCenter | 物理表：`cpu_clarify_bidder`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 谈判回复表头 |
| 物理表 | `cpu_clarify_bidder` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:26:17.3490` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（43个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `supEnterpriseId` | 供应商企业 | `bidder_id` | Long |
| 2 | `bidClarifyId` | 谈判单 | `bid_clarify_id` | dffcae36-3871-4d90-9ec5-ed563f559bd9 |
| 3 | `id` | ID | `id` | Long |
| 4 | `templateId` | 模板ID | `template_id` | Long |
| 5 | `enterpriseId` | 租户 | `enterprise_id` | Long |
| 6 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 7 | `priceWhether` | 否是报价 | `price_whether` | Integer |
| 8 | `status` | 状态 | `status` | Integer |
| 9 | `responseClarifyTime` | 谈判发起时间 | `response_clarify_time` | DateTime |
| 10 | `responseTime` | 截止时间 | `response_time` | DateTime |
| 11 | `rank` | 排名 | `rank` | String |
| 12 | `lowestOffer` | 最低无税总报价 | `lowest_offer` | Decimal |
| 13 | `taxLowestOffer` | 最低含税总报价 | `tax_lowest_offer` | Decimal |
| 14 | `billType` | 类型 | `bill_type` | String |
| 15 | `markRmbTotal` | 上次投标无税总价 | `mark_rmb_total` | Decimal |
| 16 | `taxMarkRmbTotal` | 上次投标含税总价 | `tax_mark_rmb_total` | Decimal |
| 17 | `rmbTotal` | 本次谈判无税总价 | `rmb_total` | Decimal |
| 18 | `taxRmbTotal` | 本次谈判含税总价 | `tax_rmb_total` | Decimal |
| 19 | `videoConferenceFlag` | 视频会议 | `video_conference_flag` | Integer |
| 20 | `joinMeetingFlag` | 是否被邀请参会 | `join_meeting_flag` | Integer |
| 21 | `submitTime` | 提交时间 | `submit_time` | DateTime |
| 22 | `supplydocId` | 供应商档案 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 23 | `createTime` | 创建时间 | `create_time` | DateTime |
| 24 | `createDate` | 创建日期 | `create_date` | Date |
| 25 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 26 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 27 | `creator` | 创建人名称 | `creator` | String |
| 28 | `modifier` | 修改人名称 | `modifier` | String |
| 29 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 30 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 31 | `dr` | 逻辑删除标记 | `dr` | Short |
| 32 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 33 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 34 | `pubts` | 时间戳 | `pubts` | DateTime |
| 35 | `billTemplateId` | 采购模板ID | `bill_template_id` | fa7aa0a8-dffb-4595-ab15-ad7053de81a3 |
| 36 | `sectionId` | 标段 | `section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 37 | `cpuClarifyBidderDefineCharacter` | 谈判磋商表头自定义项特征 | `define_character_id` | 92496d75-2d42-406e-b823-093324e6931c |
| 38 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 39 | `clarifySubmit` | 提交状态 | `clarify_submit` | Integer |
| 40 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 41 | `clarifyMaterialOffers` | 价格谈判回复表体 | `` | 620b097d-1d72-4a6d-8279-4d6acb3e1c9f |
| 42 | `clarifyProblemResponses` | 商务技术谈判回复表体 | `` | 2fcc6b7d-c418-4c44-81bf-0fcb5bfb990a |
| 43 | `headdefine` | 谈判磋商表头自定义项 | `` | a4c623bb-3358-4faf-9c4c-e6a3ab01e429 |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `billTemplateId` | 采购模板ID | `tpl.templateinst.TplBillTemplateInst` | Service |  |
| 2 | `headdefine` | 谈判磋商表头自定义项 | `auction.talkResponse.ClarifyBidderDefine` | None | true |
| 3 | `bidClarifyId` | 谈判单 | `auction.talks.BidClarifyVO` | None |  |
| 4 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 5 | `supplydocId` | 供应商档案 | `aa.vendor.Vendor` | Service |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `sectionId` | 标段 | `auction.project.AuctionSection` | None |  |
| 10 | `clarifyMaterialOffers` | 价格谈判回复表体 | `auction.talkResponse.ClarifyMaterialOfferVO` | None | true |
| 11 | `cpuClarifyBidderDefineCharacter` | 谈判磋商表头自定义项特征 | `auction.talkResponse.CpuClarifyBidderDefineCharacter` | None |  |
| 12 | `clarifyProblemResponses` | 商务技术谈判回复表体 | `auction.talkResponse.ClarifyProblemResponseVO` | None | true |
