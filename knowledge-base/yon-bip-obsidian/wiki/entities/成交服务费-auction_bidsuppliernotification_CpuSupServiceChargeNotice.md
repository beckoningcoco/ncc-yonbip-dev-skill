---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.bidsuppliernotification.CpuSupServiceChargeNotice"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 成交服务费 (`auction.bidsuppliernotification.CpuSupServiceChargeNotice`)

> ycSouringAuction | 物理表：`cpu_service_charge_notice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 成交服务费 |
| 物理表 | `cpu_service_charge_notice` |
| 数据库 schema | `yonbip-cpu-lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:25:02.7720` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | id |

---

## 直接属性（29个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `amountServiceFee` | 服务费金额 | `amount_service_fee` | Decimal |
| 2 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 3 | `code` | 订单号 | `code` | String |
| 4 | `deadlineDate` | 处理时间 | `deadline_date` | DateTime |
| 5 | `dr` | 逻辑删除标记 | `dr` | Short |
| 6 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 7 | `feeType` | 费用类型 | `fee_type` | String |
| 8 | `id` | id | `id` | Long |
| 9 | `isPay` | 缴费状态 | `isPay` | Integer |
| 10 | `noticeId` | 通知书主表主键 | `notice_id` | bf9f7f07-dd4e-4fc9-94eb-795fdb75ce98 |
| 11 | `payDate` | 缴费时间 | `pay_date` | DateTime |
| 12 | `paymentNotice` | 缴费通知单附件 | `payment_notice` | String |
| 13 | `paymentReason` | 缴费原因 | `payment_reason` | String |
| 14 | `processingStatus` | 处理状态 | `processing_status` | Short |
| 15 | `processingTime` | 处理时间 | `processing_time` | DateTime |
| 16 | `projectId` | 招标项目主键 | `project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 17 | `pubts` | 时间戳 | `pubts` | DateTime |
| 18 | `purchasingPerson` | 处理人 | `purchasing_person` | String |
| 19 | `resultId` | 中标结果表主键 | `result_id` | 018f6cfc-19ee-4a10-9a10-4a817bf68cae |
| 20 | `sectionId` | 招标标段主键 | `section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 21 | `serciePrice` | 服务费 | `sercie_price` | Decimal |
| 22 | `serciePriceUnit` | 服务费单位 | `sercie_price_unit` | String |
| 23 | `supEnterpriseId` | 供应商企业 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 24 | `supplierEnterpriseId` | 供应商企业 | `supplier_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 25 | `supplydocId` | 投标人主键 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 26 | `transactionTypeId` | 交易类型 | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 27 | `userId` | 用户主键 | `user_id` | Long |
| 28 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 29 | `ytenant` | 租户 | `ytenant_id` | String |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplierEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 2 | `resultId` | 中标结果表主键 | `auction.decisionresult.CpuDecisionResult` | None |  |
| 3 | `transactionTypeId` | 交易类型 | `bd.bill.TransType` | Service |  |
| 4 | `supplydocId` | 投标人主键 | `aa.vendor.Vendor` | Service |  |
| 5 | `supEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 7 | `sectionId` | 招标标段主键 | `auction.project.AuctionSection` | None |  |
| 8 | `projectId` | 招标项目主键 | `auction.project.AuctionProject` | None |  |
| 9 | `noticeId` | 通知书主表主键 | `auction.bidsuppliernotification.CpuSupBidInformationNotice` | None |  |
