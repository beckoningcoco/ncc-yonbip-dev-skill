---
tags: ["BIP", "元数据", "数据字典", "ycSouring", "bcsourcing.bidauctionHall.CpuHallQuotationRecommendVO"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 竞拍大厅推荐中标方表 (`bcsourcing.bidauctionHall.CpuHallQuotationRecommendVO`)

> ycSouring | 物理表：`cpu_hall_quotation_recommend`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 竞拍大厅推荐中标方表 |
| 物理表 | `cpu_hall_quotation_recommend` |
| domain/服务域 | `yonbip-cpu-bcsourcing` |
| schema | `cpu_pubbiz_sourcing` |
| 所属应用 | `ycSouring` |
| 构建时间 | `2026-06-04 23:44:16.6200` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（17个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `gatherHallId` | 汇总大厅id | `gather_hall_id` | 35362db2-287c-4497-8f9d-ae4ce4c9de77 |
| 3 | `ruleMaterialId` | 竞拍规则物料表 | `rule_material_id` | 4e020ce8-293e-4091-a615-ad1729c786ba |
| 4 | `recentQuotationDetailId` | 最新报价物料 | `recent_quotation_detail_id` | da829e48-cdb2-4ad8-b83a-3e9d892200fe |
| 5 | `supEnterpriseId` | 竞拍方ID | `sup_enterprise_id` | Long |
| 6 | `recentQuotationId` | 最新报价供应商 | `recent_quotation_id` | 66390445-85fd-443a-9ef4-0e6b2ec2e908 |
| 7 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 8 | `demandBillId` | 业务单据子表id | `demand_bill_id` | Long |
| 9 | `dr` | dr | `dr` | Short |
| 10 | `enterpriseId` | 采购商ID | `enterprise_id` | Long |
| 11 | `materialHallId` | 竞价子厅id | `material_hall_id` | ea14742a-4b23-4790-8ed0-91d03878c335 |
| 12 | `pubts` | 时间戳 | `pubts` | DateTime |
| 13 | `rowNo` | 行号 | `row_no` | Decimal |
| 14 | `ts` | 默认值 | `ts` | DateTime |
| 15 | `version` | 版本号 | `version` | Integer |
| 16 | `yTenantId` | 用户中心租户id | `ytenant_id` | String |
| 17 | `ytenant` | 租户id | `ytenant_id` | e4933a03-9dea-472b-a644-cdd654222f45 |

---

## 关联属性（6个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `ytenant` | 租户id | `yht.tenant.YhtTenant` | Service |  |
| 2 | `gatherHallId` | 汇总大厅id | `bcsourcing.bidauctionHall.BidauctionMainHallVO` | None | true |
| 3 | `materialHallId` | 竞价子厅id | `bcsourcing.bidauctionHall.BidauctionSubHallVO` | None |  |
| 4 | `recentQuotationDetailId` | 最新报价物料 | `bcsourcing.bidauctionHall.CpuHallQuotationDetailVO` | None |  |
| 5 | `ruleMaterialId` | 竞拍规则物料表 | `bcsourcing.bidauctionHall.CpuBidauctionRuleMaterialVO` | None |  |
| 6 | `recentQuotationId` | 最新报价供应商 | `bcsourcing.bidauctionHall.CpuHallQuotationVO` | None |  |
