---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.clarifyhistory.CpuClarifyHistoryDetail"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 谈判历史明细子表 (`lawbid.clarifyhistory.CpuClarifyHistoryDetail`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_clarify_history_detail`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 谈判历史明细子表 |
| 物理表 | `cpu_clarify_history_detail` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 20:14:36.2520` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | 主键 |

## 部署信息

- 部署时间: 2025-05-24 00:30:34:000

## 依赖接口（3个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |
| 2 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |

---

## 直接属性（27个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | 主键 | `id` | Long |
| 2 | `bidSectionId` | 标段（包）id | `bid_section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 3 | `clarifyHistoryId` | 谈判历史主表 | `clarify_history_id` | 986cca5c-0709-4854-942f-f51b747ee900 |
| 4 | `bidClarifyId` | 谈判单标识 | `bid_clarify_id` | d318ae13-0f72-4ceb-84dc-25c79f08b220 |
| 5 | `supplydocId` | 供应商档案id | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 6 | `markSegmentId` | 评标环节标识 | `mark_segment_id` | 89b6414c-2d9a-4b4f-9faa-a2cbdd58f101 |
| 7 | `markSegmentName` | 打分项目主键 | `mark_segment_name` | String |
| 8 | `bidderName` | 投标人名称 | `bidder_name` | String |
| 9 | `totalPrice` | 无税投标总价 | `total_price` | Decimal |
| 10 | `taxTotalPrice` | 含税投标总价 | `tax_total_price` | Decimal |
| 11 | `totalMarkPrice` | 无税评标总价 | `total_mark_price` | Decimal |
| 12 | `taxTotalMarkPrice` | 含税评标总价 | `tax_total_mark_price` | Decimal |
| 13 | `totalSegmentScore` | 环节总分 | `total_segment_score` | String |
| 14 | `totalScore` | 总分 | `total_score` | Decimal |
| 15 | `rank` | 排名 | `rank` | String |
| 16 | `ytenantId` | 租户id | `ytenant_id` | String |
| 17 | `buyerTenantId` | 采购商租户id | `buyer_tenant_id` | String |
| 18 | `venderTenantId` | 供应商租户id | `vender_tenant_id` | String |
| 19 | `enterpriseId` | 采购商企业id | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 20 | `supEnterpriseId` | 供应商企业id | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 21 | `biddingId` | 投标单id | `bidding_id` | 560d390c-4459-4448-8e73-f6ce26a04dba |
| 22 | `biddingDetailId` | 投标报价单 | `bidding_detail_id` | 102df149-dc26-44a9-8fbe-02be312d8a34 |
| 23 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 24 | `demandBillId` | 需求明细单 | `demand_bill_id` | 3fe14cdc-d32f-4161-80ad-994d5f6c57e3 |
| 25 | `dr` | 逻辑删除标记 | `dr` | Short |
| 26 | `pubts` | 时间戳 | `pubts` | DateTime |
| 27 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（11个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `demandBillId` | 需求明细单 | `lawbid.section.LawbidSectionMaterial` | None |  |
| 2 | `bidClarifyId` | 谈判单标识 | `lawbid.talks.BidClarifyVO` | None |  |
| 3 | `clarifyHistoryId` | 谈判历史主表 | `lawbid.clarifyhistory.CpuClarifyHistory` | None | true |
| 4 | `supplydocId` | 供应商档案id | `aa.vendor.Vendor` | Service |  |
| 5 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 6 | `supEnterpriseId` | 供应商企业id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 7 | `biddingDetailId` | 投标报价单 | `lawbid.bid.BiddingMaterialDetailVO` | None |  |
| 8 | `biddingId` | 投标单id | `lawbid.bid.BiddingVO` | None |  |
| 9 | `enterpriseId` | 采购商企业id | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 10 | `markSegmentId` | 评标环节标识 | `lawbid.scoreplan.BidScorePlanSegment` | None |  |
| 11 | `bidSectionId` | 标段（包）id | `lawbid.section.LawbidSection` | None |  |
