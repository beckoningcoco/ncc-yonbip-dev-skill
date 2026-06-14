---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.bidsuppliernotification.CpuSupNotification"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 成交结果通知书 (`auction.bidsuppliernotification.CpuSupNotification`)

> ycSouringAuction | 物理表：`cpu_bid_notification`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成交结果通知书 |
| 物理表 | `cpu_bid_notification` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:24:33.6310` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（25个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | id | `id` | Long |
| 2 | `projectId` | 项目主键 | `project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 3 | `adviceNotes` | 中标通知书时说明 | `advice_notes` | String |
| 4 | `transactionTypeId` | 采购类型 | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 5 | `templateId` | 模板id | `template_id` | 8fb3205e-7cd6-462c-ab06-d3d4f5f897ea |
| 6 | `chargeId` | 缴费表主键 | `charge_id` | 3d27203a-da5f-42ba-89ad-bb40c3bebe33 |
| 7 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 8 | `supplierEnterpriseId` | 供应商企业 | `supplier_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 9 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 10 | `ytenant` | 租户 | `ytenant_id` | String |
| 11 | `isBid` | 是否中标 | `isBid` | Boolean |
| 12 | `eliminateStatus` | 供应商是否淘汰 | `eliminate_status` | Integer |
| 13 | `state` | 通知书发布状态 | `state` | Integer |
| 14 | `dr` | 逻辑删除标记 | `dr` | Short |
| 15 | `pubts` | 时间戳 | `pubts` | DateTime |
| 16 | `sectionId` | 招标标段主键 | `section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 17 | `bidNoticeFile` | 附件 | `bid_notice_file` | String |
| 18 | `resultId` | 中标结果表主键 | `result_id` | 018f6cfc-19ee-4a10-9a10-4a817bf68cae |
| 19 | `originalContent` | 来源公告内容 | `original_content` | String |
| 20 | `targetContent` | 目标公告内容 | `target_content` | String |
| 21 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 22 | `noticeId` | 成交通知书主表主键 | `notice_id` | bf9f7f07-dd4e-4fc9-94eb-795fdb75ce98 |
| 23 | `supplierReview` | 供应商查看情况 | `supplier_review` | String |
| 24 | `editStatus` | 通知书 | `edit_status` | Integer |
| 25 | `supNotices` | 成交结果明细 | `` | 9a9a3296-ba8c-4f73-a492-e2f7d62a2b5f |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supNotices` | 成交结果明细 | `auction.bidsuppliernotification.CpuSupMaterialNotice` | None | true |
| 2 | `supplierEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 3 | `resultId` | 中标结果表主键 | `auction.decisionresult.CpuDecisionResult` | None |  |
| 4 | `transactionTypeId` | 采购类型 | `bd.bill.TransType` | Service |  |
| 5 | `chargeId` | 缴费表主键 | `auction.bidsuppliernotification.CpuSupServiceChargeNotice` | None |  |
| 6 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 7 | `sectionId` | 招标标段主键 | `auction.project.AuctionSection` | None |  |
| 8 | `templateId` | 模板id | `lawbid.noticetemplate.NoticeTemplate` | None |  |
| 9 | `projectId` | 项目主键 | `auction.project.AuctionProject` | None |  |
| 10 | `noticeId` | 成交通知书主表主键 | `auction.bidsuppliernotification.CpuSupBidInformationNotice` | None |  |
