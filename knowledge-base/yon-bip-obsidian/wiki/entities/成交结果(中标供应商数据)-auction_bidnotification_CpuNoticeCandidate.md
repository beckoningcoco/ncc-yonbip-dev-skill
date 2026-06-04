---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.bidnotification.CpuNoticeCandidate"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 成交结果(中标供应商数据) (`auction.bidnotification.CpuNoticeCandidate`)

> ycSouringAuction | 物理表：`cpu_notice_candidate`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成交结果(中标供应商数据) |
| 物理表 | `cpu_notice_candidate` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:24:26.3830` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（15个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 3 | `supplierEnterpriseId` | 供应商企业 | `supplier_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 4 | `ytenant` | 租户 | `ytenant_id` | String |
| 5 | `adviceNotes` | 中标结果说明 | `advice_notes` | String |
| 6 | `dr` | 逻辑删除标记 | `dr` | Short |
| 7 | `pubts` | 时间戳 | `pubts` | DateTime |
| 8 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 9 | `transactionTypeId` | 交易类型 | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 10 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 11 | `projectId` | 竞拍项目主键 | `project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 12 | `sectionId` | 竞拍标段主键 | `section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 13 | `noticeId` | 成交通知书(主实体) | `notice_id` | 8c661b09-e756-4d66-be51-5c836b7efe07 |
| 14 | `resultId` | 确定中标人(竞拍结果中标供应商数据) | `result_id` | 018f6cfc-19ee-4a10-9a10-4a817bf68cae |
| 15 | `sidPriceDetails` | 成交结果明细(中标供应商的中标物料数据) | `` | 18b397c4-1dc8-423e-97b3-21c615209529 |

---

## 关联属性（8个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplierEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 2 | `resultId` | 确定中标人(竞拍结果中标供应商数据) | `auction.decisionresult.CpuDecisionResult` | None |  |
| 3 | `transactionTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 4 | `sidPriceDetails` | 成交结果明细(中标供应商的中标物料数据) | `auction.bidnotification.CpuBidPriceDetailsNotice` | None | true |
| 5 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `sectionId` | 竞拍标段主键 | `auction.project.AuctionSection` | None |  |
| 7 | `projectId` | 竞拍项目主键 | `auction.project.AuctionProject` | None |  |
| 8 | `noticeId` | 成交通知书(主实体) | `auction.bidnotification.CpuBidInformationNotice` | None | true |
