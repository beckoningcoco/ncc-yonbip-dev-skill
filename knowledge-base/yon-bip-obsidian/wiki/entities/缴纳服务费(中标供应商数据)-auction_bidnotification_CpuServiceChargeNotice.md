---
tags: ["BIP", "元数据", "数据字典", "ycSouringAuction", "auction.bidnotification.CpuServiceChargeNotice"]
created: 2026-06-04
updated: 2026-06-04
sources: [元数据API queryByUri]
platform_version: "BIP V5"
project: ""
last_verified: 2026-06-04
status: verified
source_type: api_response
---

# 缴纳服务费(中标供应商数据) (`auction.bidnotification.CpuServiceChargeNotice`)

> ycSouringAuction | 物理表：`cpu_service_charge_notice`

## 基本信息

| 属性 | 值 |
|------|-----|
| 显示名 | 缴纳服务费(中标供应商数据) |
| 物理表 | `cpu_service_charge_notice` |
| domain/服务域 | `yonbip-cpu-lawbid` |
| schema | `cpu_lawbid` |
| 所属应用 | `ycSouringAuction` |
| 构建时间 | `2026-06-04 23:25:52.5030` |

## 主键与编码

| 角色 | 字段名 | 类型 | 说明 |
|------|--------|------|------|
| 主键 | `id` | Long | ID |

---

## 直接属性（29个）

| # | 字段名 | 显示名 | 数据库列 | 类型 |
|---|--------|--------|---------|------|
| 1 | `id` | ID | `id` | Long |
| 2 | `userId` | 用户主键 | `user_id` | Long |
| 3 | `feeType` | 费用类型 | `fee_type` | String |
| 4 | `purchasingPerson` | 处理人 | `purchasing_person` | String |
| 5 | `processingTime` | 处理时间 | `processing_time` | DateTime |
| 6 | `processingStatus` | 状态 | `processing_status` | Short |
| 7 | `enterpriseId` | 企业 | `enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 8 | `supplierEnterpriseId` | 供应商企业 | `supplier_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 9 | `buyerTenant` | 采购商租户 | `buyer_tenant_id` | String |
| 10 | `ytenant` | 租户 | `ytenant_id` | String |
| 11 | `code` | 订单号 | `code` | String |
| 12 | `supEnterpriseId` | 供应商企业 | `sup_enterprise_id` | fe5e8738-f49c-4170-bd4e-a06ac3f317a4 |
| 13 | `serciePrice` | 服务费 | `sercie_price` | Decimal |
| 14 | `serciePriceUnit` | 服务费单位 | `sercie_price_unit` | String |
| 15 | `isPay` | 缴费状态 | `isPay` | Integer |
| 16 | `payDate` | 缴费时间 | `pay_date` | DateTime |
| 17 | `deadlineDate` | 处理时间 | `deadline_date` | DateTime |
| 18 | `supplydocId` | 供应商名称 | `supplydoc_id` | 89bf026e-cc49-4fe7-9a7b-3e8fdcc77c1e |
| 19 | `dr` | 逻辑删除标记 | `dr` | Short |
| 20 | `pubts` | 时间戳 | `pubts` | DateTime |
| 21 | `transactionTypeId` | 采购类型 | `transaction_type_id` | 19f9264d-28d1-4b47-9d28-f2e82654f3a9 |
| 22 | `vendorTenant` | 供应商租户 | `vendor_tenant_id` | String |
| 23 | `projectId` | 竞拍项目主键 | `project_id` | 94b777ba-4855-4d81-a975-f6ab6b09f9a8 |
| 24 | `sectionId` | 竞拍标段主键 | `section_id` | be269c23-7eb6-4029-ac01-781f16c75ec4 |
| 25 | `amountServiceFee` | 服务费金额 | `amount_service_fee` | Decimal |
| 26 | `paymentReason` | 缴费原因 | `payment_reason` | String |
| 27 | `paymentNotice` | 缴费通知单 | `payment_notice` | String |
| 28 | `noticeId` | 成交通知书主表主键 | `notice_id` | 8c661b09-e756-4d66-be51-5c836b7efe07 |
| 29 | `resultId` | 确定中标人(竞拍结果中标供应商数据) | `result_id` | 018f6cfc-19ee-4a10-9a10-4a817bf68cae |

---

## 关联属性（9个）

| # | 字段名 | 显示名 | 目标实体 | 隔离级 | 组合 |
|---|--------|--------|---------|--------|------|
| 1 | `supplierEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 2 | `resultId` | 确定中标人(竞拍结果中标供应商数据) | `auction.decisionresult.CpuDecisionResult` | None |  |
| 3 | `transactionTypeId` | 采购类型 | `bd.bill.TransType` | Service |  |
| 4 | `supplydocId` | 供应商名称 | `aa.vendor.Vendor` | Service |  |
| 5 | `supEnterpriseId` | 供应商企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 6 | `enterpriseId` | 企业 | `cpu-privilege.enterprise.EnterprisePOJO` | Service |  |
| 7 | `sectionId` | 竞拍标段主键 | `auction.project.AuctionSection` | None |  |
| 8 | `projectId` | 竞拍项目主键 | `auction.project.AuctionProject` | None |  |
| 9 | `noticeId` | 成交通知书主表主键 | `auction.bidnotification.CpuBidInformationNotice` | None | true |
