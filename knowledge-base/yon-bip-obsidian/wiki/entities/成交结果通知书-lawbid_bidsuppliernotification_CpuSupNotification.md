---
tags: ["BIP", "元数据", "数据字典", "ycSouringBid", "lawbid.bidsuppliernotification.CpuSupNotification"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 成交结果通知书 (`lawbid.bidsuppliernotification.CpuSupNotification`)

> **平台版本：BIP 旗舰版 V5**

> ycSouringBid 模块 | 物理表：`cpu_bid_notification`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成交结果通知书 |
| 物理表 | `cpu_bid_notification` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringBid` |
| 构建时间 | `2026-06-04 19:24:51.6220` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

## 部署信息

- 部署时间: 2025-10-24 23:57:24:000

## 依赖接口（6个）

| # | 接口名 | URI | 版本 |
|---|--------|-----|------|
| 1 | 中标通知书接口 | `lawdecision.itf.ICpuBidNotification` | 161 |
| 2 | 企业ID | `cpu.itf.IEnterprise` | 6 |
| 3 | 跨租户采购商租户接口 | `cpu.itf.IBuyerTenant` | 10 |
| 4 | 跨租户供应商租户接口 | `cpu.itf.IVendorTenant` | 14 |
| 5 | 逻辑删除相关 | `ucfbase.ucfbaseItf.LogicDelete` | 74 |
| 6 | 统一租户接口 | `ucfbase.ucfbaseItf.IYTenant` | 40 |

---

## 直接属性（26个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 2 | `chargeId` | 缴费表主键 | `charge_id` | da314f46-878d-4bd8-8c49-15668049e3c9 |
| 3 | `isBid` | 是否中标 | `isBid` | Boolean |
| 4 | `supplierReviewTime` | 供应商查看时间 | `supplier_review_time` | DateTime |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `eliminateStatus` | 供应商是否淘汰 | `eliminate_status` | Integer |
| 7 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 8 | `pubts` | 时间戳 | `pubts` | DateTime |
| 9 | `state` | 通知书发布状态 | `state` | Integer |
| 10 | `supplierEnterpriseId` | 供应商企业 | `supplier_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 11 | `templateId` | 模板主键 | `template_id` | 8fb3205e-7cd6-462c-ab06-d3d4f5f897ea |
| 12 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 13 | `ytenant` | 租户 | `ytenant_id` | String |
| 14 | `id` | id | `id` | Long |
| 15 | `adviceNotes` | 中标通知书时说明 | `advice_notes` | String |
| 16 | `transactionTypeId` | 采购类型 | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 17 | `bidNoticeFile` | 附件 | `bid_notice_file` | String |
| 18 | `projectId` | 招标项目主键 | `project_id` | 070c3520-bf5d-4b3e-a523-59e73d9f6349 |
| 19 | `resultId` | 中标结果表主键 | `result_id` | 1b9a1d9c-4e40-4d84-9c9d-4603582e1bbd |
| 20 | `sectionId` | 招标标段主键 | `section_id` | 0409e7d6-ed4c-4c0d-bc0d-dde79bdbf461 |
| 21 | `originalContent` | 来源公告内容 | `original_content` | String |
| 22 | `targetContent` | 目标公告内容 | `target_content` | String |
| 23 | `noticeId` | 成交通知书主表主键 | `notice_id` | 53c796a3-89c8-444e-b5e0-6e063954cae8 |
| 24 | `supplierReview` | 供应商查看情况 | `supplier_review` | String |
| 25 | `editStatus` | 通知书 | `edit_status` | Integer |
| 26 | `supNotices` | 成交结果明细 | `` | 499669bd-9685-4602-b728-184611ce694a |

---

## 关联属性（10个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supNotices` | 成交结果明细 | `lawbid.bidsuppliernotification.CpuSupMaterialNotice` | None | true |
| 2 | `supplierEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 3 | `resultId` | 中标结果表主键 | `lawbid.decisionresult.CpuDecisionResult` | None |  |
| 4 | `transactionTypeId` | 采购类型 | `bd.bill.TransType` | Service |  |
| 5 | `chargeId` | 缴费表主键 | `lawbid.bidsuppliernotification.CpuSupServiceChargeNotice` | None |  |
| 6 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 7 | `sectionId` | 招标标段主键 | `lawbid.section.LawbidSection` | None |  |
| 8 | `templateId` | 模板主键 | `lawbid.noticetemplate.NoticeTemplate` | None |  |
| 9 | `projectId` | 招标项目主键 | `lawbid.project.LawbidProject` | None |  |
| 10 | `noticeId` | 成交通知书主表主键 | `lawbid.bidsuppliernotification.CpuSupBidInformationNotice` | None |  |
