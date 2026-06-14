---
tags: ["BIP", "元数据", "数据字典", "ycBusinessCenter", "lawbid.talkResponse.ClarifyBidderVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 谈判回复表头 (`lawbid.talkResponse.ClarifyBidderVO`)

> **平台版本：BIP 旗舰版 V5**

> ycBusinessCenter 模块 | 物理表：`cpu_clarify_bidder`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 谈判回复表头 |
| 物理表 | `cpu_clarify_bidder` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycBusinessCenter` |
| 构建时间 | `2026-06-04 20:16:54.0870` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

## 部署信息

- 部署时间: 2026-01-23 23:56:01:000

## 依赖接口（6个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 审计信息 | `base.itf.IAuditInfo` | 340 |
| 2 | 采购模板-领域扩展字段 | `tpl.itf.TplId` | 53 |
| 3 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 4 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 5 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 6 | 跨租户供应商租户接口 | `cpu.itf.IVendorTenant` | 14 |

---

## 直接属性（48个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `cpuClarifyBidderDefineCharacter` | 谈判回复表头自定义项 | `define_character_id` | 4ed29b65-fca0-46cf-836e-346371452851 |
| 2 | `templateId` | 模板ID | `template_id` | Long |
| 3 | `billType` | 类型 | `bill_type` | String |
| 4 | `billTemplateId` | 采购模板ID | `bill_template_id` | Long |
| 5 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 6 | `createDate` | 创建日期 | `create_date` | Date |
| 7 | `billVersionId` | 版本id | `bill_version_id` | a3a5ef89-acd9-4d26-bfa0-f2828d18ef6b |
| 8 | `taxEntiretyTotalPrice` | 本次整单含税总价 | `tax_entirety_total_price` | Decimal |
| 9 | `noTaxEntiretyTotalPrice` | 本次整单无税总价 | `no_tax_entirety_total_price` | Decimal |
| 10 | `lastTaxEntiretyTotalPrice` | 上次整单含税总价 | `last_tax_entirety_total_price` | Decimal |
| 11 | `lastNotaxEntiretyTotalPrice` | 上次整单无税总价 | `last_notax_entirety_total_price` | Decimal |
| 12 | `quotedPriceWay` | 投标报价模式 | `quoted_price_way` | Integer |
| 13 | `supplydocId` | 供应商档案 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 14 | `createTime` | 创建时间 | `create_time` | DateTime |
| 15 | `creator` | 创建人名称 | `creator` | String |
| 16 | `creatorId` | 创建人 | `creatorId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 17 | `dr` | 逻辑删除标记 | `dr` | Short |
| 18 | `enterpriseId` | 租户 | `enterprise_id` | Long |
| 19 | `enterpriseName` | 租户名 | `enterprise_name` | String |
| 20 | `joinMeetingFlag` | 是否被邀请参会 | `join_meeting_flag` | Integer |
| 21 | `lowestOffer` | 最低无税总报价 | `lowest_offer` | Decimal |
| 22 | `markRmbTotal` | 上次投标无税总价 | `mark_rmb_total` | Decimal |
| 23 | `modifier` | 修改人名称 | `modifier` | String |
| 24 | `modifierId` | 修改人 | `modifierId` | 54800425-15da-4742-ae89-059d05e77c9b |
| 25 | `modifyDate` | 修改日期 | `modify_date` | Date |
| 26 | `modifyTime` | 修改时间 | `modify_time` | DateTime |
| 27 | `priceWhether` | 否是报价 | `price_whether` | Integer |
| 28 | `pubts` | 时间戳 | `pubts` | DateTime |
| 29 | `rank` | 排名 | `rank` | String |
| 30 | `responseClarifyTime` | 谈判发起时间 | `response_clarify_time` | DateTime |
| 31 | `responseTime` | 截止时间 | `response_time` | DateTime |
| 32 | `rmbTotal` | 本次谈判无税总价 | `rmb_total` | Decimal |
| 33 | `status` | 状态 | `status` | Integer |
| 34 | `taxLowestOffer` | 最低含税总报价 | `tax_lowest_offer` | Decimal |
| 35 | `taxMarkRmbTotal` | 上次投标含税总价 | `tax_mark_rmb_total` | Decimal |
| 36 | `taxRmbTotal` | 本次谈判含税总价 | `tax_rmb_total` | Decimal |
| 37 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 38 | `videoConferenceFlag` | 视频会议 | `video_conference_flag` | Integer |
| 39 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |
| 40 | `supEnterpriseId` | 供应商企业 | `bidder_id` | Long |
| 41 | `bidClarifyId` | 谈判单 | `bid_clarify_id` | d318ae13-0f72-4ceb-84dc-25c79f08b220 |
| 42 | `id` | ID | `id` | Long |
| 43 | `sectionId` | 标段 | `section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 44 | `clarifySubmit` | 提交状态 | `clarify_submit` | Integer |
| 45 | `transType` | 交易类型 | `trans_type` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 46 | `clarifyMaterialOffers` | 价格谈判回复表体 | `` | 504e3dea-a90a-4fa4-9967-cced62dd8fe3 |
| 47 | `clarifyProblemResponses` | 商务技术谈判回复表体 | `` | c3a4ddbf-11a7-4614-94b4-8a76ad16e0fb |
| 48 | `headdefine` | 谈判磋商表头自定义项 | `` | c4c74091-fcdb-432f-a2c8-89135ed7e34e |

---

## 关联属性（12个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `headdefine` | 谈判磋商表头自定义项 | `lawbid.talkResponse.ClarifyBidderDefine` | None | true |
| 2 | `bidClarifyId` | 谈判单 | `lawbid.talks.BidClarifyVO` | None |  |
| 3 | `billVersionId` | 版本id | `lawbid.billversion.BizBillVersion` | None |  |
| 4 | `transType` | 交易类型 | `bd.bill.TransType` | Service |  |
| 5 | `supplydocId` | 供应商档案 | `aa.vendor.Vendor` | Service |  |
| 6 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 7 | `creatorId` | 创建人 | `base.user.User` | Service |  |
| 8 | `modifierId` | 修改人 | `base.user.User` | Service |  |
| 9 | `sectionId` | 标段 | `lawbid.section.LawbidSection` | None |  |
| 10 | `clarifyMaterialOffers` | 价格谈判回复表体 | `lawbid.talkResponse.ClarifyMaterialOfferVO` | None | true |
| 11 | `cpuClarifyBidderDefineCharacter` | 谈判回复表头自定义项 | `lawbid.talkResponse.CpuClarifyBidderDefineCharacter` | None |  |
| 12 | `clarifyProblemResponses` | 商务技术谈判回复表体 | `lawbid.talkResponse.ClarifyProblemResponseVO` | None | true |
