---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "saleauction.talkResponse.ClarifyBidderVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 谈判回复表头 (`saleauction.talkResponse.ClarifyBidderVO`)

> ycBusinessCenter | 物理表：`cpu_clarify_bidder`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 谈判回复表头 |
| 物理表 | `cpu_clarify_bidder` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 23:42:42.9160` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（42个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `supEnterpriseId` | 供应商企业 | `bidder_id` | Long |
| 2 | `bidClarifyId` | 谈判单 | `bid_clarify_id` | 006ef228-db7d-4d3b-a5b8-bacc392affce |
| 3 | `id` | ID | `id` | Long |
| 4 | `enterpriseId` | 租户 | `enterprise_id` | Long |
| 5 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 6 | `priceWhether` | 否是报价 | `price_whether` | Integer |
| 7 | `status` | 状态 | `status` | Integer |
| 8 | `responseClarifyTime` | 谈判发起时间 | `response_clarify_time` | DateTime |
| 9 | `responseTime` | 截止时间 | `response_time` | DateTime |
| 10 | `rank` | 排名 | `rank` | String |
| 11 | `lowestOffer` | 最低无税总报价 | `lowest_offer` | Decimal |
| 12 | `taxLowestOffer` | 最低含税总报价 | `tax_lowest_offer` | Decimal |
| 13 | `billType` | 类型 | `bill_type` | String |
| 14 | `markRmbTotal` | 上次投标无税总价 | `mark_rmb_total` | Decimal |
| 15 | `taxMarkRmbTotal` | 上次投标含税总价 | `tax_mark_rmb_total` | Decimal |
| 16 | `rmbTotal` | 本次谈判无税总价 | `rmb_total` | Decimal |
| 17 | `taxRmbTotal` | 本次谈判含税总价 | `tax_rmb_total` | Decimal |
| 18 | `videoConferenceFlag` | 视频会议 | `video_conference_flag` | Integer |
| 19 | `joinMeetingFlag` | 是否被邀请参会 | `join_meeting_flag` | Integer |
| 20 | `templateId` | 模板ID | `template_id` | Long |
| 21 | `supplydocId` | 供应商档案 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 22 | `createTime` | 创建时间 | `create_time` | DateTime |
| 23 | `createDate` | 创建日期 | `create_date` | Date |
| 24 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 25 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 26 | `creator` | 创建人名称 | `creator` | String |
| 27 | `modifier` | 修改人名称 | `modifier` | String |
| 28 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 29 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 30 | `dr` | 逻辑删除标记 | `dr` | Short |
| 31 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 32 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 33 | `pubts` | 时间戳 | `pubts` | DateTime |
| 34 | `billTemplateId` | 采购模板ID | `bill_template_id` | fa7aa0a8-dffb-4595-ab15-ad7053de81a3 |
| 35 | `sectionId` | 标段 | `section_id` | 052621d8-fde7-4ab0-94bf-b179c720ce6d |
| 36 | `cpuClarifyBidderDefineCharacter` | 谈判磋商表头自定义项特征 | `define_character_id` | e0f9c561-5a88-462c-acd7-567bd5a04450 |
| 37 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 38 | `clarifySubmit` | 提交状态 | `clarify_submit` | Integer |
| 39 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 40 | `clarifyMaterialOffers` | 价格谈判回复表体 | `` | 82ae6a8d-4d2c-4651-8121-96c934b1cfa0 |
| 41 | `clarifyProblemResponses` | 商务技术谈判回复表体 | `` | b8a87dce-0ec7-4313-b3a4-1026ade44c80 |
| 42 | `headdefine` | 谈判磋商表头自定义项 | `` | 3d779aef-599e-46d4-9bac-b6305f6878c0 |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `billTemplateId` | 采购模板ID | `tpl.templateinst.TplBillTemplateInst` | Service |  |
| 2 | `headdefine` | 谈判磋商表头自定义项 | `saleauction.talkResponse.ClarifyBidderDefine` | None | true |
| 3 | `bidClarifyId` | 谈判单 | `saleauction.talks.BidClarifyVO` | None |  |
| 4 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 5 | `supplydocId` | 供应商档案 | `aa.vendor.Vendor` | Service |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `sectionId` | 标段 | `saleauction.project.AuctionSection` | None |  |
| 10 | `clarifyMaterialOffers` | 价格谈判回复表体 | `saleauction.talkResponse.ClarifyMaterialOfferVO` | None | true |
| 11 | `cpuClarifyBidderDefineCharacter` | 谈判磋商表头自定义项特征 | `saleauction.talkResponse.CpuClarifyBidderDefineCharacter` | None |  |
| 12 | `clarifyProblemResponses` | 商务技术谈判回复表体 | `saleauction.talkResponse.ClarifyProblemResponseVO` | None | true |
